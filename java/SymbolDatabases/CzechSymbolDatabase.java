package com.lukeneedham.brailletutor.Braille.SymbolDatabases;

import com.lukeneedham.brailletutor.Braille.BrailleCellDatabase;
import com.lukeneedham.brailletutor.Braille.BrailleSymbolDataEntry;
import com.lukeneedham.brailletutor.Braille.DictionaryCategory;
import com.lukeneedham.brailletutor.R;

import static com.lukeneedham.brailletutor.Braille.BrailleCellDatabase.*;
import static com.lukeneedham.brailletutor.Braille.BrailleSymbolDataEntry.NOTHING;
import static com.lukeneedham.brailletutor.Braille.BrailleSymbolDataEntry.SHOW_INFO;
import static com.lukeneedham.brailletutor.Braille.BrailleSymbolDataEntry.SHOW_LETTERS_REP;

public class CzechSymbolDatabase extends BrailleSymbolDatabase
{
	/**
	 * make the array of all the entries in the database
	 * for each entry, make a new BrailleSymbolDataEntry object, and pass the relevant paramaters
	 * the available BrailleSymbolDataEntry constructors and neccessary paramaters can be seen in BrailleSymbolDataEntry.java
	 * the last paramter is BrailleCell... (ie varargs of BrailleCells, more here: http://stackoverflow.com/questions/1656901/varargs-and-the-argument if you need it)
	 * the cells are named after what they mean alone in UEB - cells with no independent meaning are named like 'Cell456' - the names be looked up with the search function in the app, or in BrailleCellDatabase.java
	 */

	private static final BrailleSymbolDataEntry[] allSymbols = {

			new BrailleSymbolDataEntry("a", LETTER, NOTHING, BrailleCellDatabase.Cell1),
			new BrailleSymbolDataEntry("b", LETTER, NOTHING, Cell12),
			new BrailleSymbolDataEntry("c", LETTER, NOTHING, Cell14),
			new BrailleSymbolDataEntry("d", LETTER, NOTHING, Cell145),
			new BrailleSymbolDataEntry("e", LETTER, NOTHING, Cell15),
			new BrailleSymbolDataEntry("f", LETTER, NOTHING, Cell124),
			new BrailleSymbolDataEntry("g", LETTER, NOTHING, Cell1245),
			new BrailleSymbolDataEntry("h", LETTER, NOTHING, Cell125),
			new BrailleSymbolDataEntry("i", LETTER, NOTHING, Cell24),
			new BrailleSymbolDataEntry("j", LETTER, NOTHING, Cell245),
			new BrailleSymbolDataEntry("k", LETTER, NOTHING, Cell13),
			new BrailleSymbolDataEntry("l", LETTER, NOTHING, Cell123),
			new BrailleSymbolDataEntry("m", LETTER, NOTHING, Cell134),
			new BrailleSymbolDataEntry("n", LETTER, NOTHING, Cell1345),
			new BrailleSymbolDataEntry("o", LETTER, NOTHING, Cell135),
			new BrailleSymbolDataEntry("p", LETTER, NOTHING, Cell1234),
			new BrailleSymbolDataEntry("q", LETTER, NOTHING, Cell12345),
			new BrailleSymbolDataEntry("r", LETTER, NOTHING, Cell1235),
			new BrailleSymbolDataEntry("s", LETTER, NOTHING, Cell234),
			new BrailleSymbolDataEntry("t", LETTER, NOTHING, Cell2345),
			new BrailleSymbolDataEntry("u", LETTER, NOTHING, Cell136),
			new BrailleSymbolDataEntry("v", LETTER, NOTHING, Cell1236),
			new BrailleSymbolDataEntry("w", LETTER, NOTHING, CellOF), // [12356]
			new BrailleSymbolDataEntry("x", LETTER, NOTHING, Cell1346),
			new BrailleSymbolDataEntry("y", LETTER, NOTHING, Cell13456),
			new BrailleSymbolDataEntry("z", LETTER, NOTHING, Cell1356),

			//Accent and diactricit letters
			new BrailleSymbolDataEntry("á", LETTER, NOTHING, CellCH), // [16]
			new BrailleSymbolDataEntry("č", LETTER, NOTHING, CellSH), // [146]
			new BrailleSymbolDataEntry("ď", LETTER, NOTHING, CellTH), // [1456]
			new BrailleSymbolDataEntry("é", LETTER, NOTHING, CellAR), // [345]
			new BrailleSymbolDataEntry("ě", LETTER, NOTHING, CellGH), // [126]
			new BrailleSymbolDataEntry("í", LETTER, NOTHING, CellST), // [34]
			new BrailleSymbolDataEntry("ň", LETTER, NOTHING, CellED), // [1246]
			new BrailleSymbolDataEntry("ó", LETTER, NOTHING, CellOW), // [246]
			new BrailleSymbolDataEntry("ř", LETTER, NOTHING, Cell2456), // [2456]
			new BrailleSymbolDataEntry("š", LETTER, NOTHING, CellWH), // [156]
			new BrailleSymbolDataEntry("ť", LETTER, NOTHING, CellOU), // [1256]
			new BrailleSymbolDataEntry("ú", LETTER, NOTHING, CellING), // [346]
			new BrailleSymbolDataEntry("ů", LETTER, NOTHING, CellWITH), // [23456]
			new BrailleSymbolDataEntry("ý", LETTER, NOTHING, CellAND), // [12346]
			new BrailleSymbolDataEntry("ž", LETTER, NOTHING, CellTHE), // [2346]


			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_number_sign, NUMBER, SHOW_INFO, CellNumbersign).setExtraInfo(R.string.numbersExplanation).setFillWidth(true),
			new BrailleSymbolDataEntry("1", NUMBER, NOTHING, BrailleCellDatabase.Cell1),
			new BrailleSymbolDataEntry("2", NUMBER, NOTHING, Cell12),
			new BrailleSymbolDataEntry("3", NUMBER, NOTHING, Cell14),
			new BrailleSymbolDataEntry("4", NUMBER, NOTHING, Cell145),
			new BrailleSymbolDataEntry("5", NUMBER, NOTHING, Cell15),
			new BrailleSymbolDataEntry("6", NUMBER, NOTHING, Cell124),
			new BrailleSymbolDataEntry("7", NUMBER, NOTHING, Cell1245),
			new BrailleSymbolDataEntry("8", NUMBER, NOTHING, Cell125),
			new BrailleSymbolDataEntry("9", NUMBER, NOTHING, Cell24),
			new BrailleSymbolDataEntry("0", NUMBER, NOTHING, Cell245),
			new BrailleSymbolDataEntry(".", R.string.braille_decimal_point, NUMBER, SHOW_LETTERS_REP, CellApostrophe), // [3]
			new BrailleSymbolDataEntry(",", R.string.braille_thousands_separator, NUMBER, SHOW_LETTERS_REP, CellComma),

			new BrailleSymbolDataEntry(" ", INVISIBLE, NOTHING, CellWhitespace),

			new BrailleSymbolDataEntry(".", R.string.braille_fullstop, PUNCTUATION, SHOW_LETTERS_REP, CellApostrophe),
			new BrailleSymbolDataEntry("?", R.string.braille_questionmark, PUNCTUATION, SHOW_LETTERS_REP, CellEN), // [26]
			new BrailleSymbolDataEntry("!", R.string.braille_exclamationmark, PUNCTUATION, SHOW_LETTERS_REP, CellExclamationmark),
			new BrailleSymbolDataEntry(",", R.string.braille_comma, PUNCTUATION, SHOW_LETTERS_REP, CellComma),
			new BrailleSymbolDataEntry(":", R.string.braille_colon, PUNCTUATION, SHOW_LETTERS_REP, CellColon),
			new BrailleSymbolDataEntry(";", R.string.braille_semicolon, PUNCTUATION, SHOW_LETTERS_REP, CellSemicolon),
			new BrailleSymbolDataEntry("'", R.string.braille_apostrophe, PUNCTUATION, SHOW_LETTERS_REP, Cell4), // [4]
			new BrailleSymbolDataEntry("-", R.string.braille_hyphen, PUNCTUATION, SHOW_LETTERS_REP, CellHyphen),
			new BrailleSymbolDataEntry("“", R.string.braille_openquote, PUNCTUATION, SHOW_LETTERS_REP, CellGG), // [56] quote sign, also used for second and inch
			new BrailleSymbolDataEntry("”", R.string.braille_closequote, PUNCTUATION, SHOW_LETTERS_REP, CellGG), // [56] quote sign, also used for second and inch
			//new BrailleSymbolDataEntry(NO_STRING, R.string.braille_lettersign, PUNCTUATION, SHOW_INFO, Cell5).setExtraInfo(R.string.lettersignExplanation), // [5]
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capital, PUNCTUATION, SHOW_INFO, CellCapitalsign).setExtraInfo(R.string.capitalsignExplanation),
			new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capitalword, PUNCTUATION, SHOW_INFO, Cell56).setExtraInfo(R.string.capitalwordExplanation), // [56]
			new BrailleSymbolDataEntry("*", R.string.braille_asterisk, PUNCTUATION, SHOW_LETTERS_REP, CellIN), // [35]
			new BrailleSymbolDataEntry("(", R.string.braille_openbracket, PUNCTUATION, SHOW_LETTERS_REP, CellQuestionmark), // [236]
			new BrailleSymbolDataEntry(")", R.string.braille_closebracket, PUNCTUATION, SHOW_LETTERS_REP, CellCloseQuote), // [356]
			new BrailleSymbolDataEntry("%", R.string.braille_percent, PUNCTUATION, SHOW_LETTERS_REP, CellNumbersign, Cell1234), // [3456][1234]
			new BrailleSymbolDataEntry("‰", R.string.braille_permille, PUNCTUATION, SHOW_LETTERS_REP, CellNumbersign, Cell1235), // [3456][1235]
			new BrailleSymbolDataEntry("§", R.string.braille_dollar, PUNCTUATION, SHOW_LETTERS_REP, CellNumbersign, CellING), // [3456][346]
			new BrailleSymbolDataEntry("|", R.string.braille_pipe, PUNCTUATION, SHOW_LETTERS_REP, Cell456), // [456]
			new BrailleSymbolDataEntry("/", R.string.braille_slash, PUNCTUATION, SHOW_LETTERS_REP, CellER)

	};

	public BrailleSymbolDataEntry[] getAllSymbols()
	{
		return allSymbols;
	}

	public DictionaryCategory[] getDictionaryCategories()
	{
		return new DictionaryCategory[]{
				new DictionaryCategory(R.string.symbol_letter, 0, "A", LETTER),
				new DictionaryCategory(R.string.symbol_number, 4, "1", NUMBER),
				new DictionaryCategory(R.string.symbol_punctuation, 6, "?", PUNCTUATION)
		};
	}
}
