package com.thoughtworks.tictactoe;

import java.io.PrintStream;
import java.util.List;

public class Board {


    private PrintStream printStream;
    private List<String> spots;

    public Board(PrintStream printStream, List<String> spots) {
        this.printStream = printStream;
        this.spots = spots;
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

    public void mark(int location, String marker) {
        spots.set(location-1, marker);
    }
}
