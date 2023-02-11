 import java.util.Scanner;
 class Department{

  String id;
  String head_id;
  String noOfEmployees;
  String name;
  String dateofEst;
  String headoffice;

  void GetData(){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter Department Id: ");
  id = sc.nextLine();

  System.out.println("Enter Name of Department:");
  name = sc.nextLine();

  System.out.println("Enter Date Of Establishment:");
  dateofEst = sc.nextLine();
  
  System.out.println("Enter Head Office Location:");
  headoffice = sc.nextLine();

  System.out.println("Enter Head Id: ");
  head_id = sc.nextLine();

  System.out.println("Enter Number Of Employees: ");
  noOfEmployees = sc.nextLine(); 
 }

 void SetData(){
  System.out.println("\t" + id + "\t" + name +"\t" + dateofEst +"\t" + headoffice + "\t" + head_id + "\t" + noOfEmployees);
   }  
  }
  class Department2{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in); 
  System.out.println("Enter Deatails of Department: ");
  Department  D = new Department();
  D.GetData();

 System.out.println("\nDetails of Department:\n");
 D.SetData();
 }
}   