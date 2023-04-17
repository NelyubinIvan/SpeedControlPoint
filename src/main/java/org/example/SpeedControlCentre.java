package org.example;

import java.util.ArrayList;


public class SpeedControlCentre {


    public static ArrayList<Integer> numberOfCarsByBodyType(ArrayList<MotorVehicle> arrayOfCars) {
        int numberOfSedans = 0;
        int numberOfCoupes = 0;
        int numberOfStationWagon = 0;
        int numberOfConvertibles = 0;
        int numberOfLimousines = 0;
        int numberOfSUVs = 0;
        int numberOfHatchbacks = 0;
        int numberOfPickups = 0;

        for (MotorVehicle car : arrayOfCars) {
            switch (car.getBodyType()) {
                case "sedan":
                    numberOfSedans += 1;
                    break;
                case "coupe":
                    numberOfCoupes += 1;
                    break;
                case "station wagon":
                    numberOfStationWagon += 1;
                    break;
                case "convertible":
                    numberOfConvertibles += 1;
                    break;
                case "limousine":
                    numberOfLimousines += 1;
                    break;
                case "SUV":
                    numberOfSUVs += 1;
                    break;
                case "hatchback":
                    numberOfHatchbacks += 1;
                    break;
                case "pickup truck":
                    numberOfPickups += 1;
                    break;
            }

        }


        ArrayList<Integer> numberOfCarsByBodyType = new ArrayList<>();

        numberOfCarsByBodyType.add(numberOfSedans);
        numberOfCarsByBodyType.add(numberOfCoupes);
        numberOfCarsByBodyType.add(numberOfStationWagon);
        numberOfCarsByBodyType.add(numberOfConvertibles);
        numberOfCarsByBodyType.add(numberOfLimousines);
        numberOfCarsByBodyType.add(numberOfSUVs);
        numberOfCarsByBodyType.add(numberOfHatchbacks);
        numberOfCarsByBodyType.add(numberOfPickups);
        return numberOfCarsByBodyType;
    }

    public static double averageFlowRate(ArrayList<MotorVehicle> arrayOfCars) {
        double flowRate = 0;

        for (MotorVehicle car : arrayOfCars) {
            flowRate += car.getSpeed();
        }
        return flowRate / arrayOfCars.size();
    }

    public static int numberOfCarsThatHaveExceedTheSpeedLimit(ArrayList<MotorVehicle> arrayOfCars) {
        int numberOfCarsThatHaveExceedTheSpeedLimit = 0;

        for (MotorVehicle car : arrayOfCars) {
            if (car.getSpeed() >= 110) {
                numberOfCarsThatHaveExceedTheSpeedLimit += 1;
            }
        }


        return numberOfCarsThatHaveExceedTheSpeedLimit;
    }
}

