import java.util.*;

public class Search {

    public static ArrayList<Integer> search(String text, String pattern) {

        ArrayList<Integer> result = new ArrayList<>();

        int n = text.length();
        int m = pattern.length();

        // Try every possible starting position
        for (int i = 0; i <= n - m; i++) {

            int j;

            // Compare pattern with text
            for (j = 0; j < m; j++) {

                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }

            // If all characters matched
            if (j == m) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        System.out.print("Enter the pattern: ");
        String pattern = sc.nextLine();

        ArrayList<Integer> result = search(text, pattern);

        System.out.println("Pattern found at indices:");

        for (int index : result) {
            System.out.print(index + " ");
        }

        sc.close();
    }
}