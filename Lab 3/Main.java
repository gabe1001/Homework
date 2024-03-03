import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException  {
    String filePath = args[0];
           File file = new File(filePath);

           if (!file.exists()) {
               System.out.println("File not found: " + filePath);
               return;
           }
           GradeReader gradeReader = new GradeReader(file.getPath());
           Transcript transcript = gradeReader.load_file();
           System.out.println(transcript);

// my dummy main
/*
    Transcript x = new Transcript("Scripting", "Bobby Tables", 2023, "Spring");
    x.record_lab(50);
    x.record_lab(50);
    x.record_lab(50);
    x.record_lab(50);
    x.record_lab(50);
    x.record_exam(100);
    x.record_exam(100);
    System.out.println(x);
*/
  }
}
