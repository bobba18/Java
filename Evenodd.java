package com.company;
import java.util.Scanner;
public class Evenodd {
    public static void main(String[] args) {

//#1 TAKE INPUT AND CHECK NUMBER IS EVEN OR ODD
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter number to be checked: ");
//        int n = in.nextInt();
//        if(n%2==0)
//        {
//            System.out.println("EVEN");
//        }
//        else
//        {
//            System.out.println("ODD");
//        }

//#2 TAKE NAME INPUT AND PRINT GREETING MESSAGE FOR THAT NAME
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please Enter your name: ");
//        String name = in.next();
//        System.out.println("Good Morning " + name);

//#3 Input principal, time and rate(P,T,R) and find simple interest
        //#### simple interest--> principle-->deposited amount
        //####                    rate--> extra amount or interest
        //####                    time--> time in years
        //#### interest of 1 year --> rate % of principle amount
        //####                         rate/100 * principle
        //#### interest for n years --> rate/100 * principle * n
//        Scanner in = new Scanner(System.in);
//        System.out.println("PLEASE ENTER");
//        System.out.print("Money deposited(p): ");
//        float deposit = in.nextFloat();
//        System.out.print("Rate of interest(R): ");
//        float rate = in.nextFloat();
//        System.out.print("Time in years(T): ");
//        float time = in.nextFloat();
//        float interest = rate/100 * deposit * time ;
//        System.out.println("Yout interest (I) will be: "+ interest );
//#4 INPUT TWO NUMBERS AND AN OPERATOR AND CALCULATE THE VALUE AFTER OPERATION USING IF
        //###### use .equals (method) instead of == (operator)
        //###### == checks if both the objects are pointing to same memory location
        //###### .equals() checks if the value of both objects is same or not
//        Scanner in = new Scanner(System.in);
//        System.out.println("Please enter two integers: ");
//        System.out.print("n1 = ");
//        float n1 = in.nextFloat();
//        System.out.print("n2 = ");
//        float n2 = in.nextFloat();
//        System.out.print("Please enter any operand(+,-,*,/): ");
//        String operand = in.next();
//        float result;
//        if(operand.equals("+"))
//        {
//            result=n1+n2;
//            System.out.println("Result = "+ result);
//        }
//        else if(operand.equals("-"))
//        {
//            result = n1 - n2;
//            System.out.println("Result = "+ result);
//        }
//        else if(operand.equals("*"))
//        {
//            result = n1 * n2;
//            System.out.println("Result = "+ result);
//        }
//        else if(operand.equals("/"))
//        {
//            result = n1/n2;
//            System.out.println("Result = "+ result);
//        }
//        else
//        {
//            System.out.println("You have entered something wrong");
//        }
//#5 Input two numbers and print the largest number

//            Scanner in = new Scanner(System.in);
//            System.out.print("Enter two numbers to compare: ");
//            int a = in.nextInt();
//            int b = in.nextInt();
//            if(a>b)
//            {
//                System.out.println("a is greater than b");
//            }
//            else if(a==b)
//            {
//                System.out.println("both are equal");
//            }
//            else
//            {
//                System.out.println("b is greater than a");
//            }
//#6 Take input as rupee and convert it into dollar
        Scanner in = new Scanner(System.in);
        System.out.print("Enter in rupee: ");
        double rupee = in.nextDouble();
        double dollar = 0.0135*rupee;
        System.out.println( rupee +  " rupees = " + dollar + " dollar ");




    }
}