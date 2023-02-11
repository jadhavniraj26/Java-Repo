import java.util.Scanner;
 public class Addition{
    
    public static void main(String[] args){
    double x, y;
    Scanner sc = new  Scanner(System.in);
    
    System.out.println("Enter First Number: ");
    x = sc.nextDouble();
    
    System.out.println("Enter Second Number: ");
    y = sc.nextDouble();
    
    double sum = x + y;
    System.out.println("Addition of Numbers: "+sum);
       }
  }