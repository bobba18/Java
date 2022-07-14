package learn.java;

public class Cycle extends Vehicle{

    private int stand;
    private int pillionSeat;
    private boolean isElectric;

    public Cycle(int tyres, int brakes, int seats, int sideViewMirrors, int engine, int stand, int pillionSeat, boolean isElectric) {
        super(2, 2, 1, 2, 0);
        this.stand = stand;
        this.pillionSeat = pillionSeat;
        this.isElectric = isElectric;
    }

    public int getStand() {
        return stand;
    }

    public int getPillionSeat() {
        return pillionSeat;
    }

    public boolean isElectric() {
        return isElectric;
    }

    @Override
    //drive() of Cycle class i.e. child class is overriding drive() of Vehicle class i.e. parent class
    public void drive() {
        //this is calling drive() of parent class
        speed();
        super.drive();
        System.out.println("Cycle class");
    }

    private void speed() {
        System.out.println("Speed of cycle is 50 mph");
    }
}
