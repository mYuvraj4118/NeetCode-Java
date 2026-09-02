class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for (int row = 0; row < 9; row++){
            for (int col = 0; col < 9; col++){
                char num = board[row][col];

                if (num == '.'){
                    continue;
                }

                String rowCheck = "row" + row + num;
                String colCheck = "col" + col + num;

                String boxCheck = "box" + (row/3) + (col/3) + num;

                if (seen.contains(rowCheck) ||
                    seen.contains(colCheck) ||
                    seen.contains(boxCheck)){
                    return false;
                }

                seen.add(rowCheck);
                seen.add(colCheck);
                seen.add(boxCheck);
            }
        }

        return true;
    }
}
