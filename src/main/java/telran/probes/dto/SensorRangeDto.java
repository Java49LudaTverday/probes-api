package telran.probes.dto;

import java.util.Objects;

import jakarta.validation.constraints.*;
import telran.probes.api.ErrorMessages;


public record SensorRangeDto (
		@NotNull(message=ErrorMessages.MISSING_SENSOR_ID)
		Long sensorId,
		@NotNull(message = ErrorMessages.MISSING_SENSOR_RANGE)
		 SensorRange sensorRange) {

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
		SensorRangeDto other = (SensorRangeDto) obj;
		return Objects.equals(sensorId, other.sensorId);
	}

}
