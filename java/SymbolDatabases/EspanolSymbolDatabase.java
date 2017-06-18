package com.lukeneedham.brailletutor.Braille.SymbolDatabases;

import com.lukeneedham.brailletutor.Braille.BrailleSymbolDataEntry;
import com.lukeneedham.brailletutor.Braille.DictionaryCategory;
import com.lukeneedham.brailletutor.R;

import static com.lukeneedham.brailletutor.Braille.BrailleCellDatabase.*;

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
    new BrailleSymbolDataEntry("ñ", LETTER,  CellER),//Special letter used for certain words
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
    
    //Accent and diactricit letters
    new BrailleSymbolDataEntry("á", LETTER,  CellOF),
    new BrailleSymbolDataEntry("é", LETTER,  CellTHE),
    new BrailleSymbolDataEntry("í", LETTER,  CellST),
    new BrailleSymbolDataEntry("ó", LETTER,  CellING),
    new BrailleSymbolDataEntry("ú", LETTER,  CellWITH),
    new BrailleSymbolDataEntry("ü", LETTER,  CellOU),

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

    new BrailleSymbolDataEntry(" ", INVISIBLE, CellWhitespace),

    new BrailleSymbolDataEntry(".", R.string.braille_fullstop, PUNCTUATION, CellFullstop),
    new BrailleSymbolDataEntry("?", R.string.braille_questionmark, PUNCTUATION, CellEN), //Different in Spanish
    new BrailleSymbolDataEntry("¿", R.string.braille_questionmark_inverse, PUNCTUATION, CellEN), //Different in Spanish
    new BrailleSymbolDataEntry("“", R.string.braille_openquote, PUNCTUATION, CellQuestionmark),
    new BrailleSymbolDataEntry("!", R.string.braille_exclamationmark, PUNCTUATION, CellExclamationmark), //Same as English
    new BrailleSymbolDataEntry("¡", R.string.braille_exclamationmark_inverse, PUNCTUATION, CellExclamationmark), //Same as English
    new BrailleSymbolDataEntry(",", R.string.braille_comma, PUNCTUATION, CellComma),
    new BrailleSymbolDataEntry(":", R.string.braille_colon, PUNCTUATION, CellColon),
    new BrailleSymbolDataEntry(";", R.string.braille_semicolon, PUNCTUATION, CellSemicolon),
    new BrailleSymbolDataEntry("'", R.string.braille_apostrophe, PUNCTUATION, CellApostrophe),
    new BrailleSymbolDataEntry("-", R.string.braille_hyphen, PUNCTUATION, CellHyphen),
    new BrailleSymbolDataEntry("”", R.string.braille_closequote, PUNCTUATION, CellCloseQuote),
    new BrailleSymbolDataEntry(NO_STRING, R.string.braille_lettersign, PUNCTUATION, Cell56),
    new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capital, PUNCTUATION, CellCapitalsign),
    new BrailleSymbolDataEntry(NO_STRING, R.string.braille_capitalword, PUNCTUATION, CellCapitalsign, CellCapitalsign),

    new BrailleSymbolDataEntry("*", R.string.braille_asterisk, PUNCTUATION, Cell5, CellIN),
    new BrailleSymbolDataEntry("(", R.string.braille_openbracket, PUNCTUATION, Cell5, CellGH),
    new BrailleSymbolDataEntry(")", R.string.braille_closebracket, PUNCTUATION, Cell5, CellAR),
    new BrailleSymbolDataEntry("/", R.string.braille_slash, PUNCTUATION, Cell456, CellST),

    new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots5, INVISIBLE, Cell5),
    new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots45, INVISIBLE, Cell45),
    new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots456, INVISIBLE, Cell456),

    new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots46, INVISIBLE, Cell46),
    new BrailleSymbolDataEntry(NO_STRING, R.string.braille_dots56, INVISIBLE, Cell56),
  };

  public BrailleSymbolDataEntry[] getAllSymbols() {return allSymbols;}

  public DictionaryCategory[] getDictionaryCategories()
  {
	  return new DictionaryCategory[] {
			  new DictionaryCategory(R.string.symbol_letter,0,LETTER),
			  new DictionaryCategory(R.string.symbol_number,4,NUMBER),
			  new DictionaryCategory(R.string.symbol_punctuation,6,PUNCTUATION)};
  }
}
