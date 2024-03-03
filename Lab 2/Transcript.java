public class Transcript {
  private String studentName;
  private String courseName;
  private String courseYear;
  private String courseSemester;
  private double lab1_numeric;
  private double lab2_numeric;
  private double lab3_numeric;
  private double lab4_numeric;
  private double lab5_numeric;
  private double midterm_numeric;
  private double final_numeric;


// Transcript Constuctor
  public Transcript(String given_name,String given_course, String given_year, String given_semester){
    this.studentName  = given_name;
    this.courseName = given_course;
    this.courseYear = given_year;
    this.courseSemester = given_semester;
    this.lab1_numeric = 0;
    this.lab2_numeric = 0;
    this.lab3_numeric = 0;
    this.lab4_numeric = 0;
    this.lab5_numeric = 0;
    this.midterm_numeric =0;
    this.final_numeric =0;
  }

// function that gets lab grades and sets them to our attributes at the top
  public void setLabGrades(double lab1,double lab2,double lab3,double lab4,double lab5){
    this.lab1_numeric = lab1;
    this.lab2_numeric = lab2;
    this.lab3_numeric = lab3;
    this.lab4_numeric = lab4;
    this.lab5_numeric = lab5;
  }
// function that sets exam grades
  public void setExamGrades(double midterm, double finalExam){
    this.midterm_numeric = midterm;
    this.final_numeric = finalExam;
  }

  private double calculateLabAverage(double lab1,double lab2,double lab3,double lab4,double lab5){
    return ( (lab1+lab2+lab3+lab4+lab5) /5);
  }

// Calculate course grade
  public double calculateCourseGrade(){
    double labAverage = calculateLabAverage(lab1_numeric, lab2_numeric, lab3_numeric, lab4_numeric, lab5_numeric);
    return ( 2* (labAverage * 0.6) + ( midterm_numeric * 0.2) + ( final_numeric * 0.2));

}
}

/*private static double calculateLabAverage (lab1_numeric, lab2_numeric, lab3_numeric, lab4_numeric, lab5_numeric){

  return ((lab1_numeric + lab2_numeric + lab3_numeric + lab4_numeric + lab5_numeric) / 5)
}*/
