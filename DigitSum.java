import java.util.Scanner;

@FunctionalInterface
interface Operation {
    int calculate(int number);
}

public class DigitSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = sc.nextInt();

        System.out.println("1. Sum of Even Digits");
        System.out.println("2. Sum of Odd Digits");
        System.out.print("Choice: ");
        int choice = sc.nextInt();

        Operation op;

        if (choice == 1) {
            op = (n) -> {
                int sum = 0;
                while (n > 0) {
                    int digit = n % 10;
                    if (digit % 2 == 0)
                        sum += digit;
                    n /= 10;
                }
                return sum;
            };
            System.out.println("Even Digit Sum = " + op.calculate(number));
        } else if (choice == 2) {
            op = (n) -> {
                int sum = 0;
                while (n > 0) {
                    int digit = n % 10;
                    if (digit % 2 != 0)
                        sum += digit;
                    n /= 10;
                }
                return sum;
            };
            System.out.println("Odd Digit Sum = " + op.calculate(number));
        } else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}