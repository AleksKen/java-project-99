package hexlet.code.app.mapper;

import hexlet.code.app.dto.taskStatus.TaskStatusCreateDTO;
import hexlet.code.app.dto.taskStatus.TaskStatusDTO;
import hexlet.code.app.dto.taskStatus.TaskStatusUpdateDTO;
import hexlet.code.app.model.TaskStatus;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.MappingTarget;

@Mapper(
        uses = { JsonNullableMapper.class },
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        componentModel = MappingConstants.ComponentModel.SPRING,
        unmappedTargetPolicy = ReportingPolicy.IGNORE
)
public abstract class TaskStatusMapper {
    public abstract TaskStatusDTO map(TaskStatus taskStatus);
    public abstract TaskStatus map(TaskStatusCreateDTO dto);
    public abstract void update(TaskStatusUpdateDTO dto, @MappingTarget TaskStatus model);
}
