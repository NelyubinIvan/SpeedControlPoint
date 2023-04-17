package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class CreatingAnArray {
    public static int theNumberOfCarsThatPassedTheSpeedControlCentre() {
        Scanner in = new Scanner(System.in);
        int numberOfCars = in.nextInt();
        while (numberOfCars < 0) {
            System.out.println("error! the number of machines cannot be less than zero");
            System.out.println("enter the correct number of machines -> ");
            numberOfCars = in.nextInt();
        }
        return numberOfCars;
    }

    public static ArrayList<MotorVehicle> creatingAnArray(int numberOfCars) {
        ArrayList<MotorVehicle> arrayOfCars = new ArrayList<>();
        for (int i = 0; i < numberOfCars; i++) {
            arrayOfCars.add(Console.enteringMachineParameters());
        }
        return arrayOfCars;
    }

}
