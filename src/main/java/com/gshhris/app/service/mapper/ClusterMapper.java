package com.gshhris.app.service.mapper;

import com.gshhris.app.domain.Cluster;
import com.gshhris.app.service.dto.ClusterDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Cluster} and its DTO {@link ClusterDTO}.
 */
@Mapper(componentModel = "spring", uses = {})
public interface ClusterMapper extends EntityMapper<ClusterDTO, Cluster> {
    @Named("name")
    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    ClusterDTO toDtoName(Cluster cluster);
}
