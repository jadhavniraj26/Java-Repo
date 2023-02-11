 import java.util.Scanner;
 public class Matrix{  
 public static void main(String[] args){  
 int m ,n ,p , q, sum=0,i ,j ,k;
   
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter numbers of rows and columns of first matrix");
 m = sc.nextInt();
 n = sc.nextInt();
 
 int First[][]= new int[m][n];
 
 System.out.println("Enter elements of First matrix:");
 for(i=0;i<m;i++)
  for(j =0;j<n;j++)
   First[i][j]=sc.nextInt();
  
  System.out.println("Enter the number of rows and column of second matrix");
  p = sc.nextInt();
  q = sc.nextInt();
  
  if(n!=p)
  System.out.println("The matrices can't be multiplied with each other.");
  else
  {
   int Second[][] = new int[p][q];
   int multiply[][] = new int[m][q];
  
   System.out.println("Enter elements of second matrix:");
   for(i=0;i<p;i++)
   for(j=0;j<q;j++)
   Second[i][j] = sc.nextInt();
   
   for(i=0;i<m;i++){
   for(j=0;j<q;j++){
   for(k=0;k<p;k++)
   sum = sum + First[i][k]*Second[k][j];
   
   multiply[i][j]=sum;
   sum = 0;
   }
  }

 System.out.println("Product of the Matrices:");
 for(i=0;i<m;i++){
 for(j=0;j<q;j++)
 System.out.println(multiply[i][j]+"\t");

 System.out.println("\n");
    }
   }
  }
 } 
