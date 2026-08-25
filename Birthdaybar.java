import java.util.*;

public class Birthdaybar {

    public static int birthday(List<Integer> s, int d, int m) {

        int count = 0;

        // Check every consecutive segment of length m
        for (int i = 0; i <= s.size() - m; i++) {

            int sum = 0;

            // Calculate sum of m consecutive elements
            for (int j = i; j < i + m; j++) {
                sum += s.get(j);
            }

            // If sum equals birthday, count it
            if (sum == d) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of chocolate squares
        int n = sc.nextInt();

        List<Integer> s = new ArrayList<>();

        // Chocolate values
        for (int i = 0; i < n; i++) {
            s.add(sc.nextInt());
        }

        // d = birth day, m = birth month
        int d = sc.nextInt();
        int m = sc.nextInt();

        int result = birthday(s, d, m);

        System.out.println(result);

        sc.close();
    }
}