import org.junit.Test;
import org.junit.Assert;

/**
 * Created by Ares on 9/21/2016.
 */
public class TruckTest {

    @Test
    public void testGetters() {
        //Given
        Truck truck = new Truck("Ram 1500", 2017, true, 26000, 29, false, 3);

        //When
        truck.printVehicle();

        //Then
        Assert.assertEquals("Model mismatch", "Ram 1500", truck.getMakeModel());
        Assert.assertEquals("Year mismatch", 2017, truck.getModelYear(), 0.0);
        Assert.assertEquals("WheelDrive mismatch", true, truck.getWheelDrive());
        Assert.assertEquals("Price mismatch", 26000, truck.getRetailPrice(), 0.0);
        Assert.assertEquals("MPG mismatch", 29, truck.getMpg(), 0.0);
        Assert.assertEquals("Side Step mismatch", false, truck.getSideStep());
        Assert.assertEquals("Tow Capacity mismatch", 3, truck.getTowCompacity(), 0.0);
    }


}
