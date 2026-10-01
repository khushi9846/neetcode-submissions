class Solution {
    fun trap(height: IntArray): Int {
        var i = 1
        var area = 0
        var left = 0
        var right = height.size - 1 
             var Maxleft = 0
            var Maxright = 0
        while( left < right ){
       

        Maxleft = maxOf(Maxleft, height[left])
        Maxright = maxOf(Maxright, height[right])

        if(height[left] < height[right]){
            area += Maxleft - height[left]
            left++ 
        }
        else {
        area += Maxright - height[right]
            right--
        }
        }
return area
    }
}
