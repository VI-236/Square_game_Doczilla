package org.VI__236;

public class IsValidMove {

    public boolean moveValidator(int coordinateX, int coordinateY, int [][] board){

        if (coordinateX < 0 || coordinateX >= board.length ||
            coordinateY < 0 || coordinateY >= board[coordinateX].length ||
            board[coordinateX][coordinateY] != 0) {

            return false;
        }
        else{
            return true;
        }
    }
}
