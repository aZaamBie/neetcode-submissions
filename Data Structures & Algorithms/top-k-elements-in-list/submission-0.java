class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] res = new int[k];
        // Hashmap?
        HashMap<Integer, Integer> map = new HashMap<>();

        // iterate through nums, adding to hashmap
        for (Integer n : nums){
            if ( map.containsKey(n) ) {
                map.put(n, map.get(n) + 1 );
            }
            else{
                map.put(n, 1);
            }
        }

        //System.out.println(map.values() + " are the values");
        List<int[]> pairs = new ArrayList<>();
        for ( Map.Entry<Integer, Integer> entry : map.entrySet() ) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
            pairs.add( new int[] {entry.getValue(), entry.getKey()} );
        }

        pairs.sort((a, b) -> b[0] - a[0]);

        for ( int i =0; i<k; i++) {
            res[i] = pairs.get(i)[1];
        }

        
        return res;
    }
}
