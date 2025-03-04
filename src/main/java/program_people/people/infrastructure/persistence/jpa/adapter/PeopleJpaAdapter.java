package program_people.people.infrastructure.persistence.jpa.adapter;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import program_people.people.domain.model.People;
import program_people.people.domain.spi.IPeoplePersistencePort;
import program_people.people.infrastructure.persistence.jpa.entity.PeopleEntity;
import program_people.people.infrastructure.persistence.jpa.mapper.IPeopleEntityMapper;
import program_people.people.infrastructure.persistence.jpa.repository.IPeopleRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PeopleJpaAdapter implements IPeoplePersistencePort {

    private final IPeopleRepository peopleRepository;
    private final IPeopleEntityMapper peopleEntityMapper;

    @Override
    public People registerPeople(People people) {


        PeopleEntity peopleEntity = peopleEntityMapper.toEntity(people);
        peopleRepository.save(peopleEntity);

        return peopleEntityMapper.toModel(peopleEntity);
    }

    @Override
    public List<People> getAllPeople() {

        return peopleRepository.findAll().stream()
                .map(peopleEntityMapper::toModel)
                .toList();
    }

}
