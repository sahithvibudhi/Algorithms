class Recursive {
    public int longestCommonSubsequence(String text1, String text2) {
        int size1 = text1.length();
        int size2 = text2.length();
        if (size1 == 0) return 0;
        if (size2 == 0) return 0;
        if (text1.charAt(0) == text2.charAt(0)) return 1 + longestCommonSubsequence(text1.substring(1), text2.substring(1));
        int l1 = longestCommonSubsequence(text1.substring(1), text2);
        int l2 = longestCommonSubsequence(text1, text2.substring(1));
        return Math.max(l1, l2);
    }
}