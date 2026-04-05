
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> x = new HashSet<Integer>();
        for(int y: nums){
            if(x.contains(y)){
                return true;
            }
            x.add(y);
        }
        return false;
    }
}