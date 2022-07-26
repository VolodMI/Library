package ua.testTask.Library;

import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ua.testTask.Library.models.Book;
import ua.testTask.Library.models.Person;

public class PersonTest {
    private Person person;

    @Before
    public void createNewPerson(){
        person = new Person();
    }

    @Test
    public void personIdShouldNotBeNull(){
        Person person = new Person();
        int i = person.getId();
        Assertions.assertNotNull(i);
    }
}
