interface Shape {
    // Liana changunda(ab) godwell Njikho(ab), analife sangwani(ab),blessings nkhoma(p),davis phiri(ab)
    public  double getArea();      
    public double getNumberOfSides();
}
interface Name{
    public void getName();
}
interface ThreeDShape extends Shape {
    public  double Volume();
}
class Cube implements Name,ThreeDShape{
  private double length, width, height;
  Cube(double length, double width, double height){
    this.length = length;
    this.width = width;
    this.height = height;
  }
  @Override
  public double getArea() {      
      return this.length * this.width * 6;
  }
  @Override
  public double getNumberOfSides() {
      return 6;
  }
  @Override
  public double Volume() {      
      return this.length * this.width * this.height;
  }
  @Override
  public void getName() {
    System.out.println("Name of the shape is aa cube with widith "+this.width+"Hieght"+this.height+" and length of "+this.length );
  }
}
  class Main {
    public static void main(String args[]) {  
      Cube Shape1 = new Cube(2,3,4); 
      Shape1.getName();
      System.out.println("the  area is "+ Shape1.getArea());
      System.out.println("the  Volume is "+ Shape1.Volume());
      System.out.println("the number of sides is "+ Shape1.getNumberOfSides());      
    }
  }