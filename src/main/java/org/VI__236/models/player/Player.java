package org.VI__236.models.player;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Player {

    @Setter
    @Getter
    private Color color;

    @Setter
    @Getter
    private PlayerType playerType;
}
