class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
var savedMap = HashSet<String>()
            for( i in board.indices){
                for( j in board[i].indices){
                    var num = board[i][j]
                    if(num.toString() == ".") continue 
                    
                    if(savedMap.contains("row$i-"+num) ||               savedMap.contains("col$j-"+num)|| 
                            savedMap.contains("Mat-"+((i/3)*3+j/3) +"-"+num))
                    return false 
                    
                    savedMap.add("row$i-"+num )
                 	savedMap.add("col$j-"+num )
                    savedMap.add("Mat-"+((i/3)*3+j/3) +"-"+num)

                }
            }
            println(savedMap)
            return true
    }
}
