//Polymerphisim 

// Method overloading and Method overriding

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method overloading
    public void show() {
        System.out.println("Hi");
    }

    public void show(String name) {
        System.out.println("Name is:" + name);
    }
}

class Ram extends Person {
    int salary;

    Ram(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    // Method overriding
    public void show() {
        System.out.println("Method overriding is done!");
    }
}

public class Assignment_43 {
    public static void main(String[] args) {
        Person p = new Person("Jagjit", 21);
        Ram r = new Ram("Ram", 25, 50000);

        p.show();
        p.show("Jagjit");

        r.show();
        r.show("Ram");
    }
}
