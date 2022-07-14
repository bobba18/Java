package learn.java;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Car porsche = new Car();
//        Car buggati = new Car();
//        Bicycle myBike = new Bicycle();
//        int id = myBike.id;
//        int numberOfBicycles = Bicycle.numberOfBicycles;
//        Bicycle.sayHello();
//        myBike.sayHi();

//
//        buggati.setColor("Orange");
//        System.out.println(buggati.getColor());

//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

//        Person person = new Person();
//        person.setFirstName("");   // firstName is set to empty string
//        person.setLastName("");    // lastName is set to empty string
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");    // firstName is set to John
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");    // lastName is set to Smith
//        System.out.println("fullName= " + person.getFullName());

//        BankAccount account1 = new BankAccount(); //12245682, 20000.0,
              //  "Sabah Yunus Shiakh", "sabayshaikh44@gmail.com", 9284516202L);
//        account1.setAccountNumber(12245682);
//        account1.setBalance(20000.0);
//        account1.setCustomerName("Sabah Yunus Shiakh");
//        account1.setEmailId("sabayshaikh44@gmail.com");
//        account1.setPhoneNumber(9284516202L);
//        System.out.println(account1.getAccountNumber());
//        System.out.println(account1.getBalance());
//        System.out.println(account1.getCustomerName());
//        System.out.println(account1.getEmailId());
//        System.out.println(account1.getPhoneNumber());
//        account1.setdeposit(3000);
//        account1.setwithdraw(200);
//        System.out.println(account1.getBalance());
//        account1.setwithdraw(21.0);

//        VipCustomer customer1 = new VipCustomer();
//        System.out.println(customer1.getCreditLimit());
//        System.out.println(customer1.getEmailId());
//        System.out.println(customer1.getName());
//
//        VipCustomer customer2 = new VipCustomer("sabah", 16000);
//        System.out.println(customer2.getCreditLimit());
//        System.out.println(customer2.getEmailId());
//        System.out.println(customer2.getName());
//
//        VipCustomer customer3 = new VipCustomer("asfiya", 1000, "asfiya@gmail.com");
//        System.out.println(customer3.getCreditLimit());
//        System.out.println(customer3.getEmailId());
//        System.out.println(customer3.getName());

//        Point first = new Point(6, 5);
//        Point second = new Point(3, 1);
//        System.out.println("distance(0,0)= " + first.distance());
//        System.out.println("distance(second)= " + first.distance(second));
//        System.out.println("distance(2,2)= " + first.distance(2, 2));
//        Point point = new Point();
//        System.out.println("distance()= " + point.distance());

//        ComplexNumber one = new ComplexNumber(1.0, 1.0);
//        ComplexNumber number = new ComplexNumber(2.5, -1.5);
//        one.add(1,1);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        one.subtract(number);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        number.subtract(one);
//        System.out.println("number.real= " + number.getReal());
//        System.out.println("number.imaginary= " + number.getImaginary());

//        Vehicle vehicle = new Vehicle(2,2,1,1,1);
//        System.out.println(vehicle.getBrakes());
//        Cycle cycle = new Cycle(1,1,1,2,1,1,1,false);
//
//        System.out.println(cycle.getBrakes());
//        System.out.println(cycle.getPillionSeat());
//
//
//        Scanner scan = new Scanner(System.in);

//        Vehicle1 vehicle = new Vehicle1();
//        System.out.println("Type of vehicle: " + vehicle.getVehicleType());
//        System.out.println("Vehicle color: " + vehicle.getColor());
//        System.out.println("No. of wheels: " + vehicle.getWheels());
//        vehicle.speed();
//
//        System.out.println();
//
//        Vehicle1 vehicle2 = new Vehicle1("Black","Cycle",2);
//        System.out.println("No. of wheels: " + vehicle2.getWheels());
//        System.out.println("Vehicle Type: " + vehicle2.getVehicleType());
//        System.out.println("Vehicle color: " + vehicle2.getColor());
//
//        System.out.println();
//
//        Car1 car = new Car1("Black", "Tata",
//                            "Hatchback", 1, 2, 0, 4, 2, 0, 980, 345,
//                             5, 345);
//        System.out.println("Car color: " + car.getColor());
//        System.out.println("Car Brand: " + car.getBrand());
//        System.out.println("Car car body type: " + car.getCarBodyType());
//        System.out.println("Car steering: " + car.getSteering());
//        System.out.println("Car air bags: " + car.getAirBags());
//        System.out.println("Car led screen: " + car.getLedScreen());
//        System.out.println("Car speakers: " + car.getSpeakers());
//        System.out.println("Car tweeters: " + car.getTweeters());
//        System.out.println("Car defogger: " + car.getDefogger());
//        System.out.println("Car weight: " + car.getWeight());
//        System.out.println("Car mileage: " + car.getMileage());
//        System.out.println("Car seats: " + car.getSeats());
//        System.out.println("Car boot space: " + car.getBootSpace());
//        car.accelerate();
//        car.applyBreaks();
//        car.changingGear();
//        car.speed();
//        car.windScreenWiper();
//        car.reverse();
//
//        System.out.println();
//
//        Tata tataCar = new Tata("Grey", "Tata",
//                "Hatchback", 1, 2, 0, 4, 2, 0, 980, 345,
//                5, 345, 5, 5.99, 120, "Altroz");
//
//        System.out.println("Type of vehicle: " + tataCar.getVehicleType());
//        System.out.println("Vehicle color: " + tataCar.getColor());
//        System.out.println("No. of wheels: " + tataCar.getWheels());
//        System.out.println("Car Brand: " + tataCar.getBrand());
//        System.out.println("Model name: " + tataCar.getModelName());
//        System.out.println("Car body type: " + tataCar.getCarBodyType());
//        System.out.println("Car steering: " + tataCar.getSteering());
//        System.out.println("Car air bags: " + tataCar.getAirBags());
//        System.out.println("Car led screen: " + tataCar.getLedScreen());
//        System.out.println("Car speakers: " + tataCar.getSpeakers());
//        System.out.println("Car tweeters: " + tataCar.getTweeters());
//        System.out.println("Car defogger: " + tataCar.getDefogger());
//        System.out.println("Car weight: " + tataCar.getWeight());
//        System.out.println("Car mileage: " + tataCar.getMileage());
//        System.out.println("Car seats: " + tataCar.getSeats());
//        System.out.println("Car boot space: " + tataCar.getBootSpace());
//        System.out.println("Starting price: " + tataCar.getStartPrice());
//        System.out.println("Safety rating: " + tataCar.getSafetyRating());
//        System.out.println("Speed limit: " + tataCar.getSpeedLimit());

//        int a = Integer.parseInt("34");
//        System.out.println(a);

        Circle circle = new Circle(3.75);
        System.out.println("circle.radius= " + circle.getRadius());
        System.out.println("circle.area= " + circle.getArea());
        Cylinder cylinder = new Cylinder(5.55, 7.25);
        System.out.println("cylinder.radius= " + cylinder.getRadius());
        System.out.println("cylinder.height= " + cylinder.getHeight());
        System.out.println("cylinder.area= " + cylinder.getArea());
        System.out.println("cylinder.volume= " + cylinder.getVolume());
    }
}
