package com.gshhris.app.service.mapper;

import com.gshhris.app.domain.TrainingHistory;
import com.gshhris.app.service.dto.TrainingHistoryDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link TrainingHistory} and its DTO {@link TrainingHistoryDTO}.
 */
@Mapper(componentModel = "spring", uses = { EmployeeMapper.class })
public interface TrainingHistoryMapper extends EntityMapper<TrainingHistoryDTO, TrainingHistory> {
    @Mapping(target = "employee", source = "employee", qualifiedByName = "employeeId")
    TrainingHistoryDTO toDto(TrainingHistory s);
}
