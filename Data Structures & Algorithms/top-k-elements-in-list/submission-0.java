class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        ArrayList<int[]> list = new ArrayList<>();

        for(int key : map.keySet()){
            list.add(new int[]{key, map.get(key)});
        }

        Collections.sort(list, (a,b) -> b[1] - a[1]);

        int[] arr = new int[k];

        for(int i=0; i < k; i++){
            arr[i] = list.get(i)[0];
        }

        return arr;
    }
}
