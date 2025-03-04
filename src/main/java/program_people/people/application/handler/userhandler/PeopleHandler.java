package program_people.people.application.handler.userhandler;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import program_people.people.application.dto.userdto.PeopleRequest;
import program_people.people.application.dto.userdto.PeopleResponse;
import program_people.people.application.mapper.usermapper.IPeopleRequestMapper;
import program_people.people.application.mapper.usermapper.IPeopleResponseMapper;
import program_people.people.domain.api.IPeopleServicePort;
import program_people.people.domain.model.People;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class PeopleHandler implements IPeopleHandler {


    private final IPeopleServicePort peopleServicePort;
    private final IPeopleRequestMapper userRequestMapper;
    private final IPeopleResponseMapper userResponseMapper;

    @Override
    public PeopleResponse registerUser( PeopleRequest userRequest) {

        People people = userRequestMapper.toModel(userRequest);

        People registeredUser = peopleServicePort.registerPeople(people);

        return userResponseMapper.toResponse(registeredUser);
    }

    @Override
    public List<PeopleResponse> getAllPeople() {

        return peopleServicePort.getAllPeople().stream()
                .map(userResponseMapper::toResponse)
                .collect(Collectors.toList());
    }

}
