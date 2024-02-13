package telran.probes.dto;

import jakarta.validation.constraints.*;
import telran.probes.api.ErrorMessages;

public record SensorRangeDto (
		@NotNull(message=ErrorMessages.MISSING_SENSOR_ID)
		Long sensorId,
		@NotNull(message = ErrorMessages.MISSING_SENSOR_RANGE)
		 SensorRange sensorRange) {

}
