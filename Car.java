package learn.java;

import java.util.Locale;

public class Car {

    private int doors;
    private int wheels;
    private String model;
    private String engine;
    public String color;

    //Setter
    public void setColor(String color) {
        //"this" keyword points to the variable color declared in the class
        String validChoice = color.toLowerCase();
        if(validChoice.equals("black") || validChoice.equals("white")) {
            this.color = color.toUpperCase();
        } else {
            this.color = "Unknown";
        }
    }

    //getter
    public String getColor() {
        return color;
    }
}
