package com.epam.mapstruct.dao.model;

/**
 * Created by Adam_Skowron on 3/10/2017.
 */
public class UserEntity {

    private long id;

    private String username;

    private String firstName;

    private String lastName;

    private AddressEntity address;

    public UserEntity(long id, String username, String firstName, String lastName, AddressEntity address) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public AddressEntity getAddress() {
        return address;
    }

    public void setAddress(AddressEntity address) {
        this.address = address;
    }
}
