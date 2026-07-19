class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        // create empty hashmap: key->value = sorted string->strings in anagram group
        HashMap<String, List<String>> map = new HashMap<>();

        // Loop through the string list, and add strings to their anagram lists.
        for (String str : strs){
            // SORTING CHARACTERS -> CREATING SORTED STRING
            char[] chars = str.toCharArray();
            Arrays.sort(chars); // sort characters first
            String sorted = new String(chars);

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
        }

        // get the values from hashmap and assign them to the res ArrayList.
        res = new ArrayList<>(map.values() );
        return res;
    }
}