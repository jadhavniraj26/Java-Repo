import java.util.Scanner;
 class Person1{

  String PersonId;
  String Name;
  String DateOfBirth;
  String Age;
  String Street;
  String City;
  int Pincode;
  
  void GetData(){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter Person Id: ");
  PersonId = sc.nextLine();

  System.out.println("Enter Person Name:");
  Name = sc.nextLine();

  System.out.println("Enter Date of Birth:");
  DateOfBirth = sc.nextLine();
  
  System.out.println("Enter Age:");
  Age = sc.nextLine();

  System.out.println("Enter street's name: ");
  Street = sc.nextLine();

  System.out.println("Enter City's name: ");
  City = sc.nextLine();
  
  System.out.println("Enter Pincode: ");
  Pincode = sc.nextInt();
 }
 void PutData(){
  System.out.println("\n\t" + PersonId + "\t" + Name +"\t" + DateOfBirth +"\t" + Age + "\t" + Street + "\t" + City + "\t" + Pincode + "\t");
   }  
  }
  class person{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in); 
  System.out.println("Enter Details of Person: ");
  int n = sc.nextInt();
  Person p = new Person();
 p.GetData();

 System.out.println("\nDetails of Person:\n");
 p.PutData();
 }
}   