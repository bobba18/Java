package learn.java;

public class Car1 extends Vehicle1 {

    private String brand;
    private String carBodyType;
    private int steering;
    private int airBags;
    private int ledScreen;
    private int speakers;
    private int tweeters;
    private int defogger;
    private int weight;
    private int mileage;
    private int seats;
    private int bootSpace;


    public Car1(String color, String brand, String carBodyType, int steering, int airBags,
                int ledScreen, int speakers, int tweeters, int defogger, int weight, int mileage,
                int seats, int bootSpace) {
        super(color, "Car", 4);
        this.brand = brand;
        this.steering = steering;
        this.carBodyType = carBodyType;
        this.airBags = airBags;
        this.ledScreen = ledScreen;
        this.speakers = speakers;
        this.tweeters = tweeters;
        this.defogger = defogger;
        this.brand = brand;
        this.weight = weight;
        this.mileage = mileage;
        this.seats = seats;
        this.bootSpace = bootSpace;
    }


    public String getCarBodyType() {
        return carBodyType;
    }

    public int getSteering() {
        return steering;
    }

    public String getType() {
        return carBodyType;
    }

    public int getAirBags() {
        return airBags;
    }

    public int getLedScreen() {
        return ledScreen;
    }

    public int getSpeakers() {
        return speakers;
    }

    public int getTweeters() {
        return tweeters;
    }

    public int getDefogger() {
        return defogger;
    }

    public String getBrand() {
        return brand;
    }

    public int getWeight() {
        return weight;
    }

    public int getMileage() {
        return mileage;
    }

    public int getSeats() {
        return seats;
    }

    public int getBootSpace() {
        return bootSpace;
    }

    @Override
    public void speed() {
        System.out.println("Speed of car is");
    }

    public void changingGear() {
        System.out.println("Changes gear");
    }

    public void windScreenWiper() {
        System.out.println("Wipes wind screen");
    }

    public void reverse() {
        System.out.println("takes Reverse");
    }

    public void applyBreaks() {
        System.out.println("Applies break");
    }

    public void accelerate() {
        System.out.println("Speed modulation");
    }

    int a = Integer.parseInt("34");
}


