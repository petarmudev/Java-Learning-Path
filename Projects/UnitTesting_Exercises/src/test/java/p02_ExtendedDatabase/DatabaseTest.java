package p02_ExtendedDatabase;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {

    private Database database;
    private static final Person[] PEOPLE = {new Person(1, "Boris"), new Person(2, "Petar"), new Person(3, "Ivan")};

    @Before
    public void prepareDatabase() throws OperationNotSupportedException {
        database = new Database(PEOPLE);
    }

    //1.Конструктора
    //1.1 дали създава правилен обект
    @Test
    public void testConstructorCreatesValidObject() throws OperationNotSupportedException {

        Person[] elements = database.getElements();

        //Дали в този database елементите са същите
        Assert.assertArrayEquals(elements, PEOPLE);
    }


    //1.2 елементите > 16
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowMoreThanSixteenElements() throws OperationNotSupportedException {
        Person[] people = new Person[17];
        new Database(people);
    }

    //1.3 елементите < 1
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowLessThanOneElements() throws OperationNotSupportedException {
        Person[] people = new Person[0];
        new Database(people);
    }

    //2. add
    //2.1 успешно добавяме елемент
    @Test
    public void testAddShouldAddElement() throws OperationNotSupportedException {
        //[ (1, "Boris"), (2, "Petar"), (3, "Ivan") ]
        Person personToAdd = new Person(4, "Georgi");
        database.add(personToAdd); // [(1, "Boris"), (2, "Petar"), (3, "Ivan")] -> [(1, "Boris"), (2, "Petar"), (3, "Ivan"), (4, "Georgi")]
        Person[] people = database.getElements();
        Assert.assertEquals("Invalid add operation", people.length, PEOPLE.length + 1);

        Assert.assertEquals(Integer.valueOf(people[people.length - 1].getId()), Integer.valueOf(4));
        Assert.assertEquals(people[people.length - 1].getUsername(), "Georgi");

    }

    //2.2 добавяне на null елемент
    @Test(expected = OperationNotSupportedException.class)
    public void testAddNullShouldThrow() throws OperationNotSupportedException {
        database.add(null);
    }


    //3. remove
    //3.1 успрешно премахване на елемент
    @Test
    public void testRemoveLastElement() throws OperationNotSupportedException {
        //[ (1, "Boris"), (2, "Petar"), (3, "Ivan") ]

        Person personToRemove = PEOPLE[PEOPLE.length - 2];
        database.remove(); // -> [ (1, "Boris"), (2, "Petar") ]
        Person[] people = database.getElements();
        Assert.assertEquals(people.length, PEOPLE.length - 1);
        Assert.assertEquals(people[people.length - 1], personToRemove);
    }

    //3.2 премахване на елемент от празна database
    @Test(expected = OperationNotSupportedException.class)
    public void testRemoveElementFromEmptyDatabaseThrows() throws OperationNotSupportedException {
        for (int i = 0; i < PEOPLE.length; i++) {
            database.remove();
        }
        //empty database
        database.remove();
    }

    //4. findByUsername
    @Test
    //4.1 search by valid username
    public void testFindByUsername() throws OperationNotSupportedException {
        //[ (1, "Boris"), (2, "Petar"), (3, "Ivan") ]
        Person personFound = database.findByUsername("Ivan");
        Person personSearched = PEOPLE[PEOPLE.length - 1];
        Assert.assertEquals(personFound, personSearched);
    }

    //4.2 Find by null username
    @Test(expected = OperationNotSupportedException.class)
    public void testFindByNullUsername() throws OperationNotSupportedException {

        database.findByUsername(null);
    }

    //4.3 search/find in empty database of people
    @Test(expected = OperationNotSupportedException.class)
    public void testFindByUsernameInEmptyDatabase() throws OperationNotSupportedException {
        Database emptyDatabase = new Database();
        emptyDatabase.findByUsername("Go6o");
    }

    //4.4 Find nonValidUsername
    @Test (expected = OperationNotSupportedException.class)
    public void testFindByNotValidUsername () throws OperationNotSupportedException {
        database.findByUsername("MagicHero");
    }

    //5. findById

    //5.1 search validId
    @Test
    public void testFindIdByValidId () throws OperationNotSupportedException {
        Person personById = database.findById(1);
        Person person = PEOPLE[0];
        Assert.assertEquals(personById, person);
    }

    //5.2 search notValidId
    @Test (expected = OperationNotSupportedException.class)
    public void testFindIdByNonValidId () throws OperationNotSupportedException {
        database.findById(12);
    }

}
