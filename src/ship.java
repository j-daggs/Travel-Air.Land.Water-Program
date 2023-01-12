/*
======================================================================================================================
PROGRAM PURPOSE: The purpose of this program is to implement a ship class (including a String override).
Name: John Daggs, Chase Richardet
Date: 3/18/2022
Section: CSC 331-002
======================================================================================================================
*/
public class ship extends waterTransportation{
    private String amenities;
    private String captain;
    private int crew;

    //constructor
    public ship(String amenities,String captain,int crew, String type,String name, String engineCount,String submersiable, int speed,
                double costPerPerson, int maxPassengers, String travelInstructions, int yearMade, String payment){
        super(type, name, engineCount, submersiable, speed, costPerPerson, maxPassengers, travelInstructions, yearMade, payment);
        this.amenities=amenities;
        this.captain=captain;
        this.crew=crew;
    }

    //mutators
    public void setAmenities(String amenities){this.amenities=amenities;}
    public void setCaptain(String captain){this.captain=captain;}
    public void setCrew(int crew) {this.crew=crew;}

    //accessors
    public String getAmenities() {return this.amenities;}
    public String getCaptain() {return this.captain;}
    public int getCrew() {return this.crew;}

    @Override
    public String toString() {
        return String.format("%-1s%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-20s",
                super.toString(),
                "Amenities", this.amenities,
                "Captain", this.captain,
                "Crew count", this.crew);
    }


}
