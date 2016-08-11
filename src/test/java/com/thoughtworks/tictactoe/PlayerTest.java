package com.thoughtworks.tictactoe;

import org.junit.Before;

import static org.junit.Assert.*;

public class PlayerTest {
    @Before
    public void setUp() {
        String marker = "X";
        Player player = new Player(marker);
    }

}