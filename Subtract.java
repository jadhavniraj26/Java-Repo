 import java.util.Scanner;
 public class Subtract{
 public static void main(String[] args){
 int a,b,c;
 Scanner sc= new Scanner(System.in);
 System.out.println("Enter first number: ");
  a = sc.nextInt();
 System.out.println("Enter second number: ");
  b = sc.nextInt();
 if(a>b){
    c = a-b;
  }
 else{
   c = b-a;
  } 
 System.out.println("Answer is: "+c);
  }
 }