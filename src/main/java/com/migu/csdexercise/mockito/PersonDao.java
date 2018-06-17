package com.migu.csdexercise.mockito;

public interface PersonDao {
    Person getPerson(int id);

    boolean update(Person person);
}
