import java.util.Scanner;

 public class Vehicles{

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

  class Inheritance6{
  public static void main(String args[]){
  Car C = new Car();
  C.GetData();
  
  System.out.println("\nDetails of Car:\n");
  C.SetData();
   }
 }   