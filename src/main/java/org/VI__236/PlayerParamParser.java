package org.VI__236;

import org.VI__236.models.player.Color;
import org.VI__236.models.player.Player;
import org.VI__236.models.player.PlayerType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlayerParamParser {

    public Player parsePlayer(String playerStr) {
        Pattern pattern = Pattern.compile("(USER|COMP)\\s+([WB])", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(playerStr.trim());

        if (!matcher.matches()) {
            return null;
        }

        PlayerType type = matcher.group(1).equalsIgnoreCase("USER") ? PlayerType.USER : PlayerType.COMP;
        Color color = matcher.group(2).equalsIgnoreCase("W") ? Color.WHITE : Color.BLACK;

        return new Player(color, type);
    }
}
