import java.util.Scanner;
 class Laptop{

  String name;
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
  
  System.out.println("Enter Device Name: ");
  name = sc.nextLine();

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
  System.out.println("\t" + name + "\t" + processor +"\t" + Speed +"\t" + Memory + "\t" + Capacity + "\t" + Storage + "\t" + Capacity1 + "\t" + Screen + "\t" + Type + "\t" + Led + "\t" + OS);
   }  
 }
 class Gadget extends Laptop{
 }
  public class Inheritance3{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
  System.out.println("Enter number of gadget: ");
  int n = sc.nextInt();
  Gadget g[] = new Gadget[n];
  
  for(int i=0;i<n;i++){
  g[i]= new Gadget();
   }
 
 for(int i=0;i<n;i++){  
 System.out.println("\nEnter details of"+ (i+1) +"gadget\n");
 g[i].GetData();
 int gadgetCount = (i+1); 
 System.out.println("Count of gadget:"+gadgetCount);
   
 System.out.println("\nDetails of gadget:\n");
 
 g[i].SetData();
     }
    }
  }   

