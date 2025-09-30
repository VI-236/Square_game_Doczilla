package org.VI__236;

import org.VI__236.models.player.Color;
import org.VI__236.models.player.Player;
import org.VI__236.models.player.PlayerType;

public class PlayerCreator{

    private Player player;

    public Player playerCreator(String color, String playerType){

        try{
            player.setColor(Color.valueOf(color));
        }
        catch(IllegalArgumentException e){
            System.err.println("Invalid enum constant: " + color);
        }

        try{
            player.setPlayerType(PlayerType.valueOf(playerType));
        }
        catch(IllegalArgumentException e){
            System.err.println("Invalid enum constant: " + playerType);
        }

        return player;
    }
}
