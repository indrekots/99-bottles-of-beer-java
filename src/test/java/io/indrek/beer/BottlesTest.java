package io.indrek.beer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BottlesTest {

    private Bottles bottles;

    @Before
    public void setUp() {
        bottles = new Bottles();
    }

    @Test
    public void testFirstVerse() throws Exception {
        String expected = "99 bottles of beer on the wall, 99 bottles of beer.\n" +
                "Take one down and pass it around, 98 bottles of beer on the wall.";

        assertEquals(expected, bottles.verse(99));
    }
}
