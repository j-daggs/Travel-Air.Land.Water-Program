/*
======================================================================================================================
PROGRAM PURPOSE: The purpose of this program is to first ask the user what type of transportation they want to use
                (Land, Air, Water). Then the options for the type selected are to be displayed for the selected type in
                a table format. Next, the program should ask the user to select which mode of transportation they want
                to use. When a selection is made, all information about the selected mode should be displayed. After
                that, the user is prompted to verify their selection. Then, the user is asked how many passengers need
                to travel. Once the number of passengers is selceted, the total cost is displayed along with the travel
                instructions.
Name: John Daggs, Chase Richardet
Date: 3/18/2022
Section: CSC 331-002
======================================================================================================================
*/

import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class WTCDaggsRichardet {

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static final DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        // air transportation instances
        plane boeing747 = new plane(211, 4, "not vtol", "jet", "Boeing 747", 43100,
                "needs paved runway to land", "cannot hover", "on board entertainment, bathrooms and concessions",
                "is foward propulsed", 614, 564.75, 467,
                "Departs at 10:30pm from ILM international airport", 2004, "ticket");

        plane harrierGR9 = new plane(30, 1, "is vtol", "jet engine", "Harrier GR7",
                38000, "can land on flat ground", "can hover",
                "no amenities", "is foward propulsed", 731, 4576.70, 1,
                "departs from ILM international airport at 1:00pm June 10th", 1974, "rental");

        helicopter bell412 = new helicopter(1, 4, "Bell 412", 20000, "can land on flat ground",
                "can hover", "no amenities", "is foward propulsed", 160, 350.00,
                13, "Go to ILM international airport at 3:42pm June 5th", 1995, "ticket");

        helicopter MILV12 = new helicopter(2, 10, "MIL V12", 11500, "can land on flat ground",
                "can hover", "bathrooms and concessions", "is foward propulsed", 160, 789.74,
                196, "Go to ILM international airport at 10:50am July 14th", 1967, "ticket");

        hotairballoon hotAir1 = new hotairballoon(40, "Hot Air Baloon", 200, "can land on flat ground",
                "can hover", "no amenities", "not foward propulsed", 0, 500.43, 5,
                "Go to Writesville beach park at 9:52 Feburary 13th", 2004, "rental");


        dirigible GZ20 = new dirigible("helium", 45, 2, "Good Year Blimp", 7500,
                "can only land on specific airship docks", "can hover", "no amenites",
                "is foward propelled", 50, 1111.11, 6,
                "Go to ILM International Airport at 5:00pm", 1969, "ticket");

        // water transportation instances

        boat leopard42 = new boat("sail boat", "catamaran", "full kitchen, 4 cabins and 3 heads",
                "blue water sailboat", "Mrs.puff", "1 sail, 2 motors", "Not submersiable",
                9, 4000.00, 10, "Go to Seapath docks at 6:00am May 6th",
                2018, "rental");

        ship costa = new ship("cabins, fitness center, spa, sauna, bars, restaurants and much much more!",
                "Francesco Schettino", 1100, "cruise ship", "Costa Concordia", "6 engines",
                "non submersiable", 23, 979.99, 3780,
                "Go to the Miami port at 10:00pm June 9th", 2005, "ticket");

        submarine shark42 = new submarine("Davey Jones", 5, 1000, "Submarine","Shark42", "Two",
                "Yes", 50, 150.00, 12, "Go to the south end of Wrightsville Beach at 8:30am on March 28th.", 2006,
                "Ticket");


        // land transportation instances

        automobile rentalCar = new automobile("Yes", 27, "Yes", "White", "Pick-up Truck", "Ford", "F-150", "Gasoline", 120,
                20.00, 4, "Your rental will be available at the nearest Enterprise Rent-a-Car location.", 2017, "Rental");

        bike rentalBike = new bike(22, 32, 6, "Black", "Bicycle", "Mongoose", "Excursion",
                "Man-power", 20, 5.00, 1, "Go to Writesville beach park to pick up your rental.", 2018, "Rental");

        bus publicBus = new bus(88, "Dave Hamilton", "Yes", "Blue", "Bus", "Greyhound", "Coach33X", "Hybrid", 100, 10.00,
        50, "Board the Bus at 10:00 AM at Downtown Wilmington Bus Station #1.", 2004, "ticket");

        train publicTrain = new train("No", 12000, "Dave Train", "Red", "Train", "Amtrack", "X217", "Diesel-Electric", 140,
        12.00, 120, "Board your train at 11:15 AM at the Wilmington public Train Station.", 2003, "ticket");



        airTransportation[] airVehicles = {boeing747, harrierGR9, bell412, MILV12, hotAir1, GZ20};
        waterTransportation[] waterVehicles = {leopard42, costa, shark42};
        landTransportation[] landVehicles = {rentalCar, rentalBike, publicBus, publicTrain};

        //initalizing stuff and scanners

        int pick;
        int passCount;

        String method;
        Scanner m = new Scanner(System.in); //scanner for choosing method
        Scanner s = new Scanner(System.in);
        Scanner v = new Scanner(System.in);
        Scanner p = new Scanner(System.in);

        //user input for mode of transport aka air/land/water
        System.out.printf("\nWould you like to travel by land, air or water?\n");
        method = m.nextLine(); //mode of transport

        while (!"air".equals(method) && !"land".equals(method) && !"water".equals(method)) { //while loop sorting out invalid inputs
            System.out.print("Invalid input. Would you like to travel by land, air or water? ");
            method = m.nextLine();
        }//while loop sorting out invalid inputs

        //table formatting for showing all of a mode, works for air/land/water
        System.out.format("%-20s%-30s%-20s%-20s%-20s%-20s%n", "Selection num", "Name", "Cost Per Person", "Ticket/Rental", "Top Speed", "Max Passengers");


        if ("air".equals(method)) { // if statment for air selection
            for (int i = 0; i < airVehicles.length; i++) {// for loop-- printing name, cost per person, rental/ticket, speed, max passengers for each air vehicle
                System.out.format("%-20s%-30s%-20s%-20s%-20s%-20s%n", (i + 1), airVehicles[i].getModel(), airVehicles[i].getCostPerPerson(),
                        airVehicles[i].getPayment(), airVehicles[i].getSpeed(), airVehicles[i].getMaxPassengers());
            }//for loop-- printing name, cost per person, rental/ticket, speed, max passengers for each air vehicle

            String Vsure = "x";
            while ("x".equals(Vsure)) { //while loop-- allowing user to pick a different vehicle
                System.out.print("\nPlease enter the selection number of the vehicle you wish to fly");
                pick = s.nextInt();
                while((pick > airVehicles.length)){ // if an invalid pick is chosen, reprompt
                    System.out.print("\nERROR: Invalid Input. Please enter the selection number of the vehicle you wish to sail");
                    pick = s.nextInt();
                }
                System.out.print(airVehicles[pick - 1]); //printing all the states of selected vehicle

                System.out.print("\ntype x to pick another vehicle, type anything else to confirm.");
                Vsure = v.nextLine();

                if ("x".equals(Vsure)) { //if statement-- continues while loop if the user wants to pick a different vehicle,
                    continue;
                } // bypassing the passenger count input

                else {
                } //else statement -- goes on to allow the passinger count input

                System.out.printf("%nHow many passengers would you like to transport?");
                passCount = p.nextInt();

                while (passCount < 1 || passCount > airVehicles[pick - 1].getMaxPassengers()) {//while loop-- preventing invalid passenger count
                    System.out.printf("Invalid input, please pick an integer from 1 to " + airVehicles[pick - 1].getMaxPassengers());
                    passCount = p.nextInt();
                } //while loop-- preventing invalid passenger count

                //printing total cost and travel instructions
                System.out.printf("Total cost:" + passCount * airVehicles[pick - 1].getCostPerPerson() + "(USD)%n" + "Travel instructions: " + airVehicles[pick - 1].getTravelInstructions());
            }//while loop-- allowing user to pick a different vehicle
        } // if statment-- for air selection

        else if ("water".equals(method)) { // if statment for water selection
            for (int i = 0; i < waterVehicles.length; i++) {// for loop-- printing name, cost per person, rental/ticket, speed, max passengers for each air vehicle
                System.out.format("%-20s%-30s%-20s%-20s%-20s%-20s%n", (i + 1), waterVehicles[i].getName(),
                        waterVehicles[i].getCostPerPerson(), waterVehicles[i].getPayment(), waterVehicles[i].getSpeed(),
                        waterVehicles[i].getMaxPassengers());
            }//for loop-- printing name, cost per person, rental/ticket, speed, max passengers for each air vehicle

            String Vsure = "x";
            while ("x".equals(Vsure)) { //while loop-- allowing user to pick a different vehicle
                System.out.print("\nPlease enter the selection number of the vehicle you wish to sail");
                pick = s.nextInt();
                while((pick > waterVehicles.length)){ // if an invalid pick is chosen, reprompt
                    System.out.print("\nERROR: Invalid Input. Please enter the selection number of the vehicle you wish to sail");
                    pick = s.nextInt();
                }
                System.out.print(waterVehicles[pick - 1]); //printing all the states of selected vehicle

                System.out.print("\nType x to pick another vehicle, type anything else to confirm.");
                Vsure = v.nextLine();

                if ("x".equals(Vsure)) { //if statement-- continues while loop if the user wants to pick a different vehicle,
                    continue;
                } // bypassing the passenger count input

                else {
                } //else statement -- goes on to allow the passinger count input

                System.out.printf("%nHow many passengers would you like to transport?");
                passCount = p.nextInt();

                while (passCount < 1 || passCount > waterVehicles[pick - 1].getMaxPassengers()) {//while loop-- preventing invalid passenger count
                    System.out.printf("Invalid input, please pick an integer from 1 to " + waterVehicles[pick - 1].getMaxPassengers());
                    passCount = p.nextInt();
                } //while loop-- preventing invalid passenger count

                //printing total cost and travel instructions
                System.out.printf("Total cost:" + passCount * waterVehicles[pick - 1].getCostPerPerson() + "(USD)%n" + "Travel instructions: "
                        + waterVehicles[pick - 1].getTravelInstructions());
            }//while loop-- allowing user to pick a different vehicle
        } // if statment-- for water selection
        else if ("land".equals(method)) { // if statment for land selection
            for (int i = 0; i < landVehicles.length; i++) {// for loop-- printing name, cost per person, rental/ticket, speed, max passengers for each air vehicle
                System.out.format("%-20s%-30s%-20s%-20s%-20s%-20s%n", (i + 1), landVehicles[i].getManufacturer() + " " + landVehicles[i].getModel() + " (" + landVehicles[i].getType() + ")",
                        landVehicles[i].getCostPerPerson(), landVehicles[i].getPayment(), landVehicles[i].getSpeed(),
                        landVehicles[i].getMaxPassengers());
            }//for loop-- printing name, cost per person, rental/ticket, speed, max passengers for each air vehicle

            String Vsure = "x";
            while ("x".equals(Vsure)) { //while loop-- allowing user to pick a different vehicle
                System.out.print("\nPlease enter the selection number of the vehicle you wish to ride\n");
                pick = s.nextInt();
                while(pick > landVehicles.length){ // if an invalid pick is chosen, reprompt
                    System.out.print("\nERROR: Invalid Input. Please enter the selection number of the vehicle you wish to sail");
                    pick = s.nextInt();
                }
                System.out.print(landVehicles[pick - 1]); //printing all the states of selected vehicle

                System.out.print("\ntype x to pick another vehicle, type anything else to confirm.\n");
                Vsure = v.nextLine();

                if ("x".equals(Vsure)) { //if statement-- continues while loop if the user wants to pick a different vehicle,
                    continue;
                } // bypassing the passenger count input

                else {
                } //else statement -- goes on to allow the passinger count input

                System.out.printf("%nHow many passengers would you like to transport?");
                passCount = p.nextInt();

                while (passCount < 1 || passCount > landVehicles[pick - 1].getMaxPassengers()) {//while loop-- preventing invalid passenger count
                    System.out.printf("Invalid input, please pick an integer from 1 to " + landVehicles[pick - 1].getMaxPassengers());
                    passCount = p.nextInt();
                } //while loop-- preventing invalid passenger count

                //printing total cost and travel instructions
                System.out.printf("Total cost:" + passCount * landVehicles[pick - 1].getCostPerPerson() + "(USD)%n" + "Travel instructions: "
                        + landVehicles[pick - 1].getTravelInstructions());
            }//while loop-- allowing user to pick a different vehicle
        } // if statement for land selection

}//main
}//program

