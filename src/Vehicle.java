/**
 * Created by Ares on 9/16/2016.
 */
import java.util.Scanner;
public class Vehicle {

            private String makeModel;
            private double modelYear;
            private boolean wheelDrive;
            private double retailPrice;
            private double mpg;

        public Vehicle() {
                this.makeModel = "";
                this.modelYear = 0;
                this.wheelDrive = false;
                this.retailPrice = 0;
                this.mpg = 0;        }

        public Vehicle(String makeModel, double modelYear, boolean wheelDrive, double retailPrice,
                     double mpg){
                this.makeModel = makeModel;
                this.modelYear = modelYear;
                this.wheelDrive = wheelDrive;
                this.retailPrice = retailPrice;
                this.mpg = mpg;   }

        //get functions
        public String getMakeModel() {
                return (this.makeModel);        }
        public double getModelYear() {
                return (this.modelYear);        }
        public boolean getWheelDrive() {
                return (this.wheelDrive);        }
        public double getRetailPrice() {
                return (this.retailPrice);        }
        public double getMpg() {
                return (this.mpg);        }

        //set functions
        public void setMakeModel(String placeHolder) {
                this.makeModel = placeHolder;        }
        public void setModelYear(double placeHolder) {
                this.modelYear = placeHolder;        }
        public void setWheelDrive(boolean placeHolder) {
                this.wheelDrive = placeHolder;        }
        public void setRetailPrice(double placeHolder) {
                this.retailPrice = placeHolder;        }
        public void setMpg(double placeHolder) {
                this.mpg = placeHolder;        }


        //print function
        public void printVehicle () {
                if (this.modelYear == 0)
                        System.out.println("Error, no vehicles in file.");
                else {
                        System.out.println(this.modelYear + " " + this.makeModel);
                        if (this.wheelDrive == true)
                                System.out.println("4WD");
                        else
                                System.out.println("2WD");
                        System.out.println("$" + this.retailPrice);
                        System.out.println(this.mpg + "MPG");                }
        }
}
