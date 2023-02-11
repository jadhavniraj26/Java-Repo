 import java.util.Scanner;
 import java.util.Arrays;
 public class Input{
 
 public static void main(String[]  args){
 int 1sum = 0 ;
 Scanner sc= new Scanner(System.in);
 
 System.out.println("Enter size of array: ");
 int length = sc.nextInt();
 int [] array= new int[length];

 System.out.println("Enter Integers: ");
 
 for(int i=0; i<length; i++){ 
   array[i] =  sc.nextInt();
 }
 for (int i=0;i<length;i++){ 
 sum = sum + array[0 + i] * array[length-i];
 }
  
 System.out.println(Arrays.toString(array));
 System.out.println("Sum of both Multliplications: "+sum);
 }
 } 
