package com.epam.mapstruct.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.epam.mapstruct.dao.model.AddressEntity;
import com.epam.mapstruct.dao.model.Location;
import com.epam.mapstruct.dao.model.UserEntity;

/**
 * Created by Adam_Skowron on 3/10/2017.
 */
@Repository
public class UserRepository {

    public List<UserEntity> getUsers() {
        List<UserEntity> userEntities = new ArrayList<>();
        userEntities.add(new UserEntity(1L, "olgierd", "Olgierd", "von Everec",
                new AddressEntity("Redania", Location.REDANIA)));
        userEntities.add(new UserEntity(2L, "letho", "Letho", "Gulet",
                new AddressEntity("Gulet", Location.UNKNOWN)));
        userEntities.add(new UserEntity(3L, "john", "John", "Natalis",
                new AddressEntity("Novigrad", Location.NOVIGRAD)));
        userEntities.add(new UserEntity(4L, "geralt", "Geralt", "z Rivii",
                new AddressEntity( "Rivia", Location.RIVIA)));
        userEntities.add(new UserEntity(5L, "yennefer", "Yennefer", "z Vengerbergu",
                new AddressEntity("Vengerbeg", Location.UNKNOWN)));
        userEntities.add(new UserEntity(6L, "triss", "Triss", "Merigold",
                new AddressEntity("Novigrad", Location.NOVIGRAD)));
        userEntities.add(new UserEntity(7L, "jaskier", "Jaskier", "",
                new AddressEntity("Novigrad", Location.NOVIGRAD)));
        userEntities.add(new UserEntity(8L, "zoltan", "Zoltan", "Chivay",
                new AddressEntity("Novigrad", Location.NOVIGRAD)));
        userEntities.add(new UserEntity(9L, "radowid", "Radowid", "The King",
                new AddressEntity("Redania", Location.REDANIA)));
        userEntities.add(new UserEntity(10L, "emhyr", "Emhyr", "var Emreis",
                new AddressEntity( "Novigrad", Location.NOVIGRAD)));
        userEntities.add(new UserEntity(11L, "ciri", "Cirilla", "var Emreis",
                new AddressEntity( "Novigrad", Location.NOVIGRAD)));
        userEntities.add(new UserEntity(12L, "dijkstra", "Sigismund", "Dijkstra",
                new AddressEntity("Novigrad", Location.NOVIGRAD)));
        userEntities.add(new UserEntity(13L, "vesemir", "Vesemir", "",
                new AddressEntity("Karen", Location.RIVIA)));
        userEntities.add(new UserEntity(14L, "lambert", "Lambert", "",
                new AddressEntity("Karen", Location.RIVIA)));
        userEntities.add(new UserEntity(15L, "gaunter o'dimm", "Gaunter", "O'Dimm",
                new AddressEntity( "", Location.UNKNOWN)));
        userEntities.add(new UserEntity(16L, "yarpen", "Yarpen", "Zigrin",
                new AddressEntity("Novigrad", Location.NOVIGRAD)));
        userEntities.add(new UserEntity(17L, "foltest", "Foltest", "The king",
                new AddressEntity("Temeria", Location.TEMERIA)));
        userEntities.add(new UserEntity(18L, "keira", "Keira", "Metz",
                new AddressEntity("Carreras", Location.UNKNOWN)));
        userEntities.add(new UserEntity(19L, "ves", "Ves", "",
                new AddressEntity("Temeria", Location.TEMERIA)));
        userEntities.add(new UserEntity(20L, "vernon", "Vernon", "Roche",
                new AddressEntity("Temeria", Location.TEMERIA)));
        return userEntities;
    }

}
