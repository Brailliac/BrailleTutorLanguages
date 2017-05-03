package com.lukeneedham.brailletutor.Braille;

/**
 * Created by Luke on 30/07/2016.
 */
public class BrailleSymbolDataEntry
{
    private final BrailleSymbol symbol; // store the list of cells and encapsulate methods on them
    private String lettersRepresented; // the literal ascii to be read when reading this symbol - like "and", "?". Use NO_STRING when the symbol has to literal meaning (modifiers)
    private int descriptiveNameRes = -1; // the descriptive title of the symbol - like "Question mark" - should be an int referencing the value in strings.xml
    private BrailleSymbolUsageRule ruleForUsage = BrailleSymbolUsageRule.ANYWHERE; // rule for where the symbol can be used
    private BrailleSymbolType type = BrailleSymbolType.LETTER; // type of symbol

    public BrailleSymbolDataEntry(String nameIn, BrailleSymbolType typeIn, BrailleCell... cellsIn)
    {
        symbol = new BrailleSymbol(cellsIn);
        lettersRepresented = nameIn;
        type = typeIn;
    }

    public BrailleSymbolDataEntry(String nameIn, BrailleSymbolUsageRule ruleForUsageIn, BrailleSymbolType typeIn, BrailleCell... cellsIn)
    {
        symbol = new BrailleSymbol(cellsIn);
        lettersRepresented = nameIn;
        ruleForUsage = ruleForUsageIn;
        type = typeIn;
    }

    public BrailleSymbolDataEntry(String nameIn, int descRes, BrailleSymbolType typeIn, BrailleCell... cellsIn)
    {
        symbol = new BrailleSymbol(cellsIn);
        lettersRepresented = nameIn;
        descriptiveNameRes = descRes;
        type = typeIn;
    }


    public BrailleSymbolUsageRule getRuleForUsage()
    {
        return ruleForUsage;
    }

    public boolean isSingleCell()
    {
        return symbol.isSingleCell();
    }

    public BrailleSymbolType getType()
    {
        return type;
    }

    public String getLettersRepresented()
    {
        return lettersRepresented;
    }

    public String getDescriptiveName(Context c)
    {
      if(descriptiveNameRes == -1)
      {
        return getLettersRepresented();
      }
      else
      {
        return c.getResources().getString(descriptiveNameRes);
      }
    }

    public BrailleCell[] getCells()
    {
        return symbol.getCells();
    }

    public String getFont()
    {
        return symbol.getFont();
    }

    public BrailleSymbol getSymbol()
    {
        return symbol;
    }

    public String toString()
    {
        return getLettersRepresented();
    }
}
