package com.gshhris.app.service.mapper;

import com.gshhris.app.domain.Dependents;
import com.gshhris.app.service.dto.DependentsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Dependents} and its DTO {@link DependentsDTO}.
 */
@Mapper(componentModel = "spring", uses = { EmployeeMapper.class })
public interface DependentsMapper extends EntityMapper<DependentsDTO, Dependents> {
    @Mapping(target = "employee", source = "employee", qualifiedByName = "employeeId")
    DependentsDTO toDto(Dependents s);
}
