package com.gshhris.app.service.mapper;

import com.gshhris.app.domain.HolidayType;
import com.gshhris.app.service.dto.HolidayTypeDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link HolidayType} and its DTO {@link HolidayTypeDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface HolidayTypeMapper extends EntityMapper<HolidayTypeDTO, HolidayType> {}
