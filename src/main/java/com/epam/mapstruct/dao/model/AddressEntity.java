package com.epam.mapstruct.dao.model;

/**
 * Created by Adam_Skowron on 3/10/2017.
 */
public class AddressEntity {

    private String location;

    public AddressEntity(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
