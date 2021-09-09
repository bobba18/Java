package com.company;
//package is folder
// "com" folder contains "company" folder which contains "main"

import java.util.Scanner;
//package for input
public class Main
//**********************class*****************************
//###public class main
//"public"--> this program can be used in other programs also
//"class Main"--> Main is the name of class we can also give another name to class
//if the class is public the class name and file name has to be same

{
	public static void main(String[] args)
//**********************main funciton*********************
//###public static void main(String[] args)
//"public"--> if the class is public the main function has to be public so others can see it
//"static"--> we are using function without creating any object first
//"void"--> return type
//"main"--> name of function it has to be main
//"(String[] args)" command line arguments
    {
        //println takes the cursor to new line whereas print does not
        System.out.println("I AM STARTING JAVA PROGRAM ");
        System.out.print("6 september ");
        System.out.println(2021);
        // Scanner is class Scanner(System.in) is object ans input is variable
        Scanner input = new Scanner(System.in);
        System.out.println(input.nextLine());
//        input.nextLine
//        input --> taking input from keyboard
//        --> .____ is specifying the type of input
//            '.next'--> input 'WORD'
//            '.nextLine'--> input 'LINE'
//            '.nextInt/float/double/long/boolean'--> input an 'INTEGER'/'FLOAT'..ETC
        //PRIMITIVE DATA TYPES
        //Int
        //Char
        //Float
        //Double(large decimal numbers)
        //Long(large integer values)
        //
        //A Data type which we cannot break further to create another data type
        //Eg
        //Int n = 10
        //We cannot break int data type
        //So it is primitive
        //Eg
        //String name="sabah"
        //We can break string data type into char datatype
        //So string is not primitive
        int roll_no = 1;
        //roll_no is identifier
        //identifier is name of a vairable, functions, class, pacakage etc
        //1 is literal
        //Literal : Any constant value which can be assigned to the variable is called as literal/constant.
        //size--> 4 bytes
        //it is used as default to store int thats why we use L in long data type
        char first_char ='S';
        //size--> 1 byte
        float decimal_number = 96876.8768f;
        //size--> 4 bytes
        // we use f because long is used default to store decimal values
        long large_integer = 868756586989L;
        //size--> 4 bytes
        boolean check = true;
        //size--> 1 byte

    }
}