import java.util.Scanner;
 public class MyArea{
  public static void main(String[] args){
   int radius, side ,length, breadth,areaofsquare,areaofrectangle;
   double areaofcircle;
   Scanner sc= new Scanner(System.in);
   
    System.out.println("Enter the radius of the circle:");
	 radius = sc.nextInt();
	  
	 areaofcircle = (radius*radius)*Math.PI;
	 System.out.println("Area of Circle: "+areaofcircle);
	 
	 System.out.println("Enter length of side of square:");
	  side = sc.nextInt();
	   
	   areaofsquare = side*side;
	    System.out.println("Area of Square: "+areaofsquare);
		 
		  System.out.println("Enter length and breadth of rectangle:");
		   length= sc.nextInt();
		    breadth= sc.nextInt();
			
			areaofrectangle =length*breadth;
			  System.out.println("Area of Rectangle : "+areaofrectangle);
			  }
			 } 
		
		
   