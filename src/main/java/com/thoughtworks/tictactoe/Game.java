package com.thoughtworks.tictactoe;

import java.io.PrintStream;

public class Game {
    private String firstRow;
    private String secondRow;
    private String thirdRow;
    private String rowDivider;
    private PrintStream printStream;

    public Game(PrintStream printStream) {
        this.printStream = printStream;
        firstRow = "1|2|3";
        secondRow = "4|5|6";
        thirdRow = "7|8|9";
        rowDivider = "-----";
    }

    public void start() {
        drawInitialBoard();
    }

    private void drawInitialBoard() {
        printStream.println((firstRow));
        printStream.println((rowDivider));
        printStream.println((secondRow));
        printStream.println((rowDivider));
        printStream.println((thirdRow));
    }
}
