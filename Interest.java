import java.util.Scanner;

class Interest {
    float principal, rate, time;
    Interest() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal amount: ");
        principal = sc.nextFloat();
        System.out.print("Enter Rate of interest: ");
        rate = sc.nextFloat();
        System.out.print("Enter Time (in years): ");
        time = sc.nextFloat();
    }

    float calculateSI() {
        return (principal * rate * time) / 100;
    }
}
class SimpleInterest {
    public static void main(String[] args) {
        Interest obj = new Interest();
        System.out.println("Simple Interest = " + obj.calculateSI());
    }
}
