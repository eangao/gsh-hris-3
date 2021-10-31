package com.gshhris.app.service.impl;

import com.gshhris.app.domain.HolidayType;
import com.gshhris.app.repository.HolidayTypeRepository;
import com.gshhris.app.service.HolidayTypeService;
import com.gshhris.app.service.dto.HolidayTypeDTO;
import com.gshhris.app.service.mapper.HolidayTypeMapper;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Service Implementation for managing {@link HolidayType}.
 */
@Service
@Transactional
public class HolidayTypeServiceImpl implements HolidayTypeService {

    private final Logger log = LoggerFactory.getLogger(HolidayTypeServiceImpl.class);

    private final HolidayTypeRepository holidayTypeRepository;

    private final HolidayTypeMapper holidayTypeMapper;

    public HolidayTypeServiceImpl(HolidayTypeRepository holidayTypeRepository, HolidayTypeMapper holidayTypeMapper) {
        this.holidayTypeRepository = holidayTypeRepository;
        this.holidayTypeMapper = holidayTypeMapper;
    }

    @Override
    public HolidayTypeDTO save(HolidayTypeDTO holidayTypeDTO) {
        log.debug("Request to save HolidayType : {}", holidayTypeDTO);
        HolidayType holidayType = holidayTypeMapper.toEntity(holidayTypeDTO);
        holidayType = holidayTypeRepository.save(holidayType);
        return holidayTypeMapper.toDto(holidayType);
    }

    @Override
    public Optional<HolidayTypeDTO> partialUpdate(HolidayTypeDTO holidayTypeDTO) {
        log.debug("Request to partially update HolidayType : {}", holidayTypeDTO);

        return holidayTypeRepository
            .findById(holidayTypeDTO.getId())
            .map(existingHolidayType -> {
                holidayTypeMapper.partialUpdate(existingHolidayType, holidayTypeDTO);

                return existingHolidayType;
            })
            .map(holidayTypeRepository::save)
            .map(holidayTypeMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public Page<HolidayTypeDTO> findAll(Pageable pageable) {
        log.debug("Request to get all HolidayTypes");
        return holidayTypeRepository.findAll(pageable).map(holidayTypeMapper::toDto);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<HolidayTypeDTO> findOne(Long id) {
        log.debug("Request to get HolidayType : {}", id);
        return holidayTypeRepository.findById(id).map(holidayTypeMapper::toDto);
    }

    @Override
    public void delete(Long id) {
        log.debug("Request to delete HolidayType : {}", id);
        holidayTypeRepository.deleteById(id);
    }
}
