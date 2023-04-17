package org.example;

public class MotorVehicle {
    private String registrationNumber;
    private String color;
    private String bodyType;
    private double speed;


    public MotorVehicle() {}
    public MotorVehicle(String registrationNumber, String color, String bodyType, double speed) {
        this.registrationNumber = registrationNumber;
        this.color = color;
        this.bodyType = bodyType;
        this.speed = speed;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getColor() {
        return color;
    }

    public String getBodyType() {
        return bodyType;
    }

    public double getSpeed() {
        return speed;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

}
