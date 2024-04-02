package com.itacademy;

  abstract class Transport {
    private String model;
    private int height;
    private int weight;
    private int maxSpeed;
    private int numberofdoors;


    public Transport() {
     //   System.out.println("1 Конструктор");

    }
    public Transport(String model, int height, int weight, int maxSpeed) {
        this.model = model;
        this.height = height;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
       // System.out.println("2 Конструктор");

    }
    public Transport(int weight) {
        this.weight = weight;
      //  System.out.println("3 Конструктор");
    }
    public int setNumberofdoors (int numberofdoors)
    {
        this.numberofdoors=numberofdoors;
        return numberofdoors;
    }

    public int getNumberofdoors ()
    {
        return numberofdoors;
    }
public int getMaxSpeed ()
{
    return maxSpeed;
}
public int setMaxSpeed (int maxSpeed)
{
    this.maxSpeed=maxSpeed;
    return maxSpeed;
}
    public int getWeight ()
    {
        return weight;
    }

    public int setWeight (int weight)
    {
        this.weight=weight;
        return weight;
    }

    public int getHeight ()
    {
        return height;
    }

    public int setHeight (int height)
    {
        this.height=height;
        return height;
    }

      public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
      public int getcartransportmethod()
      {
          return height;
      }
    public void cartransportmethod ()
    {

    }
    public abstract void carmodel ();





//public String toString()
//{
//    return model+ ","+ height+ ","+ weight+","+ maxSpeed;
//}

}











