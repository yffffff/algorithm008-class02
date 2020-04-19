class FirstUniqChar_50 {
    public char firstUniqChar(String s) {
        Map<Character, Boolean> result_map = new HashMap<>();

        char[] array = s.toCharArray();

        for (char c : array) {
            result_map.put(c, !result_map.containsKey(c));
        }

        for (char c : array) {
            if (result_map.get(c)) return c;
        }

        return ' ';
    }
}