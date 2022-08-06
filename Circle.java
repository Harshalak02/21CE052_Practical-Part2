import java.util.Scanner;

public class Circle {

    private double radius = 1;

    public Circle() {
        // radius = 2;
    }

    public Circle(int r) {
        radius = (double) (r);
    }

    public double getArea() {
        return radius * 3.14 * radius;
    }

    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());

        Scanner sc = new Scanner(System.in);
        int rad = sc.nextInt();
        Circle circle2 = new Circle(rad);
        System.out.println(circle2.getArea());
        System.out.println(circle2.getPerimeter());

    }
}
