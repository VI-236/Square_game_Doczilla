package org.VI__236;

import org.VI__236.models.player.Player;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HandleMoveCommand {


    public void moveCommand(String command) {

        /*
        if (currentGame == null || !currentGame.gameActive) {
            System.out.println("Incorrect command");
            return;
        }*/


        Pattern pattern = Pattern.compile("MOVE\\s*(\\d+)\\s*,\\s*(\\d+)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(command);

        if (!matcher.matches()) {
            System.out.println("Incorrect command");
            return;
        }

        try {
            int coordinateX = Integer.parseInt(matcher.group(1));
            int coordinateY = Integer.parseInt(matcher.group(2));


            makeMove(coordinateX, coordinateY, currentGame.currentPlayer);
            checkGameEnd();

            if (currentGame.gameActive) {
                switchPlayer();
                // If next player is computer, make move
                Player nextPlayerObj = currentGame.playerMap.get(currentGame.currentPlayer);
                if (nextPlayerObj.type == PlayerType.COMP) {
                    makeComputerMove();
                }
            }

        } catch (Exception e) {
            System.out.println("Incorrect command");
        }
    }
    }
}
