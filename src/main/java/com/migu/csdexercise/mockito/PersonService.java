package com.migu.csdexercise.mockito;

class PersonService {
    private final PersonDao personDao;

    PersonService(PersonDao personDao) {
        this.personDao = personDao;
    }

    /**
     * update person
     * @param id id
     * @param name id
     * @return update result
     */
    boolean update(int id, String name) {
        Person person = personDao.getPerson(id);
        if (person == null) {
            return false;
        }
        person.setName(name);
        return personDao.update(person);
    }
}
