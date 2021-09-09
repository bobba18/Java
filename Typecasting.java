package com.company;

public class Typecasting {
    public static void main(String[] args)
    {
        //*********Type_casting**********
        //converting a type of data to store it into another type
        //data_type variable = (data_type) literal ;
        int a = 0;//good
        int z = (int) 5.9;//typecast 4.5 which is of type float/double to int
        System.out.println(z);//it will round of to lower values eg 8.9->8

        //**********primitive data types*******
        //java will automatically cast up, and we have to cast it down
            byte b=1;
            short s = 8756;
            char c = 'A';
            int i = 859;
            long l = 9865986;
            float f = 75.86f;
            double d =9868.9069685;
            //storing low size data type to large size data type
            double j = c;
            System.out.println(j);
            //storing large size data type to low size by typecasting it.
            char x = (char)f;
            System.out.println(x);
            System.out.println((d*b)+" "+(f/s)+" "+(i+c));
            //((double*byte)-->double (float-short)-->float (int+char)-->int
            System.out.println((d*b)+(f-s)-(i+c));
            System.out.println(((byte)d*b)+" "+((short)f/s)+" "+((char)i+c));
            //((double*byte)-->double (float-short)-->float (int+char)-->int
            System.out.println(((byte)d*b)+((short)f-s)-((char)i+c));
            byte p = (byte)9868.9069685;
            System.out.println(p);
            short u = (short)75.86f;
            System.out.println(u);
            char h = (char)859;
            int o = c;
            System.out.println(h);
            System.out.println(o);



    }
}
