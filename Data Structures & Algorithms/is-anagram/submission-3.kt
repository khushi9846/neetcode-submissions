class Solution {
  var hashMap1 = HashMap<Char,Int>()
  var hashMap2 = HashMap<Char,Int>()
    fun isAnagram(s: String, t: String): Boolean {
      for(n in s ){
        hashMap1[n] = (hashMap1[n] ?:0 ) +1
      }
       
       for(n in t ){
        hashMap2[n] = (hashMap2[n] ?:0 ) +1
      }
      print(hashMap1)
      println(hashMap2)
      if(hashMap1 == hashMap2)
      return true
      else return false
    }
}
