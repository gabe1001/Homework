public class Main {
  public static void main(String[] args) {
    // take inputs
    String studentName = args[0];
    String courseName = args[1];
    String courseYear = args[2];
    String courseSemester = args[3];
    double labScore1 = Double.parseDouble(args[4]);
    double labScore2 = Double.parseDouble(args[5]);
    double labScore3 = Double.parseDouble(args[6]);
    double labScore4 = Double.parseDouble(args[7]);
    double labScore5 = Double.parseDouble(args[8]);
    double midtermExam = Double.parseDouble(args[9]);
    double finalExam = Double.parseDouble(args[10]);


    Transcript studentTranscript = new Transcript ( studentName, courseName, courseYear, courseSemester);
    studentTranscript.setLabGrades(labScore1, labScore2, labScore3, labScore4, labScore5);
    studentTranscript.setExamGrades(midtermExam, finalExam);
    double courseGrade = studentTranscript.calculateCourseGrade();

    System.out.println("Student Name: " + studentName);
    System.out.println("Course Name: " + courseName);
    System.out.println("Year: " + courseYear);
    System.out.println("Semester: " + courseSemester);
    System.out.println("Your course grade is " + courseGrade);
  }

}

// print transcript
