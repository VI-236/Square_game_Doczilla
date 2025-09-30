package org.VI__236;

import org.VI__236.models.player.Color;

public class Movement {

    private IsValidMove isValidMove = new IsValidMove();
    private boolean moveIsDone;

    public boolean move(int coordinateX, int coordinateY, int [][] board, Color color){

        if(isValidMove.moveValidator(coordinateX, coordinateY, board)){
            if (color == Color.WHITE){
                board[coordinateX][coordinateY] = 1;
            }
            else{
                board[coordinateX][coordinateY] = 2;
            }
            moveIsDone = true;
        }
        else {
            moveIsDone = false;
        }

        return moveIsDone;
    }
}
