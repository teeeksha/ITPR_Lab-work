import java.util.Scanner;
class CylinderCalc {

    static final double PI = 3.14;

    // Curved Surface Area
    static double curvedSurfaceArea(double r, double h) {
        return 2 * PI * r * h;
    }

    // Total Surface Area
    static double totalSurfaceArea(double r, double h) {
        return 2 * PI * r * (h + r);
    }

    // Volume
    static double volume(double r, double h) {
        return PI * r * r * h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius of the cylinder: ");
        double radius = sc.nextDouble();

        System.out.print("Enter height of the cylinder: ");
        double height = sc.nextDouble();

        System.out.printf("Curved Surface Area: %.2f\n", curvedSurfaceArea(radius, height));
        System.out.printf("Total Surface Area: %.2f\n", totalSurfaceArea(radius, height));
        System.out.printf("Volume: %.2f\n", volume(radius, height));

        sc.close();
    }
}

