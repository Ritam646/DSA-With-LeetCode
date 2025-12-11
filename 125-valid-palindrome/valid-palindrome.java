class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder cleaned = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }
        String cleanStr = cleaned.toString();
        int n = cleanStr.length();
        String left = cleanStr.substring(0, n / 2);
        String right = cleanStr.substring((n + 1) / 2);
        String reversedRight = new StringBuilder(right).reverse().toString();
        return left.equals(reversedRight);
    }
}