package io.indrek.beer;

public class Bottles {

    private static final String NUM_BOTTLES = "${numBottles}";
    private static final String NUM_BOTTLES_AFTER = "${numBottlesAfter}";
    private static final String BOTTLE_PRONOUN = "${one}";
    private final String VERSE_TEMPLATE = "${numBottles} of beer on the wall, ${numBottles} of beer.\n" +
            "Take ${one} down and pass it around, ${numBottlesAfter} of beer on the wall.";

    public String verse(int verseNumber) {
        return constructVerse(verseNumber);
    }

    private String constructVerse(int verseNumber) {
        String verse = VERSE_TEMPLATE.replace(NUM_BOTTLES, bottlesBefore(verseNumber));
        verse = verse.replace(NUM_BOTTLES_AFTER, bottlesAfter(verseNumber));
        verse = verse.replace(BOTTLE_PRONOUN, bottlePronoun(verseNumber));
        return verse;
    }

    private CharSequence bottlePronoun(int verseNumber) {
        return verseNumber == 1 ? "it" : "one";
    }

    private CharSequence bottlesBefore(int verseNumber) {
        return verseNumber + " " + bottleNumber(verseNumber);
    }

    private CharSequence bottlesAfter(int verseNumber) {
        int bottlesAfter = verseNumber - 1;
        String amount = bottlesAfter == 0 ? "no more" : Integer.toString(bottlesAfter);
        return amount + " " + bottleNumber(bottlesAfter);
    }

    private String bottleNumber(int verseNumber) {
        return verseNumber == 1 ? "bottle" : "bottles";
    }

}
