import java.util.Scanner;
 public class Square{
  public static void main(String[] args){
    
      int num1,num2 , sum,  sq1,sq2;
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter First number: ");
      num1 = sc.nextInt();
   
      System.out.println("Enter Second  Number:");
      num2 = sc.nextInt();
     
      sq1 = num1*num1;
      sq2 = num2*num2;

      System.out.println("Square of First number: "+ sq1);
      System.out.println("Square of second number: "+ sq2);

      sum = sq1 +  sq2 ;
      System.out.println("Sum of square of both  numbers: "+ sum);
      
      }
    }
      
            