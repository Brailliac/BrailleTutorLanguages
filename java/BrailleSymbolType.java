package com.lukeneedham.brailletutor.Braille;

/**
 * Created by Luke on 01/08/2016.
 */
public enum BrailleSymbolType
{
    LETTER, PUNCTUATION, GROUPSIGN, WORDSIGN, INITIALLETTERCONTRACTION, FINALLETTERCONTRACTION, SHORTFORM, INVISIBLE, NUMBER;

    public boolean isAdvancedContraction()
    {
        return this.equals(INITIALLETTERCONTRACTION) || this.equals(FINALLETTERCONTRACTION);
    }

    public boolean isContraction()
    {
        return this.equals(GROUPSIGN) || this.equals(WORDSIGN);
    }
}
