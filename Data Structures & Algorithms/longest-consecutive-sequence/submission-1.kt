class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        val newArr = nums.distinct().sorted()

        val start = IntArray(nums.size)
        var j = 0
        var count = 1
        for (i in 0 until newArr.lastIndex) {
            if (newArr[i] == newArr[i + 1] - 1) {
                count++
            } else {
                start[j] = count
                j++
                count = 1
            }
        }
        start[j] = count
        val sortedarr = start.sorted()
        return sortedarr.last()
    }
}
