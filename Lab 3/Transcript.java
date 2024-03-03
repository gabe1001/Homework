

public class Transcript {

  //ATTRIBUTES
  private String course_name;
  private String student_name;
  private int year_taken;
  private String semester;
  private Assignment[] assignment;
  private int num_assignments;



  //METHODS
  public Transcript(String given_course, String given_student, int given_year, String given_semester) {
      this.course_name = given_course;
      this.student_name = given_student;
      this.year_taken = given_year;
      this.semester = given_semester;
      this.assignment = new Assignment[20];
      this.num_assignments = 0;
  }


  public void record_lab(double points_earned) {
    Assignment new_assignment = new Assignment (points_earned, 50, "Lab");
    this.assignment[this.num_assignments] = new_assignment;
    this.num_assignments +=1;
  }

  public void record_exam(double points_earned) {
    Assignment new_assignment = new Assignment (points_earned, 100, "Exam");
    this.assignment[this.num_assignments] = new_assignment;
    this.num_assignments +=1;
  }

 private double calculateAssignment_grade() {
    double lab_earned = 0;
    double lab_possible = 0;
    double exam_earned = 0;
    double exam_possible = 0;

    for ( Assignment new_assignment : this.assignment ) {
      if (new_assignment != null){
        if (new_assignment.getassignment_category().equals("Lab")){
          //do lab
          lab_possible+=50;
          lab_earned += new_assignment.getpoint_earned();
        }
        else{
          //do exam
            exam_possible+=100;
            exam_earned+= new_assignment.getpoint_earned();
        }

      }
    }
    //outside forloop here
    double lab_score = lab_earned /  lab_possible;
    double exam_score = exam_earned / exam_possible;
    return ((100* lab_score) * 0.6) + ((100*exam_score) * 0.4);
  }


  private String grade_to_text(String assignment_name, double points_earned) {

          String dot_spacer = ".".repeat(25 - assignment_name.length());
          String score = "" + points_earned;
          String assignment_text = assignment_name + " " + dot_spacer + " " + score;

          return assignment_text;
  }


  public String toString() {
    String representation = "";

    representation = "Showing scores for " + this.course_name + "(" + this.semester + " " + this.year_taken + ") student " + this.student_name + ":";

    representation = representation + "\n" + "-".repeat(30);

    for ( int i=0; i<this.num_assignments; i++ ) {
      String assignment_text = this.grade_to_text(this.assignment[i].getassignment_category(), this.assignment[i].getpoint_earned());
      representation = representation + "\n" + assignment_text;
    }

    representation = representation + "\n" + "-".repeat(30);


    representation = representation + "\n"+ " Total Course Grade: " + " ".repeat(5) + this.calculateAssignment_grade();


    return representation;

  }
}
