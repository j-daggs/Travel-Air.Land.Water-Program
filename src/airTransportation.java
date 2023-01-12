/*
======================================================================================================================
PROGRAM PURPOSE: The purpose of this program is to implement an airTransportation class (including a String override).
Name: John Daggs, Chase Richardet
Date: 3/18/2022
Section: CSC 331-002
======================================================================================================================
*/

public class airTransportation extends transportation {
    private String model;
    private int maxAltitude;
    private String canLand; //where the vehicle can land
    private String hover;
    private String amenities;
    private String forwardProp;


    //constructor
    public airTransportation(String model, int maxAltitude, String canLand, String hover, String amenities,
                             String forwardProp, int speed, double costPerPerson, int maxPassengers, String travelInstructions,
                             int yearMade, String payment) {

        super(speed, costPerPerson, maxPassengers, travelInstructions, yearMade, payment);
        this.model = model;
        this.maxAltitude = maxAltitude;
        this.canLand = canLand;
        this.hover = hover;
        this.amenities = amenities;
        this.forwardProp = forwardProp;
    }

    public airTransportation() {
    }

    //mutators
    public void setModel(String model) {
        this.model = model;
    }

    public void setMaxAltitude(int maxAltitude) {
        this.maxAltitude = maxAltitude;
    }

    public void setCanLand(String canLand) {
        this.canLand = canLand;
    }

    public void setHover(String hover) {
        this.hover = hover;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public void setFowardProp(String fowardProp) {
        this.forwardProp = fowardProp;
    }


    //accessors
    public String getModel() {
        return this.model;
    }

    public int getMaxAltitude() {
        return this.maxAltitude;
    }

    public String getCanLand() {
        return this.canLand;
    }

    public String getHover() {
        return this.hover;
    }

    public String getAmenities() {
        return this.amenities;
    }

    public String getFowardProp() {
        return this.forwardProp;
    }

    @Override
    public String toString() {
        return String.format("%-1s%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-100s" +
                        "%n",
                super.toString(),
                "Model", this.model,
                "maxAltitude", this.maxAltitude,
                "can land", this.canLand,
                "hover", this.hover,
                "Foward propulsion", this.forwardProp,
                "amentities", this.amenities);
    }
}
