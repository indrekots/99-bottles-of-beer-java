package io.indrek.beer;

public class Bottles {

    private final String VERSE_TEMPLATE = "${numBottles} bottles of beer on the wall, ${numBottles} bottles of beer.\n" +
            "Take one down and pass it around, ${numBottlesAfter} of beer on the wall.";

    public String verse(int verseNumber) {
        return constructVerse(verseNumber);
    }

    private String constructVerse(int verseNumber) {
        String verse = VERSE_TEMPLATE.replace("${numBottles}", Integer.toString(verseNumber));
        verse = verse.replace("${numBottlesAfter}", bottlesAfter(verseNumber));
        return verse;
    }

    private CharSequence bottlesAfter(int verseNumber) {
        int numAfter = verseNumber - 1;
        String bottles = numAfter == 1 ? "bottle" : "bottles";
        return numAfter + " " + bottles;
    }

}
