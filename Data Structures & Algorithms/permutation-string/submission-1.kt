class Solution {
    fun checkInclusion(s1: String, s2: String): Boolean {
        var i = 0
        var s1Map = HashMap<Char,Int>()

        var windowSize = s1.length

            if(s2.length < s1.length) return false

        for(ch in s1){
            s1Map[ch] = s1Map.getOrDefault(ch,0) + 1
        }
            while(i + windowSize <= s2.length){
                        var s2Map = HashMap<Char,Int>()
             for(j in i until i + windowSize){
                s2Map[s2[j]] = s2Map.getOrDefault(s2[j],0) + 1
            }
            if(s1Map == s2Map) return true
            else {
                i++
            }
            }
            return false

    }
}
