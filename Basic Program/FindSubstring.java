public class FindSubstring {
    public static int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();

        // If needle is empty, return 0
        if (nLen == 0) return 0;

        // Loop through haystack
        for (int i = 0; i <= hLen - nLen; i++) {
            int j;
            // Check if substring matches
            for (j = 0; j < nLen; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            // If full needle matched
            if (j == nLen) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        String haystack = "sadbutsad";
        String needle = "sad";

        int index = strStr(haystack, needle);
        System.out.println(index); // Output: 0
    }
}
