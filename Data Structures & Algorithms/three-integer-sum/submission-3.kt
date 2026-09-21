class Solution {
  fun threeSum(nums: IntArray): List<List<Int>> {
// -4, -3, -2, -1, -1, 0, 0, 1, 2, 3, 4
    //0,0,0
    var i = 0
    var input = nums.sorted()
    var output = mutableListOf<List<Int>>()
    while(i < nums.size - 1 ){
    var j = i+1
    var k = nums.size - 1
        while(j<k){
            if(input[i] + input[j] + input[k] == 0){
                output.add(listOf(input[i],input[j],input[k]))
                j++
                k--
            }else if( input[i] + input[j] + input[k] < 0 ){
                j++
            }else{
                k--
            }
        }
        
        i++
        val sum = input[i] + input[j] + input[k]

println(
    "i=$i(${input[i]}) " +
    "j=$j(${input[j]}) " +
    "k=$k(${input[k]}) " +
    "sum=$sum"
)
    }
    return(output.distinct())
}
}
