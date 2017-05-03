package com.lukeneedham.brailletutor.Braille;

import static com.lukeneedham.brailletutor.Braille.BrailleCellDatabase.*;
import static com.lukeneedham.brailletutor.Braille.BrailleSymbolType.*;
import static com.lukeneedham.brailletutor.Braille.BrailleSymbolUsageRule.*;

public class SvenskaSymbolDatabase extends BrailleSymbolDatabase
{
	/**
	 * make the array of all the entries in the database
	 * for each entry, make a new BrailleSymbolDataEntry object, and pass the relevant paramaters
	 * the available BrailleSymbolDataEntry constructors and neccessary paramaters can be seen in BrailleSymbolDataEntry.java
	 * the last paramter is BrailleCell... (ie varargs of BrailleCells, more here: http://stackoverflow.com/questions/1656901/varargs-and-the-argument if you need it)
	 * the cells are named after what they mean alone in UEB - cells with no independent meaning are named like 'Cell456' - the names be looked up with the search function in the app, or in BrailleCellDatabase.java
	 */
    private static final BrailleSymbolDataEntry[] allSymbols = {

            new BrailleSymbolDataEntry("a", LETTER,  CellA),
            new BrailleSymbolDataEntry("b", LETTER,  CellB),
            new BrailleSymbolDataEntry("c", LETTER,  CellC),
            new BrailleSymbolDataEntry("d", LETTER,  CellD),
            new BrailleSymbolDataEntry("e", LETTER,  CellE),
            new BrailleSymbolDataEntry("f", LETTER,  CellF),
            new BrailleSymbolDataEntry("g", LETTER,  CellG),
            new BrailleSymbolDataEntry("h", LETTER,  CellH),
            new BrailleSymbolDataEntry("i", LETTER,  CellI),
            new BrailleSymbolDataEntry("j", LETTER,  CellJ),
            new BrailleSymbolDataEntry("k", LETTER,  CellK),
            new BrailleSymbolDataEntry("l", LETTER,  CellL),
            new BrailleSymbolDataEntry("m", LETTER,  CellM),
            new BrailleSymbolDataEntry("n", LETTER,  CellN),
            new BrailleSymbolDataEntry("o", LETTER,  CellO),
            new BrailleSymbolDataEntry("p", LETTER,  CellP),
            new BrailleSymbolDataEntry("q", LETTER,  CellQ),
            new BrailleSymbolDataEntry("r", LETTER,  CellR),
            new BrailleSymbolDataEntry("s", LETTER,  CellS),
            new BrailleSymbolDataEntry("t", LETTER,  CellT),
            new BrailleSymbolDataEntry("u", LETTER,  CellU),
            new BrailleSymbolDataEntry("v", LETTER,  CellV),
            new BrailleSymbolDataEntry("w", LETTER,  CellW),
            new BrailleSymbolDataEntry("x", LETTER,  CellX),
            new BrailleSymbolDataEntry("y", LETTER,  CellY),
            new BrailleSymbolDataEntry("z", LETTER,  CellZ),
            new BrailleSymbolDataEntry("å", LETTER,  CellCH), // [16]
            new BrailleSymbolDataEntry("ä", LETTER,  CellAR), // [345]
            new BrailleSymbolDataEntry("ö", LETTER,  CellOW), // [246]

            new BrailleSymbolDataEntry("é", LETTER,  CellFOR), // [123456] Used in few Swedish words to prolong the e. Important but not part of the official Swedish alphabet.

            new BrailleSymbolDataEntry(" ", INVISIBLE, CellWhitespace),

            new BrailleSymbolDataEntry("%", "Percent", PUNCTUATION, CellTH), // [1456] Percent
            new BrailleSymbolDataEntry("‰", "Per mille", PUNCTUATION, CellTH, CellTH), // [1456] [1456] per mille
            new BrailleSymbolDataEntry("¢", "Cent", PUNCTUATION, Cell45, CellC), // [45] [14] Cent
            new BrailleSymbolDataEntry("$", "Dollar", PUNCTUATION, Cell45, CellS), // [45] [234] Dollar
            new BrailleSymbolDataEntry("€", "Euro", PUNCTUATION, Cell45, CellE), // [45] [15] Euro
            new BrailleSymbolDataEntry("£", "Brittish pound", PUNCTUATION, Cell45, CellL), // [45] [123] Brittish pound
            new BrailleSymbolDataEntry("¥", "Japan Yen", PUNCTUATION, Cell45, CellY), // [45] [13456] Japan yen
            new BrailleSymbolDataEntry("○", "Degree", PUNCTUATION, CellER, CellG), // [12456] [1245] Degree sign
            new BrailleSymbolDataEntry("&", "And", PUNCTUATION, CellAND), // [12346] And sign

            new BrailleSymbolDataEntry("©", "Copyright", PUNCTUATION, CellQuestionmark, CellC, CellCloseQuote), // [236] [14] [356] Copyright sign
            new BrailleSymbolDataEntry("®", "Rights reserved", PUNCTUATION, CellQuestionmark, CellR, CellCloseQuote), // [236] [1235] [356] Rights reserved sign
            new BrailleSymbolDataEntry("TM", "Trade mark", PUNCTUATION, CellQuestionmark, CellT, CellR, CellCloseQuote), // [236] [2345] [134] [356] Trade mark sign

            new BrailleSymbolDataEntry("?", R.string.braille_questionmark, PUNCTUATION, CellEN), // [26]
            new BrailleSymbolDataEntry("!", R.string.braille_exclamationmark, PUNCTUATION, CellExclamationmark), // [235]
            new BrailleSymbolDataEntry(":", R.string.braille_colon, PUNCTUATION, CellColon), // [25]
            new BrailleSymbolDataEntry(";", R.string.braille_semicolon, PUNCTUATION, CellSemicolon), // [23]
            new BrailleSymbolDataEntry("/", R.string.braille_slash, PUNCTUATION, CellST), // [34] (also for division)
            new BrailleSymbolDataEntry("”", R.string.braille_openquote, PUNCTUATION, Cell56), // [56] quote sign, also used for second and inch
            new BrailleSymbolDataEntry("’", R.string.braille_apostrophe, PUNCTUATION, Cell5), // [5], singe quite or minute or fot

            new BrailleSymbolDataEntry("-", R.string.braille_hyphen, PUNCTUATION, CellHyphen), // [36] (also for subtract)
            new BrailleSymbolDataEntry("–", "Speech string", PUNCTUATION, CellHyphen, CellHyphen), // [36] [36] Speech string

            new BrailleSymbolDataEntry("(",  R.string.braille_openbracket, PUNCTUATION, CellQuestionmark), // [236]
            new BrailleSymbolDataEntry(")", R.string.braille_closebracket, PUNCTUATION, CellCloseQuote), // [356]
            new BrailleSymbolDataEntry("[", "Left bracket", PUNCTUATION, CellOF), // [12356]
            new BrailleSymbolDataEntry("]", "Right bracket", PUNCTUATION, CellWITH), // [23456]
            new BrailleSymbolDataEntry("{", "Left brace", PUNCTUATION, CellCapitalsign, CellOF), // [6] [12356]
            new BrailleSymbolDataEntry("}", "Right brace", PUNCTUATION, CellCapitalsign, CellWITH), // [6] [23456]

            new BrailleSymbolDataEntry("§", "Paragraph", PUNCTUATION, CellING), // [346] paragraph. Must have a space after or else this enables super script mode
            new BrailleSymbolDataEntry("&", "And", PUNCTUATION, CellOU), // [12346]
            new BrailleSymbolDataEntry("*", R.string.braille_asterisk, PUNCTUATION, CellIN), // [35]
            new BrailleSymbolDataEntry("†", "Cross", PUNCTUATION, Cell45, CellQuestionmark), // [45] [236] Cross
            new BrailleSymbolDataEntry("#", "Number sign", PUNCTUATION, Cell45, CellNumbersign), // [45] [3456] Number sign, square
            new BrailleSymbolDataEntry("@", "At", PUNCTUATION, Cell45, CellOF), // [45] [12356] At sign
            new BrailleSymbolDataEntry("\", "Backslash", PUNCTUATION, Cell45, CellST), // [45] [34] Backslash
            new BrailleSymbolDataEntry("_", "Underscore", PUNCTUATION, Cell45, CellHyphen), // [45] [36] Underscore
            new BrailleSymbolDataEntry("|", "Hyphen", PUNCTUATION, Cell456), // [456]
            new BrailleSymbolDataEntry("~", "Tilde", PUNCTUATION, Cell45, CellColon), // [45] [25]

            new BrailleSymbolDataEntry("•", "List bullet", PUNCTUATION, CellFOR), // [123456] List character - bullet
            new BrailleSymbolDataEntry("◦", "List ring", PUNCTUATION,Cell4, CellFOR), // [4] [123456] List character - ring
            new BrailleSymbolDataEntry("▪", "List square", PUNCTUATION,Cell45, CellFOR), // [45] [123456] List character - square

            // pre signs
            // new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  Cell45), // Pre [45] for various characters, currency, some diacritical signs, one list char, help parentheses
            // new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  Cell4), // Pre [4] for Diacritical signs used over letters. Used for writing in other languages than Swedish.
            // new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  Cell46), // Pre [46] for style
            // new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  Cell56), // Pre [56] for fonetic, greek lc letter
            // new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  CellER), // Pre [12456] for ·, ×, ○
            new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  CellING), // [346] super script mode. (ends with space)
            new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  CellGH), // [126] sub script mode (ends with space)
            new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  CellWH), // [156] Stop sign. End a mode. For modes that do not end at next space.

            // Three signs for capital mode
            new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  CellCapitalsign), // [6] Next character is a capital letter
            new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  CellCapitalsign, CellCapitalsign), // [6] [6] Capital mode as log as you have letters and -
            new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  CellCapitalsign, CellCapitalsign, CellCapitalsign), // [6] [6] [6] Capital mode until stop sign

            // Numbers. Same as in english where a-i = 1-9, j=0.
            // The number sign activate the number mode. Then mode end on any other character but digits.
            new BrailleSymbolDataEntry(NO_STRING, LETTER,  CellNumbersign), // [3456] enter number mode.
            new BrailleSymbolDataEntry(",", "Comma", PUNCTUATION, CellComma), // [2] comma 3,1415 (Decimal point used in Swedish texts)
            new BrailleSymbolDataEntry(".", "Period", PUNCTUATION, CellApostrophe), // [3] Period (Used as decimal point in English texts, not in Swedish text) 3.1415
            new BrailleSymbolDataEntry("<", "Less than", PUNCTUATION, CellNumbersign, CellOW), // [3456] [246] (Number sign and ö) less than
            new BrailleSymbolDataEntry(">", "Greater than", PUNCTUATION, CellNumbersign, CellO), // [3456] [135] (Number sign and o) greater than

            // Mathematics
            new BrailleSymbolDataEntry("+", "Add", PUNCTUATION, CellFullstop), // [256] add
            new BrailleSymbolDataEntry("=", "Equal", PUNCTUATION, CellGG), // [2356] equals
            new BrailleSymbolDataEntry("·", "Multiplier dot", PUNCTUATION, CellER, CellApostrophe), // [12456] [3] Multiplication sign with a dot (common) Example: 2,5 ⋅ 2,5 = 6,25
            new BrailleSymbolDataEntry("×", "Multiplier x", PUNCTUATION, CellER, CellX), // [12456] [1346] Multiplication sign with an x. Example: Magnification is 625x
            new BrailleSymbolDataEntry("──", "Division horizontal line", PUNCTUATION, CellOU), // [1256] division (horizontal line)
            new BrailleSymbolDataEntry("√", "Root sign", PUNCTUATION, CellSH), // [146] root sign

            // Below is foreign signs. Used only for rare names and when writing in another language.

            // You could (not a requirement) use an indicator before and after foreign language text
            new BrailleSymbolDataEntry(NO_STRING, LETTER,  Cell5, CellComma), // [5] [2]

            // Foreign letters used in names and foreign addresses
            new BrailleSymbolDataEntry("à", LETTER,  CellOF), // [12356]
            new BrailleSymbolDataEntry("è", LETTER,  CellTHE), // [2346]
            new BrailleSymbolDataEntry("ü", LETTER,  CellOU), //  [1256] German y

            // More foreign letters used in names and foreign addresses
            new BrailleSymbolDataEntry("æ", LETTER,  Cell4, CellAR), // [1] [15] or [4] [345] Danish ä
            new BrailleSymbolDataEntry("ø", LETTER,  Cell4, CellO), // [246] or [4] [135] Danish ö
            new BrailleSymbolDataEntry("œ", LETTER,  Cell4, CellOW), // [135] [15] or [4] [246] oe, can also be written with o and e.
            new BrailleSymbolDataEntry("ß", LETTER,  Cell4, CellS), // [234] [234] or [4] [234] German double s. Can also be written with s and s.
            new BrailleSymbolDataEntry("ð", LETTER,  Cell4, CellD), // [4] [145] Icelandic d with a sting (edh)
            new BrailleSymbolDataEntry("þ", LETTER,  Cell4, CellT), // [4] [2345] Icelandic t (called thorn)

            // Characters used for writing in other languages
            new BrailleSymbolDataEntry("á", LETTER,  Cell4, CellA), // [4] [1]
            new BrailleSymbolDataEntry("ç", LETTER,  Cell4, CellC), // [4] [14]
            new BrailleSymbolDataEntry("ë", LETTER,  Cell4, CellE), // [4] [15] Yes same as ė
            new BrailleSymbolDataEntry("ė", LETTER,  Cell4, CellE), // [4] [15] Yes same as ë
            new BrailleSymbolDataEntry("ô", LETTER,  Cell4, CellO), // [4] [135]
            new BrailleSymbolDataEntry("ř", LETTER,  Cell4, CellR), // [4] [1235]
            new BrailleSymbolDataEntry("ū", LETTER,  Cell4, CellU), // [4] [136]

            // Exact diacritical signs to be used before any letter. Like: á ç ë ė ô ř ū
            // Used for writing in other languages. Eleven symbols.
            new BrailleSymbolDataEntry(NO_STRING, LETTER,  CellING, CellIN), // [346] [35] apostrophe forward above letter  ́
            new BrailleSymbolDataEntry(NO_STRING, LETTER,  CellING, CellEN), // [346] [26] apostrophe backward above letter `
            new BrailleSymbolDataEntry(NO_STRING, LETTER,  CellGH, CellComma), // [126] [2] cedilj under letter
            new BrailleSymbolDataEntry(NO_STRING, LETTER,  CellING, CellExclamationmark), // [346] [235] circumflex over letter ^
            new BrailleSymbolDataEntry(NO_STRING, LETTER,  CellING, CellGG), // [346] [2356] reveresed circumflex over letter ˇ
            new BrailleSymbolDataEntry(NO_STRING, LETTER,  CellING, CellColon), // [346] [25] tilde over letter ~
            new BrailleSymbolDataEntry(NO_STRING, LETTER,  CellING, CellSemicolon), // [346] [23] trema over letter ̈
            new BrailleSymbolDataEntry(NO_STRING, LETTER,  CellING, CellHyphen), // [346] [36] line over letter ̄
            new BrailleSymbolDataEntry(NO_STRING, LETTER,  CellGH, CellHyphen), // [126] [36] line under letter
            new BrailleSymbolDataEntry(NO_STRING, LETTER,  CellING, CellApostrophe), // [346] [3] dot over letter
            new BrailleSymbolDataEntry(NO_STRING, LETTER,  CellGH, CellApostrophe), // [126] [3] dot under letter

            // Above diacritical signs again but now stand alone (Skipping this for now)

            // North Saami letters.
            new BrailleSymbolDataEntry("á", LETTER,  CellOF), // [12356] a with forward apostrophe
            new BrailleSymbolDataEntry("č", LETTER,  CellSH), // [146] c with reversed circumflex
            new BrailleSymbolDataEntry("đ", LETTER,  CellTH), // [1456] stung d
            new BrailleSymbolDataEntry("ŋ", LETTER,  CellED), // [1246] eng
            new BrailleSymbolDataEntry("š", LETTER,  CellWH), // [156] s with reversed circumflex
            new BrailleSymbolDataEntry("ŧ", LETTER,  CellOU), // [1256] stung t
            new BrailleSymbolDataEntry("ž", LETTER,  CellTHE), // [2346] z with reversed circumflex

            // South Saami letters
            new BrailleSymbolDataEntry("ï", LETTER,  CellST), // [34] i with trema

            // Skipping below areas
            // Signs for italic, bold, underline, fine, large etc. I skip those for now.
            // German signs (Already covered)
            // French signs (Skipping for now)
            // Spanish signs (Skipping for now)
            // Esperanto (Skipping for now)
            // Phonetic signs (Skipping for now)
            // Signs for poetry
            // Signs for verse
            // Signs for music
            // Signs for blank characters (Like in forms where you are supposed to write something there)
            // Signs for breaking a word and sentence. Example: It's all abo...


            // Short write - level 1 & 2. Short write text ends with a colon : [25].

            // Short write - Level 1. System is called K-75
            // One type: Shorten a whole word. Words can be really long in Swedish.

			new BrailleSymbolDataEntry("att", STANDALONE, SHORTFORM, CellA), // [1] a. to (do something)
			new BrailleSymbolDataEntry("bli", STANDALONE, SHORTFORM, CellB), // [12] b. become
			new BrailleSymbolDataEntry("och", STANDALONE, SHORTFORM, CellC), // [14] c. and
			new BrailleSymbolDataEntry("där", STANDALONE, SHORTFORM, CellD), // [145] d. there
			new BrailleSymbolDataEntry("eller", STANDALONE, SHORTFORM, CellE), // [15] e. or
			new BrailleSymbolDataEntry("från", STANDALONE, SHORTFORM, CellF), // [124] f. from
			new BrailleSymbolDataEntry("genom", STANDALONE, SHORTFORM, CellG), // [1245] g. trough
			new BrailleSymbolDataEntry("han", STANDALONE, SHORTFORM, CellH), // [125] h. he
			new BrailleSymbolDataEntry("jag", STANDALONE, SHORTFORM, CellJ), // [134] j. I
			new BrailleSymbolDataEntry("kan", STANDALONE, SHORTFORM, CellK), // [13] k. can
			new BrailleSymbolDataEntry("lika", STANDALONE, SHORTFORM, CellL), // [123] l. like/same
			new BrailleSymbolDataEntry("man", STANDALONE, SHORTFORM, CellM), // [134] m. you/man/one
			new BrailleSymbolDataEntry("när", STANDALONE, SHORTFORM, CellN), // [1345] n. when
			new BrailleSymbolDataEntry("på", STANDALONE, SHORTFORM, CellP), // [1234] p. on
			new BrailleSymbolDataEntry("under", STANDALONE, SHORTFORM, CellQ), // [12345] q. under
			new BrailleSymbolDataEntry("har", STANDALONE, SHORTFORM, CellR), // [1235] r. have
			new BrailleSymbolDataEntry("som", STANDALONE, SHORTFORM, CellS), // [234] s. as
			new BrailleSymbolDataEntry("till", STANDALONE, SHORTFORM, CellT), // [2345] t. to (a destination)
			new BrailleSymbolDataEntry("utan", STANDALONE, SHORTFORM, CellU), // [136] u. without
			new BrailleSymbolDataEntry("vid", STANDALONE, SHORTFORM, CellV), // [1236] v. by
			new BrailleSymbolDataEntry("vad", STANDALONE, SHORTFORM, CellW), // [2456] w. what
			new BrailleSymbolDataEntry("över", STANDALONE, SHORTFORM, CellX), // [1346] x. over
			new BrailleSymbolDataEntry("mycket", STANDALONE, SHORTFORM, CellY), // [13456] y. much
			new BrailleSymbolDataEntry("efter", STANDALONE, SHORTFORM, CellZ), // [1356] z. after
			new BrailleSymbolDataEntry("är", STANDALONE, SHORTFORM, CellAR), // [345] ä. is

			new BrailleSymbolDataEntry("en", STANDALONE, SHORTFORM, CellGH), // [126] a/one (a chair, en stol)
			new BrailleSymbolDataEntry("med", STANDALONE, SHORTFORM, CellSH), // [146] with
			new BrailleSymbolDataEntry("er", STANDALONE, SHORTFORM, CellWH), // [156] your
			new BrailleSymbolDataEntry("ett", STANDALONE, SHORTFORM, CellING), // [346] a/one (a house, ett hus)
			new BrailleSymbolDataEntry("för", STANDALONE, SHORTFORM, CellED), // [1246] for
			new BrailleSymbolDataEntry("inte", STANDALONE, SHORTFORM, CellOU), // [1256] not
			new BrailleSymbolDataEntry("de", STANDALONE, SHORTFORM, CellTH), // [1456] them
			new BrailleSymbolDataEntry("det", STANDALONE, SHORTFORM, CellTHE), // [2346] that (det huset)
			new BrailleSymbolDataEntry("den", STANDALONE, SHORTFORM, CellOU), // [12346] that (den stolen)
			new BrailleSymbolDataEntry("var", STANDALONE, SHORTFORM, CellOF), // [12356] where

            // Short write - Level 2. System is called K-75
            // Three types: A. whole words, B. sound groups, C. shortened sound groups
            // A. Whole words

            new BrailleSymbolDataEntry("att", STANDALONE, SHORTFORM, CellA), // [1] a. to
            new BrailleSymbolDataEntry("alla", STANDALONE, SHORTFORM, CellA, CellA), // [1][1] aa. all/everyone
            new BrailleSymbolDataEntry("allas", STANDALONE, SHORTFORM, CellA, CellA, CellS), // [1][1][234] aas. everyones
            new BrailleSymbolDataEntry("alltid", STANDALONE, SHORTFORM, CellA, CellD), // [1][145] ad. always
            new BrailleSymbolDataEntry("aldrig", STANDALONE, SHORTFORM, CellA, CellG), // [1] ag. never
            new BrailleSymbolDataEntry("allt", STANDALONE, SHORTFORM, CellA, CellT), // [1] at. everything
            new BrailleSymbolDataEntry("alltför", STANDALONE, SHORTFORM, CellA, CellT, CellED), // [1][2345][1246] at[1246]. too
            new BrailleSymbolDataEntry("allting", STANDALONE, SHORTFORM, CellA, CellT, CellQuestionmark), // [1][2345][236] at[236]. everything
            new BrailleSymbolDataEntry("alltings", STANDALONE, SHORTFORM, CellA, CellT, CellQuestionmark, CellS), // [1][2345][236][234] at[236]s. everything (including heaven and hell and outer space)
            new BrailleSymbolDataEntry("andra", STANDALONE, SHORTFORM, CellA, CellW), // [1][2456] other
            new BrailleSymbolDataEntry("andras", STANDALONE, SHORTFORM, CellA, CellW, CellS), // [1][2456][234] other peoples ...
            new BrailleSymbolDataEntry("alltså", STANDALONE, SHORTFORM, CellA, CellCH), // [1][16] aå. that is / so

            // Still 139 short forms left, I will add them too.


    };

	public BrailleSymbolDataEntry[] getAllSymbols() {return allSymbols;}
}
