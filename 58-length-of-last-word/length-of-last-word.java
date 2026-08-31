class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int d = s.lastIndexOf(" ");
        return s.length() - d - 1;
    }
}