package com.company;

import java.util.Scanner;

public class CtoF {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("PLEASE ENTER TEMPERATURE IN CELSIUS");
        float celsius = in.nextFloat();
        float fahrenheit = (celsius*9/5)+32;
        System.out.println("TEMPERATURE IN FEHRENHEIT = "+ fahrenheit );

    }
}
