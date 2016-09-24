/**
 * Created by Ares on 9/16/2016.
 */
public class Car extends Vehicle {

    //variable just for car
    private boolean convertible;

    public Car (){
        super();
        this.convertible = false;    }

    public Car(String makeModel, double modelYear, boolean wheelDrive, double retailPrice,
               double mpg, boolean convertible){
        super (makeModel, modelYear, wheelDrive, retailPrice, mpg);
        this.convertible = convertible;    }

    //get function
    public boolean getConvertible() {
        return (this.convertible);    }

    //set function
    public void setConvertible(boolean placeholder) {
        this.convertible = placeholder;    }

    //print function
    public void printVehicle () {
        if (getModelYear() == 0)
            System.out.print("Error, no vehicles in file.");
        else {
            System.out.println(getModelYear() + " " + getMakeModel());
            if (getWheelDrive() == true)
                System.out.println("4WD");
            else
                System.out.println("2WD");
            System.out.println("$" + getRetailPrice());
            System.out.println(getMpg() + "MPG");
            if (this.convertible == true)
                System.out.println("Convertible");
            else
                System.out.println("Not a convertible");        }
    }
}

//for print vehicle function:
// can put-  super.printVehicle();
// then just do the convertible part, also applies for truck