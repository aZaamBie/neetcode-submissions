
class Solution {
    public boolean isAnagram(String s, String t) {
        // First check whether length of both are equal
        if (s.length() == t.length()){
            // Now, get frequency of letters
            HashMap<String, Integer> s_map = new HashMap<>();
            HashMap<String, Integer> t_map = new HashMap<>();

            for (int i=0; i<s.length(); i++){
                String c = String.valueOf(s.charAt(i)) ;
                if (s_map.containsKey(c)){ // Hashmap for s
                    s_map.put( c, s_map.get(c)+1 );
                }
                else {s_map.put(c,1 );}

                c = String.valueOf(t.charAt(i)) ;
                if (t_map.containsKey(c)){ // Hashmap for t
                    t_map.put(c, t_map.get(c)+1 );
                }
                else {t_map.put(c,1 );}
            }

            // if their frequencies/hash maps are same, then they're anagram
            if ( s_map.equals(t_map) ) { return true; }
        }
        return false;
    }
}
