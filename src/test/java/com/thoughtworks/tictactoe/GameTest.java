package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class GameTest {
    private PrintStream printStream;
    private Game game;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        game = new Game(printStream);
        game.start();


    }

    @Test
    public void shouldDrawBoardWhenGameStarts() {

        String firstRow = "1|2|3";
        String secondRow = "4|5|6";
        String thirdRow = "7|8|9";
        String rowDivider = "-----";

        verify(printStream).println(firstRow);
        verify(printStream, times(2)).println(rowDivider);
        verify(printStream).println(secondRow);
        verify(printStream).println(thirdRow);
    }

    @Test
    public void shouldPromptUserForMarkLocationWhenBoardDrawn() {

    }
}
