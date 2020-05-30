package com.patricklombardo.demo.dao;

import java.util.UUID;

import com.patricklombardo.demo.model.Person;

public interface PersonDao {

    // Allows for UUID to be provided or randomly generated

    int insertPerson(UUID id, Person person);

    default int insertPerson(Person person) {
        UUID id = UUID.randomUUID();
        return insertPerson(id, person);
    }

}