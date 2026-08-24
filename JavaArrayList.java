import java.io.*;
import java.util.*;

public class JavaArrayList {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        // Number of lines
        int n = sc.nextInt();

        // Create ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> data = new ArrayList<>();

        // Read each line
        for (int i = 0; i < n; i++) {

            // Number of integers in this line
            int d = sc.nextInt();

            ArrayList<Integer> list = new ArrayList<>();

            // Add integers to the list
            for (int j = 0; j < d; j++) {
                list.add(sc.nextInt());
            }

            data.add(list);
        }

        // Number of queries
        int q = sc.nextInt();

        // Process queries
        for (int i = 0; i < q; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            // Check whether line and position exist
            if (x >= 1 && x <= data.size() &&
                y >= 1 && y <= data.get(x - 1).size()) {

                System.out.println(data.get(x - 1).get(y - 1));

            } else {
                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}