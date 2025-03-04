package program_people.people.domain.spi;

import program_people.people.domain.model.People;

import java.util.List;

public interface IPeoplePersistencePort {

    People registerPeople(People user);


    List<People> getAllPeople();
}
