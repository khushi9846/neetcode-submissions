class Solution {
    var hash1 = HashMap<Char,Int>()
    var hash2 = HashMap<Char,Int>()
val groups = HashMap<String, MutableList<String>>()

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
          for(item in strs){
        val key = item.toCharArray().sorted().joinToString("") 
        //if this key is present then put then in the list and that hashMap of 
        // string and then if it is present 
        groups.computeIfAbsent(key){ mutableListOf() }.add(item)

      }
      return groups.values.toList()
    }
}
