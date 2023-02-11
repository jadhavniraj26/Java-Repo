 import java.util.Scanner;
 class Employee{

 String Name;
 String Post;
 int Salary;
 void GetData(){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter Employee Name:");
 Name = sc.nextLine();

  System.out.println("Enter Employee's Post:");
  Post = sc.nextLine();
  
  System.out.println("Enter Employee's salary:");
  Salary = Integer.parseInt(sc.nextLine());
 }
 void PutData(){
  System.out.println("\n\t" + Name +"\t" + Post +"\t" + Salary);
    }
  
 public static void main(String[] args){

 Employee emp[] = new Employee[5];
 for(int i=0;i<5;i++){
 emp[i]= new Employee();
 }
 
 for(int i=0; i<5;i++){
 System.out.println("\nEnter details of"+(i+1)+"Employee\n");
 emp[i].GetData();
 }
 System.out.println("\nDetails of Employee:\n");
 for(int i=0;i<5;i++)
  emp[i].PutData();
 }
}   