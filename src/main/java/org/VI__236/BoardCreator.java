package org.VI__236;

import java.util.Arrays;

public class BoardCreator {

    public char [] [] gameBoarCreator(char [] [] gameBoard, int boardSize){

        if (boardSize < 2){
            return null;
        }
        else{
            return gameBoard = new char [boardSize] [boardSize];
        }
    }
}
