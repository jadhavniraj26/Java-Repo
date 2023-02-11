import java.util.*;
interface Taxable{
  public void cost();
  public void percentGST();
 }
 
 class Car implements Taxable{

  String manufacturer;
  String model;
  String numberOfSeats;
  int price;
  int tax;
  int gst;
  
  public void GetData(){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter Manufacturer Name:");
  manufacturer = sc.nextLine();

  System.out.println("Enter Model Name: ");
  model = sc.nextLine(); 
  
  System.out.println("Enter Seating Capacity: ");
  numberOfSeats = sc.nextLine();
 }

  public void SetData(){
  System.out.println("\t"+ manufacturer +"\t" + model + "\t" + numberOfSeats);
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

  class Laptop implements Taxable{
  String imei;
  String processor;
  String Speed;
  String Memory;
  String Capacity;
  String Storage;
  String Capacity1;
  String Screen;
  String Type;
  String Led;
  String Ports;
  String OS;
  int price;
  int tax;
  int gst;

  void GetData(){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter Laptop imei Number: ");
  imei = sc.nextLine();

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
  
  System.out.println("Enter Storage Capacity: ");
  Capacity1 = sc.nextLine();
  
  System.out.println("Enter Screen resolution:");
  Screen = sc.nextLine();

  System.out.println("Enter Screen Type:");
  Type = sc.nextLine();

  System.out.println("Is the Screen Led?");
  Led = sc.nextLine();
 
  System.out.println("OS Installed: ");
  OS = sc.nextLine(); 
 }

 void SetData(){
  System.out.println("\t" + imei + "\t" + processor +"\t" + Speed +"\t" + Memory + "\t" + Capacity + "\t" + Storage + "\t" + Capacity1 + "\t" + Screen + "\t" + Type + "\t" + Led + "\t" + OS);
   } 
 
  public void cost(){
 Scanner sc = new Scanner(System.in);
  System.out.println("Price of Laptop:");
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
 
 class Inheritance5{
 public static void main(String args[]){
 Laptop l = new Laptop();
 l.cost();
 l.percentGST();
 Car C = new Car();
 C.cost();
 C.percentGST();
    } 
 }