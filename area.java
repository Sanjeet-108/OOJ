import java.util.*;

abstract class inputscanner {
    Scanner sc = new Scanner(System.in);

}

abstract class Shape extends inputscanner {
    double a, b;

    abstract void getinput();

    abstract void displayarea();
}

class Rectangle extends Shape {
    void getinput() {
        System.out.println("Enter the length and breadth of Rectangle:");
        a = sc.nextDouble();
        b = sc.nextDouble();
    }

    void displayarea() {
        System.out.println("Area of Rectangle is: ");
        System.out.format("%.2f\n", a * b);

    }

}

class Triangle extends Shape {
    void getinput() {
        System.out.println("Enter the height and base of Tringle:");
        a = sc.nextDouble();
        b = sc.nextDouble();
    }

    void displayarea() {
        System.out.println("Area of Tringle is: ");
        System.out.format("%.2f\n", 0.5 * a * b);
    }

}

class Circle extends Shape {
    void getinput() {
        System.out.println("Enter the radius of Circle:");
        a = sc.nextDouble();
    }

    void displayarea() {
        System.out.println("Area of circle is: ");
        System.out.format("%.2f\n", 3.14 * a * a);
    }

}

public class area {
    public static void main(String args[]) {
        Shape ref;
        ref = new Rectangle();
        ref.getinput();
        ref.displayarea();

        ref = new Triangle();
        ref.getinput();
        ref.displayarea();

        ref = new Circle();
        ref.getinput();
        ref.displayarea();

    }
}