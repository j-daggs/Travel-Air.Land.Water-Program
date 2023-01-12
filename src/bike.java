/*
======================================================================================================================
PROGRAM PURPOSE: The purpose of this program is to implement an bike class (including a String override).
Name: John Daggs, Chase Richardet
Date: 3/18/2022
Section: CSC 331-002
======================================================================================================================
*/
public class bike extends landTransportation {

    private int tireSize;
    private int seatHeight;
    private int numGear;

    public bike(int tireSize, int seatHeight, int numGear, String color, String type, String manufacturer, String model,
                String powerSource, int speed, double costPerPerson, int maxPassengers, String travelInstructions,
                int yearMade, String payment){
        super(color, type, manufacturer, model, powerSource, speed, costPerPerson, maxPassengers, travelInstructions, yearMade, payment);
        this.tireSize = tireSize;
        this.seatHeight = seatHeight;
        this.numGear = numGear;
    }

    // Mutators

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    public void setNumGear(int numGear) {
        this.numGear = numGear;
    }

    // Accessors

    public int getTireSize() {
        return this.tireSize;
    }

    public int getSeatHeight() {
        return this.seatHeight;
    }

    public int getNumGear() {
        return this.numGear;
    }

    @Override
    public String toString() {
        return String.format("%-1s%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-20s",
                super.toString(),
                "Tire Size ", this.tireSize + " inches",
                "Seat Height: ", this.seatHeight + " inches",
                "Number of Gears: ", this.numGear);
    }
}
