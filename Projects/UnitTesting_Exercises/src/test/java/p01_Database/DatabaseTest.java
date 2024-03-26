package p01_Database;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class DatabaseTest {
    private Database database;
    private static final Integer[] NUMBERS = {7, 45, 34, 12, 98, 23};

    @Before
    public void prepareDatabase() throws OperationNotSupportedException {
        database = new Database(NUMBERS);
    }

    //1.Конструктора
    //1.1 дали създава правилен обект
    @Test
    public void testConstructorCreatesValidObject() throws OperationNotSupportedException {
        //Дали в този database елементите са същите
        Integer[] elements = database.getElements();

        Assert.assertArrayEquals(elements, NUMBERS);

        //Или по този начин:
        //брой елементи
        //Assert.assertEquals(elements.length, NUMBERS.length);
        //стойностите на елементите(дали са същите)
        //for (int index = 0; index < elements.length; index++) {
        //Assert.assertEquals(elements[index], NUMBERS[index]);
        //}
    }


    //1.2 елементите > 16
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorThrowMoreThanSixteenElements() throws OperationNotSupportedException {
        Integer[] numbers = new Integer[17];
        new Database(numbers);
    }

    //1.3 елементите < 1
    @Test (expected = OperationNotSupportedException.class)
    public void testConstructorThrowLessThanOneElements() throws OperationNotSupportedException {
        Integer[] numbers = new Integer[0];
        new Database(numbers);
    }
    //2. add
    //2.1 успешно добавяме елемент
    @Test
    public void  testAddShouldAddElement () throws OperationNotSupportedException {
        // {7, 45, 34, 12, 98, 23}
        database.add(67); // {7, 45, 34, 12, 98, 23} -> {7, 45, 34, 12, 98, 23, 67}
        Integer[] elements = database.getElements();
        Assert.assertEquals("Invalid add operation", elements.length, NUMBERS.length + 1);
        //дали е адд-нало накрая:
        Assert.assertEquals(elements[elements.length - 1], Integer.valueOf(67));
    }
    //2.2 добавяне на null елемент
     @Test (expected = OperationNotSupportedException.class)
    public void testAddNullShouldThrow() throws OperationNotSupportedException {
        database.add(null);
     }

    //3. remove
    //3.1 успрешно премахване на елемент
    @Test
    public void testRemoveLastElement() throws OperationNotSupportedException {
        //{7, 45, 34, 12, 98, 23}
        database.remove(); // -> {7, 45, 34, 12, 98}
        Integer[] elements = database.getElements();
        Assert.assertEquals(elements.length, NUMBERS.length - 1);
        Assert.assertEquals(elements[elements.length - 1], Integer.valueOf(98));
    }
    //3.2 премахване на елемент от празна database
    @Test (expected = OperationNotSupportedException.class)
    public void testRemoveElementFromEmptyDatabaseThrows() throws OperationNotSupportedException {
        for (int i = 0; i < NUMBERS.length; i++) {
            database.remove();
        }
        //empty database
        database.remove();
    }
}