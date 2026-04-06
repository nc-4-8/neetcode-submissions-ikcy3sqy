class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] x = str.toCharArray();
            Arrays.sort(x);
            String y = new String(x);
            map.computeIfAbsent(y, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}