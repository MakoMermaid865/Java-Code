import java.util.Scanner;
//Class for the area
public class TriangleArea {
    private double base;
    private double height;

    public void setBase(double base1) {
        base = base1;
    }
    public void setHeight(double height1) {
        height = height1;
    }
    public double getArea() {
        return 0.5 * base * height;
    }
    public void printInfo() {
        System.out.println("Base: " + base + ", Height: " + height + ", Area: " + getArea());
    }

    
public static void main(String[] args) {
Scanner scnr = new Scanner(System.in);

Triangle triangle1 = new Triangle();
Triangle triangle2 = new Triangle();

      // Read and set base and height for triangle1
double base1 = scnr.nextDouble();
double height1 = scnr.nextDouble();
triangle1.setBase(base1);
triangle1.setHeight(height1);

      // Read and set base and height for triangle2
double base2 = scnr.nextDouble();
double height2 = scnr.nextDouble();
triangle2.setBase(base2);
triangle2.setHeight(height2);

System.out.println("Triangle with smaller area:");
    
      // Determine smaller triangle and output its info
if (triangle1.getArea() < triangle2.getArea()) {
    triangle1.printInfo();
    } else {
    triangle2.printInfo();
    }
scnr.close();
}
}
//input 3.0 4.0
//4.0 5.0

//Expect: Triangle with smaller area:
//Base: 3.00
//Height: 4.00
//Area: 6.00
