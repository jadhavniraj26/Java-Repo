  import java.io.*;  
  import java.util.Scanner;  

  public class Readcsv{  

  public static void main(String[] args) throws Exception{  
   
 try{
    int sum = 0;
    int i = 0;
   Scanner sc = new Scanner(new File("C://Integer.csv"));  
   sc.useDelimiter(" , ");
     
   while (sc.hasNext()){  
  
    System.out.println(sc.next()); 
      i = Integer.parseInt(sc.next());
     sum =sum + i;
   }  
  
  System.out.println("Sum of all numbers from file: "+sum);
 }

   catch(FileNotFounfException e){
   e.printStackTrace();
  }
   
   finally{
   if(sc != null){
    sc.close();
       }   
     }  
  }
