class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        if (word == null || abbr == null) {
            throw new IllegalArgumentException("Input is null");
        }

        int wLen = word.length();
        int aLen = abbr.length();

        if (aLen > wLen) {
            return false;
        }

        if (wLen == 0) {
            return true;
        }

        int i = 0;
        int j = 0;

        while (i < wLen && j < aLen) {
            if (word.charAt(i) == abbr.charAt(j)) {
                i++;
                j++;
                continue;
            }

            if (abbr.charAt(j) == '0' || !Character.isDigit(abbr.charAt(j))) {
                return false;
            }

            int num = 0;
            while (j < aLen && Character.isDigit(abbr.charAt(j))) {
                num = 10 * num + (abbr.charAt(j) - '0');
                j++;
            }

            i += num;
        }

        return i == wLen && j == aLen;
    }
}