package org.VI__236;

public class ProcessCommand {

    private HandleGameCommand handleGameCommand;
    private HandleMoveCommand handleMoveCommand;

    public void processCommand(String command) {
        if (command.isEmpty()) return;

        String upperCommand = command.toUpperCase();

        if (upperCommand.startsWith("GAME")) {
            handleGameCommand(command);
        } else if (upperCommand.startsWith("MOVE")) {
            handleMoveCommand(command);
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
