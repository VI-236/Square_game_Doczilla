package org.VI__236;

public class IsBoardFull {

    public boolean isBoardFull(char [][] board, int boardSize){
        int totalCount = 0;

        if (board == null) {
            return false;
        }

        for (char [] symb : board) {
            if (symb != null) {
                totalCount += symb.length;
            }
        }

        if (totalCount == boardSize*boardSize){
            return true;
        }
        else{
            return false;
        }
    }
}
