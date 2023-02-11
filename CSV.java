import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;

public class CSV {

public static void main(String[] args) throws Exception {

try {

File file = new File("D:\\integers.csv");

PrintWriter pWriter = new PrintWriter(file);

StringBuilder nwBuilder = new StringBuilder();

nwBuilder.append(15) ;
nwBuilder.append("\n");
nwBuilder.append(153) ;
nwBuilder.append("\n");
nwBuilder.append(8) ;
nwBuilder.append("\n");
nwBuilder.append(1435) ;
nwBuilder.append("\n");
nwBuilder.append(5) ;
nwBuilder.append("\n");
nwBuilder.append(0) ;
nwBuilder.append("\n");
nwBuilder.append(33) ;
nwBuilder.append("\n");
nwBuilder.append(888) ;
nwBuilder.append("\n");
nwBuilder.append(5) ;
nwBuilder.append("\n");
nwBuilder.append(447) ;

pWriter.write(nwBuilder.toString()+" ");

} catch (FileNotFoundException e) {
        e.printStackTrace();
} finally {
    if(pWriter!=null){
         pWriter.close();
     }


 try {
  Scanner scanner = new Scanner(file);
  int sum = 0;
  int i= 0;

  while (scanner.hasNext()) {
        i = Integer. parseInt(scanner.next());
         sum= sum+i;
  }
 
  System.out.println("sum of the numbers is : "+sum);

} catch (FileNotFoundException e) {
e.printStackTrace();
} finally {
      if(scanner!=null){
            scanner.close();
          }
       }
     }

 

