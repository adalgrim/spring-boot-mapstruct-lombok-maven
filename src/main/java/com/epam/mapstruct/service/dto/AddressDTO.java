package com.epam.mapstruct.service.dto;

import lombok.Data;

/**
 * Created by Adam_Skowron on 3/10/2017.
 */
@Data
public class AddressDTO {

    private LocationDTO locationType;

    private String location;
}
