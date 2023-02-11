
 import java.util.Scanner;
 import java.util.Arrays;
 public class Sum{
 
 public static void main(String[] args){
 int sum = 0 ;
 Scanner sc= new Scanner(System.in);
 
 System.out.println("Enter size of array: ");
 int m = sc.nextInt();
 int [] array= new int[m];
 
 System.out.println("Enter Integers: ");
 for(int i=0; i<m; i++){ 
   array[i] =  sc.nextInt();
 }
  sc.close();
   int product;
   int i=0,j=m-1;
   while(i<j){
   product=array[i]*array[j];				
   sum+=product;
   i++;
   j--;
			
   if(i==j){
   sum+=array[i];
   break;
  }
  }
 System.out.println(Arrays.toString(array));
 System.out.println("Sum of Multliplications: "+sum);
  } 
 }