package com.epam.mapstruct.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.epam.mapstruct.dao.model.AddressEntity;
import com.epam.mapstruct.dao.model.UserEntity;

/**
 * Created by Adam_Skowron on 3/10/2017.
 */
@Repository
public class UserRepository {

    public List<UserEntity> getUsers() {
        List<UserEntity> userEntities = new ArrayList<>();
        userEntities.add(new UserEntity(1L, "olgierd", "Olgierd", "von Everec", new AddressEntity("Redania")));
        userEntities.add(new UserEntity(2L, "letho", "Letho", "Gulet", new AddressEntity("Gulet")));
        userEntities.add(new UserEntity(3L, "john", "John", "Natalis", new AddressEntity("Novigrad")));
        userEntities.add(new UserEntity(4L, "geralt", "Geralt", "z Rivii", new AddressEntity( "Rivia")));
        userEntities.add(new UserEntity(5L, "yennefer", "Yennefer", "z Vengerbergu", new AddressEntity("Vengerbeg")));
        userEntities.add(new UserEntity(6L, "triss", "Triss", "Merigold", new AddressEntity("Novigrad")));
        userEntities.add(new UserEntity(7L, "jaskier", "Jaskier", "", new AddressEntity("Novigrad")));
        userEntities.add(new UserEntity(8L, "zoltan", "Zoltan", "Chivay", new AddressEntity("Novigrad")));
        userEntities.add(new UserEntity(9L, "radowid", "Radowid", "The King", new AddressEntity("Redania")));
        userEntities.add(new UserEntity(10L, "emhyr", "Emhyr", "var Emreis", new AddressEntity( "Novigrad")));
        userEntities.add(new UserEntity(11L, "ciri", "Cirilla", "var Emreis", new AddressEntity( "Novigrad")));
        userEntities.add(new UserEntity(12L, "dijkstra", "Sigismund", "Dijkstra", new AddressEntity("Novigrad")));
        userEntities.add(new UserEntity(13L, "vesemir", "Vesemir", "", new AddressEntity("Karen")));
        userEntities.add(new UserEntity(14L, "lambert", "Lambert", "", new AddressEntity("Karen")));
        userEntities.add(new UserEntity(15L, "gaunter o'dimm", "Gaunter", "O'Dimm", new AddressEntity( "")));
        userEntities.add(new UserEntity(16L, "yarpen", "Yarpen", "Zigrin", new AddressEntity("Novigrad")));
        userEntities.add(new UserEntity(17L, "foltest", "Foltest", "The king", new AddressEntity("Temeria")));
        userEntities.add(new UserEntity(18L, "keira", "Keira", "Metz", new AddressEntity("Carreras")));
        userEntities.add(new UserEntity(19L, "ves", "Ves", "", new AddressEntity("Temeria")));
        userEntities.add(new UserEntity(20L, "vernon", "Vernon", "Roche", new AddressEntity("Temeria")));
        return userEntities;
    }

}
