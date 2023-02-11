
  class Vehicle{
  String type;
  String company;

  public Vehicle(String type,String company){
  this.type = type;
  this.company = company;
  }

  public void displayVehicle(){
  System.out.println("Type Of Vehicle: "+this.type); 
  System.out.println("Name Of company: "+this.company);
  }
 }
 
 class Car extends Vehicle{
 public String name;
 public Car(String type,String company,String Car){
 super(type,company);
 this.name = name;
 }
  
 public void getName(){
 System.out.println("Type Of Vehicle: "+this.type);
 System.out.println("Name Of Company: "+this.company); 
 System.out.println("Name Of Car: "+this.name);
   }
 }
 class Inheritance2{
 public static void main(String args[]){
 
 Car c = new Car("SUV","Mahindra","Scorpio");
 Vehicle v = new Vehicle("SUV","Mahindra");
 v = (Car) c;
 v.displayVehicle();
 c.getName();
  }
 }