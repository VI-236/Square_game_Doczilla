package org.VI__236;

public class WinChecker {

    private boolean win = false;

    private IsValidMove moveChecker;

    public boolean winChek(char [][] board, int coordinateX, int coordinateY){

        char colorOfCell = board[coordinateX][coordinateY];

                    //Small square checker:
                    //_ _ _ _ _
                    //_ _ o o _
                    //_ _ o o _
                    //_ _ _ _ _
                    if (moveChecker.isValidMove(coordinateX + 1, coordinateY, board) &&
                       board[coordinateX + 1][coordinateY] == colorOfCell &&
                       moveChecker.isValidMove(coordinateX + 1, coordinateY + 1, board) &&
                       board[coordinateX + 1][coordinateY + 1] == colorOfCell &&
                       moveChecker.isValidMove(coordinateX, coordinateY + 1, board) &&
                       board[coordinateX][coordinateY + 1] == colorOfCell) {

                       win = true;
                    }
                    if (moveChecker.isValidMove(coordinateX, coordinateY + 1, board) &&
                        board[coordinateX][coordinateY + 1] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX + 1, coordinateY - 1, board) &&
                        board[coordinateX + 1][coordinateY - 1] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX - 1, coordinateY, board) &&
                        board[coordinateX - 1][coordinateY] == colorOfCell) {

                        win = true;
                    }
                    if (moveChecker.isValidMove(coordinateX - 1, coordinateY, board) &&
                        board[coordinateX - 1][coordinateY] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX - 1, coordinateY - 1, board) &&
                        board[coordinateX - 1][coordinateY - 1] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX, coordinateY - 1, board) &&
                        board[coordinateX][coordinateY - 1] == colorOfCell) {

                        win = true;
                    }
                    if (moveChecker.isValidMove(coordinateX, coordinateY - 1, board) &&
                        board[coordinateX][coordinateY - 1] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX + 1, coordinateY - 1, board) &&
                        board[coordinateX + 1][coordinateY - 1] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX + 1, coordinateY, board) &&
                        board[coordinateX + 1][coordinateY] == colorOfCell) {

                        win = true;
                    }


                    //Big square checker:
                    //_ _ _ _ _
                    //_ o _ o _
                    //_ _ _ _ _
                    //_ o _ o _
                    //_ _ _ _ _
                    if (moveChecker.isValidMove(coordinateX + 2, coordinateY, board) &&
                        board[coordinateX + 2][coordinateY] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX + 2, coordinateY + 2, board) &&
                        board[coordinateX + 2][coordinateY + 2] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX, coordinateY + 2, board) &&
                        board[coordinateX][coordinateY + 2] == colorOfCell) {

                        win = true;
                    }
                    if (moveChecker.isValidMove(coordinateX, coordinateY + 2, board) &&
                        board[coordinateX][coordinateY + 2] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX + 2, coordinateY - 2, board) &&
                        board[coordinateX + 2][coordinateY - 2] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX - 2, coordinateY, board) &&
                        board[coordinateX - 2][coordinateY] == colorOfCell) {

                        win = true;
                    }
                    if (moveChecker.isValidMove(coordinateX - 2, coordinateY, board) &&
                        board[coordinateX - 2][coordinateY] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX - 2, coordinateY - 2, board) &&
                        board[coordinateX - 2][coordinateY - 2] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX, coordinateY - 2, board) &&
                        board[coordinateX][coordinateY - 2] == colorOfCell) {

                        win = true;
                    }
                    if (moveChecker.isValidMove(coordinateX, coordinateY - 2, board) &&
                        board[coordinateX][coordinateY - 2] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX + 2, coordinateY - 2, board) &&
                        board[coordinateX + 2][coordinateY - 2] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX + 2, coordinateY, board) &&
                        board[coordinateX + 2][coordinateY] == colorOfCell) {

                        win = true;
                    }


                    //Rhombus checker:
                    //_ _ o _ _
                    //_ o _ o _
                    //_ _ o _ _
                    if (moveChecker.isValidMove(coordinateX + 1, coordinateY + 1, board) &&
                        board[coordinateX + 1][coordinateY + 1] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX, coordinateY + 2, board) &&
                        board[coordinateX][coordinateY + 2] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX - 1, coordinateY + 1, board) &&
                        board[coordinateX - 1][coordinateY + 1] == colorOfCell) {

                        win = true;
                    }
                    if (moveChecker.isValidMove(coordinateX - 1, coordinateY + 1, board) &&
                        board[coordinateX - 1][coordinateY + 1] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX - 2, coordinateY, board) &&
                        board[coordinateX - 2][coordinateY] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX - 1, coordinateY - 1, board) &&
                        board[coordinateX - 1][coordinateY - 1] == colorOfCell) {

                        win = true;
                    }
                    if (moveChecker.isValidMove(coordinateX - 1, coordinateY - 1, board) &&
                        board[coordinateX - 1][coordinateY - 1] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX, coordinateY - 2, board) &&
                        board[coordinateX][coordinateY - 2] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX + 1, coordinateY - 1, board) &&
                        board[coordinateX + 1][coordinateY - 1] == colorOfCell) {

                        win = true;
                    }
                    if (moveChecker.isValidMove(coordinateX + 1, coordinateY - 1, board) &&
                        board[coordinateX + 1][coordinateY - 1] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX + 2, coordinateY, board) &&
                        board[coordinateX + 2][coordinateY] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX + 1, coordinateY + 1, board) &&
                        board[coordinateX + 1][coordinateY + 1] == colorOfCell) {

                        win = true;
                    }



                    //Littered square checker:
                    //_ _ _ o _ _
                    //_ o _ _ _ _
                    //_ _ _ _ o _
                    //_ _ o _ _ _
                    if (moveChecker.isValidMove(coordinateX + 2, coordinateY - 1, board) &&
                        board[coordinateX + 2][coordinateY - 1] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX + 3, coordinateY + 1, board) &&
                        board[coordinateX + 3][coordinateY + 1] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX + 1, coordinateY + 2, board) &&
                        board[coordinateX + 1][coordinateY + 2] == colorOfCell) {

                        win = true;
                    }
                    if (moveChecker.isValidMove(coordinateX + 1, coordinateY + 2, board) &&
                        board[coordinateX + 1][coordinateY + 2] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX - 1, coordinateY + 3, board) &&
                        board[coordinateX - 1][coordinateY + 3] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX - 2, coordinateY + 1, board) &&
                        board[coordinateX - 2][coordinateY + 1] == colorOfCell) {

                        win = true;
                    }
                    if (moveChecker.isValidMove(coordinateX - 2, coordinateY + 1, board) &&
                        board[coordinateX - 2][coordinateY + 1] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX - 3, coordinateY - 1, board) &&
                        board[coordinateX - 3][coordinateY - 1] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX - 2, coordinateY - 1, board) &&
                        board[coordinateX - 2][coordinateY - 1] == colorOfCell) {

                        win = true;
                    }
                    if (moveChecker.isValidMove(coordinateX - 1, coordinateY - 2, board) &&
                        board[coordinateX - 1][coordinateY - 2] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX + 1, coordinateY - 3, board) &&
                        board[coordinateX + 1][coordinateY - 3] == colorOfCell &&
                        moveChecker.isValidMove(coordinateX + 2, coordinateY - 1, board) &&
                        board[coordinateX + 2][coordinateY - 1] == colorOfCell) {

                        win = true;
                    }

        return win;
    }
}
