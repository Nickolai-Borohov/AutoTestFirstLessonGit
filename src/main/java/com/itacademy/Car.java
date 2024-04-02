package com.itacademy;

public final class Car extends Transport {
   private Engine engine ;
   private Battery battery ;
   private Radiator radiator;
    public Car(String model, int height, int weight, int maxSpeed) {
//        setModel(model);
//        this.height = height;
//        this.weight = weight;
//        this.maxSpeed = maxSpeed;
        super (model,height,weight,maxSpeed);


    }
public Car (Engine engine,Battery battery,Radiator radiator)
{
    this.engine =engine;
    this.battery=battery;
    this.radiator=radiator;

}

public Radiator getRadiator()
{
    return radiator;
}

public Radiator setRadiator (Radiator radiator)
{
    this.radiator=radiator;
    return radiator;
}

public Battery getBattery ()
{
    return battery;
}

public Battery setBattery (Battery battery)
{
    this.battery=battery;
    return battery;
}

public Engine getEngine ()
{
    return engine;
}

public Engine setEngine (Engine engine)
{
    this.engine=engine;
    return engine;
}


    @Override public void cartransportmethod ()
    {
        final int square= getWeight()+getcartransportmethod();

        System.out.println("Height "+ getcartransportmethod());
    }
    @Override
    public void carmodel ()
    {
        System.out.println("Metod carmodel");
    }

    }


//@Override public void carmodel ()
//{
//
//}


