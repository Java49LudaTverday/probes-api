package telran.probes.dto;


import java.util.Objects;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import telran.probes.api.ErrorMessages;

public record SensorEmailsDto(
		@NotNull(message = ErrorMessages.MISSING_SENSOR_ID)
		Long sensorId,
		@NotEmpty(message=ErrorMessages.EMPTY_EMAILS)
		String[] emails ) {
	
	@Override
	public int hashCode() {
		return Objects.hash(sensorId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SensorEmailsDto other = (SensorEmailsDto) obj;
		return Objects.equals(sensorId, other.sensorId);
	}
}
