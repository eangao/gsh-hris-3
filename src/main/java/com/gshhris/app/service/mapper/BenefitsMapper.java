package com.gshhris.app.service.mapper;

import com.gshhris.app.domain.Benefits;
import com.gshhris.app.service.dto.BenefitsDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Benefits} and its DTO {@link BenefitsDTO}.
 */
@Mapper(componentModel = "spring", uses = { EmployeeMapper.class })
public interface BenefitsMapper extends EntityMapper<BenefitsDTO, Benefits> {
    @Mapping(target = "employee", source = "employee", qualifiedByName = "employeeId")
    BenefitsDTO toDto(Benefits s);
}
