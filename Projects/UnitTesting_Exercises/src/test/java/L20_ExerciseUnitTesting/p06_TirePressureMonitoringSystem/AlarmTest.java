package L20_ExerciseUnitTesting.p06_TirePressureMonitoringSystem;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class AlarmTest {
    private Sensor sensor;
    //AlarmOn
    //1. налягането е под 17 -> true
    @Test
    public void testAlarmWithLowerValue () {
        Sensor sensor = Mockito.mock(Sensor.class);
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(15.3);
        Alarm alarm = new Alarm(sensor);
        alarm.check();
        Assert.assertTrue(alarm.getAlarmOn());
    }
    //2. налягането е над 21 -> true
    @Test
    public void testAlarmWithHigherValue () {
        Sensor sensor = Mockito.mock(Sensor.class);
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(25.3);
        Alarm alarm = new Alarm(sensor);
        alarm.check();
        Assert.assertTrue(alarm.getAlarmOn());
    }

    //3. налягането е между 17 и 21 -> false
    @Test
    public void testAlarmWithCorrectValue () {
        Sensor sensor = Mockito.mock(Sensor.class);
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(20.3);
        Alarm alarm = new Alarm(sensor);
        alarm.check();
        Assert.assertFalse(alarm.getAlarmOn());
    }
    //Sensor test
    //1. popNextPressurePsiValue >= 16(OFFSET)
    @Test
    public void testGetHigherOffsetValue () {
        sensor = new Sensor();
        double offsetValue = sensor.popNextPressurePsiValue();
        Assert.assertTrue(offsetValue > 16);
    }
}