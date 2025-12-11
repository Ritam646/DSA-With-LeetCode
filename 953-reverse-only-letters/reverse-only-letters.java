class Solution {
    public String reverseOnlyLetters(String s) {
        String letters = s.replaceAll("[^A-Za-z]", "");
        StringBuilder rev = new StringBuilder(letters).reverse();
        StringBuilder result = new StringBuilder();
        int idx = 0;
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(rev.charAt(idx++));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}