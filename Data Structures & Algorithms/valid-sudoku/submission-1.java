class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for (int r = 0; r < 9; r++)
        {
            HashSet<Character> seenRows = new HashSet<>();
            for (int i = 0; i < 9; i++)
            {
                if (board[r][i] == '.') continue;
                if (seenRows.contains(board[r][i])) return false;
                seenRows.add(board[r][i]);
            }
        }

        for (int c = 0; c < 9; c++)
        {
            HashSet<Character> seenCols = new HashSet<>();
            for (int i = 0; i < 9; i++)
            {
                if (board[i][c] == '.') continue;
                if (seenCols.contains(board[i][c])) return false;
                seenCols.add(board[i][c]);
            }
        }

        for (int square = 0; square < 9; square++)
        {
            HashSet<Character> seenSquare = new HashSet<>();
            for (int i = 0; i < 3; i++)
            {
                for (int j = 0; j < 3; j++)
                {
                    int row = (square / 3) * 3 + i;
                    int col = (square % 3) * 3 + j;
                    if (board[row][col] == '.') continue;
                    if (seenSquare.contains(board[row][col])) return false;
                    seenSquare.add(board[row][col]);
                }
            }
        }

        return true;
    }
}
