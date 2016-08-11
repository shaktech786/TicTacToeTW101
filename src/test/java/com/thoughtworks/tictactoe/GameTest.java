package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class GameTest {
    private PrintStream printStream;
    private Game game;
    private Board board;
    private BufferedReader bufferedReader;
    private String rowDivider;
    private Player player1;
    private Player player2;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        board = mock(Board.class);
        player1 = mock(Player.class);
        player2 = mock(Player.class);
        game = new Game(board, player1, player2);
    }

    @Test
    public void shouldDrawBoardWhenGameStarts() throws IOException {
        game.start();
        verify(board, times(2)).drawBoard();
    }

    @Test
    public void shouldMarkBoardWhenPlayerInputsLocation() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");
        game.start();
        verify(board).mark(1, "X");
    }
}
