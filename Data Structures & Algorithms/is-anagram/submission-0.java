
class Solution {
    public boolean isAnagram(String s, String t) {
        // First check whether length of both are equal
        if (s.length() == t.length()){
            // Now, get frequency of letters
            HashMap<String, Integer> s_map = new HashMap<>();
            HashMap<String, Integer> t_map = new HashMap<>();

            for (int i=0; i<s.length(); i++){
                String c = String.valueOf(s.charAt(i)) ;
                if (s_map.containsKey(c)){
                    s_map.put( c, s_map.get(c)+1 );
                }
                else {s_map.put(c,1 );}
            }
            for (int i=0; i<t.length(); i++){
                String c = String.valueOf(t.charAt(i)) ;
                if (t_map.containsKey(c)){
                    t_map.put( c, t_map.get(c)+1 );
                }
                else {t_map.put(c,1 );}
            }

            //System.out.println(s_map.size(), t_map.size());

            // if their frequencies are same, then they're anagram
            if ( s_map.equals(t_map) ) { return true; }
        }
        return false;
    }
}
