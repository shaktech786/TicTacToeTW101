package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class BoardTest {
    private BufferedReader bufferedReader;
    private PrintStream printStream;
    private List<String> spots;
    private Board board;

    @Before
    public void setUp() throws Exception {
        bufferedReader = mock(BufferedReader.class);
        printStream = mock(PrintStream.class);
        spots = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
        board = new Board(printStream, spots);
    }

    @Test
    public void shouldDrawBoard() throws Exception {
        board.drawBoard();
        verify(printStream).println(
                "1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }
}