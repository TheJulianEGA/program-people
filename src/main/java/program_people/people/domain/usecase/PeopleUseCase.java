package program_people.people.domain.usecase;

import lombok.RequiredArgsConstructor;
import program_people.people.domain.api.IPeopleServicePort;
import program_people.people.domain.model.People;
import program_people.people.domain.spi.IPeoplePersistencePort;

import java.util.List;


@RequiredArgsConstructor
public class PeopleUseCase implements IPeopleServicePort {

    private final IPeoplePersistencePort userPersistencePort;

    @Override
    public People registerPeople(People people) {
        return userPersistencePort.registerPeople(people);
    }


    @Override
    public List<People> getAllPeople() {
        return userPersistencePort.getAllPeople();
    }
}
