class Solution {

    public String encode(List<String> strs) {
        String res = "";
        for(String s : strs){
            int length = s.length();

            res += length + "#" + s;
        }
        return res;
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();

        char[] ch = str.toCharArray();
        for(int i=0; i < str.length(); ){
            String s = "";
            while(i < str.length() && ch[i] != '#'){
                s += Character.toString(ch[i]);
                i++;
            }

            int len = Integer.parseInt(s);
            i++; // skip '#'

            String st = "";
            for(int j = i; j < i + len; j++){
                st += Character.toString(ch[j]);
            }


            list.add(st);
            i += len;
        }
        return list;
    }
}
