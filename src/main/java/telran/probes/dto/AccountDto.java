package telran.probes.dto;

import jakarta.validation.constraints.*;
import telran.probes.api.ErrorMessages;
import telran.probes.api.ConstantsConfiguration;

public record AccountDto (@NotEmpty @Email(message = ErrorMessages.WRONG_EMAIL_FORMAT) String email, 
		@NotNull @Size(min=ConstantsConfiguration.MIN_PASSWORD_SIZE, 
		message = ErrorMessages.PASSWORD_SIZE_MESSAGE) String password,
		@NotEmpty(message = ErrorMessages.EMPTY_ROLES_MESSAGE) String[] roles){

}
