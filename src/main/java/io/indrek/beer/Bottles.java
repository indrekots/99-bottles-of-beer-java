package io.indrek.beer;

public class Bottles {

    private final String VERSE_TEMPLATE = "%d bottles of beer on the wall, %d bottles of beer.\n" +
            "Take one down and pass it around, %d bottles of beer on the wall.";

    public String verse(int verseNumber) {
        return String.format(VERSE_TEMPLATE, verseNumber, verseNumber, verseNumber - 1);
    }
    
}
