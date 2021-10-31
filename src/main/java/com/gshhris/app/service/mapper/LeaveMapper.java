package com.gshhris.app.service.mapper;

import com.gshhris.app.domain.Leave;
import com.gshhris.app.service.dto.LeaveDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Leave} and its DTO {@link LeaveDTO}.
 */
@Mapper(componentModel = "spring", uses = { EmployeeMapper.class, LeaveTypeMapper.class })
public interface LeaveMapper extends EntityMapper<LeaveDTO, Leave> {
    @Mapping(target = "employee", source = "employee", qualifiedByName = "employeeId")
    @Mapping(target = "leaveType", source = "leaveType", qualifiedByName = "name")
    LeaveDTO toDto(Leave s);
}
