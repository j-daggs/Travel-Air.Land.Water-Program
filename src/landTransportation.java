/*
======================================================================================================================
PROGRAM PURPOSE: The purpose of this program is to implement a landTransportation class (including a String override).
Name: John Daggs, Chase Richardet
Date: 3/18/2022
Section: CSC 331-002
======================================================================================================================
*/

public class landTransportation extends transportation {

    private String color;
    private String type;
    private String manufacturer;
    private String model;
    private String powerSource;

    public landTransportation(String color, String type, String manufacturer, String model, String powerSource, int speed, double costPerPerson, int maxPassengers, String travelInstructions,
                             int yearMade, String payment) {

        super(speed, costPerPerson, maxPassengers, travelInstructions, yearMade, payment);
        this.color = color;
        this.type = type;
        this.manufacturer = manufacturer;
        this.model = model;
        this.powerSource = powerSource;


    }

    public landTransportation(){

    }

    // Mutators

    public void setColor(String color) {
        this.color = color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPowerSource(String powerSource) {
        this.powerSource = powerSource;
    }

    // Accessors

    public String getColor() {
        return this.color;
    }

    public String getType() {
        return this.type;
    }

    public String getManufacturer(){
        return this.manufacturer;
    }

    public String getModel() {
        return this.model;
    }

    public String getPowerSource(){
        return this.powerSource;
    }
}
