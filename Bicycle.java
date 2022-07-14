package learn.java;

public class Bicycle {

        private int cadence;
        private int gear;
        private int speed;

        // add an instance variable for the object ID
        public int id;

        // add a class variable for the
        // number of Bicycle objects instantiated
        public static int numberOfBicycles = 0;

        //instance method
        public void sayHi() {
            System.out.println("Hi");
        }

        //class method
        public static void sayHello() {
            System.out.println("Hello");
        }
}
