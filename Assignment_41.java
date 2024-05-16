// OOPs Concept

// Encapsulation in Java


public class Assignment_41 {

  public static class Student {
    public String name;
    private int age;
    private int rollno;

    public Student(String name, int age, int rollno) {     
      this.name = name;
      this.age = age;
      this.rollno = rollno;
    }

    public void showdetail() {
      System.out.println("Student details:");
      System.out.println("Name is:" + this.name + " Age is:" + this.age + " Roll no is:" + this.rollno);
    }
  }

  public static void main(String[] args) {

    String name = "Jagjit";
    int age = 21;
    int roll = 202110071;

    // Creating object for Student class

    Student st = new Student(name, age, roll);

    st.showdetail();
   
  }
}
