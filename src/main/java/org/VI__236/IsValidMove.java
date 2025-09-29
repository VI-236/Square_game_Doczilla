package org.VI__236;

public class IsValidMove {

    public boolean isValidMove(int coordinateX, int coordinateY, char [][] board){

        if (coordinateX < 0 || coordinateX >= board.length ||
            coordinateY < 0 || coordinateY >= board[coordinateX].length ||
            board[coordinateX][coordinateY] != '\u0000') {

            return false;
        }
        else{
            return true;
        }
    }
}
