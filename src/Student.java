public class Student {
  int rating;
  private String name;

  public static int count = 0;
  public static int total = 0;

  public Student(String name) {
    this.name = name;
    count++;
  }

  public static double getAvgRating() {
    if (count == 0) {
      return 0;
    }
    return (double) total / count;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getRating() {
    return rating;
  }

  public void setRating(int rating) {
    this.rating = rating;
    total = total + rating;
  }

  public boolean betterStudent(Student student) {
    if(this.rating > student.rating) {
      return true;
    } else {
      return false;
    }
  }

  public void changeRating(int rating) {
    total = total - this.rating;
    this.rating = rating;
    total = total + rating;
    System.out.println("total = " + total);
  }

  public static void removeStudent(Student student) {
    total = total - student.rating;
    count--;
  }

  @Override
  public String toString() {
    return name + " " + rating;
  }
  public static void main(String[] args) {
    Student s1 = new Student("Sarah");
    s1.setRating(10);
    System.out.println(s1);
    Student s2 = new Student("John");
    s2.setRating(20);
    System.out.println(s2);
    Student s3 = new Student("Peter");
    s3.setRating(30);
    s1.changeRating(7);
    System.out.println(Student.getAvgRating());
    System.out.println(s1.betterStudent(s2));
  }
}


