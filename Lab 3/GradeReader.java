import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;



public class GradeReader{

  //File Object
  private File file_location;

//Constructor
  public GradeReader(String file_name){
    this.file_location = new File(file_name);
  }
// METHODS, and load a file
  public Transcript load_file ()  throws FileNotFoundException {
    Scanner grade_reader = new Scanner(file_location);
    String file_read = grade_reader.nextLine();
    String[] line = file_read.split(",");

    String courseName = line[0];
    String studentName = line[1];
    int year = Integer.parseInt(line[2]);
    String semester = line[3];

    Transcript transcript = new Transcript(courseName, studentName, year, semester);

    while (grade_reader.hasNextLine()) {
            String assignmentLine = grade_reader.nextLine();
            String[] assignmentData = assignmentLine.split(",");

            double pointsEarned = Double.parseDouble(assignmentData[1]);

            // Determine the type of assignment (lab or exam) based on the assignment category
            if (assignmentData[0].equals("Lab")) {
                transcript.record_lab(pointsEarned);
            } else if (assignmentData[0].equals("Exam")) {
                transcript.record_exam(pointsEarned);
            }
          }

          return transcript;
  }
}
