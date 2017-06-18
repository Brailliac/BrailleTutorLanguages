package com.lukeneedham.brailletutor.Braille.SymbolDatabases;

import com.lukeneedham.brailletutor.Braille.BrailleSymbolDataEntry;
import com.lukeneedham.brailletutor.Braille.BrailleSymbolType;
import com.lukeneedham.brailletutor.Braille.DictionaryCategory;
import com.lukeneedham.brailletutor.R;

import static com.lukeneedham.brailletutor.Braille.BrailleCellDatabase.*;
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

	public static final BrailleSymbolType SHORT_1 = new BrailleSymbolType(R.string.symbol_short1, R.string.symbol_short1_desc);
	public static final BrailleSymbolType SHORT_2A = new BrailleSymbolType(R.string.symbol_short2a, R.string.symbol_short2a_desc);
	public static final BrailleSymbolType SHORT_2B = new BrailleSymbolType(R.string.symbol_short2b, R.string.symbol_short2b_desc);
	public static final BrailleSymbolType SHORT_2C = new BrailleSymbolType(R.string.symbol_short2c, R.string.symbol_short2c_desc);
	public static final BrailleSymbolType FOREIGN = new BrailleSymbolType(R.string.symbol_foreign, R.string.symbol_foreign_desc);

	private static final BrailleSymbolDataEntry[] allSymbols = {

			new BrailleSymbolDataEntry("a", LETTER, CellA),
			new BrailleSymbolDataEntry("b", LETTER, CellB),
			new BrailleSymbolDataEntry("c", LETTER, CellC),
			new BrailleSymbolDataEntry("d", LETTER, CellD),
			new BrailleSymbolDataEntry("e", LETTER, CellE),
			new BrailleSymbolDataEntry("f", LETTER, CellF),
			new BrailleSymbolDataEntry("g", LETTER, CellG),
			new BrailleSymbolDataEntry("h", LETTER, CellH),
			new BrailleSymbolDataEntry("i", LETTER, CellI),
			new BrailleSymbolDataEntry("j", LETTER, CellJ),
			new BrailleSymbolDataEntry("k", LETTER, CellK),
			new BrailleSymbolDataEntry("l", LETTER, CellL),
			new BrailleSymbolDataEntry("m", LETTER, CellM),
			new BrailleSymbolDataEntry("n", LETTER, CellN),
			new BrailleSymbolDataEntry("o", LETTER, CellO),
			new BrailleSymbolDataEntry("p", LETTER, CellP),
			new BrailleSymbolDataEntry("q", LETTER, CellQ),
			new BrailleSymbolDataEntry("r", LETTER, CellR),
			new BrailleSymbolDataEntry("s", LETTER, CellS),
			new BrailleSymbolDataEntry("t", LETTER, CellT),
			new BrailleSymbolDataEntry("u", LETTER, CellU),
			new BrailleSymbolDataEntry("v", LETTER, CellV),
			new BrailleSymbolDataEntry("w", LETTER, CellW),
			new BrailleSymbolDataEntry("x", LETTER, CellX),
			new BrailleSymbolDataEntry("y", LETTER, CellY),
			new BrailleSymbolDataEntry("z", LETTER, CellZ),
			new BrailleSymbolDataEntry("å", LETTER, CellCH), // [16]
			new BrailleSymbolDataEntry("ä", LETTER, CellAR), // [345]
			new BrailleSymbolDataEntry("ö", LETTER, CellOW), // [246]

			new BrailleSymbolDataEntry("é", LETTER, CellFOR), // [123456] Used in few Swedish words to prolong the e. Important but not part of the official Swedish alphabet.

			new BrailleSymbolDataEntry(" ", INVISIBLE, CellWhitespace),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_number_sign, NUMBER, CellNumbersign),
			new BrailleSymbolDataEntry("1", NUMBER, CellA),
			new BrailleSymbolDataEntry("2", NUMBER, CellB),
			new BrailleSymbolDataEntry("3", NUMBER, CellC),
			new BrailleSymbolDataEntry("4", NUMBER, CellD),
			new BrailleSymbolDataEntry("5", NUMBER, CellE),
			new BrailleSymbolDataEntry("6", NUMBER, CellF),
			new BrailleSymbolDataEntry("7", NUMBER, CellG),
			new BrailleSymbolDataEntry("8", NUMBER, CellH),
			new BrailleSymbolDataEntry("9", NUMBER, CellI),
			new BrailleSymbolDataEntry("0", NUMBER, CellJ),
			new BrailleSymbolDataEntry(".", R.string.braille_decimal_point, NUMBER, CellFullstop),
			new BrailleSymbolDataEntry(",", R.string.braille_thousands_separator, NUMBER, CellComma),

			new BrailleSymbolDataEntry("%", R.string.braille_percent, PUNCTUATION, CellTH), // [1456] Percent
			new BrailleSymbolDataEntry("‰", R.string.braille_permille, PUNCTUATION, CellTH, CellTH), // [1456] [1456] per mille
			new BrailleSymbolDataEntry("¢", R.string.braille_cent, PUNCTUATION, Cell45, CellC), // [45] [14] Cent
			new BrailleSymbolDataEntry("$", R.string.braille_dollar, PUNCTUATION, Cell45, CellS), // [45] [234] Dollar
			new BrailleSymbolDataEntry("€", R.string.braille_euro, PUNCTUATION, Cell45, CellE), // [45] [15] Euro
			new BrailleSymbolDataEntry("£", R.string.braille_poundsterling, PUNCTUATION, Cell45, CellL), // [45] [123] Brittish pound
			new BrailleSymbolDataEntry("¥", R.string.braille_yen, PUNCTUATION, Cell45, CellY), // [45] [13456] Japan yen
			new BrailleSymbolDataEntry("○", R.string.braille_degree, PUNCTUATION, CellER, CellG), // [12456] [1245] Degree sign
			new BrailleSymbolDataEntry("&", R.string.braille_ampersand, PUNCTUATION, CellAND), // [12346] And sign

			new BrailleSymbolDataEntry("©", R.string.braille_copyright, PUNCTUATION, CellQuestionmark, CellC, CellCloseQuote), // [236] [14] [356] Copyright sign
			new BrailleSymbolDataEntry("®", R.string.braille_rights_reserved, PUNCTUATION, CellQuestionmark, CellR, CellCloseQuote), // [236] [1235] [356] Rights reserved sign
			new BrailleSymbolDataEntry("TM", R.string.braille_tm, PUNCTUATION, CellQuestionmark, CellT, CellR, CellCloseQuote), // [236] [2345] [134] [356] Trade mark sign

			new BrailleSymbolDataEntry("?", R.string.braille_questionmark, PUNCTUATION, CellEN), // [26]
			new BrailleSymbolDataEntry("!", R.string.braille_exclamationmark, PUNCTUATION, CellExclamationmark), // [235]
			new BrailleSymbolDataEntry(":", R.string.braille_colon, PUNCTUATION, CellColon), // [25]
			new BrailleSymbolDataEntry(";", R.string.braille_semicolon, PUNCTUATION, CellSemicolon), // [23]
			new BrailleSymbolDataEntry("/", R.string.braille_slash, PUNCTUATION, CellST), // [34] (also for division)
			//new BrailleSymbolDataEntry("\"", R.string.braille_quote, PUNCTUATION, Cell56), // [56] quote sign, also used for second and inch
			new BrailleSymbolDataEntry("“", R.string.braille_openquote, PUNCTUATION, Cell56), // [56] quote sign, also used for second and inch
			new BrailleSymbolDataEntry("”", R.string.braille_closequote, PUNCTUATION, Cell56), // [56] quote sign, also used for second and inch
			new BrailleSymbolDataEntry("’", R.string.braille_apostrophe, PUNCTUATION, Cell5), // [5], singe quote or minute or fot

			new BrailleSymbolDataEntry("-", R.string.braille_hyphen, PUNCTUATION, CellHyphen), // [36] (also for subtract)
			new BrailleSymbolDataEntry("–", R.string.braille_dash, PUNCTUATION, CellHyphen, CellHyphen), // [36] [36] Speech string

			new BrailleSymbolDataEntry("(", R.string.braille_openbracket, PUNCTUATION, CellQuestionmark), // [236]
			new BrailleSymbolDataEntry(")", R.string.braille_closebracket, PUNCTUATION, CellCloseQuote), // [356]
			new BrailleSymbolDataEntry("[", R.string.braille_opensquarebracket, PUNCTUATION, CellOF), // [12356]
			new BrailleSymbolDataEntry("]", R.string.braille_closesquarebracket, PUNCTUATION, CellWITH), // [23456]
			new BrailleSymbolDataEntry("{", R.string.braille_opencurlybrace, PUNCTUATION, CellCapitalsign, CellOF), // [6] [12356]
			new BrailleSymbolDataEntry("}", R.string.braille_closecurlybrace, PUNCTUATION, CellCapitalsign, CellWITH), // [6] [23456]

			new BrailleSymbolDataEntry("§", R.string.braille_paragraph, PUNCTUATION, CellING), // [346] paragraph. Must have a space after or else this enables super script mode
			new BrailleSymbolDataEntry("&", R.string.braille_ampersand, PUNCTUATION, CellOU), // [12346]
			new BrailleSymbolDataEntry("*", R.string.braille_asterisk, PUNCTUATION, CellIN), // [35]
			new BrailleSymbolDataEntry("†", R.string.braille_dagger, PUNCTUATION, Cell45, CellQuestionmark), // [45] [236] Cross
			new BrailleSymbolDataEntry("#", R.string.braille_hash, PUNCTUATION, Cell45, CellNumbersign), // [45] [3456] Number sign, square
			new BrailleSymbolDataEntry("@", R.string.braille_at, PUNCTUATION, Cell45, CellOF), // [45] [12356] At sign
			new BrailleSymbolDataEntry("\\", R.string.braille_backslash, PUNCTUATION, Cell45, CellST), // [45] [34] Backslash
			new BrailleSymbolDataEntry("_", R.string.braille_underscore, PUNCTUATION, Cell45, CellHyphen), // [45] [36] Underscore
			new BrailleSymbolDataEntry("|", R.string.braille_pipe, PUNCTUATION, Cell456), // [456]
			new BrailleSymbolDataEntry("~", R.string.braille_tilde, PUNCTUATION, Cell45, CellColon), // [45] [25]

			new BrailleSymbolDataEntry("•", R.string.braille_bullet, PUNCTUATION, CellFOR), // [123456] List character - bullet
			new BrailleSymbolDataEntry("◦", R.string.braille_bullet_white, PUNCTUATION, Cell4, CellFOR), // [4] [123456] List character - ring
			new BrailleSymbolDataEntry("▪", R.string.braille_bullet_square, PUNCTUATION, Cell45, CellFOR), // [45] [123456] List character - square

			// pre signs
			// new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  Cell45), // Pre [45] for various characters, currency, some diacritical signs, one list char, help parentheses
			// new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  Cell4), // Pre [4] for Diacritical signs used over letters. Used for writing in other languages than Swedish.
			// new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  Cell46), // Pre [46] for style
			// new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  Cell56), // Pre [56] for fonetic, greek lc letter
			// new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  CellER), // Pre [12456] for ·, ×, ○
			new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, CellING), // [346] super script mode. (ends with space)
			new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, CellGH), // [126] sub script mode (ends with space)
			new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, CellWH), // [156] Stop sign. End a mode. For modes that do not end at next space.

			// Three signs for capital mode
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capital, PUNCTUATION, CellCapitalsign), // [6] Next character is a capital letter
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capitalword, PUNCTUATION, CellCapitalsign, CellCapitalsign), // [6] [6] Capital mode as log as you have letters and -
			//new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, CellCapitalsign, CellCapitalsign, CellCapitalsign), // [6] [6] [6] Capital mode until stop sign

			// Numbers. Same as in english where a-i = 1-9, j=0.
			// The number sign activate the number mode. Then mode end on any other character but digits.
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_number_sign, NUMBER, CellNumbersign), // [3456] enter number mode.
			new BrailleSymbolDataEntry(",", R.string.braille_decimal_point, NUMBER, CellComma), // [2] comma 3,1415 (Decimal point used in Swedish texts)
			new BrailleSymbolDataEntry(".", R.string.braille_decimal_point, NUMBER, CellApostrophe), // [3] Period (Used as decimal point in English texts, not in Swedish text) 3.1415
			new BrailleSymbolDataEntry("<", R.string.braille_less_than, MATHS, CellNumbersign, CellOW), // [3456] [246] (Number sign and ö) less than
			new BrailleSymbolDataEntry(">", R.string.braille_greater_than, MATHS, CellNumbersign, CellO), // [3456] [135] (Number sign and o) greater than

			// Mathematics
			new BrailleSymbolDataEntry("+", R.string.braille_add, MATHS, CellFullstop), // [256] add
			new BrailleSymbolDataEntry("=", R.string.braille_equal, MATHS, CellGG), // [2356] equals
			new BrailleSymbolDataEntry("·", R.string.braille_multiply_dot, MATHS, CellER, CellApostrophe), // [12456] [3] Multiplication sign with a dot (common) Example: 2,5 ⋅ 2,5 = 6,25
			new BrailleSymbolDataEntry("×", R.string.braille_multiply_cross, MATHS, CellER, CellX), // [12456] [1346] Multiplication sign with an x. Example: Magnification is 625x
			new BrailleSymbolDataEntry("──", R.string.braille_divide_line, MATHS, CellOU), // [1256] division (horizontal line)
			new BrailleSymbolDataEntry("√", R.string.braille_root, MATHS, CellSH), // [146] root sign

			// Below is foreign signs. Used only for rare names and when writing in another language.

			// You could (not a requirement) use an indicator before and after foreign language text
			new BrailleSymbolDataEntry(NO_STRING, PUNCTUATION, Cell5, CellComma), // [5] [2]

			// Foreign letters used in names and foreign addresses
			new BrailleSymbolDataEntry("à", FOREIGN, CellOF), // [12356]
			new BrailleSymbolDataEntry("è", FOREIGN, CellTHE), // [2346]
			new BrailleSymbolDataEntry("ü", FOREIGN, CellOU), //  [1256] German y

			// More foreign letters used in names and foreign addresses
			new BrailleSymbolDataEntry("æ", FOREIGN, Cell4, CellAR), // [1] [15] or [4] [345] Danish ä
			new BrailleSymbolDataEntry("ø", FOREIGN, Cell4, CellO), // [246] or [4] [135] Danish ö
			new BrailleSymbolDataEntry("œ", FOREIGN, Cell4, CellOW), // [135] [15] or [4] [246] oe, can also be written with o and e.
			new BrailleSymbolDataEntry("ß", FOREIGN, Cell4, CellS), // [234] [234] or [4] [234] German double s. Can also be written with s and s.
			new BrailleSymbolDataEntry("ð", FOREIGN, Cell4, CellD), // [4] [145] Icelandic d with a sting (edh)
			new BrailleSymbolDataEntry("þ", FOREIGN, Cell4, CellT), // [4] [2345] Icelandic t (called thorn)

			// Characters used for writing in other languages
			new BrailleSymbolDataEntry("á", FOREIGN, Cell4, CellA), // [4] [1]
			new BrailleSymbolDataEntry("ç", FOREIGN, Cell4, CellC), // [4] [14]
			new BrailleSymbolDataEntry("ë", FOREIGN, Cell4, CellE), // [4] [15] Yes same as ė
			new BrailleSymbolDataEntry("ė", FOREIGN, Cell4, CellE), // [4] [15] Yes same as ë
			new BrailleSymbolDataEntry("ô", FOREIGN, Cell4, CellO), // [4] [135]
			new BrailleSymbolDataEntry("ř", FOREIGN, Cell4, CellR), // [4] [1235]
			new BrailleSymbolDataEntry("ū", FOREIGN, Cell4, CellU), // [4] [136]

			// Exact diacritical signs to be used before any letter. Like: á ç ë ė ô ř ū
			// Used for writing in other languages. Eleven symbols.
			new BrailleSymbolDataEntry(NO_STRING, FOREIGN, CellING, CellIN), // [346] [35] apostrophe forward above letter  ́
			new BrailleSymbolDataEntry(NO_STRING, FOREIGN, CellING, CellEN), // [346] [26] apostrophe backward above letter `
			new BrailleSymbolDataEntry(NO_STRING, FOREIGN, CellGH, CellComma), // [126] [2] cedilj under letter
			new BrailleSymbolDataEntry(NO_STRING, FOREIGN, CellING, CellExclamationmark), // [346] [235] circumflex over letter ^
			new BrailleSymbolDataEntry(NO_STRING, FOREIGN, CellING, CellGG), // [346] [2356] reveresed circumflex over letter ˇ
			new BrailleSymbolDataEntry(NO_STRING, FOREIGN, CellING, CellColon), // [346] [25] tilde over letter ~
			new BrailleSymbolDataEntry(NO_STRING, FOREIGN, CellING, CellSemicolon), // [346] [23] trema over letter ̈
			new BrailleSymbolDataEntry(NO_STRING, FOREIGN, CellING, CellHyphen), // [346] [36] line over letter ̄
			new BrailleSymbolDataEntry(NO_STRING, FOREIGN, CellGH, CellHyphen), // [126] [36] line under letter
			new BrailleSymbolDataEntry(NO_STRING, FOREIGN, CellING, CellApostrophe), // [346] [3] dot over letter
			new BrailleSymbolDataEntry(NO_STRING, FOREIGN, CellGH, CellApostrophe), // [126] [3] dot under letter

			// Above diacritical signs again but now stand alone (Skipping this for now)

			// North Saami letters.
			new BrailleSymbolDataEntry("á", FOREIGN, CellOF), // [12356] a with forward apostrophe
			new BrailleSymbolDataEntry("č", FOREIGN, CellSH), // [146] c with reversed circumflex
			new BrailleSymbolDataEntry("đ", FOREIGN, CellTH), // [1456] stung d
			new BrailleSymbolDataEntry("ŋ", FOREIGN, CellED), // [1246] eng
			new BrailleSymbolDataEntry("š", FOREIGN, CellWH), // [156] s with reversed circumflex
			new BrailleSymbolDataEntry("ŧ", FOREIGN, CellOU), // [1256] stung t
			new BrailleSymbolDataEntry("ž", FOREIGN, CellTHE), // [2346] z with reversed circumflex

			// South Saami letters
			new BrailleSymbolDataEntry("ï", FOREIGN, CellST), // [34] i with trema

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

			new BrailleSymbolDataEntry("att", STANDALONE, SHORT_1, CellA), // [1] a. to (do something)
			new BrailleSymbolDataEntry("bli", STANDALONE, SHORT_1, CellB), // [12] b. become
			new BrailleSymbolDataEntry("och", STANDALONE, SHORT_1, CellC), // [14] c. and
			new BrailleSymbolDataEntry("där", STANDALONE, SHORT_1, CellD), // [145] d. there
			new BrailleSymbolDataEntry("eller", STANDALONE, SHORT_1, CellE), // [15] e. or
			new BrailleSymbolDataEntry("från", STANDALONE, SHORT_1, CellF), // [124] f. from
			new BrailleSymbolDataEntry("genom", STANDALONE, SHORT_1, CellG), // [1245] g. trough
			new BrailleSymbolDataEntry("han", STANDALONE, SHORT_1, CellH), // [125] h. he
			new BrailleSymbolDataEntry("jag", STANDALONE, SHORT_1, CellJ), // [134] j. I
			new BrailleSymbolDataEntry("kan", STANDALONE, SHORT_1, CellK), // [13] k. can
			new BrailleSymbolDataEntry("lika", STANDALONE, SHORT_1, CellL), // [123] l. like/same
			new BrailleSymbolDataEntry("man", STANDALONE, SHORT_1, CellM), // [134] m. you/man/one
			new BrailleSymbolDataEntry("när", STANDALONE, SHORT_1, CellN), // [1345] n. when
			new BrailleSymbolDataEntry("på", STANDALONE, SHORT_1, CellP), // [1234] p. on
			new BrailleSymbolDataEntry("under", STANDALONE, SHORT_1, CellQ), // [12345] q. under
			new BrailleSymbolDataEntry("har", STANDALONE, SHORT_1, CellR), // [1235] r. have
			new BrailleSymbolDataEntry("som", STANDALONE, SHORT_1, CellS), // [234] s. as
			new BrailleSymbolDataEntry("till", STANDALONE, SHORT_1, CellT), // [2345] t. to (a destination)
			new BrailleSymbolDataEntry("utan", STANDALONE, SHORT_1, CellU), // [136] u. without
			new BrailleSymbolDataEntry("vid", STANDALONE, SHORT_1, CellV), // [1236] v. by
			new BrailleSymbolDataEntry("vad", STANDALONE, SHORT_1, CellW), // [2456] w. what
			new BrailleSymbolDataEntry("över", STANDALONE, SHORT_1, CellX), // [1346] x. over
			new BrailleSymbolDataEntry("mycket", STANDALONE, SHORT_1, CellY), // [13456] y. much
			new BrailleSymbolDataEntry("efter", STANDALONE, SHORT_1, CellZ), // [1356] z. after
			new BrailleSymbolDataEntry("är", STANDALONE, SHORT_1, CellAR), // [345] ä. is

			new BrailleSymbolDataEntry("en", STANDALONE, SHORT_1, CellGH), // [126] a/one (a chair, en stol)
			new BrailleSymbolDataEntry("med", STANDALONE, SHORT_1, CellSH), // [146] with
			new BrailleSymbolDataEntry("er", STANDALONE, SHORT_1, CellWH), // [156] your
			new BrailleSymbolDataEntry("ett", STANDALONE, SHORT_1, CellING), // [346] a/one (a house, ett hus)
			new BrailleSymbolDataEntry("för", STANDALONE, SHORT_1, CellED), // [1246] for
			new BrailleSymbolDataEntry("inte", STANDALONE, SHORT_1, CellOU), // [1256] not
			new BrailleSymbolDataEntry("de", STANDALONE, SHORT_1, CellTH), // [1456] them
			new BrailleSymbolDataEntry("det", STANDALONE, SHORT_1, CellTHE), // [2346] that (det huset)
			new BrailleSymbolDataEntry("den", STANDALONE, SHORT_1, CellOU), // [12346] that (den stolen)
			new BrailleSymbolDataEntry("var", STANDALONE, SHORT_1, CellOF), // [12356] where

			// Short write - Level 2. System is called K-75
			// Three types: A. whole words, B. sound groups, C. shortened sound groups
			// A. Whole words

			new BrailleSymbolDataEntry("att", STANDALONE, SHORT_2A, CellA), // [1] a. to
			new BrailleSymbolDataEntry("alla", STANDALONE, SHORT_2A, CellA, CellA), // [1][1] aa. all/everyone
			new BrailleSymbolDataEntry("allas", STANDALONE, SHORT_2A, CellA, CellA, CellS), // [1][1][234] aas. everyones
			new BrailleSymbolDataEntry("alltid", STANDALONE, SHORT_2A, CellA, CellD), // [1][145] ad. always
			new BrailleSymbolDataEntry("aldrig", STANDALONE, SHORT_2A, CellA, CellG), // [1] ag. never
			new BrailleSymbolDataEntry("allt", STANDALONE, SHORT_2A, CellA, CellT), // [1] at. everything
			new BrailleSymbolDataEntry("alltför", STANDALONE, SHORT_2A, CellA, CellT, CellED), // [1][2345][1246] at[1246]. too
			new BrailleSymbolDataEntry("allting", STANDALONE, SHORT_2A, CellA, CellT, CellQuestionmark), // [1][2345][236] at[236]. everything
			new BrailleSymbolDataEntry("alltings", STANDALONE, SHORT_2A, CellA, CellT, CellQuestionmark, CellS), // [1][2345][236][234] at[236]s. everything (including heaven and hell and outer space)
			new BrailleSymbolDataEntry("andra", STANDALONE, SHORT_2A, CellA, CellW), // [1][2456] other
			new BrailleSymbolDataEntry("andras", STANDALONE, SHORT_2A, CellA, CellW, CellS), // [1][2456][234] other peoples ...
			new BrailleSymbolDataEntry("alltså", STANDALONE, SHORT_2A, CellA, CellCH), // [1][16] aå. that is / so

			new BrailleSymbolDataEntry("bli", STANDALONE, SHORT_2A, CellB), // [12] b. become
			new BrailleSymbolDataEntry("börja", STANDALONE, SHORT_2A, CellB, CellJ), // [12][245] bj. start
			new BrailleSymbolDataEntry("början", STANDALONE, SHORT_2A, CellB, CellJ, CellN), // [12][245][1345] bjn. the start
			new BrailleSymbolDataEntry("börjans", STANDALONE, SHORT_2A, CellB, CellJ, CellN, CellS), // [12][245][1345][234] bjns. about the start
			new BrailleSymbolDataEntry("börjar", STANDALONE, SHORT_2A, CellB, CellJ, CellR), // [12][245][1235] bjr. starting
			new BrailleSymbolDataEntry("börjat", STANDALONE, SHORT_2A, CellB, CellJ, CellT), // [12][245][2345] bjt. have started
			new BrailleSymbolDataEntry("började", STANDALONE, SHORT_2A, CellB, CellJ, CellTH), // [12][245][1456] bj[1456]. did start / it started
			new BrailleSymbolDataEntry("bland", STANDALONE, SHORT_2A, CellB, CellL), // [12][123] bl. among
			new BrailleSymbolDataEntry("blir", STANDALONE, SHORT_2A, CellB, CellR), // [12][1235] br. become
			new BrailleSymbolDataEntry("blev", STANDALONE, SHORT_2A, CellB, CellV), // [12][1236] became

			new BrailleSymbolDataEntry("och", STANDALONE, SHORT_2A, CellC), // [14] c. and
			new BrailleSymbolDataEntry("också", STANDALONE, SHORT_2A, CellC, CellS), // [12][234] also

			new BrailleSymbolDataEntry("där", STANDALONE, SHORT_2A, CellD), // [145] d. there
			new BrailleSymbolDataEntry("dess", STANDALONE, SHORT_2A, CellD, CellS), // [145][234] its
			new BrailleSymbolDataEntry("dessa", STANDALONE, SHORT_2A, CellD, CellS, CellA), // [145][234][1] dsa. those
			new BrailleSymbolDataEntry("dessas", STANDALONE, SHORT_2A, CellD, CellS, CellA, CellS), // [145][234][1][234] dsas. thoses (that belong to them, it is thoses :-)

			new BrailleSymbolDataEntry("eller", STANDALONE, SHORT_2A, CellE), // [15] e. or
			new BrailleSymbolDataEntry("endast", STANDALONE, SHORT_2A, CellE, CellA), // [15][1] only
			new BrailleSymbolDataEntry("henne", STANDALONE, SHORT_2A, CellE, CellE), // [15][15] ee. her
			new BrailleSymbolDataEntry("hennes", STANDALONE, SHORT_2A, CellE, CellE, CellS), // [15][15][234] ees. hers
			new BrailleSymbolDataEntry("emedan", STANDALONE, SHORT_2A, CellE, CellM, CellD), // [15][134][145] emd. while
			new BrailleSymbolDataEntry("emellan", STANDALONE, SHORT_2A, CellE, CellM, CellL), // [15][134][123] between
			new BrailleSymbolDataEntry("emellertid", STANDALONE, SHORT_2A, CellE, CellM, CellT), // [15][134][2345] emt. however

			new BrailleSymbolDataEntry("från", STANDALONE, SHORT_2A, CellF), // [124] from
			new BrailleSymbolDataEntry("fortfarande", STANDALONE, SHORT_2A, CellF, CellO, CellF), // [124][135][124] emt. still

			new BrailleSymbolDataEntry("genom", STANDALONE, SHORT_2A, CellG), // [1245] g. trough
			new BrailleSymbolDataEntry("gång", STANDALONE, SHORT_2A, CellG, CellG), // [1245][1245] gg. gangway
			new BrailleSymbolDataEntry("gångs", STANDALONE, SHORT_2A, CellG, CellG, CellS), // [1245][1245][234] ggs. gangways
			new BrailleSymbolDataEntry("gångar", STANDALONE, SHORT_2A, CellG, CellG, CellA, CellR), // [1245][1245][1][1235] ggar. tunnels (in general)
			new BrailleSymbolDataEntry("gångars", STANDALONE, SHORT_2A, CellG, CellG, CellA, CellR, CellS), // [1245][1245][1][1235][234] ggar. tunnels (property)
			new BrailleSymbolDataEntry("gångarna", STANDALONE, SHORT_2A, CellG, CellG, CellA, CellR, CellN, CellA), // [1245][1245][1][1235][1345][1] ggarna. the tunnels (in general)
			new BrailleSymbolDataEntry("gångarnas", STANDALONE, SHORT_2A, CellG, CellG, CellA, CellR, CellN, CellA, CellS), // [1245][1245][1][1235][1345][1][234] ggarnas. the tunnels (property)
			new BrailleSymbolDataEntry("gången", STANDALONE, SHORT_2A, CellG, CellG, CellWH), // [1245][1245][156] gg[156]. the tunnel
			new BrailleSymbolDataEntry("gångens", STANDALONE, SHORT_2A, CellG, CellG, CellWH, CellS), // [1245][1245][156][234] gg[156]s. the tunnels (property)

			new BrailleSymbolDataEntry("gånger", STANDALONE, SHORT_2A, CellG, CellG, CellWH), // [1245][1245][156] gg[156]. times (I have done it 5 times)
			new BrailleSymbolDataEntry("gångers", STANDALONE, SHORT_2A, CellG, CellG, CellWH, CellS), // [1245][1245][156][234] gg[156]s. times (I will have 5 times suspension)
			new BrailleSymbolDataEntry("gångerna", STANDALONE, SHORT_2A, CellG, CellG, CellWH, CellN, CellA), // [1245][1245][156][1345][1] gg[156]na. the times
			new BrailleSymbolDataEntry("gångernas", STANDALONE, SHORT_2A, CellG, CellG, CellWH, CellN, CellA, CellS), // [1245][1245][156][1345][1][234] gg[156]nas. the times

			new BrailleSymbolDataEntry("han", STANDALONE, SHORT_2A, CellH), // [125] h. he
			new BrailleSymbolDataEntry("hans", STANDALONE, SHORT_2A, CellH, CellS), // [125][234] hs. his
			new BrailleSymbolDataEntry("hon", STANDALONE, SHORT_2A, CellH, CellN), // [125][1345] hn. she
			new BrailleSymbolDataEntry("hade", STANDALONE, SHORT_2A, CellH, CellTH), // [125][1456] h[1456]. had

			new BrailleSymbolDataEntry("inga", STANDALONE, SHORT_2A, CellI, CellA), // [24][1] ia. none
			new BrailleSymbolDataEntry("ingas", STANDALONE, SHORT_2A, CellI, CellA, CellS), // [24][1][234] ias. none (plural)
			new BrailleSymbolDataEntry("ingen", STANDALONE, SHORT_2A, CellI, CellGH), // [24][126] i[126]. noone
			new BrailleSymbolDataEntry("ingens", STANDALONE, SHORT_2A, CellI, CellGH, CellS), // [24][126][234] i[126]s. noone (plural)
			new BrailleSymbolDataEntry("inget", STANDALONE, SHORT_2A, CellI, CellING), // [24][346] i[346]. nothing (abstract)
			new BrailleSymbolDataEntry("ingets", STANDALONE, SHORT_2A, CellI, CellING, CellS), // [24][346][234] i[346]s. (abstract abstract)
			new BrailleSymbolDataEntry("ibland", STANDALONE, SHORT_2A, CellI, CellB, CellL), // [24][12][123] ibl. sometimes.
			new BrailleSymbolDataEntry("ingenting", STANDALONE, SHORT_2A, CellI, CellGH, CellT, CellQuestionmark), // [24][126][2345][236] i[126]t[236]. nothing (no thing)
			new BrailleSymbolDataEntry("igenom", STANDALONE, SHORT_2A, CellI, CellG), // [13][1245] ig. trough

			new BrailleSymbolDataEntry("jag", STANDALONE, SHORT_2A, CellJ), // [245] j. I

			new BrailleSymbolDataEntry("kan", STANDALONE, SHORT_2A, CellK), // [13] k. can
			new BrailleSymbolDataEntry("kanske", STANDALONE, SHORT_2A, CellK, CellA), // [13][1] ka. perhaps
			new BrailleSymbolDataEntry("komma", STANDALONE, SHORT_2A, CellK, CellM, CellA), // [13][134][1] kma. come
			new BrailleSymbolDataEntry("kommer", STANDALONE, SHORT_2A, CellK, CellM, CellWH), // [13][134][156] km[156]. coming
			new BrailleSymbolDataEntry("kommit", STANDALONE, SHORT_2A, CellK, CellM, CellT), // [13][134][2345] kmt. have came
			new BrailleSymbolDataEntry("kunna", STANDALONE, SHORT_2A, CellK, CellN), // [13][1345] kn. can (I want to be able to come)
			new BrailleSymbolDataEntry("kunnat", STANDALONE, SHORT_2A, CellK, CellN, CellT), // [13][1345][2345] knt. been able (I have known how to do that)
			new BrailleSymbolDataEntry("kunde", STANDALONE, SHORT_2A, CellK, CellTH), // [13][1456] k[1456]. could (the I could)

			new BrailleSymbolDataEntry("lika", STANDALONE, SHORT_2A, CellL), // [123] l. equal
			new BrailleSymbolDataEntry("liksom", STANDALONE, SHORT_2A, CellL, CellS), // [123][234] ls. as well as

			new BrailleSymbolDataEntry("man", STANDALONE, SHORT_2A, CellM), // [134] m. I or you in general (abstract)
			new BrailleSymbolDataEntry("medan", STANDALONE, SHORT_2A, CellM, CellD), // [134][145] md. while
			new BrailleSymbolDataEntry("många", STANDALONE, SHORT_2A, CellM, CellG), // [134][1245] mg. many
			new BrailleSymbolDataEntry("mångas", STANDALONE, SHORT_2A, CellM, CellG, CellS), // [134][1245][234] mgs. many (property)
			new BrailleSymbolDataEntry("mellan", STANDALONE, SHORT_2A, CellM, CellL), // [134][123] ml. between
			new BrailleSymbolDataEntry("men", STANDALONE, SHORT_2A, CellM, CellGH), // [134][126] m[126]. but
			new BrailleSymbolDataEntry("måste", STANDALONE, SHORT_2A, CellM, CellOU), // [134][1256] m[1256]. have to

			new BrailleSymbolDataEntry("när", STANDALONE, SHORT_2A, CellN), // [1345] n. when
			new BrailleSymbolDataEntry("någon", STANDALONE, SHORT_2A, CellN, CellN), // [1345][1345] nn. somenone
			new BrailleSymbolDataEntry("någons", STANDALONE, SHORT_2A, CellN, CellN, CellS), // [1345][1345][234] nns. someones
			new BrailleSymbolDataEntry("någonting", STANDALONE, SHORT_2A, CellN, CellN, CellT, CellQuestionmark), // [1345][1345][2345][236] nnt[236]. something
			new BrailleSymbolDataEntry("något", STANDALONE, SHORT_2A, CellN, CellT), // [1345][2345] nt. something
			new BrailleSymbolDataEntry("naturligtvis", STANDALONE, SHORT_2A, CellN, CellT, CellV), // [1345][2345][1236] ntv. of course
			new BrailleSymbolDataEntry("några", STANDALONE, SHORT_2A, CellN, CellW), // [1345][2456] nw. some
			new BrailleSymbolDataEntry("någras", STANDALONE, SHORT_2A, CellN, CellW, CellS), // [1345][2456][234] nws. some (plural)

			new BrailleSymbolDataEntry("olika", STANDALONE, SHORT_2A, CellO, CellL), // [135] ol. different
			new BrailleSymbolDataEntry("honom", STANDALONE, SHORT_2A, CellO, CellO), // [135][135] oo. him
			new BrailleSymbolDataEntry("omkring", STANDALONE, SHORT_2A, CellO, CellQuestionmark), // [245] o[236]. around

			new BrailleSymbolDataEntry("på", STANDALONE, SHORT_2A, CellP), // [1234] p. on

			new BrailleSymbolDataEntry("under", STANDALONE, SHORT_2A, CellQ), // [12345] q. under

			new BrailleSymbolDataEntry("har", STANDALONE, SHORT_2A, CellR), // [1235] r. have
			new BrailleSymbolDataEntry("redan", STANDALONE, SHORT_2A, CellR, CellD), // [1235][145] rd. already

			new BrailleSymbolDataEntry("som", STANDALONE, SHORT_2A, CellS), // [234] s. some
			new BrailleSymbolDataEntry("sedan", STANDALONE, SHORT_2A, CellS, CellD), // [234][145] sd. since
			new BrailleSymbolDataEntry("själv", STANDALONE, SHORT_2A, CellS, CellJ), // [234][245] sj. self (do)
			new BrailleSymbolDataEntry("själva", STANDALONE, SHORT_2A, CellS, CellJ, CellA), // [234][245][1] sja. self (thing)
			new BrailleSymbolDataEntry("självt", STANDALONE, SHORT_2A, CellS, CellJ, CellT), // [234][245][2345] sjt. self (by itself)
			new BrailleSymbolDataEntry("skall", STANDALONE, SHORT_2A, CellS, CellK), // [234][13] sk. dog bark, or will do
			new BrailleSymbolDataEntry("skulle", STANDALONE, SHORT_2A, CellS, CellL), // [234][123] sl. would do
			new BrailleSymbolDataEntry("sådan", STANDALONE, SHORT_2A, CellS, CellN), // [234][1345] sn. such
			new BrailleSymbolDataEntry("sådana", STANDALONE, SHORT_2A, CellS, CellN, CellA), // [234][1345][1] sna. such (specific plural)
			new BrailleSymbolDataEntry("sådant", STANDALONE, SHORT_2A, CellS, CellN, CellT), // [234][1345][2345] snt. such (specific singular)
			new BrailleSymbolDataEntry("särskilt", STANDALONE, SHORT_2A, CellS, CellAR), // [234][345] sä. specially

			new BrailleSymbolDataEntry("till", STANDALONE, SHORT_2A, CellT), // [2345] t. to
			new BrailleSymbolDataEntry("tills", STANDALONE, SHORT_2A, CellT, CellS), // [2345][234] ts. until
			new BrailleSymbolDataEntry("tillbaka", STANDALONE, SHORT_2A, CellT, CellB), // [2345][12] tb. back

			new BrailleSymbolDataEntry("utan", STANDALONE, SHORT_2A, CellU), // [136] u. without

			new BrailleSymbolDataEntry("vid", STANDALONE, SHORT_2A, CellV), // [1236] v. by
			new BrailleSymbolDataEntry("vilka", STANDALONE, SHORT_2A, CellV, CellK, CellA), // [1236][13][1] vka. who or what (plural)
			new BrailleSymbolDataEntry("vilkas", STANDALONE, SHORT_2A, CellV, CellK, CellA, CellS), // [1236][13][1][234] vkas. who or what (plural property)
			new BrailleSymbolDataEntry("vilken", STANDALONE, SHORT_2A, CellV, CellK, CellGH), // [1236][13][126] vk[126]. what (when selecting one)
			new BrailleSymbolDataEntry("vilkens", STANDALONE, SHORT_2A, CellV, CellK, CellGH, CellS), // [1236][13][126][234] vk[126]s. what (when selecting one property)
			new BrailleSymbolDataEntry("vilket", STANDALONE, SHORT_2A, CellV, CellK, CellING), // [1236][13][346] vk[346]. what (when you have selected one)
			new BrailleSymbolDataEntry("vilkets", STANDALONE, SHORT_2A, CellV, CellK, CellING, CellS), // [1236][13][346][234] vk[346]s. what (when you have selected one property)
			new BrailleSymbolDataEntry("vill", STANDALONE, SHORT_2A, CellV, CellL), // [1236][123] vl. want
			new BrailleSymbolDataEntry("ville", STANDALONE, SHORT_2A, CellV, CellL, CellE), // [1236][123][15] vle. wanted
			new BrailleSymbolDataEntry("vad", STANDALONE, SHORT_2A, CellW), // [2456] w. what (in general) or calf (muscle)

			new BrailleSymbolDataEntry("över", STANDALONE, SHORT_2A, CellX), // [1346] x. over
			new BrailleSymbolDataEntry("överallt", STANDALONE, SHORT_2A, CellX, CellA, CellT), // [1346][1][2345] xat. all over the place

			new BrailleSymbolDataEntry("mycket", STANDALONE, SHORT_2A, CellY), // [13456] y. much

			new BrailleSymbolDataEntry("efter", STANDALONE, SHORT_2A, CellZ), // [1356] z. after
			new BrailleSymbolDataEntry("eftersom", STANDALONE, SHORT_2A, CellZ, CellS), // [1356][234] zs. because or (we solve it over time)

			new BrailleSymbolDataEntry("är", STANDALONE, SHORT_2A, CellAR), // [345] ä. is
			new BrailleSymbolDataEntry("ännu", STANDALONE, SHORT_2A, CellAR, CellU), // [345][136] äu. still

			new BrailleSymbolDataEntry("en", STANDALONE, SHORT_2A, CellGH), // [126] [126]. one
			new BrailleSymbolDataEntry("med", STANDALONE, SHORT_2A, CellSH), // [146] [146]. with
			new BrailleSymbolDataEntry("er", STANDALONE, SHORT_2A, CellWH), // [156] [156]. your
			new BrailleSymbolDataEntry("ett", STANDALONE, SHORT_2A, CellING), // [346] [346]. one (equal to 'en' but used with other nouns)
			new BrailleSymbolDataEntry("för", STANDALONE, SHORT_2A, CellED), // [1246] [1246]. for
			new BrailleSymbolDataEntry("före", STANDALONE, SHORT_2A, CellED, CellE), // [1246][15] [1246]e. before
			new BrailleSymbolDataEntry("förr", STANDALONE, SHORT_2A, CellED, CellR), // [1246][1235] [1246]r. previous (in time)
			new BrailleSymbolDataEntry("förra", STANDALONE, SHORT_2A, CellED, CellR, CellA), // [1246][1235][1] [1246]ra. last (as in previous)
			new BrailleSymbolDataEntry("först", STANDALONE, SHORT_2A, CellED, CellS, CellT), // [1246][234][2345] [1246]st. first
			new BrailleSymbolDataEntry("första", STANDALONE, SHORT_2A, CellED, CellS, CellT, CellA), // [1246][234][2345][1] [1246]sta. the first
			new BrailleSymbolDataEntry("inte", STANDALONE, SHORT_2A, CellOU), // [1256] [1256]. not
			new BrailleSymbolDataEntry("de", STANDALONE, SHORT_2A, CellTH), // [1456] [1456]. those
			new BrailleSymbolDataEntry("det", STANDALONE, SHORT_2A, CellTHE), // [2346] [2346]. that (not a thing)
			new BrailleSymbolDataEntry("detta", STANDALONE, SHORT_2A, CellTHE, CellT, CellA), // [2346][2345][1] [2346]ta. this
			new BrailleSymbolDataEntry("dettas", STANDALONE, SHORT_2A, CellTHE, CellT, CellA, CellS), // [2346][2345][1][234] [2346]tas. this (property)
			new BrailleSymbolDataEntry("den", STANDALONE, SHORT_2A, CellOU), // [12346] [12346]. that (thing)
			new BrailleSymbolDataEntry("denna", STANDALONE, SHORT_2A, CellOU, CellN, CellA), // [12346][1345][1] [12346]na. this (thing specific)
			new BrailleSymbolDataEntry("dennas", STANDALONE, SHORT_2A, CellOU, CellN, CellA, CellS), // [12346][1345][1][234] [12346]nas. this (thing specific property)
			new BrailleSymbolDataEntry("var", STANDALONE, SHORT_2A, CellOF), // [12356] [12356]. where
			new BrailleSymbolDataEntry("vara", STANDALONE, SHORT_2A, CellOF, CellA), // [12356][1] [12356]a. be
			new BrailleSymbolDataEntry("varit", STANDALONE, SHORT_2A, CellOF, CellI, CellT), // [12356][24][2345] [12356]it. have been
			new BrailleSymbolDataEntry("varandra", STANDALONE, SHORT_2A, CellOF, CellA, CellW), // [12356][1][2456] [12356]aw. each other (people)
			new BrailleSymbolDataEntry("varandras", STANDALONE, SHORT_2A, CellOF, CellA, CellW, CellS), // [12356][1][2456][234] [12356]aws. each other (people property). Hold each others hands.

			// Short write - Level 2. System is called K-75
			// Three types: A. whole words, B. sound groups, C. shortened sound groups
			// B. sound grooups - Rule is: Used as part of a word but must have normal letter(s) at -

			new BrailleSymbolDataEntry("-ing-", STANDALONE, SHORT_2B, CellQuestionmark), // [236] [236].
			new BrailleSymbolDataEntry("-ingen", STANDALONE, SHORT_2B, CellQuestionmark, CellGH), // [236][126] [236][126].
			new BrailleSymbolDataEntry("-inger", STANDALONE, SHORT_2B, CellQuestionmark, CellWH), // [236][156] [236][156].
			new BrailleSymbolDataEntry("-inget", STANDALONE, SHORT_2B, CellQuestionmark, CellING), // [236][346] [236][346].
			new BrailleSymbolDataEntry("-de-", STANDALONE, SHORT_2B, CellTH), // [1456] [1456].
			new BrailleSymbolDataEntry("-det-", STANDALONE, SHORT_2B, CellTHE), // [2346] [2346].
			new BrailleSymbolDataEntry("-den-", STANDALONE, SHORT_2B, CellOU), // [12346] [12346].

			// Short write - Level 2. System is called K-75
			// Three types: A. whole words, B. sound groups, C. shortened sound groups
			// C. shortened sound groups - Rule is: use stand alone.

			new BrailleSymbolDataEntry("bl-a", STANDALONE, SHORT_2C, CellB, CellL, CellHyphen, CellA), // [15][123][36][1] bl-a. bland annat (among other)
			new BrailleSymbolDataEntry("dvs", STANDALONE, SHORT_2C, CellD, CellV, CellS), // [145][1236][234] dvs. det vill säga (viz)
			new BrailleSymbolDataEntry("e-d", STANDALONE, SHORT_2C, CellE, CellHyphen, CellD), // [15][36][145] e-d. eller dylikt (etc)
			new BrailleSymbolDataEntry("f-d", STANDALONE, SHORT_2C, CellF, CellHyphen, CellD), // [124][36][145] f-d. före detta (former)
			new BrailleSymbolDataEntry("f-n", STANDALONE, SHORT_2C, CellF, CellHyphen, CellN), // [145][36][1345] f-n. för närvarande (present)
			new BrailleSymbolDataEntry("f-ö", STANDALONE, SHORT_2C, CellF, CellHyphen, CellOW), // [124][36][246] f-ö. för övrigt (moreover)
			new BrailleSymbolDataEntry("m-fl", STANDALONE, SHORT_2C, CellM, CellHyphen, CellF, CellL), // [134][36][124][123] m-fl. med flera (and others)
			new BrailleSymbolDataEntry("m-m", STANDALONE, SHORT_2C, CellM, CellHyphen, CellM), // [134][36][134] m-m. med mera (etc)
			new BrailleSymbolDataEntry("o-d", STANDALONE, SHORT_2C, CellO, CellHyphen, CellD), // [135][36][135] o-d. och dylikt (and the like)
			new BrailleSymbolDataEntry("osv", STANDALONE, SHORT_2C, CellO, CellS, CellV), // [135][234][1236] osv. och så vidare (and so on)
			new BrailleSymbolDataEntry("s-k", STANDALONE, SHORT_2C, CellS, CellHyphen, CellK), // [234][36][13] s-k. så kallat (so called)
			new BrailleSymbolDataEntry("t-ex", STANDALONE, SHORT_2C, CellT, CellHyphen, CellE, CellX), // [2345][36][15][1346] t-ex. till exempel (for example)
	};

	public BrailleSymbolDataEntry[] getAllSymbols()
	{
		return allSymbols;
	}

	public DictionaryCategory[] getDictionaryCategories()
	{
		return new DictionaryCategory[] {
				new DictionaryCategory(R.string.symbol_letter,0,LETTER),
				new DictionaryCategory(R.string.symbol_number,4,NUMBER),
				new DictionaryCategory(R.string.symbol_punctuation,6,PUNCTUATION),
				new DictionaryCategory(R.string.symbol_short1, 8, SHORT_1).setTranslateToggle(true),
				new DictionaryCategory(R.string.category_short2, 12, SHORT_2A, SHORT_2B, SHORT_2C).setTranslateToggle(true),
				new DictionaryCategory(R.string.symbol_foreign, 15, FOREIGN)};
	}

	public BrailleSymbolDataEntry getCloseQuote()
	{
		return findSymbolDataByDescription(R.string.braille_quote);
	}

	public BrailleSymbolDataEntry getOpenQuote()
	{
		return findSymbolDataByDescription(R.string.braille_quote);
	}
}
