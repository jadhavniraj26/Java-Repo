import java.util.Scanner;
 public class MyInterest{
     
  public static void main(String[] args){
   int P, R , T ;
   double SI , FA;
    Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter Principle amount:");
        P = sc.nextInt();
       
       System.out.println("Enter Rate of Interest:");
        R = sc.nextInt();
       
         System.out.println("Enter Time in years:");
          T = sc.nextInt();
      
            SI = (P*R*T)/100;
              System.out.println("Interest to be paid: "+SI);
             
            FA = P + SI;
      System.out.println("Final Amount to be paid: "+FA);
  
        }      
     }
		
		
   