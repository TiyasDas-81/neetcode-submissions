class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        int n = nums.length;
        int max = 0;

        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i < n; i++){
            set.add(nums[i]);
        }

        for(int item : set){
            int temp = item;
            int count = 0;
            if(!set.contains(temp - 1)){
                while(set.contains(temp)){
                    count++;
                    temp++;
                }
            }
            max = Math.max(count,max);
        }

        return max;
    }
}
