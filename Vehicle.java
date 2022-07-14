package learn.java;

public class Vehicle {

    private int tyres;
    private int brakes;
    private int seats;
    private int sideViewMirrors;
    private int engine;

    public Vehicle(int tyres, int brakes, int seats, int sideViewMirrors, int engine) {
        this.tyres = tyres;
        this.brakes = brakes;
        this.seats = seats;
        this.sideViewMirrors = sideViewMirrors;
        this.engine = engine;

    }

    public int getTyres() {
        return tyres;
    }

    public int getBrakes() {
        return brakes;
    }

    public int getSeats() {
        return seats;
    }

    public int getSideViewMirrors() {
        return sideViewMirrors;
    }

    public int getEngine() {
        return engine;
    }

    public void drive() {
        System.out.println("Vehicle class");
    }
}
