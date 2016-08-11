package com.thoughtworks.tictactoe;

public class Game {
    private Board board;
    private Player player1;
    private Player player2;
    private boolean isOver;
    private int turns;


    public Game(Board board, Player player1, Player player2) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        isOver = false;
        turns = 5;
    }

    public void start() {
        board.drawBoard();
        while (turns > 0) {
            player1.makeMove();
            board.drawBoard();
            turns--;
        }
    }
}
