/**
 * Created by Ares on 9/16/2016.
 */
public class Truck extends Vehicle{

    //just for truck
    private boolean sideStep;
    private double towCompacity;

    public Truck () {
        super();
        this.sideStep = false;
        this.towCompacity = 0;
    }
    public Truck(String makeModel, double modelYear, boolean wheelDrive, double retailPrice,
                 double mpg, boolean sideStep, double towCompacity){
        super (makeModel, modelYear, wheelDrive, retailPrice, mpg);
        this.sideStep = sideStep;
        this.towCompacity = towCompacity;    }

    //get functions
    public boolean getSideStep() {
        return (this.sideStep);    }
    public double getTowCompacity() {
        return (this.towCompacity);    }

    //set functions
    public void setSideStep(boolean placeHolder){
        this.sideStep = placeHolder;    }
    public void setTowCompacity(double placeHolder){
        this.towCompacity = placeHolder;    }

    //print function
    public void printVehicle() {
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
            if (this.sideStep == true)
                System.out.println("Has side step");
            else
                System.out.println("No side step");
            System.out.println("Tow up to " + this.towCompacity + " tons");
        }
    }
}
