import java.util.Scanner;

@FunctionalInterface
interface SumOperation {
    int sum(int a, int b);
}

public class LastDigitSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        SumOperation obj = (a, b) -> (a % 10) + (b % 10);

        System.out.println("Sum of last digits = " + obj.sum(num1, num2));

        sc.close();
    }
}