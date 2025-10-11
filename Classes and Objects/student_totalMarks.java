class Student {

  // Define private fields here
  private String name;
  private double mark1;
  private double mark2;

  public Student() {
    // Write definition here
    this.name = "";
    this.mark1 = 0.0;
    this.mark2 = 0.0;
    
  }

  public Student(String name, double mark1, double mark2) { 
    // Write definition here
    this.name = null;
    this.mark1 = mark1;
    this.mark2 = mark2;
  }

  public double getMarks(int markNumber) {
    // Write definition here
    if (markNumber == 1){
      return mark1;
    } else {
      return mark2;
    }
  }

  public double calcTotal() {
    // Write definition here
    double totalMarks = 0;
    totalMarks = mark1 + mark2;

    return totalMarks;
  }
  
}

// class Demo {

//   public static void main(String args[]) {
//     Student student = new Student("Jack", 60, 70);
//     System.out.println(student.calcTotal());
//   }

// }