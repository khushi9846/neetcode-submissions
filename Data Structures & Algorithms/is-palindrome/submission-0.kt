class Solution {
    fun isPalindrome(s: String): Boolean {
        var ArrChar = mutableListOf<Char>()
        var ArrCharBack = mutableListOf<Char>()
        var input1 = s.replace(" ","")
        
        var input = input1.replace(("[^a-zA-Z0-9]").toRegex(),"").lowercase()           
        
        for(i in input){
            ArrChar.add(i)
        }
        for (i in input.length - 1 downTo 0) {
            ArrCharBack.add(input[i])
        }
        if(ArrCharBack.toCharArray().contentEquals(ArrChar.toCharArray()))
        return true
        else return false
    }
}
