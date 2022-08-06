import java.util.Scanner;

public class Overloading {
    static double area(int r) {
        double t = 3.14 * r * r;
        return t;
    }

    static float area(int a, int b) {
        float t = a * b;
        return t;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cr = sc.nextInt();
        int rs = sc.nextInt();
        int rs2 = sc.nextInt();
        System.out.println(area(cr));
        System.out.println(area(rs, rs2));

    }
}
