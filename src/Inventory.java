/**
 * Created by Ares on 9/22/2016.
 */
import java.util.ArrayList;
public class Inventory {

    private ArrayList<Vehicle> inventory = new ArrayList<Vehicle>();

    //constructor
    public void Inventory(){
        this.inventory = null; }

    //Add and remove vehicle functions
    public void addVehicle(Vehicle x) {
        this.inventory.add(x);
    }

    public void removeVehicle(Vehicle x) {
        this.inventory.remove(x);
    }

    // find vehicle prices
    public Vehicle findCheapestVehicle(){

        double placeHolder = Double.MAX_VALUE;
        Vehicle temp = new Vehicle();

        for (int i = 0; i < this.inventory.size(); i++){
            if (inventory.get(i).getRetailPrice() < placeHolder) {
                placeHolder = inventory.get(i).getRetailPrice();
                temp = inventory.get(i);  }
        }

        return temp;
    }

    public Vehicle findMostExpensiveVehicle(){
        double placeHolder = Double.MIN_VALUE;
        Vehicle temp = new Vehicle();

        for (int i = 0; i < this.inventory.size(); i ++) {
            if (inventory.get(i).getRetailPrice() > placeHolder) {
                placeHolder = inventory.get(i).getRetailPrice();
                temp = inventory.get(i);            }
        }

        return temp;
    }

    public void printAveragePrice(){
        double placeHolder = 0;
        int var = 0;

        for (int i = 0; i < this.inventory.size(); i++) {
            placeHolder += inventory.get(i).getRetailPrice();
        }
        System.out.println("The average price of vehicles is " + (placeHolder/inventory.size()));
    }
}