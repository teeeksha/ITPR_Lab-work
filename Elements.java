import java.util.Scanner;
 class Elements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];
        int Count1 = 0, Count2 = 0;

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
            if (numbers[i] > 0) {
                Count1++;
            } else if (numbers[i] < 0) {
                Count2++;
            }
        }

        System.out.println("Total Positive Numbers: " + Count1);
        System.out.println("Total Negative Numbers: " + Count2);

        sc.close();
    }
}

