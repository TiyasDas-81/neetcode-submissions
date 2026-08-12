class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        HashMap<Character, Integer> map = new HashMap<>();

        int max = 0;

        int j = 0;
        for(int i=0; i < n;i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);

            while(j < i && map.get(s.charAt(i)) > 1){
                map.put(s.charAt(j), map.get(s.charAt(j)) - 1);
                j++;
            }

            max = Math.max(max, i - j + 1);
        }
        return max;
    }
}
