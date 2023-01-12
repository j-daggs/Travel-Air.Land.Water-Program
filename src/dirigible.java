public class dirigible extends airTransportation{
    String gasType;
    int diameter;
    int engineNum;

    public dirigible(String gasType,int diameter,int engineNum, String model,
                     int maxAltitude, String canLand, String hover, String amenities,
                     String forwardProp, int speed,double costPerPerson,int maxPassengers,String travelInstructions,
                     int yearMade, String payment) {
        super(model, maxAltitude, canLand, hover, amenities, forwardProp, speed, costPerPerson, maxPassengers, travelInstructions,
                yearMade, payment);
        this.gasType=gasType;
        this.diameter=diameter;
        this.engineNum=engineNum;
    }
    //mutators
    public void setGasType(String gasType) {this.gasType=gasType;}
    public void setDiameter(int diameter) {this.diameter=diameter;}
    public void setEngineNum(int engineNum) {this.engineNum=engineNum;}

    //accessors

    public String getGasType() {return this.gasType;}
    public int getDiameter() {return this.diameter;}
    public int getEngineNum() {return this.engineNum;}

    @Override
    public String toString() {
        return String.format("%-1s%-25s%-20s" +
                        "%n%-25s%-20s" +
                        "%n%-25s%-20s",
                super.toString(),
                "Gas type", this.gasType,
                "Diameter", this.diameter,
                "Engine count", this.engineNum);
    }
}
