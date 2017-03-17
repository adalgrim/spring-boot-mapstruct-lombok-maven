package com.epam.mapstruct.dao.model;

/**
 * Created by Adam_Skowron on 3/10/2017.
 */
public class AddressEntity {

    private Location locationType;

    private String location;

    public AddressEntity(String location, Location locationType) {
        this.location = location;
        this.locationType = locationType;
    }

    public Location getLocationType() {
        return locationType;
    }

    public void setLocationType(Location locationType) {
        this.locationType = locationType;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
