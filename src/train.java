/*
======================================================================================================================
PROGRAM PURPOSE: The purpose of this program is to implement a train class (including a String override).
Name: John Daggs, Chase Richardet
Date: 3/18/2022
Section: CSC 331-002
======================================================================================================================
*/
public class train extends landTransportation {

    private String restroomsAvailable;
    private int weight;
    private String conductor;


    public train(String restroomsAvailable, int weight, String conductor, String color, String type, String manufacturer, String model, String powerSource, int speed, double costPerPerson, int maxPassengers, String travelInstructions,
                 int yearMade, String payment){
        super(color, type, manufacturer, model, powerSource, speed, costPerPerson, maxPassengers, travelInstructions, yearMade, payment);
        this.restroomsAvailable = restroomsAvailable;
        this.weight = weight;
        this.conductor = conductor;
    }

    // Mutators

    public void setRestroomsAvailable(String restroomsAvailable) {
        this.restroomsAvailable = restroomsAvailable;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    // Accessors


    public String getRestroomsAvailable(){
        return this.restroomsAvailable;
    }

    public int getWeight() {
        return this.weight;
    }

    public String getConductor() {
        return this.conductor;
    }

    @Override
    public String toString() {
        return String.format("%-1s%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-20s",
                super.toString(),
                "Restrooms Available? ", this.restroomsAvailable,
                "Weight: ", this.weight + " tons",
                "Conductor: ", this.conductor);
    }
}
