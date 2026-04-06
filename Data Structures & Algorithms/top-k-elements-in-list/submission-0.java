class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] frequency = new int[k];
        Map<Integer, Integer> x = new HashMap<>();
        for(int y : nums){
            x.put(y, x.getOrDefault(y, 0)+1);
        }
        PriorityQueue<Integer> a = new PriorityQueue<>(
            (b, c) -> x.get(b) - x.get(c)
        );

        for(int i: x.keySet()){
            a.add(i);
            if(a.size()>k){
                a.poll();
            }
        }

        for(int j = k - 1; j>=0;j--){
            frequency[j] = a.poll();
        }
        return frequency;


    }
}
