package program_people.people.application.dto.userdto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import program_people.people.application.util.ApplicationConstants;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PeopleRequest {

    @NotBlank(message = ApplicationConstants.NAME_NOT_BLANK)
    private String name;

    @NotBlank(message = ApplicationConstants.EMAIL_NOT_BLANK)
    @Email(message = ApplicationConstants.EMAIL_PATTERN)
    private String email;


}
