class Solution {

    fun encode(strs: List<String>): String {
        var str1=""
        for(i in strs){
           str1 = str1 + i.length.toString() + ("#") + i
      }
        return str1
    }

   fun decode(str: String): List<String> {
        var i =0 
        var listItem = mutableListOf<String>()
        while(i < str.length){
        var j =i

// search #
        while(str[j].toString()!="#"){
            j++
        }

// we got index for number 
        var num = str.substring(i,j).toInt()

  //substring reads from i to j -1 so here start afternumber 
        var start = j + 1
        var end = start + num
        var item = str.substring(start , end) 
        listItem.add(item)

        // move the index to end of word.
        i = end 

        }
        return listItem;
    }
}
