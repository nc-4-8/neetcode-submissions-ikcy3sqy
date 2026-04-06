class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> a = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(char b: s.toCharArray()){
            a.put(b, a.getOrDefault(b, 0) + 1);
        }
        for(char c: t.toCharArray()){
            if(a.getOrDefault(c, 0) == 0){
                return false;
            }
            a.put(c, a.getOrDefault(c, 0) - 1);
        }

        return true;
        
    }
}
