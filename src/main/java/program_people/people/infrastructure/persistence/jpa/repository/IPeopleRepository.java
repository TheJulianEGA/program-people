package program_people.people.infrastructure.persistence.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import program_people.people.infrastructure.persistence.jpa.entity.PeopleEntity;


public interface IPeopleRepository extends JpaRepository<PeopleEntity,Long> {



}
