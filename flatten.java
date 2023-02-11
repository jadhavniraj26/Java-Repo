import java.util.*;
import java.util.stream.Collectors;

 public class flatten{
  
  public static void main(String args[]){
  
  List<String> list = Arrays.asList("Niraj","Madhur","Pranay","Pushkar"); 
  List<String> list1 = Arrays.asList("Mayuri","Prachi","Siddhi");
  
  List<List<String>>listofstring = Arrays.asList(list,list1);
  System.out.println("The Structure before flattening: "+listofstring);
 
  List<String> listOfString = listofstring.stream()
                              .flatMap(list2 -> list2.stream()) 
                                    .collect(Collectors.toList()); 
  
        System.out.println("The Structure after flattening is : " + 
                                                         listOfString);
   }
  } 
    