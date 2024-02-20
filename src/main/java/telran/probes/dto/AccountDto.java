package telran.probes.dto;

import java.io.Serializable;
import java.util.Objects;

import jakarta.validation.constraints.*;
import telran.probes.api.ErrorMessages;
import telran.probes.api.ConstantsConfiguration;

public record AccountDto (@NotEmpty @Email(message = ErrorMessages.WRONG_EMAIL_FORMAT) String email, 
		@NotNull @Size(min=ConstantsConfiguration.MIN_PASSWORD_SIZE, 
		message = ErrorMessages.PASSWORD_SIZE_MESSAGE) String password,
		@NotEmpty(message = ErrorMessages.EMPTY_ROLES_MESSAGE) String[] roles) implements Serializable{

	@Override
	public int hashCode() {
		return Objects.hash(email);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AccountDto other = (AccountDto) obj;
		return Objects.equals(email, other.email);
	}

}
