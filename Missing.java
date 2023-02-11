import java.io.*; 
import java.util.Scanner;
import java.util.Arrays;
  
class Missing  { 
static int search(int array[],   int size) 
{ 
    int a = 0, b = size - 1; 
    int mid = 0; 
    while ((b - a) > 1) 
    { 
        mid = (a + b) / 2; 
        if ((array[a] - a) != (array[mid] - mid)) 
            b = mid; 
        else if ((array[b] - b) != (array[mid] - mid)) 
        a = mid; 
    } 
    return (array[mid] + 1); 
} 

 public static void main (String[] args){ 
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter Length of array: ");
    int n = sc.nextInt();
    int array[] = new int[n];
   
    System.out.println("Enter Number: ");
    for(int i=0; i<n; i++){
    array[i] = sc.nextInt();
   }

    System.out.println("Entered numbers: "+Arrays.toString(array));
    int size = array.length; 
    System.out.println("Missing number: "+search(array, size)); 
} 
} 