package p03_IteratorTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.naming.OperationNotSupportedException;

public class ListIteratorTest {

    private ListIterator listIterator;
    private static final String[] DATA = {"Ivan", "Petar", "Georgi"};

    @Before
    public void setup() throws OperationNotSupportedException {
        listIterator = new ListIterator(DATA);
    }

    //1. constructor
    //1.1 Empty elements
    @Test(expected = OperationNotSupportedException.class)
    public void testConstructorWithNullList() throws OperationNotSupportedException {
        ListIterator listIterator1 = new ListIterator(null);
    }

    //2. hasNext + move
    @Test
    public void testMoveWithValidInput() {

        Assert.assertTrue(listIterator.hasNext());
        Assert.assertTrue(listIterator.move());
        Assert.assertTrue(listIterator.move());
        Assert.assertFalse(listIterator.move());
    }

    //3.Print

    //3.1 Empty elements List
    @Test (expected = IllegalStateException.class)
    public void testPrintWithEmptyThrows() throws IllegalStateException, OperationNotSupportedException {
        listIterator = new ListIterator();
        listIterator.print();
    }
    //3.2 With valid List with elements
    @Test
    public void testPrintWithValidInput () {
        //{"Ivan", "Petar", "Georgi"}
        int index = 0;
        while (listIterator.hasNext()) {
            Assert.assertEquals(listIterator.print(), DATA[index]);
            index++;
            listIterator.move();
        }

    }

}
