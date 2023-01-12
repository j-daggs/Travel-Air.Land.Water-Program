/*
======================================================================================================================
PROGRAM PURPOSE: The purpose of this program is to implement an Transportation class (including a String override).
Name: John Daggs, Chase Richardet
Date: 3/18/2022
Section: CSC 331-002
======================================================================================================================
*/
public class transportation {
    private int speed;
    private double costPerPerson;
    private int maxPassengers;
    private String travelInstructions;
    private int yearMade;
    private String payment;

    public transportation(int speed,double costPerPerson,int maxPassengers,String travelInstructions, int yearMade, String payment){
        this.speed=speed;
        this.costPerPerson=costPerPerson;
        this.maxPassengers=maxPassengers;
        this.travelInstructions=travelInstructions;
        this.yearMade=yearMade;
        this.payment=payment;
    }
    public transportation(){
        //test
    }

    public void setSpeed(int speed){this.speed=speed;}
    public void setCostPerPerson(int speed){this.speed=speed;}
    public void setMaxPassengers(int speed){this.speed=speed;}
    public void setTravelInstructions(int speed){this.speed=speed;}
    public void setYearMade(int yearMade){this.yearMade=yearMade;}
    public void setPayment(String payment) {this.payment=payment;}

    //accessors
    public int getSpeed() {return this.speed;}
    public double getCostPerPerson() {return this.costPerPerson;}
    public int getMaxPassengers() {return this.maxPassengers;}
    public String getTravelInstructions() {return this.travelInstructions;}
    public int getYearMade() {return this.yearMade;}
    public String getPayment() {return this.payment;}



    @Override
    public String toString() {
        return String.format("%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-100s" +
                        "%n",
                "Speed (MPH)", this.speed,
                "Cost per person", this.costPerPerson,
                "Max Passengers", this.maxPassengers,
                "Year Made", this.yearMade,
                "Rental/ticket", this.payment,
                "Travel instructions", this.travelInstructions);
    }


}
