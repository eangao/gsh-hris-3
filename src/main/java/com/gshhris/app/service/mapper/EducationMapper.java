package com.gshhris.app.service.mapper;

import com.gshhris.app.domain.Education;
import com.gshhris.app.service.dto.EducationDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Education} and its DTO {@link EducationDTO}.
 */
@Mapper(componentModel = "spring", uses = { EmployeeMapper.class })
public interface EducationMapper extends EntityMapper<EducationDTO, Education> {
    @Mapping(target = "employee", source = "employee", qualifiedByName = "employeeId")
    EducationDTO toDto(Education s);
}
