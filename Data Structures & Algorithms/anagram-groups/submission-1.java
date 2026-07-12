class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map <String,List<String>> map = new HashMap<>();
        for(String s : strs){
          char ch[] = s.toCharArray();
          Arrays.sort(ch);
          String key = new String(ch);
          if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
          }
          map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }


    /*Let's define:

n = number of strings
k = average length of each string
Time Complexity

For each string:

toCharArray() → O(k)
Arrays.sort(ch) → O(k log k) ← this is the most expensive step
new String(ch) → O(k)
HashMap operations (containsKey, put, get) → O(1) on average

So for one string:

O(k log k)

For n strings:

O(n × k log k)

So the final time complexity is:

✅ O(n × k log k)

Space Complexity

The HashMap stores all the input strings, grouped into lists.

The total number of characters stored is still proportional to the input size.

Also, each iteration creates a temporary char[] of size k.

So the overall auxiliary space is dominated by the map storing the grouped strings:

✅ O(n × k)*/
}
