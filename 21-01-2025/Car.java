public class Car {
    private String make;
    private double price;
    private int year;
    private String color;
    private String[] parts;

  public Car(String make, double price, int year, String color, String[] parts) {
    this.make = make;
    this.price = price;
    this.year = year;
    this.color = color;
    this.parts = parts;
  }
  public Car(Car source)
{
  this.make=source.make;
  this.price= source.price;
  this.year = source.year;
  this.color = source.color;
  this.parts = source.parts;
}

public String getMake()
{
  return make;
}
public void setMake(String make)
{
  this.make=make;
}
public double getPrice()
{
  return price;
}
public void setPrice(double price)
{
  this.price=price;
}
public int getYear()
{
  return year;
}
public void setYear(int year)
{
  this.year=year;
}
public String getColor()
{
  return color;
}
public void setColor(String color)
{
  this.color=color;
}

public void drive()
{
  System.out.println("you bought the beautiful "+ this.year+ " " + this.color + " " + this.make + " " + this.price );
  System.out.println("please drive to the nearest exit");
}

public String toString()
{
  return getClass().getName() + " @ " +Integer.toHexString(hashCode());
}
}
