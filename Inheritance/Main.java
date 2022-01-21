public class Main extends Employee {
  public static void main(String[] args) {
    new Main();
  }
  
  public Main() {
    System.out.println(" Faculty's no-arg constructor is invoked");
  }
}

class Employee extends Person {
  public Employee() {
    this("(Invoke Employee’s overloaded constructor");
    System.out.println(" Employee's no-arg constructor is invoked");
  }

  public Employee(String s) {
    System.out.println(s);
  }
}

class Person {
  public Person() {
    System.out.println(" Person's no-arg constructor is invoked");
  }
}

