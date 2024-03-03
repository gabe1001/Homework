public class GradeCalc {
  public static void main(String[] args) {

    int labScore1 = Integer.parseInt(args[0]);
    int labScore2 = Integer.parseInt(args[1]);
    int labScore3 = Integer.parseInt(args[2]);
    int labScore4 = Integer.parseInt(args[3]);
    int labScore5 = Integer.parseInt(args[4]);
    double labAvg = calculateLabAverage(labScore1, labScore2, labScore3, labScore4, labScore5);
    System.out.println("Your lab average is " + labAvg);
    int MidtermAvg = Integer.parseInt(args[5]);
    int FinalExamAvg = Integer.parseInt(args[6]);
    double FinalGrade = calculateCourseGrade(labAvg, MidtermAvg, FinalExamAvg);
    System.out.println("Your Final Grade average is " + FinalGrade);

  }

  public static double calculateLabAverage( int lab1, int lab2, int lab3, int lab4, int lab5){

    return ((double) lab1 + lab2 + lab3 + lab4 + lab5) / 5;

  }

  public static double calculateCourseGrade(double labAvg, double MidtermAvg, double FinalExamAvg){

    return ((double) 2* (labAvg * 0.6) + (MidtermAvg * 0.2) + (FinalExamAvg * 0.2));

  }
}
