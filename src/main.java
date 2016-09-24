/**
 * Created by Ares on 9/16/2016.
 */
import java.util.ArrayList;
    //import java.util.List;
public class main {
    public static void main(String[] args) {
        Car newCar1 = new Car("Honda Civic", 2013, false, 17000, 32, false);
        Car newCar2 = new Car("Porsche 918", 2014, false, 845000, 67, false);
        Car newCar3 = new Car("Porsche Boxster", 2016, false, 52000, 32, true);
        Truck newTruck1 = new Truck("Ford F-150", 2017, true, 27000, 26, true, 5);
        Truck newTruck2 = new Truck("Ram 1500", 2017, true, 26000, 29, false, 3);

        ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();

        Inventory vehicleInfo = new Inventory();
        vehicleInfo.addVehicle(newCar1);
        vehicleInfo.addVehicle(newCar2);
        vehicleInfo.addVehicle(newCar3);
        vehicleInfo.addVehicle(newTruck1);
        vehicleInfo.addVehicle(newTruck2);


        for (int i = 0; i < vehicleList.size(); i++) {
            vehicleList.get(i).printVehicle();
            System.out.println("");   }

    }
}
