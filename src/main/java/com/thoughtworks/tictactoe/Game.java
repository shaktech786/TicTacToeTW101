package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

public class Game {
    private char[] firstRow;
    private char[] secondRow;
    private char[] thirdRow;
    private String rowDivider;
    private PrintStream printStream;
    private BufferedReader bufferedReader;
    private List<String> spots;

    public Game(PrintStream printStream, BufferedReader bufferedReader, List<String> spots) {
        this.printStream = printStream;
        this.bufferedReader = bufferedReader;
        this.spots = spots;
    }

    public void start() {
        drawBoard();
    }

    public void drawBoard() {
        String board = String.format(
                "%s|%s|%s\n" +
                "-----\n" +
                "%s|%s|%s\n" +
                "-----\n" +
                "%s|%s|%s", spots.toArray());
        printStream.println(board);
    }

    private String promptInput() {
        printStream.println("Where would you like to place your marker?");
        return readLine();
    }

    public void putMarkerOnBoard(String marker) {
        String input = promptInput();
        int location = Integer.parseInt(input)-1;
        spots.set(location, marker);
        drawBoard();
    }

    private String readLine() {
        try {
            return bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}
