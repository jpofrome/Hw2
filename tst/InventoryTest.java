/**
 * Created by Ares on 9/23/2016.
 */
import org.junit.Test;
import org.junit.Assert;
public class InventoryTest {

    @Test
    public void testFindCheapestVehicleNormal(){
        //given
        Vehicle norm1 = new Vehicle("Ran Model", 2012, false, 12000, 26);
        Vehicle norm2 = new Vehicle("Ran Model", 2012, false, 11000, 26);
        Vehicle norm3 = new Vehicle("Ran Model", 2012, false, 10000, 26);
        Vehicle norm4 = new Vehicle("Ran Model", 2012, false, 200, 26);
        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(norm1);
        vehicleTest.addVehicle(norm2);
        vehicleTest.addVehicle(norm3);
        vehicleTest.addVehicle(norm4);

        //when
        vehicleTest.findCheapestVehicle();

        //then
        Assert.assertEquals("Not cheapest car", 200, vehicleTest.findCheapestVehicle());
    }

    @Test
    public void testFindCheapestVehicleZero(){
        //given
        Vehicle norm1 = new Vehicle("Ran Model", 2012, false, 12000, 26);
        Vehicle norm2 = new Vehicle("Ran Model", 2012, false, 11000, 26);
        Vehicle norm3 = new Vehicle("Ran Model", 2012, false, 10000, 26);
        Vehicle norm4 = new Vehicle("Ran Model", 2012, false, 0, 26);
        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(norm1);
        vehicleTest.addVehicle(norm2);
        vehicleTest.addVehicle(norm3);
        vehicleTest.addVehicle(norm4);

        //when
        vehicleTest.findCheapestVehicle();

        //then
        Assert.assertEquals("Not cheapest car", 0, vehicleTest.findCheapestVehicle());
    }

    @Test
    public void testFindCheapestVehicleNegative(){
        //given
        Vehicle norm1 = new Vehicle("Ran Model", 2012, false, 12000, 26);
        Vehicle norm2 = new Vehicle("Ran Model", 2012, false, 11000, 26);
        Vehicle norm3 = new Vehicle("Ran Model", 2012, false, 10000, 26);
        Vehicle norm4 = new Vehicle("Ran Model", 2012, false, -1, 26);
        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(norm1);
        vehicleTest.addVehicle(norm2);
        vehicleTest.addVehicle(norm3);
        vehicleTest.addVehicle(norm4);

        //when
        vehicleTest.findCheapestVehicle();

        //then
        Assert.assertEquals("Not cheapest car", -1, vehicleTest.findCheapestVehicle());
    }

    @Test
    public void testFindCheapestVehicleHigh(){
        //given
        Vehicle norm1 = new Vehicle("Ran Model", 2012, false, 12000, 26);
        Vehicle norm2 = new Vehicle("Ran Model", 2012, false, 11000, 26);
        Vehicle norm3 = new Vehicle("Ran Model", 2012, false, 10000, 26);
        Vehicle norm4 = new Vehicle("Ran Model", 2012, false, 1000000000, 26);
        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(norm1);
        vehicleTest.addVehicle(norm2);
        vehicleTest.addVehicle(norm3);
        vehicleTest.addVehicle(norm4);

        //when
        vehicleTest.findCheapestVehicle();

        //then
        Assert.assertEquals("Not cheapest car", 10000, vehicleTest.findCheapestVehicle());
    }

    @Test
    public void testFindMostExpensiveVehicleNormal(){
        //given
        Vehicle norm1 = new Vehicle("Ran Model", 2012, false, 12000, 26);
        Vehicle norm2 = new Vehicle("Ran Model", 2012, false, 11000, 26);
        Vehicle norm3 = new Vehicle("Ran Model", 2012, false, 10000, 26);
        Vehicle norm4 = new Vehicle("Ran Model", 2012, false, 13000, 26);
        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(norm1);
        vehicleTest.addVehicle(norm2);
        vehicleTest.addVehicle(norm3);
        vehicleTest.addVehicle(norm4);

        //when
        vehicleTest.findMostExpensiveVehicle();

        //then
        Assert.assertEquals("Not cheapest car", 13000, vehicleTest.findMostExpensiveVehicle());
    }

    @Test
    public void testFindMostExpensiveVehicleLarge(){
        //given
        Vehicle norm1 = new Vehicle("Ran Model", 2012, false, 12000, 26);
        Vehicle norm2 = new Vehicle("Ran Model", 2012, false, 11000, 26);
        Vehicle norm3 = new Vehicle("Ran Model", 2012, false, 10000, 26);
        Vehicle norm4 = new Vehicle("Ran Model", 2012, false, 1000000000, 26);
        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(norm1);
        vehicleTest.addVehicle(norm2);
        vehicleTest.addVehicle(norm3);
        vehicleTest.addVehicle(norm4);

        //when
        vehicleTest.findMostExpensiveVehicle();

        //then
        Assert.assertEquals("Not cheapest car", 1000000000, vehicleTest.findMostExpensiveVehicle());
    }


    @Test
    public void testFindMostExpensiveVehicleDecimalNegativeZero(){
        //given
        Vehicle norm1 = new Vehicle("Ran Model", 2012, false, 0, 26);
        Vehicle norm2 = new Vehicle("Ran Model", 2012, false, 11000.98, 26);
        Vehicle norm3 = new Vehicle("Ran Model", 2012, false, -8000, 26);
        Vehicle norm4 = new Vehicle("Ran Model", 2012, false, 500, 26);
        Inventory vehicleTest = new Inventory();
        vehicleTest.addVehicle(norm1);
        vehicleTest.addVehicle(norm2);
        vehicleTest.addVehicle(norm3);
        vehicleTest.addVehicle(norm4);

        //when
        vehicleTest.findMostExpensiveVehicle();

        //then
        Assert.assertEquals("Not cheapest car", 11000.98, vehicleTest.findMostExpensiveVehicle());
    }

}