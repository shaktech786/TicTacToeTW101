package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

import static org.mockito.Mockito.*;

public class PlayerTest {
    private BufferedReader bufferedReader;
    private Player player;
    private PrintStream printStream;
    private Board board;

    @Before
    public void setUp() {
        bufferedReader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        board = mock(Board.class);
        player = new Player(board, "X", bufferedReader, printStream);
    }

    @Test
    public void shouldPromptPlayerToMakeMove() throws IOException {
        player.makeMove();
        verify(printStream).println("Where would you like to place your marker?");
        verify(bufferedReader).readLine();
    }

    @Test
    @Ignore
    public void shouldMarkBoardWhen() throws Exception {

    }

    @Test
    public void shouldPutMarkerInLocation1When1IsInput() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");
        player.makeMove();
        verify(board).mark(1, "X");
    }
}