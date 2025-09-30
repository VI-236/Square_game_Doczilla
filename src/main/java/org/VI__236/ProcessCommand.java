package org.VI__236;

public class ProcessCommand {

    private HandleGameCommand handleGameCommand;
    private HandleMoveCommand handleMoveCommand;

    public void processCommand(String command) {
        while (true){
            if (command.isEmpty()) return;

            String upperCommand = command.toUpperCase();

            if (upperCommand.startsWith("GAME")) {
                handleGameCommand.gameCommand(command);
            } else if (upperCommand.startsWith("MOVE")) {
                handleMoveCommand.moveCommand(command);
            } else if (upperCommand.equals("EXIT")) {
                System.out.println("Goodbye!");
                System.exit(0);
            } else if (upperCommand.equals("HELP")) {
                System.out.println(HELP_TEXT);
            } else {
                System.out.println("Incorrect command");
            }
        }
    }

    private static final String HELP_TEXT =
            "Available commands:\n" +
                    "GAME N, U1, U2 - start new game\n" +
                    "  N - board size (integer > 2)\n" +
                    "  U1, U2 - players in format: TYPE C\n" +
                    "    TYPE: 'user' or 'comp'\n" +
                    "    C: 'W' (white) or 'B' (black)\n" +
                    "MOVE X, Y - make a move\n" +
                    "EXIT - exit program\n" +
                    "HELP - show this help";
}
