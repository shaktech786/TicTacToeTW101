package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

public class Player {
    private Board board;
    private String marker;
    private BufferedReader bufferedReader;
    private PrintStream printStream;

    public Player(Board board, String marker, BufferedReader bufferedReader, PrintStream printStream) {
        this.board = board;
        this.marker = marker;
        this.bufferedReader = bufferedReader;
        this.printStream = printStream;
    }

    public void makeMove() {
        printStream.println("Where would you like to place your marker?");
        board.mark(Integer.parseInt(readLine()), marker);
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
