/*
======================================================================================================================
PROGRAM PURPOSE: The purpose of this program is to implement a automobile class (including a String override).
Name: John Daggs, Chase Richardet
Date: 3/18/2022
Section: CSC 331-002
======================================================================================================================
*/
public class automobile extends landTransportation {

    private String windowsTinted;
    private int tankSize;
    private String bluetoothCapability;


    public automobile(String windowsTinted, int tankSize, String bluetoothCapability, String color, String type,
                      String manufacturer, String model, String powerSource, int speed, double costPerPerson,
                      int maxPassengers, String travelInstructions, int yearMade, String payment){
        super(color, type, manufacturer, model, powerSource, speed, costPerPerson, maxPassengers, travelInstructions,
                yearMade, payment);
        this.windowsTinted = windowsTinted;
        this.tankSize = tankSize;
        this.bluetoothCapability = bluetoothCapability;

    }

    public automobile(){


    }

    // Mutators

    public void setWindowsTinted(String windowsTinted) {
        this.windowsTinted = windowsTinted;
    }

    public void setTankSize(int tankSize) {
        this.tankSize = tankSize;
    }

    public void setBluetoothCapability(String bluetoothCapability) {
        this.bluetoothCapability = bluetoothCapability;
    }

    // Accessors
    public String getWindowsTinted() {
        return this.windowsTinted;
    }

    public int getTankSize() {
        return this.tankSize;
    }

    public String getBluetoothCapability() {
        return this.bluetoothCapability;
    }

    @Override
    public String toString() {
        return String.format("%-1s%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-20s",
                super.toString(),
                "Windows Tinted? ", this.windowsTinted,
                "Tank Size: ", this.tankSize + " gallons",
                "Bluetooth Capable? ", this.bluetoothCapability);
    }

}
