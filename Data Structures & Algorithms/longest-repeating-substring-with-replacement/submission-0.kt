class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var left = 0
        var right = 0
        var hashmap = HashMap<Char,Int>()
        var maxfreq = 0
        var maxCount = 0 
        while(right < s.length){
        
        hashmap[s[right]] = hashmap.getOrDefault(s[right],0) + 1
        maxfreq = maxOf(maxfreq, hashmap[s[right]]!!)
        //here getting the window size
        var currentsize = right - left + 1
        if(currentsize - maxfreq > k){
            //it means more replacements than K so we will incremnt the i and move it to right 

            //remove that last i th item from the window 
           hashmap[s[left]] = hashmap[s[left]]!! - 1 
           left ++
        }
        maxCount = maxOf(maxCount, right - left + 1 )
        right++
        }
return maxCount
    }
}
