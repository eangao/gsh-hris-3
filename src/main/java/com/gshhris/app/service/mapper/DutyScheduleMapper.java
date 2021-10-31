package com.gshhris.app.service.mapper;

import com.gshhris.app.domain.DutySchedule;
import com.gshhris.app.service.dto.DutyScheduleDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link DutySchedule} and its DTO {@link DutyScheduleDTO}.
 */
@Mapper(componentModel = "spring", uses = { EmployeeMapper.class })
public interface DutyScheduleMapper extends EntityMapper<DutyScheduleDTO, DutySchedule> {
    @Mapping(target = "employee", source = "employee", qualifiedByName = "employeeId")
    DutyScheduleDTO toDto(DutySchedule s);
}
