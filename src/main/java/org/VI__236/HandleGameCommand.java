package org.VI__236;

import org.VI__236.models.player.Player;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HandleGameCommand {

    private PlayerParamParser playerParamParser = new PlayerParamParser();

    private List<String> commandList;
    private int correctCommand = 1;

    public List<String> gameCommand(String command) {

        Pattern pattern = Pattern.compile("GAME\\s+(\\d+)\\s*,\\s*(\\w+\\s+[WB])\\s*,\\s*(\\w+\\s+[WB])", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(command);

        // 2. Проверка соответствия формату команды
        if (!matcher.matches()) {
            System.out.println("Incorrect command");
            correctCommand--;
        }

        try {
            // 3. Извлечение и проверка размера доски
            int size = Integer.parseInt(matcher.group(1));
            if (size <= 2) {
                System.out.println("Incorrect command");
                correctCommand--;
            }
            else {
                commandList.add(matcher.group(1));
            }


            // 4. Парсинг параметров игроков
            for(int a = 2; a <= 3; a++){
                String [] temporaryPlayerParamList = pattern.split(matcher.group(a));

                commandList.add(temporaryPlayerParamList[0]);
                commandList.add(temporaryPlayerParamList[1]);
            }
            Player p1 = playerParamParser.parsePlayer(matcher.group(2));
            Player p2 = playerParamParser.parsePlayer(matcher.group(3));

            // 5. Проверка корректности игроков
            if (commandList.get(1) == null || commandList.get(3) == null || commandList.get(2).equals(commandList.get(4))) {
                System.out.println("Incorrect command");
                correctCommand--;
            }

            // 6. Создание новой игры
            //currentGame = new GameState(size, p1, p2);
            //System.out.println("New game started");

            // 7. Обработка первого хода, если игрок - компьютер
            /*if (currentGame.playerMap.get(currentGame.currentPlayer).type == PlayerType.COMP) {
                makeComputerMove();
            }*/

        } catch (Exception e) {
            System.out.println("Incorrect command");
        }

        if (correctCommand == 1){
            return commandList;
        }
        else {
            return null;
        }
    }
}
