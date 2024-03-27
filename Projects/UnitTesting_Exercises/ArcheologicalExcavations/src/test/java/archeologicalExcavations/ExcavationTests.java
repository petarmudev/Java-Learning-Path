package archeologicalExcavations;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ExcavationTests {
    private static final String EXPECTED_NAME = "Excavation";
    private static final int EXPECTED_CAPACITY = 2;
    private static final int EXPECTED_COUNT = 0;
    private Excavation excavation;

    @Before
    public void setup() {
        excavation = new Excavation(EXPECTED_NAME, EXPECTED_CAPACITY);
    }

    //1.Constructor test
    //name
    @Test(expected = NullPointerException.class)
    public void testConstructorShouldThrowWhenNameEmpty() {
        excavation = new Excavation("", EXPECTED_CAPACITY);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorShouldThrowWhenNameBlanc() {
        excavation = new Excavation("     ", EXPECTED_CAPACITY);
    }

    @Test(expected = NullPointerException.class)
    public void testConstructorShouldThrowWhenNameNull() {
        excavation = new Excavation(null, EXPECTED_CAPACITY);
    }

    //2.Capacity test
    @Test(expected = IllegalArgumentException.class)
    public void testConstructorShouldThrowWhenCapacityNegative() {
        excavation = new Excavation(EXPECTED_NAME, -1);
    }

    //3.Constructor with valid name and valid capacity
    @Test
    public void testConstructorWithValidInputs() {
        excavation = new Excavation(EXPECTED_NAME, EXPECTED_CAPACITY);
        Assert.assertEquals(EXPECTED_NAME, excavation.getName());
        Assert.assertEquals(EXPECTED_CAPACITY, excavation.getCapacity());
        Assert.assertEquals(EXPECTED_COUNT, excavation.getCount());

    }

    //4. Test addArchaeologist
    @Test(expected = IllegalArgumentException.class)
    public void testAddArchaeologistShouldThrowWhenNoCapacity() {

        Archaeologist archaeologist1 = new Archaeologist("Petar", 100);
        Archaeologist archaeologist2 = new Archaeologist("Georgi", 100);
        Archaeologist archaeologist3 = new Archaeologist("Ivan", 2);

        excavation.addArchaeologist(archaeologist1);
        excavation.addArchaeologist(archaeologist2);
        excavation.addArchaeologist(archaeologist3);
    }

    //4.1
    @Test(expected = IllegalArgumentException.class)
    public void testAddArchaeologistShouldThrowWhenSameName() {
        Archaeologist archaeologist1 = new Archaeologist("Petar", 100);
        Archaeologist archaeologist2 = new Archaeologist("Petar", 100);
        excavation.addArchaeologist(archaeologist1);
        excavation.addArchaeologist(archaeologist2);
    }

    //5. Test removeArchaeologist
    @Test
    public void testRemoveArchaeologistShouldRemoveSuccessfully() {
        Archaeologist archaeologist1 = new Archaeologist("Petar", 100);
        excavation.addArchaeologist(archaeologist1);
        boolean hasRemoved = excavation.removeArchaeologist("Petar");
        Assert.assertTrue(hasRemoved);

    }

    @Test
    public void testRemoveArchaeologistShouldRemoveUnsuccessfully() {
        boolean hasRemoved = excavation.removeArchaeologist("Petar");
        Assert.assertFalse(hasRemoved);
    }

}
