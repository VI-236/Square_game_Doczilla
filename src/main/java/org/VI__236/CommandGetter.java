package org.VI__236;

import java.util.Scanner;

public class CommandGetter {

    private static final Scanner scanner = new Scanner(System.in);
    private String command;

    public String commandGet(){

        command = scanner.nextLine().trim();

        return command;
    }
}
