package basic;

class Solution {
    public static void main(String[] args) {
        String[] strings = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(strings));
    }
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String commonPrefix = strs[0]; // Start with the first string as the initial common prefix

        for (int i = 1; i < strs.length; i++) {
            String currentString = strs[i];

            int j = 0;
            while (j < commonPrefix.length() && j < currentString.length()
                    && commonPrefix.charAt(j) == currentString.charAt(j)) {
                j++;
            }

            // Update commonPrefix with the matching characters until index j
            commonPrefix = commonPrefix.substring(0, j);

            // If the common prefix is an empty string, there is no need to check further
            if (commonPrefix.isEmpty()) {
                break;
            }
        }

        return commonPrefix;
    }

}
