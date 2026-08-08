class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            int[] arr = new int[26];
            for(char c : s.toCharArray()){
                int idx = c - 'a';
                arr[idx] += 1;
            }
            String key = Arrays.toString(arr);
            map.putIfAbsent(key, new ArrayList<>());
            List<String> list = map.get(key);
            list.add(s);
            map.put(key, list);
        }

        for(String a : map.keySet() ){
            res.add(map.get(a));
        }

        return res;
    }
}