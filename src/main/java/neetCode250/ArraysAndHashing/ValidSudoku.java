package neetCode250.ArraysAndHashing;

//https://neetcode.io/problems/valid-sudoku?list=neetcode250

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        //Checking rows
        Set<Character> row = new HashSet<>();
        Map<Integer, Set<Character>> columns = new HashMap<>();
        Map<Integer, Set<Character>> subBoxes = new HashMap<>();

        //Looping columns
        for (int i = 0; i < board.length; i++){
            //Looping row
            for (int j = 0; j < board.length; j++){
                char boardItem = board[i][j];
                int subBoxIndex =  ((i/3) * 3) + (j / 3);

                //Ignore empty spaces
                if (boardItem == '.'){
                    continue;
                }

                //Controlling duplicates
                if (row.contains(boardItem) ||
                    columns.computeIfAbsent(j, k -> new HashSet<>()).contains(boardItem) ||
                    subBoxes.computeIfAbsent(subBoxIndex, k -> new HashSet<>()).contains(boardItem)){

                    return false;
                }

                row.add(boardItem);
                columns.get(j).add(boardItem);
                subBoxes.get(subBoxIndex).add(boardItem);
            }
            row.clear();
        }

        return true;
    }

    public static void main(String[] args) {
        /*
        char[][] board =
            {{'1','2','.','.','3','.','.','.','.'},
             {'4','.','.','5','.','.','.','.','.'},
             {'.','9','8','.','.','.','.','.','3'},
             {'5','.','.','.','6','.','.','.','4'},
             {'.','.','.','8','.','3','.','.','5'},
             {'7','.','.','.','2','.','.','.','6'},
             {'.','.','.','.','.','.','2','.','.'},
             {'.','.','.','4','1','9','.','.','8'},
             {'.','.','.','.','8','.','.','7','9'}};
        */
        char[][] board =
                {{'1','2','.','.','3','.','.','.','.'},
                        {'4','.','.','5','.','.','.','.','.'},
                        {'.','9','1','.','.','.','.','.','3'},
                        {'5','.','.','.','6','.','.','.','4'},
                        {'.','.','.','8','.','3','.','.','5'},
                        {'7','.','.','.','2','.','.','.','6'},
                        {'.','.','.','.','.','.','2','.','.'},
                        {'.','.','.','4','1','9','.','.','8'},
                        {'.','.','.','.','8','.','.','7','9'}};
        var isValid = ValidSudoku.isValidSudoku(board);
        System.out.println(isValid);
    }
}
