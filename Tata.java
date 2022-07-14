package learn.java;

import javax.swing.plaf.basic.BasicIconFactory;

public class Tata extends Car1{

    private int safetyRating;
    private double startPrice;
    private int speedLimit;
    private String modelName;

    public Tata(String color, String brand, String carBodyType, int steering, int airBags,
                int ledScreen, int speakers, int tweeters, int defogger, int weight, int mileage,
                int seats, int bootSpace, int safetyRating,
                double startPrice, int speedLimit, String modelName) {

        super(color,"TATA", carBodyType,1, airBags, ledScreen, speakers, tweeters
             ,defogger, weight, mileage, seats, bootSpace);
        this.safetyRating = safetyRating;
        this.speedLimit = speedLimit;
        this.startPrice = startPrice;       
        this.modelName = modelName;
    }

    public int getSafetyRating() {
        return safetyRating;
    }

    public double getStartPrice() {
        return startPrice;
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public String getModelName() {
        return modelName;
    }

}
