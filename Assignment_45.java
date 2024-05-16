//  interface is a reference type that is similar to a class but can only contain constants, method signatures, default methods, static methods, and nested types. It cannot contain method

// Constants: These are variables that are declared with the final modifier. They are implicitly public, static, and final. In interfaces, they are usually considered public.

// Method Signatures: Interfaces can declare method signatures without providing the implementation details. These methods are implicitly public and abstract.

// Default Methods: Starting from Java 8, interfaces can have default methods. These methods provide a default implementation that can be overridden by implementing classes.

// Static Methods: Also introduced in Java 8, interfaces can now contain static methods which are implicitly public.

// Nested Types: Interfaces can contain nested types such as other interfaces, classes, enums, or even other interfaces.

// implements is the keyword is use to extend the interface.

// Final keyword read by own.

interface Animal {
    
    void eat();
    void sleep();
}


class Dog implements Animal {
    
    public void eat() {
        System.out.println("Dog is eating");
    }
    
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}


public class Assignment_45 {
    public static void main(String[] args) {
        
    Dog dog = new Dog();
    
    dog.eat();
    dog.sleep();
   }
}
