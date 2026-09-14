class Solution {
    var hashMap = HashMap<Int,Int>()
    fun hasDuplicate(nums: IntArray): Boolean {
       for(n in nums){
        hashMap[n] = (hashMap[n] ?: 0) + 1
          if (hashMap[n]!! > 1) {
        return true
       }
    }
    return false
    }
}
