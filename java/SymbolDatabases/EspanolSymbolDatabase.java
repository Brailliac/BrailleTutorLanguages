package com.lukeneedham.brailletutor.Braille.SymbolDatabases;

import com.lukeneedham.brailletutor.Braille.BrailleSymbolDataEntry;
import com.lukeneedham.brailletutor.Braille.DictionaryCategory;
import com.lukeneedham.brailletutor.R;

import static com.lukeneedham.brailletutor.Braille.BrailleCellDatabase.*;
import static com.lukeneedham.brailletutor.Braille.BrailleSymbolDataEntry.NOTHING;
import static com.lukeneedham.brailletutor.Braille.BrailleSymbolDataEntry.SHOW_INFO;
import static com.lukeneedham.brailletutor.Braille.BrailleSymbolDataEntry.SHOW_LETTERS_REP;

public class EspanolSymbolDatabase extends BrailleSymbolDatabase
{
  /**
  * make the array of all the entries in the database
  * for each entry, make a new BrailleSymbolDataEntry object, and pass the relevant paramaters
  * the available BrailleSymbolDataEntry constructors and neccessary paramaters can be seen in BrailleSymbolDataEntry.java
  * the last paramter is BrailleCell... (ie varargs of BrailleCells, more here: http://stackoverflow.com/questions/1656901/varargs-and-the-argument if you need it)
  * the cells are named after what they mean alone in UEB - cells with no independent meaning are named like 'Cell456' - the names be looked up with the search function in the app, or in BrailleCellDatabase.java
  */
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
    new BrailleSymbolDataEntry("ñ", LETTER, NOTHING, CellER),//Special letter used for certain words
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
    
    //Accent and diactricit letters
    new BrailleSymbolDataEntry("á", LETTER, NOTHING, CellOF),
    new BrailleSymbolDataEntry("é", LETTER, NOTHING, CellTHE),
    new BrailleSymbolDataEntry("í", LETTER, NOTHING, CellST),
    new BrailleSymbolDataEntry("ó", LETTER, NOTHING, CellING),
    new BrailleSymbolDataEntry("ú", LETTER, NOTHING, CellWITH),
    new BrailleSymbolDataEntry("ü", LETTER, NOTHING, CellOU),

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
    new BrailleSymbolDataEntry("?", R.string.braille_questionmark, PUNCTUATION, SHOW_LETTERS_REP, CellEN), //Different in Spanish
    new BrailleSymbolDataEntry("¿", R.string.braille_questionmark_inverse, PUNCTUATION, SHOW_LETTERS_REP, CellEN), //Different in Spanish
    new BrailleSymbolDataEntry("“", R.string.braille_openquote, PUNCTUATION, SHOW_LETTERS_REP, CellQuestionmark),
    new BrailleSymbolDataEntry("!", R.string.braille_exclamationmark, PUNCTUATION, SHOW_LETTERS_REP, CellExclamationmark), //Same as English
    new BrailleSymbolDataEntry("¡", R.string.braille_exclamationmark_inverse, PUNCTUATION, SHOW_LETTERS_REP, CellExclamationmark), //Same as English
    new BrailleSymbolDataEntry(",", R.string.braille_comma, PUNCTUATION, SHOW_LETTERS_REP, CellComma),
    new BrailleSymbolDataEntry(":", R.string.braille_colon, PUNCTUATION, SHOW_LETTERS_REP, CellColon),
    new BrailleSymbolDataEntry(";", R.string.braille_semicolon, PUNCTUATION, SHOW_LETTERS_REP, CellSemicolon),
    new BrailleSymbolDataEntry("'", R.string.braille_apostrophe, PUNCTUATION, SHOW_LETTERS_REP, CellApostrophe),
    new BrailleSymbolDataEntry("-", R.string.braille_hyphen, PUNCTUATION, SHOW_LETTERS_REP, CellHyphen),
    new BrailleSymbolDataEntry("”", R.string.braille_closequote, PUNCTUATION, SHOW_LETTERS_REP, CellCloseQuote),
    new BrailleSymbolDataEntry(NO_STRING, R.string.braille_lettersign, PUNCTUATION, SHOW_LETTERS_REP, Cell56),
    new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capital, PUNCTUATION, SHOW_LETTERS_REP, CellCapitalsign),
    new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capitalword, PUNCTUATION, SHOW_LETTERS_REP, CellCapitalsign, CellCapitalsign),

    new BrailleSymbolDataEntry("*", R.string.braille_asterisk, PUNCTUATION, SHOW_LETTERS_REP, Cell5, CellIN),
    new BrailleSymbolDataEntry("(", R.string.braille_openbracket, PUNCTUATION, SHOW_LETTERS_REP, Cell5, CellGH),
    new BrailleSymbolDataEntry(")", R.string.braille_closebracket, PUNCTUATION, SHOW_LETTERS_REP, Cell5, CellAR),
    new BrailleSymbolDataEntry("/", R.string.braille_slash, PUNCTUATION, SHOW_LETTERS_REP, Cell456, CellST),

    new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots5, INVISIBLE, NOTHING, Cell5),
    new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots45, INVISIBLE, NOTHING, Cell45),
    new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots456, INVISIBLE, NOTHING, Cell456),

    new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots46, INVISIBLE, NOTHING, Cell46),
    new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots56, INVISIBLE, NOTHING, Cell56),
  };

  public BrailleSymbolDataEntry[] getAllSymbols() {return allSymbols;}

  public DictionaryCategory[] getDictionaryCategories()
  {
	  return new DictionaryCategory[] {
			  new DictionaryCategory(R.string.symbol_letter,0,"A",LETTER),
			  new DictionaryCategory(R.string.symbol_number,4,"1",NUMBER),
			  new DictionaryCategory(R.string.symbol_punctuation,6,"?",PUNCTUATION)};
  }
}
