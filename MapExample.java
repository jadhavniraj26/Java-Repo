import java.util.*;  
class MapExample{  
 public static void main(String args[]){  
Map<Integer,String> map=new HashMap<Integer,String>();          
      map.put(9,"Pushkaraj");    
      map.put(6,"Pranay");    
      map.put(6,"Madhur");   
      map.put(5,"Niraj");
           
      map.entrySet()    
      .stream()  
      .sorted(Map.Entry.comparingByKey())  
      .forEach(System.out::println);  
 }  
}