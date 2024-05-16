
// Abstract class

// Abstract classes are classes that contain one or more abstract methods.An abstract method is a method that is declared, but contains noimplementation.

// An abstract class is a class that is declared abstract it may or may not include abstract method.

// We cannot declare abstract constructor or abstract static method.

abstract class Shape 
{
     int len;
    

        Shape(int len){
              this.len = len;
        }
          abstract int area();  // Abstract method.
}

class Rectangle extends Shape {
    int width;
    Rectangle(int len, int width) {
        super(len);
        this.width = width;
      }
       int area(){
           return this.len * this.width;
       }
  
}
class Triangle extends Shape {
        int base;
    
        Triangle(int len, int base) {
            super(len); 
            this.base = base;
        }
    
        int area() {
            return (int) (0.5 * this.len * this.base); 
        }
    }
    

  
public class Assignment_44 
{
    public static void main(String[] args) {
        
    
    
    // We cannot create object of Shape class

    Rectangle r = new Rectangle(10, 20);
    Triangle t = new Triangle(23, 14);

    Shape sp;

    sp = t;
    System.out.println("Area of triangle: " + sp.area());

    // Casting Rectangle object to Shape
    sp = (Shape) r; // This line casts Rectangle to Shape
    System.out.println("Area of rectangle: " + sp.area());

   }
}
