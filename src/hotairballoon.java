/*
======================================================================================================================
PROGRAM PURPOSE: The purpose of this program is to implement a hot ait balloon class (including a String override).
Name: John Daggs, Chase Richardet
Date: 3/18/2022
Section: CSC 331-002
======================================================================================================================
*/
public class hotairballoon extends airTransportation{

    private int diameter;

    //constructor
    public hotairballoon(int diameter, String model, int maxAltitude, String canLand, String hover, String amenities,
                         String forwardProp, int speed,double costPerPerson,int maxPassengers,String travelInstructions,
                         int yearMade, String payment) {
        super(model, maxAltitude, canLand, hover, amenities, forwardProp, speed, costPerPerson, maxPassengers,
                travelInstructions, yearMade, payment);
        this.diameter=diameter;
    }

    //mutators
    public void setDiameter(int diameter) {this.diameter = diameter;}

    //accessors
    public int getDiameter() {return this.diameter;}

    @Override
    public String toString() {
        return String.format("%-1s%-25s%-20s",
                super.toString(),
                "Diameter", this.diameter);
    }
}
