package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

public class GameTest {
    private PrintStream printStream;
    private Game game;
    private BufferedReader bufferedReader;
    private String rowDivider;
    private Player player1;
    private List<String> spots;

    @Before
    public void setUp() {
        printStream = mock(PrintStream.class);
        bufferedReader = mock(BufferedReader.class);
        spots = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
        //player1 = mock(Player.class);
    }

    @Test
    public void shouldDrawBoardWhenGameStarts() throws IOException {
        game = new Game(printStream, bufferedReader, spots);
        game.drawBoard();
        verify(printStream).println(
                "1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }

    @Test
    public void shouldPutMarkerInLocation1When1IsInput() throws IOException {
        when(bufferedReader.readLine()).thenReturn("1");
        game = new Game(printStream, bufferedReader, spots);
        spots = Arrays.asList("X", "2", "3", "4", "5", "6", "7", "8", "9");

        game.putMarkerOnBoard("X");
        verify(printStream).println(
                "X|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }
}
