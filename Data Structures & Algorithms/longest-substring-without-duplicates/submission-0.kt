class Solution {
    fun lengthOfLongestSubstring(s: String): Int {

        val map = HashMap<Char, Int>()

        var left = 0
        var i = 0
        var maxLength = 0

        while (i < s.length) {

            val char = s[i]

            // Duplicate found INSIDE the current window
            if (map.containsKey(char) && map[char]!! >= left) {

                // Get previous index and move left after it
                left = map[char]!! + 1
            }

            // Store/update the latest index
            map[char] = i

            // Current valid window = left...i
            val currentLength = i - left + 1

            maxLength = maxOf(maxLength, currentLength)

            i++
        }

        return maxLength
    }
}