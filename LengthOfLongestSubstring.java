import java.util.Scanner;

public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {

        int[] lastSeen = new int[128];

        // Initialize all positions to -1
        for (int i = 0; i < 128; i++) {
            lastSeen[i] = -1;
        }

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            char current = s.charAt(right);

            // If character was already seen,
            // move left pointer after its previous position
            if (lastSeen[current] >= left) {
                left = lastSeen[current] + 1;
            }

            // Store the latest position of the character
            lastSeen[current] = right;

            // Calculate current window length
            int currentLength = right - left + 1;

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int result = lengthOfLongestSubstring(s);

        System.out.println("Length of Longest Substring = " + result);

        sc.close();
    }
}