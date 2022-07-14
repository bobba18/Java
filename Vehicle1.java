package learn.java;

public class Vehicle1 {

    private String color;
    private String vehicleType;
    private int wheels;


    public Vehicle1() {

    }

    public Vehicle1(String color, String vehicleType, int wheels) {
        this.color = color;
        this.vehicleType = vehicleType;
        this.wheels = wheels;
    }

    public String getColor() {
        return color;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public int getWheels() {
        return wheels;
    }

    public void speed() {
        System.out.println("Speed of vehicle");
    }
}
