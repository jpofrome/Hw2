import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Ares on 9/21/2016.
 */


public class CarTest {

    @Test
    public void testGetters() {
        //Given
        Car car = new Car("Porsche Boxster", 2016, false, 52000, 32, true);

        //When
        car.printVehicle();

        //Then
        Assert.assertEquals("Model mismatch", "Porsche Boxster", car.getMakeModel());
        Assert.assertEquals("Year mismatch", 2016, car.getModelYear(), 0.0);
        Assert.assertEquals("WheelDrive mismatch", false, car.getWheelDrive());
        Assert.assertEquals("Price mismatch", 52000, car.getRetailPrice(), 0.0);
        Assert.assertEquals("MPG mismatch", 32, car.getMpg(), 0.0);
        Assert.assertEquals("Convertable mismatch", true, car.getConvertible());
    }
}
