import java.util.*;

class FrequencySort {
    public String frequencySort(String s) {

        // Count frequency of each character
        int[] freq = new int[128];

        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        // Store characters
        Character[] chars = new Character[128];
        int count = 0;

        for (int i = 0; i < 128; i++) {
            if (freq[i] > 0) {
                chars[count++] = (char) i;
            }
        }

        // Sort characters by decreasing frequency
        Arrays.sort(chars, 0, count, new Comparator<Character>() {
            @Override
            public int compare(Character a, Character b) {
                return Integer.compare(freq[b], freq[a]);
            }
        });

        // Build result
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < count; i++) {
            char c = chars[i];

            for (int j = 0; j < freq[c]; j++) {
                result.append(c);
            }
        }

        return result.toString();
    }
}