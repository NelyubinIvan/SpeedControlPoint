package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SpeedControlCentreTest {

    @Test
    public void testNumberOfCarsByBodyType(){
        ArrayList<MotorVehicle> arrayOfCars = new ArrayList<>();
        MotorVehicle testCar1 = new MotorVehicle("a123aa", "Green", "sedan", 100);
        MotorVehicle testCar2 = new MotorVehicle("a333aa", "Black", "coupe", 133);
        MotorVehicle testCar3= new MotorVehicle("a444aa", "White", "SUV", 80);
        arrayOfCars.add(testCar1);
        arrayOfCars.add(testCar2);
        arrayOfCars.add(testCar3);
        ArrayList<Integer> testResult = new ArrayList<>(Arrays.asList(1,1,0,0,0, 1,0,0));
        assertEquals( testResult, SpeedControlCentre.numberOfCarsByBodyType(arrayOfCars));

    }
    @Test
    public void testAverageFlowRate(){
        ArrayList<MotorVehicle> arrayOfCars = new ArrayList<>();
        MotorVehicle testCar1 = new MotorVehicle("a123aa", "Green", "sedan", 100);
        MotorVehicle testCar2 = new MotorVehicle("a333aa", "Black", "coupe", 133);
        MotorVehicle testCar3= new MotorVehicle("a444aa", "White", "SUV", 80);
        arrayOfCars.add(testCar1);
        arrayOfCars.add(testCar2);
        arrayOfCars.add(testCar3);
        assertEquals(104.333, SpeedControlCentre.averageFlowRate(arrayOfCars),0.001);
    }
    @Test
    public void testNumberOfCarsThatHaveExceedTheSpeedLimit(){
        ArrayList<MotorVehicle> arrayOfCars = new ArrayList<>();
        MotorVehicle testCar1 = new MotorVehicle("a123aa", "Green", "sedan", 110);
        MotorVehicle testCar2 = new MotorVehicle("a333aa", "Black", "coupe", 133);
        MotorVehicle testCar3= new MotorVehicle("a444aa", "White", "SUV", 80);
        arrayOfCars.add(testCar1);
        arrayOfCars.add(testCar2);
        arrayOfCars.add(testCar3);
        assertEquals(2, SpeedControlCentre.numberOfCarsThatHaveExceedTheSpeedLimit(arrayOfCars));
    }


}