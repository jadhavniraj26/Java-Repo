/**
*
*
* @author Niraj Jadhav
* This program is about finding Average marks and Percentage
*/

import java.util.Scanner; 
 
 public class Doc{ 
 public static void main(String[] args){ 
 int mark[] = new int[5]; 
 int i; int rollno;
 float sum=0 ; 
 float avg , percentage; 

/** Scanner Class for taking Marks
* Scanner class initialization
*/

 Scanner sc = new Scanner(System.in); 
 
  System.out.print("\n\n Enter Roll No.\t:\t"); 
  rollno= sc.nextInt(); 
 
 System.out.print("Enter marks Obtained in 5 Subjects : "); 
 for(i=0; i<5; i++) 
 { 
  mark[i] = sc.nextInt(); 
  sum = sum + mark[i]; 
 } 
 
 avg = sum/5;
 percentage = (sum/500)*100;
 
 System.out.println("Percentage = "+percentage+ "%"); 
 System.out.print("Average Marks = " +avg); 
 }
}