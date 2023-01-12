/*
======================================================================================================================
PROGRAM PURPOSE: The purpose of this program is to implement an bus class (including a String override).
Name: John Daggs, Chase Richardet
Date: 3/18/2022
Section: CSC 331-002
======================================================================================================================
*/
public class bus extends landTransportation {

    private int tankSize;
    private String driver;
    private String restroomsAvailable;

    public bus(int tankSize, String driver, String restroomsAvailable, String color, String type, String manufacturer, String model, String powerSource, int speed, double costPerPerson,
               int maxPassengers, String travelInstructions, int yearMade, String payment){
        super(color, type, manufacturer, model, powerSource, speed, costPerPerson, maxPassengers, travelInstructions, yearMade, payment);
        this.tankSize = tankSize;
        this.driver = driver;
        this.restroomsAvailable = restroomsAvailable;
    }

    // Mutators

    public void setTankSize(int tankSize) {
        this.tankSize = tankSize;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setRestroomsAvailable(String restroomsAvailable) {
        this.restroomsAvailable = restroomsAvailable;
    }

    // Accessors


    public int getTankSize() {
        return this.tankSize;
    }

    public String getDriver() {
        return driver;
    }

    public String getRestroomsAvailable() {
        return restroomsAvailable;
    }

    @Override
    public String toString() {
        return String.format("%-1s%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-20s",
                super.toString(),
                "Restrooms Available? ", this.restroomsAvailable,
                "Tank Size: ", this.tankSize + " gallons",
                "Driver: ", this.driver);
    }
}
