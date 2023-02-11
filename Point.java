import java.util.Scanner;
 class Point{

  int x;
  int y ;
  int z ;

  void GetData(){
  Scanner sc = new Scanner(System.in);
  
  System.out.println("Enter co-ordinates of X: ");
  x = sc.nextInt();

  System.out.println("Enter co-ordinates of Y :");
  y = sc.nextInt();

  System.out.println("Enter Co-ordinates of Z:");
  z = sc.nextInt();
 }

 void SetData(){
  System.out.println("\t" + x + "\t" + y +"\t" + z);
   }  
  }
  class Point2{
  public static void main(String[] args){
  Scanner sc = new Scanner(System.in); 
  System.out.println("Enter Co-ordinates: ");
  Point p = new Point();
  p.GetData();

 System.out.println("\nDetails of Co-ordinates:\n");
 p.SetData();
 }
}   