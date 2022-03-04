/*Creating abstract classs
this class cannot be instantiated ie; you cannot do Shape v = new Shape
but you can use this chass as a data type for creating object of its subclasses(child classes)
*/
import java.util.Date;

abstract class Shape {
  Shape(){

  }
    /* Creating abstract method this method does not have a bo or implementation */
    public  double getArea(){
      return 0;
    }
    // public abstract double getPerimeter();
    public String getTimeCreated() {
      Date date = new Date();
      return date.toString();
    }
    public static double getNumberOfSides() { 
      return 4;
    }
  }
/*This class have inherited for the abstract class, it must implement all the abstract method methods or 
else it must be declared as abstract because it has inherited abstract methods.
if it has implemented all the abstract methods it can be called  concrete class */
class Rectangle extends Shape {
    private double width;
    private final double  height;
    public Rectangle() { 
      this.width = 1;
      this.height = 1;
    }
    public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
    }
    // This is an implementation the abstract method getArea()
    public double getArea() {
      return this.width * this.height; 
    }
    
  }
  class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
      this.radius = radius; 
    }
    public double getArea() {
      return 3.14 * radius * radius; 
    }
  }
  class Main {
    public static void main(String args[]) {
    // creating an object of the abstract class will cause an error
    // Shape shape1 = new Shape();
    // you can use the class shape as a data type
    // Shape circle1 = new Circle(3);
    Rectangle rectangle1 = new Rectangle(); 
      
    // System.out.println("Area of the Circle: " + circle1.getArea()+ " date created is "+circle1.getTimeCreated());
    System.out.println("Area of the Rectangle: " + rectangle1.getArea()
    + " date created is "+Shape.getNumberOfSides());
    }
  }