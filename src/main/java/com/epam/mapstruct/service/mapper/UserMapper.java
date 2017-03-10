package com.epam.mapstruct.service.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;

import com.epam.mapstruct.dao.model.UserEntity;
import com.epam.mapstruct.service.dto.FlattenUserDTO;
import com.epam.mapstruct.service.dto.UserDTO;

/**
 * Created by Adam_Skowron on 3/10/2017.
 */
@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    List<UserDTO> mapToUsers(List<UserEntity> userEntityList);

    @Mappings({
            @Mapping(target = "location", source = "address.location")
    })
    FlattenUserDTO mapToFlattenUser(UserEntity userEntity);

}
