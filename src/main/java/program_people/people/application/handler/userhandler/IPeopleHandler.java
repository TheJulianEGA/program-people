package program_people.people.application.handler.userhandler;

import program_people.people.application.dto.userdto.PeopleRequest;
import program_people.people.application.dto.userdto.PeopleResponse;

import java.util.List;

public interface IPeopleHandler {

    PeopleResponse registerUser( PeopleRequest userRequest);

    List<PeopleResponse> getAllPeople();
}
