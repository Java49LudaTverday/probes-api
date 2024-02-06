package telran.probes.dto;

import jakarta.validation.constraints.*;

public record SensorRangeDto (
		@NotNull(message=ErrorMessages.MISSING_SENSOR_ID)
		Long sensorId,
		@NotNull(message = ErrorMessages.MISSING_SENSOR_RANGE)
		 SensorRange sensorRange) {

}
