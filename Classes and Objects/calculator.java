class Calculator {
  // write class fields here
  private double num1;
  private double num2;

  public Calculator(double num1, double num2) {
    //write definition here
    this.num1 = num1;
    this.num2 = num2;

  }

  double add() {
    //write definition here
    double sum = num1 + num2;

    return sum;
  }

  double subtract() {
    //write definition here
    double difference = num2-num1;

    return difference;
  }

  double multiply() {
    //write definition here
    double product = num1 * num2;

    return product;
  }

  double divide() { 
    //write definition here
    double division = num2/num1;

    return division;
  }
  
}

// class Demo {

//   public static void main(String args[]) {
//     Calculator obj = new Calculator(10, 94);

//     System.out.println(obj.add());
//     System.out.println(obj.subtract());
//     System.out.println(obj.multiply());
//     System.out.println(obj.divide());
//   }

// }