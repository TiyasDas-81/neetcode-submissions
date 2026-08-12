class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();

        int n = s.length();

        int max = 0;

        int j = 0;
        int maxfreq = 0;

        for(int i=0; i < n; i++){
            
            char ch = s.charAt(i);

            map.put(ch, map.getOrDefault(ch, 0)+1);

            maxfreq = Math.max(maxfreq, map.get(ch));

            int distinct = (i - j + 1) - maxfreq;

            while(distinct > k){
                char c = s.charAt(j);
                map.put(c, map.get(c) - 1);
                j++;
                distinct = (j - i + 1) - maxfreq;
            }

            max = Math.max(max, i - j + 1);
        } 
        return max;
    }
}
