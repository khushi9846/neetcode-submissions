class Solution {
  val hashMap = HashMap<Int,Int>()
  var output = arrayListOf<Int>()
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val freqMap = HashMap<Int, Int>()
        for (num in nums) {
        if (freqMap.containsKey(num)) {
            freqMap[num] = freqMap[num]!! + 1
        } else {
            freqMap[num] = 1
        }
    }

    val list = mutableListOf<Pair<Int,Int>>()
      for((key,value) in freqMap){
        list.add(Pair(key,value))
      }

      for(i in 0 until list.size-1){
        for(j in 0 until list.size - i-1){
          if(list[j].second < list[j+1].second){
            val temp =list[j]
            list[j]=list[j+1]
            list[j+1]=temp
          }
        }
      }
      for(i in 0 until k){
        output.add(list[i].first)
      }
      return output.toIntArray()
    }
}
