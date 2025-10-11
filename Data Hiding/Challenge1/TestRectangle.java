public class TestRectangle{
    public static void main(String[]args){
        System.out.println("Testing the parameterized constructor...");
        Rectangle rect1 = new Rectangle(10,5);

        int area1 = rect1.getArea();

        
        System.out.println("The area of rect1 (10x5) is: " + area1);
        System.out.println("------------------------------------");

        
        System.out.println("Testing the default constructor...");
        Rectangle rect2 = new Rectangle();
        int area2 = rect2.getArea();
        System.out.println("The area of rect2 (default) is: " + area2);
    }
    }
 
    

