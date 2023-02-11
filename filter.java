import java.util.*;

 class filter{
 public static void main(String args[]){
  
  int r,sum=0,temp; 
  
  List<Integer>list = Arrays.asList(1,3,5,6,796,421,121,141,444,999,7,11,13,14,23,27);
  System.out.println("List of numbers: "+list);
  
  System.out.println("Odd Numbers in the list: ");
  list.stream().filter(num-> num%2!=0 ).forEach(System.out::println);
  
  System.out.println("Even Numbers in the list: ");
  list.stream().filter(num -> num%2==0).forEach(System.out::println);
  
  System.out.println("Prime Numbers in the list: ");
  list.stream().filter(num -> num%2==0).forEach(System.out::println);
    
   } 
 }