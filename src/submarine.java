/*
======================================================================================================================
PROGRAM PURPOSE: The purpose of this program is to implement a submarine class (including a String override).
Name: John Daggs, Chase Richardet
Date: 3/18/2022
Section: CSC 331-002
======================================================================================================================
*/
public class submarine extends waterTransportation{
    private String captain;
    private int crew;
    private int diveDepth;

    //constructor
    public submarine(String captain,int crew, int diveDepth, String type,String name, String engineCount,
                     String submersiable, int speed,double costPerPerson, int maxPassengers, String travelInstructions,
                     int yearMade, String payment){
        super(type, name, engineCount, submersiable, speed, costPerPerson, maxPassengers, travelInstructions,
                yearMade, payment);
        this.captain=captain;
        this.crew=crew;
        this.diveDepth=diveDepth;
    }

    //mutators
    public void setCaptain(String captain){this.captain=captain;}
    public void setCrew(int crew) {this.crew=crew;}
    public void setDiveDepth(int diveDepth){this.crew=crew;}

    //accessors
    public String getCaptain() {return this.captain;}
    public int getCrew() {return this.crew;}
    public int getDiveDepth() {return this.diveDepth;}

    @Override
    public String toString() {
        return String.format("%-1s%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-20s",
                super.toString(),
                "Captain", this.captain,
                "Crew count", this.crew,
                "Maximum dive depth", this.diveDepth);
    }





}
