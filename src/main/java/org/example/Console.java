package org.example;


import java.util.ArrayList;
import java.util.Scanner;

public class Console {

    public static void Start() {
        programContent();
        outputOfSpeedControlCentreStatistics(CreatingAnArray.theNumberOfCarsThatPassedTheSpeedControlCentre());
    }

    public static void programContent(){
        System.out.println("*******************************************************************************************************************");
        System.out.println("this program calculates the statistics of cars that have passed through the speed control point and outputs data: ");
        System.out.println("1) the number of cars that have passed by body type");
        System.out.println("2) the average flow rate ");
        System.out.println("3) the number of cars that have exceeded the speed limit of 110 km/h");
        System.out.println("*******************************************************************************************************************");
        System.out.println("Enter the number of cars that passed through the speed control centre ->");
    }

    public static void outputOfSpeedControlCentreStatistics(int numberOfCars) {
        ArrayList<MotorVehicle> arrayOfCars;
        arrayOfCars = CreatingAnArray.creatingAnArray(numberOfCars);

        System.out.println("Statistics :");
        System.out.println("1) number of cars driven by body type : ");

        ArrayList<Integer> statisticsOnTheNumberOfCarsByBodyType;
        statisticsOnTheNumberOfCarsByBodyType = SpeedControlCentre.numberOfCarsByBodyType(arrayOfCars);
        System.out.println("====================================================");
        System.out.println("The number of cars with sedan body type : " + statisticsOnTheNumberOfCarsByBodyType.get(0));
        System.out.println("The number of cars with the coupe body type : " + statisticsOnTheNumberOfCarsByBodyType.get(1));
        System.out.println("The number of cars with the wagon body type : " + statisticsOnTheNumberOfCarsByBodyType.get(2));
        System.out.println("The number of cars with a convertible body type : " + statisticsOnTheNumberOfCarsByBodyType.get(3));
        System.out.println("The number of cars with a limousine body type : " + statisticsOnTheNumberOfCarsByBodyType.get(4));
        System.out.println("The number of cars with the SUV body type : " + statisticsOnTheNumberOfCarsByBodyType.get(5));
        System.out.println("The number of cars with hatchback body type : " + statisticsOnTheNumberOfCarsByBodyType.get(6));
        System.out.println("The number of cars with a pickup truck body type : " + statisticsOnTheNumberOfCarsByBodyType.get(7));
        System.out.println("====================================================");
        System.out.print("2) average flow rate : ");
        System.out.println(SpeedControlCentre.averageFlowRate(arrayOfCars));
        System.out.print("3) the number of cars exceeding the speed limit : ");
        System.out.println(SpeedControlCentre.numberOfCarsThatHaveExceedTheSpeedLimit(arrayOfCars));

    }


    public static MotorVehicle enteringMachineParameters() {
        Scanner in = new Scanner(System.in);
        System.out.println("-Enter the machine parameters-");
        System.out.println("-----------------------------------------");
        System.out.println("Enter the registration number of the car ->");
        String registrationNumberOfTheCar = in.nextLine();
        System.out.println("-----------------------------------------");
        System.out.println("Enter the color of the machine ->");
        String carColor = in.nextLine();
        System.out.println("-----------------------------------------");
        System.out.println("Enter the car body type ->");
        String carBodyType = in.nextLine();
        System.out.println("-----------------------------------------");
        System.out.println("Enter the speed of the machine ->");
        double carSpeed = in.nextDouble();
        System.out.println("-----------------------------------------");
        return new MotorVehicle(registrationNumberOfTheCar, carColor, carBodyType, carSpeed);
    }


}

