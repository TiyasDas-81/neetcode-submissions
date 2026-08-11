class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prefix = new int[n];
        int[] suffix = new int[n];

        int pdt = 1;
        for(int i=0; i < n; i++){
            prefix[i] = pdt;
            pdt *= nums[i];
        }

        pdt = 1;
        for(int i=n - 1; i >= 0; i--){
            suffix[i] = pdt;
            pdt *= nums[i];
        }

        int[] res = new int[n];

        for(int i=0; i < n; i++){
            res[i] = prefix[i] * suffix[i];
        }

        return res;
    }
}  
