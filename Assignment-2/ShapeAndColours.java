class Shape {

 private String name;

 public Shape(String name) {
     this.name = name;
 }

 public void displayShape() {
     System.out.println("Shape: " + name);
 }
}

class Circle extends Shape {
 private double radius;


 public Circle(double radius) {
     super("Circle"); 
     this.radius = radius;
 }

 public double calculateArea() {
     return Math.PI * radius * radius;
 }

 @Override
 public void displayShape() {
     super.displayShape();  
     System.out.println("Radius: " + radius);
     System.out.println("Area: " + calculateArea());
 }
}

class ColoredCircle extends Circle {
 private String color;

 public ColoredCircle(double radius, String color) {
     super(radius);
     this.color = color;
 }

 @Override
 public void displayShape() {
     super.displayShape(); 
     System.out.println("Color: " + color);
 }
}

public class ShapeAndColours {
    public static void main(String[] args) {

        ColoredCircle myCircle = new ColoredCircle(5.0, "Red");
        System.out.println("Details of Colored Circle:");
        myCircle.displayShape();;

}
}
