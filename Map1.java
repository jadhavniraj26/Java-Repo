import java.util.*; 
 
class Map1{
  
 public static void main(String args[]){

 List<String> list = Arrays.asList("Joel","Vinit","Niraj","Omkar","Pushkaraj",
                       "Madhur","Pranay","Prachi","Mayuri","Siddhi");
  
 Map<Integer,List<String>> map= new HashMap<>();
 list.forEach(map2->map.computeIfAbsent(map2.length(),k->new ArrayList<>()).add(map2));
 
 System.out.println("Grouping Of Words according to their length : \n" +map);

  }  
}  