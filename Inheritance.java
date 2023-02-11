import java.util.Scanner;

 class Vehicles{

  String registrationNumber;
  String rcBookNumber;
  String manufacturer;
  String vehicleType;
  String NumberofWheels;
  String model;
  String numberOfSeats;
  
  public void GetData(){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter Registration Number: ");
  registrationNumber = sc.nextLine();

  System.out.println("Enter rcbook Number:");
  rcBookNumber = sc.nextLine();

  System.out.println("Enter Manufacturer Name:");
  manufacturer = sc.nextLine();
  
  System.out.println("Enter Vehicle type:");
  vehicleType = sc.nextLine();

  System.out.println("Enter Number Of Wheels: ");
  NumberofWheels = sc.nextLine();

  System.out.println("Enter Model Name: ");
  model = sc.nextLine(); 
  
  System.out.println("Enter Seating Capacity: ");
  numberOfSeats = sc.nextLine();
 }

  public void SetData(){
  System.out.println("\t" + registrationNumber + "\t" + rcBookNumber +"\t" + manufacturer +"\t" + vehicleType + "\t" + NumberofWheels + "\t" + model + "\t" + numberOfSeats);
   }  
  } 

  class Car extends Vehicles{
  }

  class Train extends Vehicles{
   }

  class Truck extends Vehicles{
  
 String registrationNumber;
    }
  
  class Inheritance{
  public static void main(String args[]){
  System.out.println("Enter Details of Car:");
  Car C = new Car();
  C.GetData();

  System.out.println("Enter Details of Train:");
  Train t = new Train();
  t.GetData();

  System.out.println("Enter Details of Truck:");
  Truck T = new Truck();
  T.GetData();

  System.out.println("\nDetails of Vehicles:\n");
  C.SetData();
  t.SetData();
  T.SetData();
   }
  }   