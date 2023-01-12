/*
======================================================================================================================
PROGRAM PURPOSE: The purpose of this program is to implement a water Transportation class
Name: John Daggs, Chase Richardet
Date: 3/18/2022
Section: CSC 331-002
======================================================================================================================
*/

public class waterTransportation extends transportation{
    String type;
    String name;
    String engineCount;
    String submersible; // edited to submersible (typo)

    //constructor
    public waterTransportation(String type,String name,String engineCount,String submersiable, int speed,
                               double costPerPerson, int maxPassengers, String travelInstructions,
                               int yearMade, String payment){
        super(speed, costPerPerson, maxPassengers, travelInstructions, yearMade, payment);
        this.type=type;
        this.name=name;
        this.engineCount=engineCount;
        this.submersible =submersiable;
    }

    public waterTransportation(){}

    //Mutators
    public void setType(String type) { this.type = type; }
    public void setName(String name) { this.name=name; }
    public void setEngineCount(String engineCount) { this.engineCount=engineCount; }
    public void setSubmersible(String submersible) {this.submersible = submersible;}


    //Accessors
    public String getType() {return this.type; }
    public String getName() { return this.name; }
    public String getEngineCount() {return this.engineCount;}
    public String getSubmersible() {return this.submersible; }

    @Override
    public String toString() {
        return String.format("%-1s%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n",
                super.toString(),
                "Type", this.type,
                "Name", this.name,
                "Engine count", this.engineCount,
                "Submersiable", this.submersible);
    }

}
