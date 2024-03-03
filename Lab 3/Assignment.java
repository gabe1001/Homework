public class Assignment{
  // this will track details on one assignment

  //ATTRIBUTES
  private double points_earned;
  private double points_possible;
  private String assignment_category;

  //METHODS
  public Assignment(double points_numeric, double max_points, String assignment_type) {
    this.points_earned = points_numeric;
    this.points_possible = max_points;
    this.assignment_category = assignment_type;
  }

  public double getpoint_earned() {
    return this.points_earned;
  }

  public double getpoint_possible() {
    return this.points_possible;
  }

  public String getassignment_category() {
    return this.assignment_category;
  }

}
