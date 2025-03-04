package program_people.people.infrastructure.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import program_people.people.domain.api.IPeopleServicePort;
import program_people.people.domain.spi.IPeoplePersistencePort;
import program_people.people.domain.usecase.PeopleUseCase;

@Configuration
@RequiredArgsConstructor
public class BeanConfiguration {

    @Bean
    public IPeopleServicePort peopleServicePort(
            IPeoplePersistencePort userModelPersistencePort
    ) {
        return new PeopleUseCase(userModelPersistencePort);
    }


}
