/*
======================================================================================================================
PROGRAM PURPOSE: The purpose of this program is to implement a plane class (including a String override).
Name: John Daggs, Chase Richardet
Date: 3/18/2022
Section: CSC 331-002
======================================================================================================================
*/
public class plane extends airTransportation {
    int wingspan;
    int engineNum;
    String vtol;
    String propOrJet;


    //constructor
    public plane(int wingspan, int engineNum, String vtol, String propOrJet, String model,
                 int maxAltitude, String canLand, String hover, String amenities,
                 String forwardProp, int speed, double costPerPerson, int maxPassengers, String travelInstructions,
                 int yearMade, String payment) {
        super(model, maxAltitude, canLand, hover, amenities, forwardProp, speed, costPerPerson, maxPassengers, travelInstructions,
                yearMade, payment);
        this.wingspan = wingspan;
        this.engineNum = engineNum;
        this.vtol = vtol;
        this.propOrJet = propOrJet;
    }

    //mutators
    public void setWingspan(int wingspan) {this.wingspan = wingspan;}
    public void setEngineNum(int engineNum) {this.engineNum = engineNum;}
    public void setVtol(String vtol) {this.vtol = vtol;}

    //accessors
    public int getWingspan() {return this.wingspan;}
    public int getEngineNum() {return this.engineNum;}
    public String getVtol() {return this.vtol;}
    public String getPropOrJet() {return this.propOrJet;}

    @Override
    public String toString() {
        return String.format("%-1s%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-20s",
                super.toString(),
                "Wingspan", this.wingspan,
                "engineNum", this.engineNum,
                "vtol", this.vtol,
                "Propeller or jet", this.propOrJet);
    }
}
