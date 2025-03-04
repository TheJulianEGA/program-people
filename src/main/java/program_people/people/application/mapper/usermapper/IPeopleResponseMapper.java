package program_people.people.application.mapper.usermapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import program_people.people.application.dto.userdto.PeopleResponse;
import program_people.people.domain.model.People;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IPeopleResponseMapper {

    PeopleResponse toResponse(People people);
}