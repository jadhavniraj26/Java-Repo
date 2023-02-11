 import java.util.Scanner;
 class Laptop{

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
   }
 class Laptop2{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in); 
  System.out.println("Enter Details of Laptop: ");
  Laptop D = new Laptop();
  D.GetData();

 System.out.println("\nDetails of Laptop:\n");
 D.SetData();
 }
}   