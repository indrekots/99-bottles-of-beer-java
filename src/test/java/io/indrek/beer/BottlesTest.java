package io.indrek.beer;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

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

        assertThat(bottles.verse(99), is(expected));
    }

    @Test
    public void testAnotherVerse() throws Exception {
        String expected = "89 bottles of beer on the wall, 89 bottles of beer.\n" +
                "Take one down and pass it around, 88 bottles of beer on the wall.";

        assertThat(bottles.verse(89), is(expected));
    }
}
