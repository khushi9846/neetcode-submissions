class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {

        var size = nums.size
        var result = IntArray(size)

        //for iterating from start
        var prefix = 1 
        for(i in nums.indices){
            result[i] = prefix
             prefix *= nums[i]
        }       

        var suffix = 1
        for( i in nums.lastIndex downTo 0){
            result[i] *= suffix
            suffix *= nums[i]
        }

        return result 

    }
}
