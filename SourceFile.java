import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

 



public class SourceFile {

public static void main(String[] args) throws IOException {

try {
//CREATE SOURCE & TARGET FİLES
PrintWriter writetosource = new PrintWriter("C:\\GAMES\\file.txt");
PrintWriter writetotarget = new PrintWriter("C:\\pro\\file2.txt");



writetosource.write("THIS IS THE SOURCEFILE");
writetosource.close();

writetotarget.write("THAT IS THE TARGETFİLE");
writetotarget.close();



Path sourcepath = Paths.get("C:\\GAMES\\file.txt");
Path destinationepath = Paths.get("C:\\pro\\files2.txt");
   
 
//COPY FİLE FROM SOURCE TO TARGET
Files.copy(sourcepath, destinationepath, StandardCopyOption.REPLACE_EXISTING );
System.out.println("File copied from Source to Target:");

//MOVE FİLE FROM SOURCE TO TARGET
// Files.move(sourcepath, destinationepath, StandardCopyOption.REPLACE_EXISTING);
   System.out.println("File moved from Source to Target");

//DELETE THE SOURCEFILE
// Files.delete(sourcepath);
   System.out.println("File Deleted at Source:");

// READ BOTH OF THE FILES

Scanner reader1 = new Scanner(sourcepath);
Scanner reader2 = new Scanner(destinationepath);

while (reader1.hasNext()) {
String source1 = reader1.nextLine();
System.out.println("Source file read:");
System.out.println(source1);
}

while (reader2.hasNext()) {
String source2 = reader2.nextLine();
System.out.println("Target file read:");
System.out.println(source2);

}



} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}




}


}