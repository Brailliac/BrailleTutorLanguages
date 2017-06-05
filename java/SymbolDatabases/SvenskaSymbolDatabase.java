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

            new BrailleSymbolDataEntry("bli", STANDALONE, SHORTFORM, CellB), // [12] b. become
            new BrailleSymbolDataEntry("börja", STANDALONE, SHORTFORM, CellB, CellJ), // [12][245] bj. start
            new BrailleSymbolDataEntry("början", STANDALONE, SHORTFORM, CellB, CellJ, CellN), // [12][245][1345] bjn. the start
            new BrailleSymbolDataEntry("börjans", STANDALONE, SHORTFORM, CellB, CellJ, CellN, CellS), // [12][245][1345][234] bjns. about the start
            new BrailleSymbolDataEntry("börjar", STANDALONE, SHORTFORM, CellB, CellJ, CellR), // [12][245][1235] bjr. starting
            new BrailleSymbolDataEntry("börjat", STANDALONE, SHORTFORM, CellB, CellJ, CellT), // [12][245][2345] bjt. have started
            new BrailleSymbolDataEntry("började", STANDALONE, SHORTFORM, CellB, CellJ, CellTH), // [12][245][1456] bj[1456]. did start / it started
            new BrailleSymbolDataEntry("bland", STANDALONE, SHORTFORM, CellB, CellL), // [12][123] bl. among
            new BrailleSymbolDataEntry("blir", STANDALONE, SHORTFORM, CellB, CellR), // [12][1235] br. become
            new BrailleSymbolDataEntry("blev", STANDALONE, SHORTFORM, CellB, CellV), // [12][1236] became

            new BrailleSymbolDataEntry("och", STANDALONE, SHORTFORM, CellC), // [14] c. and
            new BrailleSymbolDataEntry("också", STANDALONE, SHORTFORM, CellC, CellS), // [12][234] also

            new BrailleSymbolDataEntry("där", STANDALONE, SHORTFORM, CellD), // [145] d. there
            new BrailleSymbolDataEntry("dess", STANDALONE, SHORTFORM, CellD, CellS), // [145][234] its
            new BrailleSymbolDataEntry("dessa", STANDALONE, SHORTFORM, CellD, CellS, CellA), // [145][234][1] dsa. those
            new BrailleSymbolDataEntry("dessas", STANDALONE, SHORTFORM, CellD, CellS, CellA, CellS), // [145][234][1][234] dsas. thoses (that belong to them, it is thoses :-)

            new BrailleSymbolDataEntry("eller", STANDALONE, SHORTFORM, CellE), // [15] e. or
            new BrailleSymbolDataEntry("endast", STANDALONE, SHORTFORM, CellE, CellA), // [15][1] only
            new BrailleSymbolDataEntry("henne", STANDALONE, SHORTFORM, CellE, CellE), // [15][15] ee. her
            new BrailleSymbolDataEntry("hennes", STANDALONE, SHORTFORM, CellE, CellE, CellS), // [15][15][234] ees. hers
            new BrailleSymbolDataEntry("emedan", STANDALONE, SHORTFORM, CellE, CellM, CellD), // [15][134][145] emd. while
            new BrailleSymbolDataEntry("emellan", STANDALONE, SHORTFORM, CellE, CellM, CellL), // [15][134][123] between
            new BrailleSymbolDataEntry("emellertid", STANDALONE, SHORTFORM, CellE, CellM, CellT), // [15][134][2345] emt. however

            new BrailleSymbolDataEntry("från", STANDALONE, SHORTFORM, CellF), // [124] from
            new BrailleSymbolDataEntry("fortfarande", STANDALONE, SHORTFORM, CellF, CellO, CellF), // [124][135][124] emt. still

            new BrailleSymbolDataEntry("genom", STANDALONE, SHORTFORM, CellG), // [1245] g. trough
            new BrailleSymbolDataEntry("gång", STANDALONE, SHORTFORM, CellG, CellG), // [1245][1245] gg. gangway
            new BrailleSymbolDataEntry("gångs", STANDALONE, SHORTFORM, CellG, CellG, CellS), // [1245][1245][234] ggs. gangways
            new BrailleSymbolDataEntry("gångar", STANDALONE, SHORTFORM, CellG, CellG, CellA, CellR), // [1245][1245][1][1235] ggar. tunnels (in general)
            new BrailleSymbolDataEntry("gångars", STANDALONE, SHORTFORM, CellG, CellG, CellA, CellR, CellS), // [1245][1245][1][1235][234] ggar. tunnels (property)
            new BrailleSymbolDataEntry("gångarna", STANDALONE, SHORTFORM, CellG, CellG, CellA, CellR, CellN, CellA), // [1245][1245][1][1235][1345][1] ggarna. the tunnels (in general)
            new BrailleSymbolDataEntry("gångarnas", STANDALONE, SHORTFORM, CellG, CellG, CellA, CellR, CellN, CellA, CellS), // [1245][1245][1][1235][1345][1][234] ggarnas. the tunnels (property)
            new BrailleSymbolDataEntry("gången", STANDALONE, SHORTFORM, CellG, CellG, CellWH), // [1245][1245][156] gg[156]. the tunnel
            new BrailleSymbolDataEntry("gångens", STANDALONE, SHORTFORM, CellG, CellG, CellWH, CellS), // [1245][1245][156][234] gg[156]s. the tunnels (property)

            new BrailleSymbolDataEntry("gånger", STANDALONE, SHORTFORM, CellG, CellG, CellWH), // [1245][1245][156] gg[156]. times (I have done it 5 times)
            new BrailleSymbolDataEntry("gångers", STANDALONE, SHORTFORM, CellG, CellG, CellWH, CellS), // [1245][1245][156][234] gg[156]s. times (I will have 5 times suspension)
            new BrailleSymbolDataEntry("gångerna", STANDALONE, SHORTFORM, CellG, CellG, CellWH, CellN, CellA), // [1245][1245][156][1345][1] gg[156]na. the times
            new BrailleSymbolDataEntry("gångernas", STANDALONE, SHORTFORM, CellG, CellG, CellWH, CellN, CellA, CellS), // [1245][1245][156][1345][1][234] gg[156]nas. the times

            new BrailleSymbolDataEntry("han", STANDALONE, SHORTFORM, CellH), // [125] h. he
            new BrailleSymbolDataEntry("hans", STANDALONE, SHORTFORM, CellH, CellS), // [125][234] hs. his
            new BrailleSymbolDataEntry("hon", STANDALONE, SHORTFORM, CellH, CellN), // [125][1345] hn. she
            new BrailleSymbolDataEntry("hade", STANDALONE, SHORTFORM, CellH, CellTH), // [125][1456] h[1456]. had

            new BrailleSymbolDataEntry("inga", STANDALONE, SHORTFORM, CellI, CellA), // [24][1] ia. none
            new BrailleSymbolDataEntry("ingas", STANDALONE, SHORTFORM, CellI, CellA, CellS), // [24][1][234] ias. none (plural)
            new BrailleSymbolDataEntry("ingen", STANDALONE, SHORTFORM, CellI, CellGH), // [24][126] i[126]. noone
            new BrailleSymbolDataEntry("ingens", STANDALONE, SHORTFORM, CellI, CellGH, CellS), // [24][126][234] i[126]s. noone (plural)
            new BrailleSymbolDataEntry("inget", STANDALONE, SHORTFORM, CellI, CellING), // [24][346] i[346]. nothing (abstract)
            new BrailleSymbolDataEntry("ingets", STANDALONE, SHORTFORM, CellI, CellING, CellS), // [24][346][234] i[346]s. (abstract abstract)
            new BrailleSymbolDataEntry("ibland", STANDALONE, SHORTFORM, CellI, CellB, CellL), // [24][12][123] ibl. sometimes.
            new BrailleSymbolDataEntry("ingenting", STANDALONE, SHORTFORM, CellI, CellGH, CellT, CellQuestionmark), // [24][126][2345][236] i[126]t[236]. nothing (no thing)
            new BrailleSymbolDataEntry("igenom", STANDALONE, SHORTFORM, CellI, CellG), // [13][1245] ig. trough

            new BrailleSymbolDataEntry("jag", STANDALONE, SHORTFORM, CellJ), // [245] j. I

            new BrailleSymbolDataEntry("kan", STANDALONE, SHORTFORM, CellK), // [13] k. can
            new BrailleSymbolDataEntry("kanske", STANDALONE, SHORTFORM, CellK, CellA), // [13][1] ka. perhaps
            new BrailleSymbolDataEntry("komma", STANDALONE, SHORTFORM, CellK, CellM, CellA), // [13][134][1] kma. come
            new BrailleSymbolDataEntry("kommer", STANDALONE, SHORTFORM, CellK, CellM, CellWH), // [13][134][156] km[156]. coming
            new BrailleSymbolDataEntry("kommit", STANDALONE, SHORTFORM, CellK, CellM, CellT), // [13][134][2345] kmt. have came
            new BrailleSymbolDataEntry("kunna", STANDALONE, SHORTFORM, CellK, CellN), // [13][1345] kn. can (I want to be able to come)
            new BrailleSymbolDataEntry("kunnat", STANDALONE, SHORTFORM, CellK, CellN, CellT), // [13][1345][2345] knt. been able (I have known how to do that)
            new BrailleSymbolDataEntry("kunde", STANDALONE, SHORTFORM, CellK, CellTH), // [13][1456] k[1456]. could (the I could)

            new BrailleSymbolDataEntry("lika", STANDALONE, SHORTFORM, CellL), // [123] l. equal
            new BrailleSymbolDataEntry("liksom", STANDALONE, SHORTFORM, CellL, CellS), // [123][234] ls. as well as

            new BrailleSymbolDataEntry("man", STANDALONE, SHORTFORM, CellM), // [134] m. I or you in general (abstract)
            new BrailleSymbolDataEntry("medan", STANDALONE, SHORTFORM, CellM, CellD), // [134][145] md. while
            new BrailleSymbolDataEntry("många", STANDALONE, SHORTFORM, CellM, CellG), // [134][1245] mg. many
            new BrailleSymbolDataEntry("mångas", STANDALONE, SHORTFORM, CellM, CellG, CellS), // [134][1245][234] mgs. many (property)
            new BrailleSymbolDataEntry("mellan", STANDALONE, SHORTFORM, CellM, CellL), // [134][123] ml. between
            new BrailleSymbolDataEntry("men", STANDALONE, SHORTFORM, CellM, CellGH), // [134][126] m[126]. but
            new BrailleSymbolDataEntry("måste", STANDALONE, SHORTFORM, CellM, CellOU), // [134][1256] m[1256]. have to

            new BrailleSymbolDataEntry("när", STANDALONE, SHORTFORM, CellN), // [1345] n. when
            new BrailleSymbolDataEntry("någon", STANDALONE, SHORTFORM, CellN, CellN), // [1345][1345] nn. somenone
            new BrailleSymbolDataEntry("någons", STANDALONE, SHORTFORM, CellN, CellN, CellS), // [1345][1345][234] nns. someones
            new BrailleSymbolDataEntry("någonting", STANDALONE, SHORTFORM, CellN, CellN, CellT, CellQuestionmark), // [1345][1345][2345][236] nnt[236]. something
            new BrailleSymbolDataEntry("något", STANDALONE, SHORTFORM, CellN, CellT), // [1345][2345] nt. something
            new BrailleSymbolDataEntry("naturligtvis", STANDALONE, SHORTFORM, CellN, CellT, CellV), // [1345][2345][1236] ntv. of course
            new BrailleSymbolDataEntry("några", STANDALONE, SHORTFORM, CellN, CellW), // [1345][2456] nw. some
            new BrailleSymbolDataEntry("någras", STANDALONE, SHORTFORM, CellN, CellW, CellS), // [1345][2456][234] nws. some (plural)

            new BrailleSymbolDataEntry("olika", STANDALONE, SHORTFORM, CellO, CellL), // [135] ol. different
            new BrailleSymbolDataEntry("honom", STANDALONE, SHORTFORM, CellO, CellO), // [135][135] oo. him
            new BrailleSymbolDataEntry("omkring", STANDALONE, SHORTFORM, CellO, CellQuestionmark), // [245] o[236]. around

            new BrailleSymbolDataEntry("på", STANDALONE, SHORTFORM, CellP), // [1234] p. on

            new BrailleSymbolDataEntry("under", STANDALONE, SHORTFORM, CellQ), // [12345] q. under

            new BrailleSymbolDataEntry("har", STANDALONE, SHORTFORM, CellR), // [1235] r. have
            new BrailleSymbolDataEntry("redan", STANDALONE, SHORTFORM, CellR, CellD), // [1235][145] rd. already

            new BrailleSymbolDataEntry("som", STANDALONE, SHORTFORM, CellS), // [234] s. some
            new BrailleSymbolDataEntry("sedan", STANDALONE, SHORTFORM, CellS, CellD), // [234][145] sd. since
            new BrailleSymbolDataEntry("själv", STANDALONE, SHORTFORM, CellS, CellJ), // [234][245] sj. self (do)
            new BrailleSymbolDataEntry("själva", STANDALONE, SHORTFORM, CellS, CellJ, CellA), // [234][245][1] sja. self (thing)
            new BrailleSymbolDataEntry("självt", STANDALONE, SHORTFORM, CellS, CellJ, CellT), // [234][245][2345] sjt. self (by itself)
            new BrailleSymbolDataEntry("skall", STANDALONE, SHORTFORM, CellS, CellK), // [234][13] sk. dog bark, or will do
            new BrailleSymbolDataEntry("skulle", STANDALONE, SHORTFORM, CellS, CellL), // [234][123] sl. would do
            new BrailleSymbolDataEntry("sådan", STANDALONE, SHORTFORM, CellS, CellN), // [234][1345] sn. such
            new BrailleSymbolDataEntry("sådana", STANDALONE, SHORTFORM, CellS, CellN, CellA), // [234][1345][1] sna. such (specific plural)
            new BrailleSymbolDataEntry("sådant", STANDALONE, SHORTFORM, CellS, CellN, CellT), // [234][1345][2345] snt. such (specific singular)
            new BrailleSymbolDataEntry("särskilt", STANDALONE, SHORTFORM, CellS, CellAR), // [234][345] sä. specially

            new BrailleSymbolDataEntry("till", STANDALONE, SHORTFORM, CellT), // [2345] t. to
            new BrailleSymbolDataEntry("tills", STANDALONE, SHORTFORM, CellT, CellS), // [2345][234] ts. until
            new BrailleSymbolDataEntry("tillbaka", STANDALONE, SHORTFORM, CellT, CellB), // [2345][12] tb. back

            new BrailleSymbolDataEntry("utan", STANDALONE, SHORTFORM, CellU), // [136] u. without

            new BrailleSymbolDataEntry("vid", STANDALONE, SHORTFORM, CellV), // [1236] v. by
            new BrailleSymbolDataEntry("vilka", STANDALONE, SHORTFORM, CellV, CellK, CellA), // [1236][13][1] vka. who or what (plural)
            new BrailleSymbolDataEntry("vilkas", STANDALONE, SHORTFORM, CellV, CellK, CellA, CellS), // [1236][13][1][234] vkas. who or what (plural property)
            new BrailleSymbolDataEntry("vilken", STANDALONE, SHORTFORM, CellV, CellK, CellGH), // [1236][13][126] vk[126]. what (when selecting one)
            new BrailleSymbolDataEntry("vilkens", STANDALONE, SHORTFORM, CellV, CellK, CellGH, CellS), // [1236][13][126][234] vk[126]s. what (when selecting one property)
            new BrailleSymbolDataEntry("vilket", STANDALONE, SHORTFORM, CellV, CellK, CellING), // [1236][13][346] vk[346]. what (when you have selected one)
            new BrailleSymbolDataEntry("vilkets", STANDALONE, SHORTFORM, CellV, CellK, CellING, CellS), // [1236][13][346][234] vk[346]s. what (when you have selected one property)
            new BrailleSymbolDataEntry("vill", STANDALONE, SHORTFORM, CellV, CellL), // [1236][123] vl. want
            new BrailleSymbolDataEntry("ville", STANDALONE, SHORTFORM, CellV, CellL, CellE), // [1236][123][15] vle. wanted
            new BrailleSymbolDataEntry("vad", STANDALONE, SHORTFORM, CellW), // [2456] w. what (in general) or calf (muscle)

            new BrailleSymbolDataEntry("över", STANDALONE, SHORTFORM, CellX), // [1346] x. over
            new BrailleSymbolDataEntry("överallt", STANDALONE, SHORTFORM, CellX, CellA, CellT), // [1346][1][2345] xat. all over the place

            new BrailleSymbolDataEntry("mycket", STANDALONE, SHORTFORM, CellY), // [13456] y. much

            new BrailleSymbolDataEntry("efter", STANDALONE, SHORTFORM, CellZ), // [1356] z. after
            new BrailleSymbolDataEntry("eftersom", STANDALONE, SHORTFORM, CellZ, CellS), // [1356][234] zs. because or (we solve it over time)

            new BrailleSymbolDataEntry("är", STANDALONE, SHORTFORM, CellAR), // [345] ä. is
            new BrailleSymbolDataEntry("ännu", STANDALONE, SHORTFORM, CellAR, CellU), // [345][136] äu. still

            new BrailleSymbolDataEntry("en", STANDALONE, SHORTFORM, CellGH), // [126] [126]. one
            new BrailleSymbolDataEntry("med", STANDALONE, SHORTFORM, CellSH), // [146] [146]. with
            new BrailleSymbolDataEntry("er", STANDALONE, SHORTFORM, CellWH), // [156] [156]. your
            new BrailleSymbolDataEntry("ett", STANDALONE, SHORTFORM, CellING), // [346] [346]. one (equal to 'en' but used with other nouns)
            new BrailleSymbolDataEntry("för", STANDALONE, SHORTFORM, CellED), // [1246] [1246]. for
            new BrailleSymbolDataEntry("före", STANDALONE, SHORTFORM, CellED, CellE), // [1246][15] [1246]e. before
            new BrailleSymbolDataEntry("förr", STANDALONE, SHORTFORM, CellED, CellR), // [1246][1235] [1246]r. previous (in time)
            new BrailleSymbolDataEntry("förra", STANDALONE, SHORTFORM, CellED, CellR, CellA), // [1246][1235][1] [1246]ra. last (as in previous)
            new BrailleSymbolDataEntry("först", STANDALONE, SHORTFORM, CellED, CellS, CellT), // [1246][234][2345] [1246]st. first
            new BrailleSymbolDataEntry("första", STANDALONE, SHORTFORM, CellED, CellS, CellT, CellA), // [1246][234][2345][1] [1246]sta. the first
            new BrailleSymbolDataEntry("inte", STANDALONE, SHORTFORM, CellOU), // [1256] [1256]. not
            new BrailleSymbolDataEntry("de", STANDALONE, SHORTFORM, CellTH), // [1456] [1456]. those
            new BrailleSymbolDataEntry("det", STANDALONE, SHORTFORM, CellTHE), // [2346] [2346]. that (not a thing)
            new BrailleSymbolDataEntry("detta", STANDALONE, SHORTFORM, CellTHE, CellT, CellA), // [2346][2345][1] [2346]ta. this
            new BrailleSymbolDataEntry("dettas", STANDALONE, SHORTFORM, CellTHE, CellT, CellA, CellS), // [2346][2345][1][234] [2346]tas. this (property)
            new BrailleSymbolDataEntry("den", STANDALONE, SHORTFORM, CellOU), // [12346] [12346]. that (thing)
            new BrailleSymbolDataEntry("denna", STANDALONE, SHORTFORM, CellOU, CellN, CellA), // [12346][1345][1] [12346]na. this (thing specific)
            new BrailleSymbolDataEntry("dennas", STANDALONE, SHORTFORM, CellOU, CellN, CellA, CellS), // [12346][1345][1][234] [12346]nas. this (thing specific property)
            new BrailleSymbolDataEntry("var", STANDALONE, SHORTFORM, CellOF), // [12356] [12356]. where
            new BrailleSymbolDataEntry("vara", STANDALONE, SHORTFORM, CellOF, CellA), // [12356][1] [12356]a. be
            new BrailleSymbolDataEntry("varit", STANDALONE, SHORTFORM, CellOF, CellI, CellT), // [12356][24][2345] [12356]it. have been
            new BrailleSymbolDataEntry("varandra", STANDALONE, SHORTFORM, CellOF, CellA, CellW), // [12356][1][2456] [12356]aw. each other (people)
            new BrailleSymbolDataEntry("varandras", STANDALONE, SHORTFORM, CellOF, CellA, CellW, CellS), // [12356][1][2456][234] [12356]aws. each other (people property). Hold each others hands.

            // Short write - Level 2. System is called K-75
            // Three types: A. whole words, B. sound groups, C. shortened sound groups
            // B. sound grooups - Rule is: Used as part of a word but must have normal letter(s) at -

            new BrailleSymbolDataEntry("-ing-", STANDALONE, SHORTFORM, CellQuestionmark), // [236] [236].
            new BrailleSymbolDataEntry("-ingen", STANDALONE, SHORTFORM, CellQuestionmark, CellGH), // [236][126] [236][126].
            new BrailleSymbolDataEntry("-inger", STANDALONE, SHORTFORM, CellQuestionmark, CellWH), // [236][156] [236][156].
            new BrailleSymbolDataEntry("-inget", STANDALONE, SHORTFORM, CellQuestionmark, CellING), // [236][346] [236][346].
            new BrailleSymbolDataEntry("-de-", STANDALONE, SHORTFORM, CellTH), // [1456] [1456].
            new BrailleSymbolDataEntry("-det-", STANDALONE, SHORTFORM, CellTHE), // [2346] [2346].
            new BrailleSymbolDataEntry("-den-", STANDALONE, SHORTFORM, CellOU), // [12346] [12346].

            // Short write - Level 2. System is called K-75
            // Three types: A. whole words, B. sound groups, C. shortened sound groups
            // C. shortened sound groups - Rule is: use stand alone.

            new BrailleSymbolDataEntry("bl-a", STANDALONE, SHORTFORM, CellB, CellL, CellHyphen, CellA), // [15][123][36][1] bl-a. bland annat (among other)
            new BrailleSymbolDataEntry("dvs", STANDALONE, SHORTFORM, CellD, CellV, CellS), // [145][1236][234] dvs. det vill säga (viz)
            new BrailleSymbolDataEntry("e-d", STANDALONE, SHORTFORM, CellE, CellHyphen, CellD), // [15][36][145] e-d. eller dylikt (etc)
            new BrailleSymbolDataEntry("f-d", STANDALONE, SHORTFORM, CellF, CellHyphen, CellD), // [124][36][145] f-d. före detta (former)
            new BrailleSymbolDataEntry("f-n", STANDALONE, SHORTFORM, CellF, CellHyphen, CellN), // [145][36][1345] f-n. för närvarande (present)
            new BrailleSymbolDataEntry("f-ö", STANDALONE, SHORTFORM, CellF, CellHyphen, CellOW), // [124][36][246] f-ö. för övrigt (moreover)
            new BrailleSymbolDataEntry("m-fl", STANDALONE, SHORTFORM, Cellm, CellHyphen, CellF, CellL), // [134][36][124][123] m-fl. med flera (and others)
            new BrailleSymbolDataEntry("m-m", STANDALONE, SHORTFORM, CellM, CellHyphen, CellM), // [134][36][134] m-m. med mera (etc)
            new BrailleSymbolDataEntry("o-d", STANDALONE, SHORTFORM, CellO, CellHyphen, CellD), // [135][36][135] o-d. och dylikt (and the like)
            new BrailleSymbolDataEntry("osv", STANDALONE, SHORTFORM, CellO, CellS, CellV), // [135][234][1236] osv. och så vidare (and so on)
            new BrailleSymbolDataEntry("s-k", STANDALONE, SHORTFORM, CellS, CellHyphen, CellK), // [234][36][13] s-k. så kallat (so called)
            new BrailleSymbolDataEntry("t-ex", STANDALONE, SHORTFORM, CellT, CellHyphen, CellE, CellX), // [2345][36][15][1346] t-ex. till exempel (for example)

    };

	public BrailleSymbolDataEntry[] getAllSymbols() {return allSymbols;}
}
