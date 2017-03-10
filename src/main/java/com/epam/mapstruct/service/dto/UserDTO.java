package com.epam.mapstruct.service.dto;

import lombok.Data;

/**
 * Created by Adam_Skowron on 3/10/2017.
 */
@Data
public class UserDTO {

    private long id;

    private String username;

    private String firstName;

    private String lastName;

    private AddressDTO address;

}
