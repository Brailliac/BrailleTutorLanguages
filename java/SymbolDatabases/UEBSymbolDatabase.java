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

public class UEBSymbolDatabase extends BrailleSymbolDatabase
{
	/**
	 * make the array of all the entries in the database
	 * for each entry, make a new BrailleSymbolDataEntry object, and pass the relevant paramaters
	 * the available BrailleSymbolDataEntry constructors and neccessary paramaters can be seen in BrailleSymbolDataEntry.java
	 * the last paramter is BrailleCell... (ie varargs of BrailleCells, more here: http://stackoverflow.com/questions/1656901/varargs-and-the-argument if you need it)
	 * the cells are named after what they mean alone in UEB - cells with no independent meaning are named like 'Cell456' - the names be looked up with the search function in the app, or in BrailleCellDatabase.java
	 */

	public static final BrailleSymbolType WORDSIGN = new BrailleSymbolType(R.string.symbol_wordsign, R.string.symbol_wordsign_desc);
	public static final BrailleSymbolType GROUPSIGN = new BrailleSymbolType(R.string.symbol_groupsign, R.string.symbol_groupsign_desc);
	public static final BrailleSymbolType INITIALLETTERCONTRACTION = new BrailleSymbolType(R.string.symbol_initiallettercontraction, R.string.symbol_initiallettercontraction_desc);
	public static final BrailleSymbolType FINALLETTERCONTRACTION = new BrailleSymbolType(R.string.symbol_finallettercontraction, R.string.symbol_finallettercontraction_desc);
	public static final BrailleSymbolType SHORTFORM = new BrailleSymbolType(R.string.symbol_shortform, R.string.symbol_shortform_desc);

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
			new BrailleSymbolDataEntry(".", R.string.braille_decimal_point, NUMBER, SHOW_LETTERS_REP, CellFullstop),
			new BrailleSymbolDataEntry(",", R.string.braille_thousands_separator, NUMBER, SHOW_LETTERS_REP, CellComma),

			new BrailleSymbolDataEntry(" ", INVISIBLE, NOTHING, CellWhitespace),

			new BrailleSymbolDataEntry(".", R.string.braille_fullstop, PUNCTUATION, SHOW_LETTERS_REP, CellFullstop),
			new BrailleSymbolDataEntry("?", R.string.braille_questionmark, PUNCTUATION, SHOW_LETTERS_REP, CellQuestionmark),
			new BrailleSymbolDataEntry("!", R.string.braille_exclamationmark, PUNCTUATION, SHOW_LETTERS_REP, CellExclamationmark),
			new BrailleSymbolDataEntry(",", R.string.braille_comma, PUNCTUATION, SHOW_LETTERS_REP, CellComma),
			new BrailleSymbolDataEntry(":", R.string.braille_colon, PUNCTUATION, SHOW_LETTERS_REP, CellColon),
			new BrailleSymbolDataEntry(";", R.string.braille_semicolon, PUNCTUATION, SHOW_LETTERS_REP, CellSemicolon),
			new BrailleSymbolDataEntry("'", R.string.braille_apostrophe, PUNCTUATION, SHOW_LETTERS_REP, CellApostrophe),
			new BrailleSymbolDataEntry("-", R.string.braille_hyphen, PUNCTUATION, SHOW_LETTERS_REP, CellHyphen),
			new BrailleSymbolDataEntry("“", R.string.braille_openquote, PUNCTUATION, SHOW_LETTERS_REP, CellQuestionmark),
			new BrailleSymbolDataEntry("”", R.string.braille_closequote, PUNCTUATION, SHOW_LETTERS_REP, CellCloseQuote),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_lettersign, PUNCTUATION, SHOW_INFO, Cell56).setExtraInfoRes(R.string.lettersignExplanation),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capital, PUNCTUATION, SHOW_INFO, CellCapitalsign).setExtraInfoRes(R.string.capitalsignExplanation),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capitalword, PUNCTUATION, SHOW_INFO, CellCapitalsign, CellCapitalsign).setExtraInfoRes(R.string.capitalwordExplanation),
			new BrailleSymbolDataEntry("*", R.string.braille_asterisk, PUNCTUATION, SHOW_LETTERS_REP, Cell5, CellIN),
			new BrailleSymbolDataEntry("(", R.string.braille_openbracket, PUNCTUATION, SHOW_LETTERS_REP, Cell5, CellGH),
			new BrailleSymbolDataEntry(")", R.string.braille_closebracket, PUNCTUATION, SHOW_LETTERS_REP, Cell5, CellAR),
			new BrailleSymbolDataEntry("/", R.string.braille_slash, PUNCTUATION, SHOW_LETTERS_REP, Cell456, CellST),

			new BrailleSymbolDataEntry("but", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellB),
			new BrailleSymbolDataEntry("can", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellC),
			new BrailleSymbolDataEntry("do", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellD),
			new BrailleSymbolDataEntry("every", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellE),
			new BrailleSymbolDataEntry("from", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellF),
			new BrailleSymbolDataEntry("go", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellG),
			new BrailleSymbolDataEntry("have", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellH),
			new BrailleSymbolDataEntry("just", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellJ),
			new BrailleSymbolDataEntry("knowledge", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellK),
			new BrailleSymbolDataEntry("like", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellL),
			new BrailleSymbolDataEntry("more", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellM),
			new BrailleSymbolDataEntry("not", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellN),
			new BrailleSymbolDataEntry("people", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellP),
			new BrailleSymbolDataEntry("quite", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellQ),
			new BrailleSymbolDataEntry("rather", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellR),
			new BrailleSymbolDataEntry("so", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellS),
			new BrailleSymbolDataEntry("that", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellT),
			new BrailleSymbolDataEntry("us", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellU),
			new BrailleSymbolDataEntry("very", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellV),
			new BrailleSymbolDataEntry("will", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellW),
			new BrailleSymbolDataEntry("it", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellX),
			new BrailleSymbolDataEntry("you", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellY),
			new BrailleSymbolDataEntry("as", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellZ),

			new BrailleSymbolDataEntry("gg", SURROUNDED, GROUPSIGN, SHOW_USAGE_RULE, CellGG),
			new BrailleSymbolDataEntry("were", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellGG),
			new BrailleSymbolDataEntry("st", GROUPSIGN, SHOW_USAGE_RULE, CellST),
			new BrailleSymbolDataEntry("still", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellST),
			new BrailleSymbolDataEntry("ch", GROUPSIGN, SHOW_USAGE_RULE, CellCH),
			new BrailleSymbolDataEntry("child", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellCH),
			new BrailleSymbolDataEntry("gh", GROUPSIGN, SHOW_USAGE_RULE, CellGH),
			new BrailleSymbolDataEntry("sh", GROUPSIGN, SHOW_USAGE_RULE, CellSH),
			new BrailleSymbolDataEntry("shall", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellSH),
			new BrailleSymbolDataEntry("th", GROUPSIGN, SHOW_USAGE_RULE, CellTH),
			new BrailleSymbolDataEntry("this", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellTH),
			new BrailleSymbolDataEntry("wh", GROUPSIGN, SHOW_USAGE_RULE, CellWH),
			new BrailleSymbolDataEntry("which", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellWH),
			new BrailleSymbolDataEntry("ed", GROUPSIGN, SHOW_USAGE_RULE, CellED),
			new BrailleSymbolDataEntry("er", GROUPSIGN, SHOW_USAGE_RULE, CellER),
			new BrailleSymbolDataEntry("ou", GROUPSIGN, SHOW_USAGE_RULE, CellOU),
			new BrailleSymbolDataEntry("out", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellOU),
			new BrailleSymbolDataEntry("ow", GROUPSIGN, SHOW_USAGE_RULE, CellOW),
			new BrailleSymbolDataEntry("en", GROUPSIGN, SHOW_USAGE_RULE, CellEN),
			new BrailleSymbolDataEntry("enough", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellEN),
			new BrailleSymbolDataEntry("ing", NOT_AT_START, GROUPSIGN, SHOW_USAGE_RULE, CellING),
			new BrailleSymbolDataEntry("ar", GROUPSIGN, SHOW_USAGE_RULE, CellAR),
			new BrailleSymbolDataEntry("in", GROUPSIGN, SHOW_USAGE_RULE, CellIN),

			new BrailleSymbolDataEntry("and", GROUPSIGN, SHOW_USAGE_RULE, CellAND),
			new BrailleSymbolDataEntry("for", GROUPSIGN, SHOW_USAGE_RULE, CellFOR),
			new BrailleSymbolDataEntry("of", GROUPSIGN, SHOW_USAGE_RULE, CellOF),
			new BrailleSymbolDataEntry("the", GROUPSIGN, SHOW_USAGE_RULE, CellTHE),
			new BrailleSymbolDataEntry("with", GROUPSIGN, SHOW_USAGE_RULE, CellWITH),

			new BrailleSymbolDataEntry("dis", FIRST_SYLLABLE, GROUPSIGN, SHOW_USAGE_RULE, CellFullstop),
			new BrailleSymbolDataEntry("his", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellQuestionmark),
			new BrailleSymbolDataEntry("ff", SURROUNDED, GROUPSIGN, SHOW_USAGE_RULE, CellExclamationmark),
			new BrailleSymbolDataEntry("ea", SURROUNDED, GROUPSIGN, SHOW_USAGE_RULE, CellComma),
			new BrailleSymbolDataEntry("con", FIRST_SYLLABLE, GROUPSIGN, SHOW_USAGE_RULE, CellColon),
			new BrailleSymbolDataEntry("cc", SURROUNDED, GROUPSIGN, SHOW_USAGE_RULE, CellColon),
			new BrailleSymbolDataEntry("bb", SURROUNDED, GROUPSIGN, SHOW_USAGE_RULE, CellSemicolon),
			new BrailleSymbolDataEntry("be", FIRST_SYLLABLE, GROUPSIGN, SHOW_USAGE_RULE, CellSemicolon),
			new BrailleSymbolDataEntry("was", STANDALONE, WORDSIGN, SHOW_USAGE_RULE, CellCloseQuote),

			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots5, INVISIBLE, NOTHING, Cell5),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots45, INVISIBLE, NOTHING, Cell45),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots456, INVISIBLE, NOTHING, Cell456),

			new BrailleSymbolDataEntry("upon", ORIGINAL_MEANING_RETAINED, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell45, CellU),
			new BrailleSymbolDataEntry("these", ORIGINAL_MEANING_RETAINED, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell45, CellTHE),
			new BrailleSymbolDataEntry("those", ORIGINAL_MEANING_RETAINED, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell45, CellTH),
			new BrailleSymbolDataEntry("whose", ORIGINAL_MEANING_RETAINED, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell45, CellWH),
			new BrailleSymbolDataEntry("word", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell45, CellW),

			new BrailleSymbolDataEntry("cannot", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell456, CellC),
			new BrailleSymbolDataEntry("had", SHORT_A, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell456, CellH),
			new BrailleSymbolDataEntry("many", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell456, CellM),
			new BrailleSymbolDataEntry("spirit", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell456, CellS),
			new BrailleSymbolDataEntry("their", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell456, CellTHE),
			new BrailleSymbolDataEntry("world", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell456, CellW),

			new BrailleSymbolDataEntry("day", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellD),
			new BrailleSymbolDataEntry("ever", STRESS_ON_FIRST_E_AND_NOT_AFTER_I_OR_E, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellE),
			new BrailleSymbolDataEntry("father", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellF),
			new BrailleSymbolDataEntry("here", ONE_SYLLABLE, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellH),
			new BrailleSymbolDataEntry("know", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellK),
			new BrailleSymbolDataEntry("lord", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellL),
			new BrailleSymbolDataEntry("mother", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellM),
			new BrailleSymbolDataEntry("name", ONE_SYLLABLE, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellN),
			new BrailleSymbolDataEntry("one", ONE_SYLLABLE_OR_END_WITH_ONEY_BUT_NEVER_AFTER_O, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellO),
			new BrailleSymbolDataEntry("part", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellP),
			new BrailleSymbolDataEntry("question", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellQ),
			new BrailleSymbolDataEntry("right", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellR),
			new BrailleSymbolDataEntry("some", ONE_SYLLABLE, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellS),
			new BrailleSymbolDataEntry("time", ORIGINAL_PRONOUNCIATION_RETAINED, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellT),
			new BrailleSymbolDataEntry("under", NOT_AFTER_A_OR_O_AND_UN_NOT_A_PREFIX, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellU),
			new BrailleSymbolDataEntry("young", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellY),
			new BrailleSymbolDataEntry("there", ORIGINAL_MEANING_RETAINED, INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellTHE),
			new BrailleSymbolDataEntry("character", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellCH),
			new BrailleSymbolDataEntry("through", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellTH),
			new BrailleSymbolDataEntry("where", INITIALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell5, CellWH),

			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots46, INVISIBLE, NOTHING, Cell46),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots56, INVISIBLE, NOTHING, Cell56),

			new BrailleSymbolDataEntry("ound", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell46, CellD),
			new BrailleSymbolDataEntry("ance", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell46, CellE),
			new BrailleSymbolDataEntry("sion", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell46, CellN),
			new BrailleSymbolDataEntry("less", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell46, CellS),
			new BrailleSymbolDataEntry("ount", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell46, CellT),

			new BrailleSymbolDataEntry("ence", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell56, CellE),
			new BrailleSymbolDataEntry("ong", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell56, CellG),
			new BrailleSymbolDataEntry("ful", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell56, CellL),
			new BrailleSymbolDataEntry("tion", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell56, CellN),
			new BrailleSymbolDataEntry("ness", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell56, CellS),
			new BrailleSymbolDataEntry("ment", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell56, CellT),
			new BrailleSymbolDataEntry("ity", NOT_AT_START, FINALLETTERCONTRACTION, SHOW_USAGE_RULE, Cell56, CellY),

			new BrailleSymbolDataEntry("about", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellA, CellB),
			new BrailleSymbolDataEntry("above", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellA, CellB, CellV),
			new BrailleSymbolDataEntry("according", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellA, CellC),
			new BrailleSymbolDataEntry("across", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellA, CellC, CellR),
			new BrailleSymbolDataEntry("after", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellA, CellF),
			new BrailleSymbolDataEntry("afternoon", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellA, CellF, CellN),
			new BrailleSymbolDataEntry("afterward", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellA, CellF, CellW),
			new BrailleSymbolDataEntry("again", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellA, CellG),
			new BrailleSymbolDataEntry("against", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellA, CellG, CellST),
			new BrailleSymbolDataEntry("also", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellA, CellL),
			new BrailleSymbolDataEntry("almost", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellA, CellL, CellM),
			new BrailleSymbolDataEntry("already", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellA, CellL, CellR),
			new BrailleSymbolDataEntry("altogether", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellA, CellL, CellT),
			new BrailleSymbolDataEntry("although", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellA, CellL, CellTH),
			new BrailleSymbolDataEntry("always", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellA, CellL, CellW),
			new BrailleSymbolDataEntry("blind", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellB, CellL),
			new BrailleSymbolDataEntry("braille", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellB, CellR, CellL),
			new BrailleSymbolDataEntry("could", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellC, CellD),
			new BrailleSymbolDataEntry("declare", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellD, CellC, CellL),
			new BrailleSymbolDataEntry("declaring", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellD, CellC, CellL, CellG),
			new BrailleSymbolDataEntry("deceive", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellD, CellC, CellV),
			new BrailleSymbolDataEntry("deceiving", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellD, CellC, CellV, CellG),
			new BrailleSymbolDataEntry("either", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellE, CellI),
			new BrailleSymbolDataEntry("friend", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellF, CellR),
			new BrailleSymbolDataEntry("first", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellF, CellST),
			new BrailleSymbolDataEntry("good", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellG, CellD),
			new BrailleSymbolDataEntry("great", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellG, CellR, CellT),
			new BrailleSymbolDataEntry("him", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellH, CellM),
			new BrailleSymbolDataEntry("himself", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellH, CellM, CellF),
			new BrailleSymbolDataEntry("herself", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellH, CellER, CellF),
			new BrailleSymbolDataEntry("immediate", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellI, CellM, CellM),
			new BrailleSymbolDataEntry("little", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellL, CellL),
			new BrailleSymbolDataEntry("letter", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellL, CellR),
			new BrailleSymbolDataEntry("myself", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellM, CellY, CellF),
			new BrailleSymbolDataEntry("much", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellM, CellCH),
			new BrailleSymbolDataEntry("must", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellM, CellST),
			new BrailleSymbolDataEntry("necessary", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellN, CellE, CellC),
			new BrailleSymbolDataEntry("neither", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellN, CellE, CellI),
			new BrailleSymbolDataEntry("paid", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellP, CellD),
			new BrailleSymbolDataEntry("perceive", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellP, CellER, CellC, CellV),
			new BrailleSymbolDataEntry("perceiving", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellP, CellER, CellC, CellV, CellG),
			new BrailleSymbolDataEntry("perhaps", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellP, CellER, CellH),
			new BrailleSymbolDataEntry("quick", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellQ, CellK),
			new BrailleSymbolDataEntry("receive", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellR, CellC, CellV),
			new BrailleSymbolDataEntry("receiving", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellR, CellC, CellV, CellG),
			new BrailleSymbolDataEntry("rejoice", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellR, CellJ, CellC),
			new BrailleSymbolDataEntry("rejoicing", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellR, CellJ, CellC, CellG),
			new BrailleSymbolDataEntry("said", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellS, CellD),
			new BrailleSymbolDataEntry("such", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellS, CellCH),
			new BrailleSymbolDataEntry("today", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellT, CellD),
			new BrailleSymbolDataEntry("together", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellT, CellG, CellR),
			new BrailleSymbolDataEntry("tomorrow", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellT, CellM),
			new BrailleSymbolDataEntry("tonight", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellT, CellN),
			new BrailleSymbolDataEntry("itself", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellX, CellF),
			new BrailleSymbolDataEntry("its", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellX, CellS),
			new BrailleSymbolDataEntry("your", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellY, CellR),
			new BrailleSymbolDataEntry("yourself", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellY, CellR, CellF),
			new BrailleSymbolDataEntry("yourselves", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellY, CellR, CellV, CellS),
			new BrailleSymbolDataEntry("themselves", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellTHE, CellM, CellV, CellS),
			new BrailleSymbolDataEntry("children", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellCH, CellN),
			new BrailleSymbolDataEntry("should", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellSH, CellD),
			new BrailleSymbolDataEntry("thyself", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellTH, CellY, CellF),
			new BrailleSymbolDataEntry("ourselves", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellOU, CellR, CellV, CellS),
			new BrailleSymbolDataEntry("would", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellW, CellD),
			new BrailleSymbolDataEntry("because", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellSemicolon, CellC),
			new BrailleSymbolDataEntry("before", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellSemicolon, CellF),
			new BrailleSymbolDataEntry("behind", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellSemicolon, CellH),
			new BrailleSymbolDataEntry("below", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellSemicolon, CellL),
			new BrailleSymbolDataEntry("beneath", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellSemicolon, CellN),
			new BrailleSymbolDataEntry("beside", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellSemicolon, CellS),
			new BrailleSymbolDataEntry("between", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellSemicolon, CellT),
			new BrailleSymbolDataEntry("beyond", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellSemicolon, CellY),
			new BrailleSymbolDataEntry("conceive", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellColon, CellC, CellV),
			new BrailleSymbolDataEntry("conceiving", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, CellColon, CellC, CellV, CellG),
			new BrailleSymbolDataEntry("oneself", STANDALONE, SHORTFORM, SHOW_USAGE_RULE, Cell5, CellO, CellF)
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
				new DictionaryCategory(R.string.category_contractions, 8, "~",GROUPSIGN, WORDSIGN).setTranslateToggle(true),
				new DictionaryCategory(R.string.category_advancedcontractions, 12, "~+",INITIALLETTERCONTRACTION, FINALLETTERCONTRACTION).setTranslateToggle(true),
				new DictionaryCategory(R.string.symbol_shortform, 15, "…", SHORTFORM).setTranslateToggle(true)};
	}
}