package com.thoughtworks.tictactoe;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        PrintStream printStream = new PrintStream(System.out);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        List<String> spots = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
        Board board = new Board(printStream, spots);
        Player player1 = new Player(board, "X", bufferedReader, printStream);
        Player player2 = new Player(board, "O", bufferedReader, printStream);
        Game game = new Game(board, player1, player2);
        game.start();
    }
}
