class Solution {
    fun maxArea(heights: IntArray): Int {

        var i = 0 
        var j = heights.size -1 
        var maxArea = 0
        while(i < j){
             var area = minOf(heights[i], heights[j]) * (j-i)
             if(heights[i] > heights[j]){
                j--
             }else i++

             maxArea=maxOf(area, maxArea)
        }
        return maxArea
    }
}
