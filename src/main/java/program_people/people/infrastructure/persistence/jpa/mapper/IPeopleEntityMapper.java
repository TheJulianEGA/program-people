package program_people.people.infrastructure.persistence.jpa.mapper;


import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import program_people.people.domain.model.People;
import program_people.people.infrastructure.persistence.jpa.entity.PeopleEntity;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPeopleEntityMapper {

    PeopleEntity toEntity ( People people);

    People toModel (PeopleEntity userEntity);
}
