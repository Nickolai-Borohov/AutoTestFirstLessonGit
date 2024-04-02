package com.itacademy;

public class Bus extends Transport
{

    public Bus(String model, int height, int weight, int maxSpeed) {
//        setModel(model);
//        this.height = height;
//        this.weight = weight;
//        this.maxSpeed = maxSpeed;
        super (model,height,weight,maxSpeed);

    }
    @Override
    public void cartransportmethod ()
    {
setNumberofdoors(4);
System.out.println("Кол-во дверей= " + getNumberofdoors());
    }
    public void printInfo ()
    {
        System.out.println("Метод не принимает параметры");
    }

    public void printInfo (String str)
    {
        System.out.println("Метод принимает String");
    }
    public void printInfo (int digit)
    {
        System.out.println("Метод принимает int");
    }
    @Override
    public void carmodel ()
    {
        System.out.println("Metod carmodel");
    }

}

