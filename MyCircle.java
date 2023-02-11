import java.util.Scanner;
 public class MyCircle{
  public static void main(String[] args){
   int Radius;
   double area;
   Scanner sc = new Scanner(System.in);
    System.out.println("Enter the radius of circle:");
	  Radius = sc.nextInt();
	   area = (Radius*Radius)*Math.PI;
	    System.out.println("Area of circle: "+area);
		}
	 }	
	 