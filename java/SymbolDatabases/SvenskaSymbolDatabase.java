package com.lukeneedham.brailletutor.Braille.SymbolDatabases;

import com.lukeneedham.brailletutor.Braille.BrailleSymbolDataEntry;
import com.lukeneedham.brailletutor.Braille.BrailleSymbolType;
import com.lukeneedham.brailletutor.Braille.DictionaryCategory;
import com.lukeneedham.brailletutor.R;

import static com.lukeneedham.brailletutor.Braille.BrailleCellDatabase.*;
import static com.lukeneedham.brailletutor.Braille.BrailleSymbolDataEntry.NOTHING;
import static com.lukeneedham.brailletutor.Braille.BrailleSymbolDataEntry.SHOW_INFO;
import static com.lukeneedham.brailletutor.Braille.BrailleSymbolDataEntry.SHOW_LETTERS_REP;
import static com.lukeneedham.brailletutor.Braille.BrailleSymbolDataEntry.SHOW_USAGE_RULE;
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

			new BrailleSymbolDataEntry("a", LETTER, NOTHING, CellA),
			new BrailleSymbolDataEntry("b", LETTER, NOTHING, CellB),
			new BrailleSymbolDataEntry("c", LETTER, NOTHING, CellC),
			new BrailleSymbolDataEntry("d", LETTER, NOTHING, CellD),
			new BrailleSymbolDataEntry("e", LETTER, NOTHING, CellE),
			new BrailleSymbolDataEntry("f", LETTER, NOTHING, CellF),
			new BrailleSymbolDataEntry("g", LETTER, NOTHING, CellG),
			new BrailleSymbolDataEntry("h", LETTER, NOTHING, CellH),
			new BrailleSymbolDataEntry("i", LETTER, NOTHING, CellI),
			new BrailleSymbolDataEntry("j", LETTER, NOTHING, CellJ),
			new BrailleSymbolDataEntry("k", LETTER, NOTHING, CellK),
			new BrailleSymbolDataEntry("l", LETTER, NOTHING, CellL),
			new BrailleSymbolDataEntry("m", LETTER, NOTHING, CellM),
			new BrailleSymbolDataEntry("n", LETTER, NOTHING, CellN),
			new BrailleSymbolDataEntry("o", LETTER, NOTHING, CellO),
			new BrailleSymbolDataEntry("p", LETTER, NOTHING, CellP),
			new BrailleSymbolDataEntry("q", LETTER, NOTHING, CellQ),
			new BrailleSymbolDataEntry("r", LETTER, NOTHING, CellR),
			new BrailleSymbolDataEntry("s", LETTER, NOTHING, CellS),
			new BrailleSymbolDataEntry("t", LETTER, NOTHING, CellT),
			new BrailleSymbolDataEntry("u", LETTER, NOTHING, CellU),
			new BrailleSymbolDataEntry("v", LETTER, NOTHING, CellV),
			new BrailleSymbolDataEntry("w", LETTER, NOTHING, CellW),
			new BrailleSymbolDataEntry("x", LETTER, NOTHING, CellX),
			new BrailleSymbolDataEntry("y", LETTER, NOTHING, CellY),
			new BrailleSymbolDataEntry("z", LETTER, NOTHING, CellZ),
			new BrailleSymbolDataEntry("å", LETTER, NOTHING, CellCH), // [16]
			new BrailleSymbolDataEntry("ä", LETTER, NOTHING, CellAR), // [345]
			new BrailleSymbolDataEntry("ö", LETTER, NOTHING, CellOW), // [246]

			new BrailleSymbolDataEntry("é", LETTER, NOTHING, CellFOR), // [123456] Used in few Swedish words to prolong the e. Important but not part of the official Swedish alphabet.

			new BrailleSymbolDataEntry(" ", INVISIBLE, NOTHING, CellWhitespace),

			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_number_sign, NUMBER, SHOW_INFO, CellNumbersign).setExtraInfoRes(R.string.numbersExplanation).setFillWidth(true),
			new BrailleSymbolDataEntry("1", NUMBER, NOTHING, CellA),
			new BrailleSymbolDataEntry("2", NUMBER, NOTHING, CellB),
			new BrailleSymbolDataEntry("3", NUMBER, NOTHING, CellC),
			new BrailleSymbolDataEntry("4", NUMBER, NOTHING, CellD),
			new BrailleSymbolDataEntry("5", NUMBER, NOTHING, CellE),
			new BrailleSymbolDataEntry("6", NUMBER, NOTHING, CellF),
			new BrailleSymbolDataEntry("7", NUMBER, NOTHING, CellG),
			new BrailleSymbolDataEntry("8", NUMBER, NOTHING, CellH),
			new BrailleSymbolDataEntry("9", NUMBER, NOTHING, CellI),
			new BrailleSymbolDataEntry("0", NUMBER, NOTHING, CellJ),
			new BrailleSymbolDataEntry(",", R.string.braille_decimal_point, NUMBER, SHOW_LETTERS_REP, CellComma), // [2] comma 3,1415 (Decimal point used in Swedish texts)
			new BrailleSymbolDataEntry(".", R.string.braille_thousands_separator, NUMBER, SHOW_LETTERS_REP, CellApostrophe), // [3] Period (Used as decimal point in English texts, not in Swedish text) 3.1415

			new BrailleSymbolDataEntry("%", R.string.braille_percent, PUNCTUATION, SHOW_LETTERS_REP, CellTH), // [1456] Percent
			new BrailleSymbolDataEntry("‰", R.string.braille_permille, PUNCTUATION, SHOW_LETTERS_REP, CellTH, CellTH), // [1456] [1456] per mille
			new BrailleSymbolDataEntry("¢", R.string.braille_cent, PUNCTUATION, SHOW_LETTERS_REP, Cell45, CellC), // [45] [14] Cent
			new BrailleSymbolDataEntry("$", R.string.braille_dollar, PUNCTUATION, SHOW_LETTERS_REP, Cell45, CellS), // [45] [234] Dollar
			new BrailleSymbolDataEntry("€", R.string.braille_euro, PUNCTUATION, SHOW_LETTERS_REP, Cell45, CellE), // [45] [15] Euro
			new BrailleSymbolDataEntry("£", R.string.braille_poundsterling, PUNCTUATION, SHOW_LETTERS_REP, Cell45, CellL), // [45] [123] Brittish pound
			new BrailleSymbolDataEntry("¥", R.string.braille_yen, PUNCTUATION, SHOW_LETTERS_REP, Cell45, CellY), // [45] [13456] Japan yen
			new BrailleSymbolDataEntry("○", R.string.braille_degree, PUNCTUATION, SHOW_LETTERS_REP, CellER, CellG), // [12456] [1245] Degree sign
			new BrailleSymbolDataEntry("&", R.string.braille_ampersand, PUNCTUATION, SHOW_LETTERS_REP, CellAND), // [12346] And sign

			new BrailleSymbolDataEntry("©", R.string.braille_copyright, PUNCTUATION, SHOW_LETTERS_REP, CellQuestionmark, CellC, CellCloseQuote), // [236] [14] [356] Copyright sign
			new BrailleSymbolDataEntry("®", R.string.braille_rights_reserved, PUNCTUATION, SHOW_LETTERS_REP, CellQuestionmark, CellR, CellCloseQuote), // [236] [1235] [356] Rights reserved sign
			new BrailleSymbolDataEntry("™", R.string.braille_tm, PUNCTUATION, SHOW_LETTERS_REP, CellQuestionmark, CellT, CellR, CellCloseQuote), // [236] [2345] [134] [356] Trade mark sign

			new BrailleSymbolDataEntry("?", R.string.braille_questionmark, PUNCTUATION, SHOW_LETTERS_REP, CellEN), // [26]
			new BrailleSymbolDataEntry("!", R.string.braille_exclamationmark, PUNCTUATION, SHOW_LETTERS_REP, CellExclamationmark), // [235]
			new BrailleSymbolDataEntry(":", R.string.braille_colon, PUNCTUATION, SHOW_LETTERS_REP, CellColon), // [25]
			new BrailleSymbolDataEntry(";", R.string.braille_semicolon, PUNCTUATION, SHOW_LETTERS_REP, CellSemicolon), // [23]
			new BrailleSymbolDataEntry("/", R.string.braille_slash, PUNCTUATION, SHOW_LETTERS_REP, CellST), // [34] (also for division)
			//new BrailleSymbolDataEntry("\"", R.string.braille_quote, PUNCTUATION, SHOW_LETTERS_REP, Cell56), // [56] quote sign, also used for second and inch
			new BrailleSymbolDataEntry("“", R.string.braille_openquote, PUNCTUATION, SHOW_LETTERS_REP, Cell56), // [56] quote sign, also used for second and inch
			new BrailleSymbolDataEntry("”", R.string.braille_closequote, PUNCTUATION, SHOW_LETTERS_REP, Cell56), // [56] quote sign, also used for second and inch
			new BrailleSymbolDataEntry("’", R.string.braille_apostrophe, PUNCTUATION, SHOW_LETTERS_REP, Cell5), // [5], singe quote or minute or fot

			new BrailleSymbolDataEntry("-", R.string.braille_hyphen, PUNCTUATION, SHOW_LETTERS_REP, CellHyphen), // [36] (also for subtract)
			new BrailleSymbolDataEntry("–", R.string.braille_dash, PUNCTUATION, SHOW_LETTERS_REP, CellHyphen, CellHyphen), // [36] [36] Speech string

			new BrailleSymbolDataEntry("(", R.string.braille_openbracket, PUNCTUATION, SHOW_LETTERS_REP, CellQuestionmark), // [236]
			new BrailleSymbolDataEntry(")", R.string.braille_closebracket, PUNCTUATION, SHOW_LETTERS_REP, CellCloseQuote), // [356]
			new BrailleSymbolDataEntry("[", R.string.braille_opensquarebracket, PUNCTUATION, SHOW_LETTERS_REP, CellOF), // [12356]
			new BrailleSymbolDataEntry("]", R.string.braille_closesquarebracket, PUNCTUATION, SHOW_LETTERS_REP, CellWITH), // [23456]
			new BrailleSymbolDataEntry("{", R.string.braille_opencurlybrace, PUNCTUATION, SHOW_LETTERS_REP, CellCapitalsign, CellOF), // [6] [12356]
			new BrailleSymbolDataEntry("}", R.string.braille_closecurlybrace, PUNCTUATION, SHOW_LETTERS_REP, CellCapitalsign, CellWITH), // [6] [23456]

			new BrailleSymbolDataEntry("§", R.string.braille_paragraph, PUNCTUATION, SHOW_LETTERS_REP, CellING), // [346] paragraph. Must have a space after or else this enables super script mode
			new BrailleSymbolDataEntry("&", R.string.braille_ampersand, PUNCTUATION, SHOW_LETTERS_REP, CellOU), // [12346]
			new BrailleSymbolDataEntry("*", R.string.braille_asterisk, PUNCTUATION, SHOW_LETTERS_REP, CellIN), // [35]
			new BrailleSymbolDataEntry("†", R.string.braille_dagger, PUNCTUATION, SHOW_LETTERS_REP, Cell45, CellQuestionmark), // [45] [236] Cross
			new BrailleSymbolDataEntry("#", R.string.braille_hash, PUNCTUATION, SHOW_LETTERS_REP, Cell45, CellNumbersign), // [45] [3456] Number sign, square
			new BrailleSymbolDataEntry("@", R.string.braille_at, PUNCTUATION, SHOW_LETTERS_REP, Cell45, CellOF), // [45] [12356] At sign
			new BrailleSymbolDataEntry("\\", R.string.braille_backslash, PUNCTUATION, SHOW_LETTERS_REP, Cell45, CellST), // [45] [34] Backslash
			new BrailleSymbolDataEntry("_", R.string.braille_underscore, PUNCTUATION, SHOW_LETTERS_REP, Cell45, CellHyphen), // [45] [36] Underscore
			new BrailleSymbolDataEntry("|", R.string.braille_pipe, PUNCTUATION, SHOW_LETTERS_REP, Cell456), // [456]
			new BrailleSymbolDataEntry("~", R.string.braille_tilde, PUNCTUATION, SHOW_LETTERS_REP, Cell45, CellColon), // [45] [25]

			new BrailleSymbolDataEntry("•", R.string.braille_bullet, PUNCTUATION, SHOW_LETTERS_REP, CellFOR), // [123456] List character - bullet
			new BrailleSymbolDataEntry("◦", R.string.braille_bullet_white, PUNCTUATION, SHOW_LETTERS_REP, Cell4, CellFOR), // [4] [123456] List character - ring
			new BrailleSymbolDataEntry("▪", R.string.braille_bullet_square, PUNCTUATION, SHOW_LETTERS_REP, Cell45, CellFOR), // [45] [123456] List character - square

			// pre signs
			// new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  Cell45), // Pre [45] for various characters, currency, some diacritical signs, one list char, help parentheses
			// new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  Cell4), // Pre [4] for Diacritical signs used over letters. Used for writing in other languages than Swedish.
			// new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  Cell46), // Pre [46] for style
			// new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  Cell56), // Pre [56] for fonetic, greek lc letter
			// new BrailleSymbolDataEntry(NO_STRING, INVISIBLE,  CellER), // Pre [12456] for ·, ×, ○
			new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, NOTHING, CellING), // [346] super script mode. (ends with space)
			new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, NOTHING, CellGH), // [126] sub script mode (ends with space)
			new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, NOTHING, CellWH), // [156] Stop sign. End a mode. For modes that do not end at next space.

			// Three signs for capital mode
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capital, PUNCTUATION, SHOW_INFO, CellCapitalsign).setExtraInfoRes(R.string.capitalsignExplanation), // [6] Next character is a capital letter
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capitalword, PUNCTUATION, SHOW_INFO, CellCapitalsign, CellCapitalsign).setExtraInfoRes(R.string.capitalwordExplanation), // [6] [6] Capital mode as log as you have letters and -
			//new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, CellCapitalsign, CellCapitalsign, CellCapitalsign), // [6] [6] [6] Capital mode until stop sign

			// Numbers. Same as in english where a-i = 1-9, j=0.
			// The number sign activate the number mode. Then mode end on any other character but digits.
			new BrailleSymbolDataEntry("<", R.string.braille_less_than, MATHS, NOTHING, CellNumbersign, CellOW), // [3456] [246] (Number sign and ö) less than
			new BrailleSymbolDataEntry(">", R.string.braille_greater_than, MATHS, NOTHING, CellNumbersign, CellO), // [3456] [135] (Number sign and o) greater than

			// Mathematics
			new BrailleSymbolDataEntry("+", R.string.braille_add, MATHS, NOTHING, CellFullstop), // [256] add
			new BrailleSymbolDataEntry("=", R.string.braille_equal, MATHS, NOTHING, CellGG), // [2356] equals
			new BrailleSymbolDataEntry("·", R.string.braille_multiply_dot, MATHS, NOTHING, CellER, CellApostrophe), // [12456] [3] Multiplication sign with a dot (common) Example: 2,5 ⋅ 2,5 = 6,25
			new BrailleSymbolDataEntry("×", R.string.braille_multiply_cross, MATHS, NOTHING, CellER, CellX), // [12456] [1346] Multiplication sign with an x. Example: Magnification is 625x
			new BrailleSymbolDataEntry("──", R.string.braille_divide_line, MATHS, NOTHING, CellOU), // [1256] division (horizontal line)
			new BrailleSymbolDataEntry("√", R.string.braille_root, MATHS, NOTHING, CellSH), // [146] root sign

			// Short write - level 1 & 2. Short write text ends with a colon : [25].

			// Short write - Level 1. System is called K-75
			// One type: Shorten a whole word. Words can be really long in Swedish.

			new BrailleSymbolDataEntry("att", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellA), // [1] a. to (do something)
			new BrailleSymbolDataEntry("bli", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellB), // [12] b. become
			new BrailleSymbolDataEntry("och", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellC), // [14] c. and
			new BrailleSymbolDataEntry("där", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellD), // [145] d. there
			new BrailleSymbolDataEntry("eller", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellE), // [15] e. or
			new BrailleSymbolDataEntry("från", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellF), // [124] f. from
			new BrailleSymbolDataEntry("genom", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellG), // [1245] g. trough
			new BrailleSymbolDataEntry("han", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellH), // [125] h. he
			new BrailleSymbolDataEntry("jag", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellJ), // [134] j. I
			new BrailleSymbolDataEntry("kan", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellK), // [13] k. can
			new BrailleSymbolDataEntry("lika", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellL), // [123] l. like/same
			new BrailleSymbolDataEntry("man", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellM), // [134] m. you/man/one
			new BrailleSymbolDataEntry("när", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellN), // [1345] n. when
			new BrailleSymbolDataEntry("på", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellP), // [1234] p. on
			new BrailleSymbolDataEntry("under", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellQ), // [12345] q. under
			new BrailleSymbolDataEntry("har", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellR), // [1235] r. have
			new BrailleSymbolDataEntry("som", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellS), // [234] s. as
			new BrailleSymbolDataEntry("till", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellT), // [2345] t. to (a destination)
			new BrailleSymbolDataEntry("utan", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellU), // [136] u. without
			new BrailleSymbolDataEntry("vid", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellV), // [1236] v. by
			new BrailleSymbolDataEntry("vad", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellW), // [2456] w. what
			new BrailleSymbolDataEntry("över", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellX), // [1346] x. over
			new BrailleSymbolDataEntry("mycket", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellY), // [13456] y. much
			new BrailleSymbolDataEntry("efter", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellZ), // [1356] z. after
			new BrailleSymbolDataEntry("är", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellAR), // [345] ä. is

			new BrailleSymbolDataEntry("en", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellGH), // [126] a/one (a chair, en stol)
			new BrailleSymbolDataEntry("med", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellSH), // [146] with
			new BrailleSymbolDataEntry("er", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellWH), // [156] your
			new BrailleSymbolDataEntry("ett", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellING), // [346] a/one (a house, ett hus)
			new BrailleSymbolDataEntry("för", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellED), // [1246] for
			new BrailleSymbolDataEntry("inte", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellOU), // [1256] not
			new BrailleSymbolDataEntry("de", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellTH), // [1456] them
			new BrailleSymbolDataEntry("det", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellTHE), // [2346] that (det huset)
			new BrailleSymbolDataEntry("den", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellOU), // [12346] that (den stolen)
			new BrailleSymbolDataEntry("var", STANDALONE, SHORT_1, SHOW_USAGE_RULE, CellOF), // [12356] where

			// Short write - Level 2. System is called K-75
			// Three types: A. whole words, B. sound groups, C. shortened sound groups
			// A. Whole words

			new BrailleSymbolDataEntry("alla", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellA, CellA), // [1][1] aa. all/everyone
			new BrailleSymbolDataEntry("allas", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellA, CellA, CellS), // [1][1][234] aas. everyones
			new BrailleSymbolDataEntry("alltid", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellA, CellD), // [1][145] ad. always
			new BrailleSymbolDataEntry("aldrig", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellA, CellG), // [1] ag. never
			new BrailleSymbolDataEntry("allt", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellA, CellT), // [1] at. everything
			new BrailleSymbolDataEntry("alltför", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellA, CellT, CellED), // [1][2345][1246] at[1246]. too
			new BrailleSymbolDataEntry("allting", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellA, CellT, CellQuestionmark), // [1][2345][236] at[236]. everything
			new BrailleSymbolDataEntry("alltings", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellA, CellT, CellQuestionmark, CellS), // [1][2345][236][234] at[236]s. everything (including heaven and hell and outer space)
			new BrailleSymbolDataEntry("andra", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellA, CellW), // [1][2456] other
			new BrailleSymbolDataEntry("andras", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellA, CellW, CellS), // [1][2456][234] other peoples ...
			new BrailleSymbolDataEntry("alltså", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellA, CellCH), // [1][16] aå. that is / so

			new BrailleSymbolDataEntry("börja", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellB, CellJ), // [12][245] bj. start
			new BrailleSymbolDataEntry("början", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellB, CellJ, CellN), // [12][245][1345] bjn. the start
			new BrailleSymbolDataEntry("börjans", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellB, CellJ, CellN, CellS), // [12][245][1345][234] bjns. about the start
			new BrailleSymbolDataEntry("börjar", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellB, CellJ, CellR), // [12][245][1235] bjr. starting
			new BrailleSymbolDataEntry("börjat", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellB, CellJ, CellT), // [12][245][2345] bjt. have started
			new BrailleSymbolDataEntry("började", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellB, CellJ, CellTH), // [12][245][1456] bj[1456]. did start / it started
			new BrailleSymbolDataEntry("bland", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellB, CellL), // [12][123] bl. among
			new BrailleSymbolDataEntry("blir", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellB, CellR), // [12][1235] br. become
			new BrailleSymbolDataEntry("blev", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellB, CellV), // [12][1236] became

			new BrailleSymbolDataEntry("också", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellC, CellS), // [12][234] also

			new BrailleSymbolDataEntry("dess", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellD, CellS), // [145][234] its
			new BrailleSymbolDataEntry("dessa", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellD, CellS, CellA), // [145][234][1] dsa. those
			new BrailleSymbolDataEntry("dessas", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellD, CellS, CellA, CellS), // [145][234][1][234] dsas. thoses (that belong to them, it is thoses :-)

			new BrailleSymbolDataEntry("endast", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellE, CellA), // [15][1] only
			new BrailleSymbolDataEntry("henne", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellE, CellE), // [15][15] ee. her
			new BrailleSymbolDataEntry("hennes", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellE, CellE, CellS), // [15][15][234] ees. hers
			new BrailleSymbolDataEntry("emedan", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellE, CellM, CellD), // [15][134][145] emd. while
			new BrailleSymbolDataEntry("emellan", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellE, CellM, CellL), // [15][134][123] between
			new BrailleSymbolDataEntry("emellertid", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellE, CellM, CellT), // [15][134][2345] emt. however

			new BrailleSymbolDataEntry("fortfarande", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellF, CellO, CellF), // [124][135][124] emt. still

			new BrailleSymbolDataEntry("gång", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellG, CellG), // [1245][1245] gg. gangway
			new BrailleSymbolDataEntry("gångs", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellG, CellG, CellS), // [1245][1245][234] ggs. gangways
			new BrailleSymbolDataEntry("gångar", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellG, CellG, CellA, CellR), // [1245][1245][1][1235] ggar. tunnels (in general)
			new BrailleSymbolDataEntry("gångars", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellG, CellG, CellA, CellR, CellS), // [1245][1245][1][1235][234] ggar. tunnels (property)
			new BrailleSymbolDataEntry("gångarna", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellG, CellG, CellA, CellR, CellN, CellA), // [1245][1245][1][1235][1345][1] ggarna. the tunnels (in general)
			new BrailleSymbolDataEntry("gångarnas", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellG, CellG, CellA, CellR, CellN, CellA, CellS), // [1245][1245][1][1235][1345][1][234] ggarnas. the tunnels (property)
			new BrailleSymbolDataEntry("gången", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellG, CellG, CellWH), // [1245][1245][156] gg[156]. the tunnel
			new BrailleSymbolDataEntry("gångens", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellG, CellG, CellWH, CellS), // [1245][1245][156][234] gg[156]s. the tunnels (property)
			new BrailleSymbolDataEntry("gånger", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellG, CellG, CellWH), // [1245][1245][156] gg[156]. times (I have done it 5 times)
			new BrailleSymbolDataEntry("gångers", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellG, CellG, CellWH, CellS), // [1245][1245][156][234] gg[156]s. times (I will have 5 times suspension)
			new BrailleSymbolDataEntry("gångerna", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellG, CellG, CellWH, CellN, CellA), // [1245][1245][156][1345][1] gg[156]na. the times
			new BrailleSymbolDataEntry("gångernas", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellG, CellG, CellWH, CellN, CellA, CellS), // [1245][1245][156][1345][1][234] gg[156]nas. the times

			new BrailleSymbolDataEntry("hans", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellH, CellS), // [125][234] hs. his
			new BrailleSymbolDataEntry("hon", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellH, CellN), // [125][1345] hn. she
			new BrailleSymbolDataEntry("hade", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellH, CellTH), // [125][1456] h[1456]. had

			new BrailleSymbolDataEntry("inga", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellI, CellA), // [24][1] ia. none
			new BrailleSymbolDataEntry("ingas", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellI, CellA, CellS), // [24][1][234] ias. none (plural)
			new BrailleSymbolDataEntry("ingen", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellI, CellGH), // [24][126] i[126]. noone
			new BrailleSymbolDataEntry("ingens", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellI, CellGH, CellS), // [24][126][234] i[126]s. noone (plural)
			new BrailleSymbolDataEntry("inget", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellI, CellING), // [24][346] i[346]. nothing (abstract)
			new BrailleSymbolDataEntry("ingets", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellI, CellING, CellS), // [24][346][234] i[346]s. (abstract abstract)
			new BrailleSymbolDataEntry("ibland", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellI, CellB, CellL), // [24][12][123] ibl. sometimes.
			new BrailleSymbolDataEntry("ingenting", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellI, CellGH, CellT, CellQuestionmark), // [24][126][2345][236] i[126]t[236]. nothing (no thing)
			new BrailleSymbolDataEntry("igenom", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellI, CellG), // [13][1245] ig. trough

			new BrailleSymbolDataEntry("kanske", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellK, CellA), // [13][1] ka. perhaps
			new BrailleSymbolDataEntry("komma", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellK, CellM, CellA), // [13][134][1] kma. come
			new BrailleSymbolDataEntry("kommer", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellK, CellM, CellWH), // [13][134][156] km[156]. coming
			new BrailleSymbolDataEntry("kommit", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellK, CellM, CellT), // [13][134][2345] kmt. have came
			new BrailleSymbolDataEntry("kunna", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellK, CellN), // [13][1345] kn. can (I want to be able to come)
			new BrailleSymbolDataEntry("kunnat", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellK, CellN, CellT), // [13][1345][2345] knt. been able (I have known how to do that)
			new BrailleSymbolDataEntry("kunde", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellK, CellTH), // [13][1456] k[1456]. could (the I could)

			new BrailleSymbolDataEntry("liksom", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellL, CellS), // [123][234] ls. as well as

			new BrailleSymbolDataEntry("medan", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellM, CellD), // [134][145] md. while
			new BrailleSymbolDataEntry("många", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellM, CellG), // [134][1245] mg. many
			new BrailleSymbolDataEntry("mångas", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellM, CellG, CellS), // [134][1245][234] mgs. many (property)
			new BrailleSymbolDataEntry("mellan", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellM, CellL), // [134][123] ml. between
			new BrailleSymbolDataEntry("men", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellM, CellGH), // [134][126] m[126]. but
			new BrailleSymbolDataEntry("måste", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellM, CellOU), // [134][1256] m[1256]. have to

			new BrailleSymbolDataEntry("någon", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellN, CellN), // [1345][1345] nn. somenone
			new BrailleSymbolDataEntry("någons", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellN, CellN, CellS), // [1345][1345][234] nns. someones
			new BrailleSymbolDataEntry("någonting", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellN, CellN, CellT, CellQuestionmark), // [1345][1345][2345][236] nnt[236]. something
			new BrailleSymbolDataEntry("något", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellN, CellT), // [1345][2345] nt. something
			new BrailleSymbolDataEntry("naturligtvis", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellN, CellT, CellV), // [1345][2345][1236] ntv. of course
			new BrailleSymbolDataEntry("några", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellN, CellW), // [1345][2456] nw. some
			new BrailleSymbolDataEntry("någras", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellN, CellW, CellS), // [1345][2456][234] nws. some (plural)

			new BrailleSymbolDataEntry("olika", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellO, CellL), // [135] ol. different
			new BrailleSymbolDataEntry("honom", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellO, CellO), // [135][135] oo. him
			new BrailleSymbolDataEntry("omkring", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellO, CellQuestionmark), // [245] o[236]. around

			new BrailleSymbolDataEntry("redan", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellR, CellD), // [1235][145] rd. already

			new BrailleSymbolDataEntry("sedan", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellS, CellD), // [234][145] sd. since
			new BrailleSymbolDataEntry("själv", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellS, CellJ), // [234][245] sj. self (do)
			new BrailleSymbolDataEntry("själva", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellS, CellJ, CellA), // [234][245][1] sja. self (thing)
			new BrailleSymbolDataEntry("självt", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellS, CellJ, CellT), // [234][245][2345] sjt. self (by itself)
			new BrailleSymbolDataEntry("skall", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellS, CellK), // [234][13] sk. dog bark, or will do
			new BrailleSymbolDataEntry("skulle", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellS, CellL), // [234][123] sl. would do
			new BrailleSymbolDataEntry("sådan", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellS, CellN), // [234][1345] sn. such
			new BrailleSymbolDataEntry("sådana", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellS, CellN, CellA), // [234][1345][1] sna. such (specific plural)
			new BrailleSymbolDataEntry("sådant", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellS, CellN, CellT), // [234][1345][2345] snt. such (specific singular)
			new BrailleSymbolDataEntry("särskilt", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellS, CellAR), // [234][345] sä. specially

			new BrailleSymbolDataEntry("tills", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellT, CellS), // [2345][234] ts. until
			new BrailleSymbolDataEntry("tillbaka", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellT, CellB), // [2345][12] tb. back

			new BrailleSymbolDataEntry("vilka", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellV, CellK, CellA), // [1236][13][1] vka. who or what (plural)
			new BrailleSymbolDataEntry("vilkas", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellV, CellK, CellA, CellS), // [1236][13][1][234] vkas. who or what (plural property)
			new BrailleSymbolDataEntry("vilken", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellV, CellK, CellGH), // [1236][13][126] vk[126]. what (when selecting one)
			new BrailleSymbolDataEntry("vilkens", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellV, CellK, CellGH, CellS), // [1236][13][126][234] vk[126]s. what (when selecting one property)
			new BrailleSymbolDataEntry("vilket", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellV, CellK, CellING), // [1236][13][346] vk[346]. what (when you have selected one)
			new BrailleSymbolDataEntry("vilkets", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellV, CellK, CellING, CellS), // [1236][13][346][234] vk[346]s. what (when you have selected one property)
			new BrailleSymbolDataEntry("vill", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellV, CellL), // [1236][123] vl. want
			new BrailleSymbolDataEntry("ville", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellV, CellL, CellE), // [1236][123][15] vle. wanted
			new BrailleSymbolDataEntry("vad", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellW), // [2456] w. what (in general) or calf (muscle)

			new BrailleSymbolDataEntry("överallt", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellX, CellA, CellT), // [1346][1][2345] xat. all over the place

			new BrailleSymbolDataEntry("eftersom", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellZ, CellS), // [1356][234] zs. because or (we solve it over time)

			new BrailleSymbolDataEntry("ännu", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellAR, CellU), // [345][136] äu. still

			new BrailleSymbolDataEntry("före", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellED, CellE), // [1246][15] [1246]e. before
			new BrailleSymbolDataEntry("förr", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellED, CellR), // [1246][1235] [1246]r. previous (in time)
			new BrailleSymbolDataEntry("förra", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellED, CellR, CellA), // [1246][1235][1] [1246]ra. last (as in previous)
			new BrailleSymbolDataEntry("först", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellED, CellS, CellT), // [1246][234][2345] [1246]st. first
			new BrailleSymbolDataEntry("första", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellED, CellS, CellT, CellA), // [1246][234][2345][1] [1246]sta. the first
			new BrailleSymbolDataEntry("detta", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellTHE, CellT, CellA), // [2346][2345][1] [2346]ta. this
			new BrailleSymbolDataEntry("dettas", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellTHE, CellT, CellA, CellS), // [2346][2345][1][234] [2346]tas. this (property)
			new BrailleSymbolDataEntry("denna", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellOU, CellN, CellA), // [12346][1345][1] [12346]na. this (thing specific)
			new BrailleSymbolDataEntry("dennas", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellOU, CellN, CellA, CellS), // [12346][1345][1][234] [12346]nas. this (thing specific property)
			new BrailleSymbolDataEntry("vara", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellOF, CellA), // [12356][1] [12356]a. be
			new BrailleSymbolDataEntry("varit", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellOF, CellI, CellT), // [12356][24][2345] [12356]it. have been
			new BrailleSymbolDataEntry("varandra", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellOF, CellA, CellW), // [12356][1][2456] [12356]aw. each other (people)
			new BrailleSymbolDataEntry("varandras", STANDALONE, SHORT_2A, SHOW_USAGE_RULE, CellOF, CellA, CellW, CellS), // [12356][1][2456][234] [12356]aws. each other (people property). Hold each others hands.

			// Short write - Level 2. System is called K-75
			// Three types: A. whole words, B. sound groups, C. shortened sound groups
			// B. sound grooups - Rule is: Used as part of a word but must have normal letter(s) at -

			new BrailleSymbolDataEntry("ing", OPTIONAL_SURROUNDED_BOTHSIDES_ONLY_BY_PLAIN, SHORT_2B, SHOW_USAGE_RULE, CellQuestionmark), // [236] [236].
			new BrailleSymbolDataEntry("ingen", OPTIONAL_SURROUNDED_START_ONLY_BY_PLAIN, SHORT_2B, SHOW_USAGE_RULE, CellQuestionmark, CellGH), // [236][126] [236][126].
			new BrailleSymbolDataEntry("inger", OPTIONAL_SURROUNDED_START_ONLY_BY_PLAIN, SHORT_2B, SHOW_USAGE_RULE, CellQuestionmark, CellWH), // [236][156] [236][156].
			new BrailleSymbolDataEntry("inget", OPTIONAL_SURROUNDED_START_ONLY_BY_PLAIN, SHORT_2B, SHOW_USAGE_RULE, CellQuestionmark, CellING), // [236][346] [236][346].
			new BrailleSymbolDataEntry("de", OPTIONAL_SURROUNDED_BOTHSIDES_ONLY_BY_PLAIN, SHORT_2B, SHOW_USAGE_RULE, CellTH), // [1456] [1456].
			new BrailleSymbolDataEntry("det", OPTIONAL_SURROUNDED_BOTHSIDES_ONLY_BY_PLAIN, SHORT_2B, SHOW_USAGE_RULE, CellTHE), // [2346] [2346].
			new BrailleSymbolDataEntry("den", OPTIONAL_SURROUNDED_BOTHSIDES_ONLY_BY_PLAIN, SHORT_2B, SHOW_USAGE_RULE, CellOU), // [12346] [12346].

			// Short write - Level 2. System is called K-75
			// Three types: A. whole words, B. sound groups, C. shortened sound groups
			// C. shortened sound groups - Rule is: use stand alone.

			new BrailleSymbolDataEntry(new String[] {"bland annat","bl-a"}, STANDALONE, SHORT_2C, SHOW_USAGE_RULE, CellB, CellL, CellHyphen, CellA), // [15][123][36][1] bl-a. bland annat (among other)
			new BrailleSymbolDataEntry(new String[] {"det vill säga", "dvs"}, STANDALONE, SHORT_2C, SHOW_USAGE_RULE, CellD, CellV, CellS), // [145][1236][234] dvs. det vill säga (viz)
			new BrailleSymbolDataEntry(new String[] {"eller dylikt", "e-d"}, STANDALONE, SHORT_2C, SHOW_USAGE_RULE, CellE, CellHyphen, CellD), // [15][36][145] e-d. eller dylikt (etc)
			new BrailleSymbolDataEntry(new String[] {"före detta", "f-d"}, STANDALONE, SHORT_2C, SHOW_USAGE_RULE, CellF, CellHyphen, CellD), // [124][36][145] f-d. före detta (former)
			new BrailleSymbolDataEntry(new String[] {"för närvarande", "f-n"}, STANDALONE, SHORT_2C, SHOW_USAGE_RULE, CellF, CellHyphen, CellN), // [145][36][1345] f-n. för närvarande (present)
			new BrailleSymbolDataEntry(new String[] {"för övrigt", "f-ö"}, STANDALONE, SHORT_2C, SHOW_USAGE_RULE, CellF, CellHyphen, CellOW), // [124][36][246] f-ö. för övrigt (moreover)
			new BrailleSymbolDataEntry(new String[] {"med flera", "m-fl"}, STANDALONE, SHORT_2C, SHOW_USAGE_RULE, CellM, CellHyphen, CellF, CellL), // [134][36][124][123] m-fl. med flera (and others)
			new BrailleSymbolDataEntry(new String[] {"med mera", "m-m"}, STANDALONE, SHORT_2C, SHOW_USAGE_RULE, CellM, CellHyphen, CellM), // [134][36][134] m-m. med mera (etc)
			new BrailleSymbolDataEntry(new String[] {"och dylikt", "o-d"}, STANDALONE, SHORT_2C, SHOW_USAGE_RULE, CellO, CellHyphen, CellD), // [135][36][135] o-d. och dylikt (and the like)
			new BrailleSymbolDataEntry(new String[] {"och så vidare", "osv"}, STANDALONE, SHORT_2C, SHOW_USAGE_RULE, CellO, CellS, CellV), // [135][234][1236] osv. och så vidare (and so on)
			new BrailleSymbolDataEntry(new String[] {"så kallat", "s-k"}, STANDALONE, SHORT_2C, SHOW_USAGE_RULE, CellS, CellHyphen, CellK), // [234][36][13] s-k. så kallat (so called)
			new BrailleSymbolDataEntry(new String[] {"till exempel", "t-ex"}, STANDALONE, SHORT_2C, SHOW_USAGE_RULE, CellT, CellHyphen, CellE, CellX), // [2345][36][15][1346] t-ex. till exempel (for example)


			// Below is foreign signs. Used only for rare names and when writing in another language.

			// You could (not a requirement) use an indicator before and after foreign language text
			new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, NOTHING, Cell5, CellComma), // [5] [2]

			// Foreign letters used in names and foreign addresses
			new BrailleSymbolDataEntry("à", FOREIGN, NOTHING, CellOF), // [12356]
			new BrailleSymbolDataEntry("è", FOREIGN, NOTHING, CellTHE), // [2346]
			new BrailleSymbolDataEntry("ü", FOREIGN, NOTHING, CellOU), //  [1256] German y

			// More foreign letters used in names and foreign addresses
			new BrailleSymbolDataEntry("æ", FOREIGN, NOTHING, Cell4, CellAR), // [1] [15] or [4] [345] Danish ä
			new BrailleSymbolDataEntry("ø", FOREIGN, NOTHING, Cell4, CellO), // [246] or [4] [135] Danish ö
			new BrailleSymbolDataEntry("œ", FOREIGN, NOTHING, Cell4, CellOW), // [135] [15] or [4] [246] oe, can also be written with o and e.
			new BrailleSymbolDataEntry("ß", FOREIGN, NOTHING, Cell4, CellS), // [234] [234] or [4] [234] German double s. Can also be written with s and s.
			new BrailleSymbolDataEntry("ð", FOREIGN, NOTHING, Cell4, CellD), // [4] [145] Icelandic d with a sting (edh)
			new BrailleSymbolDataEntry("þ", FOREIGN, NOTHING, Cell4, CellT), // [4] [2345] Icelandic t (called thorn)

			// Characters used for writing in other languages
			new BrailleSymbolDataEntry("á", FOREIGN, NOTHING, Cell4, CellA), // [4] [1]
			new BrailleSymbolDataEntry("ç", FOREIGN, NOTHING, Cell4, CellC), // [4] [14]
			new BrailleSymbolDataEntry("ë", FOREIGN, NOTHING, Cell4, CellE), // [4] [15] Yes same as ė
			new BrailleSymbolDataEntry("ė", FOREIGN, NOTHING, Cell4, CellE), // [4] [15] Yes same as ë
			new BrailleSymbolDataEntry("ô", FOREIGN, NOTHING, Cell4, CellO), // [4] [135]
			new BrailleSymbolDataEntry("ř", FOREIGN, NOTHING, Cell4, CellR), // [4] [1235]
			new BrailleSymbolDataEntry("ū", FOREIGN, NOTHING, Cell4, CellU), // [4] [136]

			// Exact diacritical signs to be used before any letter. Like: á ç ë ė ô ř ū
			// Used for writing in other languages. Eleven symbols.
			new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, NOTHING, CellING, CellIN), // [346] [35] apostrophe forward above letter  ́
			new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, NOTHING, CellING, CellEN), // [346] [26] apostrophe backward above letter `
			new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, NOTHING, CellGH, CellComma), // [126] [2] cedilj under letter
			new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, NOTHING, CellING, CellExclamationmark), // [346] [235] circumflex over letter ^
			new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, NOTHING, CellING, CellGG), // [346] [2356] reveresed circumflex over letter ˇ
			new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, NOTHING, CellING, CellColon), // [346] [25] tilde over letter ~
			new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, NOTHING, CellING, CellSemicolon), // [346] [23] trema over letter ̈
			new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, NOTHING, CellING, CellHyphen), // [346] [36] line over letter ̄
			new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, NOTHING, CellGH, CellHyphen), // [126] [36] line under letter
			new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, NOTHING, CellING, CellApostrophe), // [346] [3] dot over letter
			new BrailleSymbolDataEntry(NO_STRING, INVISIBLE, NOTHING, CellGH, CellApostrophe), // [126] [3] dot under letter

			// Above diacritical signs again but now stand alone (Skipping this for now)

			// North Saami letters.
			new BrailleSymbolDataEntry("á", FOREIGN, NOTHING, CellOF), // [12356] a with forward apostrophe
			new BrailleSymbolDataEntry("č", FOREIGN, NOTHING, CellSH), // [146] c with reversed circumflex
			new BrailleSymbolDataEntry("đ", FOREIGN, NOTHING, CellTH), // [1456] stung d
			new BrailleSymbolDataEntry("ŋ", FOREIGN, NOTHING, CellED), // [1246] eng
			new BrailleSymbolDataEntry("š", FOREIGN, NOTHING, CellWH), // [156] s with reversed circumflex
			new BrailleSymbolDataEntry("ŧ", FOREIGN, NOTHING, CellOU), // [1256] stung t
			new BrailleSymbolDataEntry("ž", FOREIGN, NOTHING, CellTHE), // [2346] z with reversed circumflex

			// South Saami letters
			new BrailleSymbolDataEntry("ï", FOREIGN, NOTHING, CellST), // [34] i with trema

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

	};

	public BrailleSymbolDataEntry[] getAllSymbols()
	{
		return allSymbols;
	}

	public DictionaryCategory[] getDictionaryCategories()
	{
		return new DictionaryCategory[] {
				new DictionaryCategory(R.string.symbol_letter,0,"A",LETTER),
				new DictionaryCategory(R.string.symbol_number,4,"1",NUMBER),
				new DictionaryCategory(R.string.symbol_punctuation,6,"?",PUNCTUATION),
				new DictionaryCategory(R.string.symbol_short1, 8, "…1", SHORT_1).setTranslateToggle(true),
				new DictionaryCategory(R.string.category_short2, 12, "…2", SHORT_2A, SHORT_2B, SHORT_2C).setTranslateToggle(true),
				new DictionaryCategory(R.string.symbol_foreign, 15, "É",FOREIGN)};
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
