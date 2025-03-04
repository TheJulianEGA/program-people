package program_people.people.domain.api;

import program_people.people.domain.model.People;


import java.util.List;


public interface IPeopleServicePort {

    People registerPeople(People user);

    List<People> getAllPeople();
}
