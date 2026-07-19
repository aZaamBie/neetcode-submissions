class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        
        // create empty hashmap: key->value = sorted string->array of strings
        HashMap<String, List<String>> map = new HashMap<>();

        // Loop through parameter, and add strings to their anagram lists.
        for (String str : strs){
            // SORTING CHARACTERS -> CREATING SORTED STRING
            char[] chars = str.toCharArray();
            Arrays.sort(chars); // sort characters first
            String sorted = new String(chars);

            //System.out.println(sorted + " is sorted version");

            // if key exists, then add onto the value
            if ( map.containsKey(sorted) ){
                map.get(sorted).add(str);
            }
            else{ // if key doesnt exist in map, it's a new sorted string
                // new arrayliswt with original string as first item
                List<String> newList = new ArrayList<>();
                newList.add(str);
                map.put(sorted, newList);
            }

            //System.out.println(map);
        }

        // Now check the map,
        res = new ArrayList<>(map.values() );
        return res;


    }
}
