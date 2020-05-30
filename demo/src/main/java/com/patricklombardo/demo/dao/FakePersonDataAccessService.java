package com.patricklombardo.demo.dao;

import com.patricklombardo.demo.model.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;
import java.util.List;

@Repository("fakeDao") // Same as @Component
public class FakePersonDataAccessService implements PersonDao {

    public static List<Person> DB = new ArrayList<>();

    @Override
    public int insertPerson(UUID id, Person person) {
        DB.add(new Person(id, person.getName ()));
        return 1;
    }
}