import java.util.Scanner;

class Greater {
    static int findGreater(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else if (num1 < num2) {
            return num2;
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int greater = findGreater(a, b);
        System.out.println("The greater number is: " + greater);
        sc.close();
    }
}
