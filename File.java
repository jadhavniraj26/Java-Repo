

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class CSV {

public static void main(String[] args) throws Exception {

try {


 try{
  Scanner scanner = new Scanner(new File("C://Integer.csv"));
  sc.Delimiter(" , ");
  int sum = 0;
  int i= 0;

  while (scanner.hasNext()) {
        i = Integer. parseInt(scanner.next());
         sum= sum+i;
  }
 
  System.out.println("sum of the numbers is : "+sum);

  } 
   catch (FileNotFoundException e){
  e.printStackTrace();
  } finally {
      if(scanner!=null){
            scanner.close();
       }}

    }
 
 }
