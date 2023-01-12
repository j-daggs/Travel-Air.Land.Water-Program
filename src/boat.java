/*
======================================================================================================================
PROGRAM PURPOSE: The purpose of this program is to implement a boat class (including a String override).
Name: John Daggs, Chase Richardet
Date: 3/18/2022
Section: CSC 331-002
======================================================================================================================
*/
public class boat extends waterTransportation{
    String sails;
    String hullType;
    String cabin;

    public boat(String sails, String hullType, String cabin, String type,String name, String engineCount,String submersiable, int speed,
                double costPerPerson, int maxPassengers, String travelInstructions, int yearMade, String payment){
        super(type, name, engineCount, submersiable, speed, costPerPerson, maxPassengers, travelInstructions, yearMade, payment);
        this.sails=sails;
        this.hullType=hullType;
        this.cabin=cabin;
    }

    //mutators
    public void setSails(String sails){this.sails=sails;}
    public void setHullType(String hullType){this.hullType=hullType;}
    public void setCabin(String cabin){this.cabin=cabin;}

    //accessors
    public String getSails(){return this.sails;}
    public String getHullType(){return this.hullType;}
    public String getCabin(){return this.cabin;}


    @Override
    public String toString() {
        return String.format("%-1s%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-20s",
                super.toString(),
                "Power source", this.sails,
                "Hull type", this.hullType,
                "Cabin", this.cabin);
    }
}
