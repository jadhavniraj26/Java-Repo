import java.util.*;
interface Taxable{
 public void cost();
  public void percentGST();
   }

  class Vehicles implements Taxable{

  String registrationNumber;
  String rcBookNumber;
  String manufacturer;
  String vehicleType;
  String NumberofWheels;
  String model;
  String numberOfSeats;
  int price;
  int tax;
  int gst;
  
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
 
 public void cost(){
 Scanner sc = new Scanner(System.in);
  System.out.println("Price of Vehicle:");
 price = sc.nextInt();
   } 

 public void percentGST(){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Amount of Tax:");
  tax = sc.nextInt();
  gst = ((price*tax)/100);
 System.out.println("Tax on Cost: "+gst);
   }
 }
 
  class Gadget implements Taxable{
  String n1;
  String processor;
  String Speed;
  String Memory;
  String Capacity;
  String Storage;
  String Screen;
  String Ports;
  String OS;
  int price;
  int tax;
  int gst;

  void GetData(){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter gadget name: ");
  n1 = sc.nextLine();

  System.out.println("Enter Processor name :");
  processor = sc.nextLine();

  System.out.println("Enter processor speed");
  Speed = sc.nextLine();
  
  System.out.println("Enter Memory Type:");
  Memory = sc.nextLine();

  System.out.println("Enter Memory Capacity: ");
  Capacity = sc.nextLine();

  System.out.println("Enter Storage Type: ");
  Storage = sc.nextLine();
  
  System.out.println("Enter Screen resolution:");
  Screen = sc.nextLine();
 
  System.out.println("OS Installed: ");
  OS = sc.nextLine(); 
 }

 void SetData(){
  System.out.println("\t" + n1 + "\t" + processor +"\t" + Speed +"\t" + Memory + "\t" + Capacity + "\t" + Storage + "\t" + Screen + "\t" + OS);
   } 
 
  public void cost(){
 Scanner sc = new Scanner(System.in);
  System.out.println("Price of Gadget:");
 price = sc.nextInt();
   } 

 public void percentGST(){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Amount of Tax:");
  tax = sc.nextInt();
  gst = ((price*tax)/100);
 System.out.println("Tax on Cost: "+gst);
   }
 }
 
 class Inheritance4{
 public static void main(String args[]){
 Vehicles V = new Vehicles();
 V.cost();
 V.percentGST();
 Gadget G = new Gadget();
 G.cost();
 G.percentGST(); 
    } 
 }