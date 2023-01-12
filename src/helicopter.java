/*
======================================================================================================================
PROGRAM PURPOSE: The purpose of this program is to implement an helicopter class (including a String override).
Name: John Daggs, Chase Richardet
Date: 3/18/2022
Section: CSC 331-002
======================================================================================================================
*/
public class helicopter extends airTransportation{
    int rotorNum;
    int bladesNum;;
    public helicopter(int rotorNum, int bladesNum, String model,
                      int maxAltitude, String canLand, String hover, String amenities,
                      String fowardProp, int speed,double costPerPerson,int maxPassengers,String travelInstructions,
                      int yearMade, String payment){
        super(model, maxAltitude, canLand, hover, amenities, fowardProp, speed, costPerPerson, maxPassengers, travelInstructions,
                yearMade, payment);
        this.rotorNum=rotorNum;
        this.bladesNum=bladesNum;
    }

    //accessors
    public void setRotorNum(int rotorNum) {this.rotorNum=rotorNum;}
    public void setBladesNum(int bladesNum) {this.bladesNum=bladesNum;}

    //mutators

    public int getRotorNum() {return this.rotorNum;}
    public int getBladesNum() {return this.bladesNum;}


    @Override
    public String toString() {
        return String.format("%-1s%-25s%-20s" +
                        "%n%-25s%-20s",
                super.toString(),
                "Rotor Count", this.rotorNum,
                "Blade count", this.bladesNum);
    }
}
