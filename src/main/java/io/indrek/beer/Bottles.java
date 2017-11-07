package io.indrek.beer;

public class Bottles {

    private final String VERSE_TEMPLATE = "${numBottles} of beer on the wall, ${numBottles} of beer.\n" +
            "Take ${one} down and pass it around, ${numBottlesAfter} of beer on the wall.";

    public String verse(int verseNumber) {
        return constructVerse(verseNumber);
    }

    private String constructVerse(int verseNumber) {
        String verse = VERSE_TEMPLATE.replace("${numBottles}", bottlesBefore(verseNumber));
        verse = verse.replace("${numBottlesAfter}", bottlesAfter(verseNumber));
        verse = verse.replace("${one}", bottlePronoun(verseNumber));
        return verse;
    }

    private CharSequence bottlePronoun(int verseNumber) {
        return verseNumber == 1 ? "it" : "one";
    }

    private CharSequence bottlesBefore(int verseNumber) {
        String bottles = verseNumber == 1 ? "bottle" : "bottles";
        return verseNumber + " " + bottles;
    }

    private CharSequence bottlesAfter(int verseNumber) {
        int bottlesAfter = verseNumber - 1;
        String amount = bottlesAfter == 0 ? "no more" : Integer.toString(bottlesAfter);
        String bottles = (bottlesAfter) == 1 ? "bottle" : "bottles";
        return amount + " " + bottles;
    }

}
