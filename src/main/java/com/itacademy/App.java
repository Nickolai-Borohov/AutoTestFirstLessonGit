package com.itacademy;


import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;

public class App {
    public static void main(String[] args) {
//        StringUtils str;
//        FileUtils utils;

//
//        Transport transport = new Transport("Ferrari", 150, 250, 200);
//        String model = transport.getModel();
            int abc =0;
        Car car = new Car("Lambo", 250, 350, 300);
        Bus bus = new Bus("Velik", 350, 450, 400);
        Battery battery = new Battery (9000);
        Radiator radiator=new Radiator ("Radiator");
        Engine engine = new Engine ("Engine");
        Car cars =new Car(engine,battery,radiator); //engine,battery,radiator
        AnyFirstClass firstClass = new AnyFirstClass("Hellow world");

        System.out.println(cars.getBattery().value + " " + cars.getRadiator().radiatorname + " " + cars.getEngine().enginename);
        //System.out.println(car.getModel());
        // System.out.println(bus);

        bus.printInfo();
        bus.printInfo("text");
        bus.printInfo(18);
        bus.cartransportmethod();
        car.cartransportmethod();
        car.carmodel();
        bus.carmodel();

        System.out.println("car");
        System.out.println(car.getModel());
        System.out.println(car.getHeight());
        System.out.println(car.getWeight());
        System.out.println(car.getMaxSpeed());
        System.out.println(firstClass.getText());
//
//        System.out.println("bus");
//        System.out.println(bus.getModel());
//        System.out.println(bus.height);
//        System.out.println(bus.weight);
//        System.out.println(bus.maxSpeed);
//        car.cartransportmethod();
    }
//    public static int plus (int a, int b)
//    {
//
//    }

}
