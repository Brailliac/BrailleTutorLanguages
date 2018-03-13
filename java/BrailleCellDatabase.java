package com.lukeneedham.brailletutor.Braille;

import android.content.Context;

public abstract class BrailleCellDatabase
{
    public static final BrailleCell Cell1 = new BrailleCell('A', true, false, false, false, false, false); // [1]
    public static final BrailleCell Cell12 = new BrailleCell('B', true, true, false, false, false, false); //but [12]
    public static final BrailleCell Cell14 = new BrailleCell('C', true, false, false, true, false, false); //can [14]
    public static final BrailleCell Cell145 = new BrailleCell('D', true, false, false, true, true, false); //do [145]
    public static final BrailleCell Cell15 = new BrailleCell('E', true, false, false, false, true, false); //every [15]
    public static final BrailleCell Cell124 = new BrailleCell('F', true, true, false, true, false, false); //from [124]
    public static final BrailleCell Cell1245 = new BrailleCell('G', true, true, false, true, true, false); //go [1245]
    public static final BrailleCell Cell125 = new BrailleCell('H', true, true, false, false, true, false); //have [125]
    public static final BrailleCell Cell24 = new BrailleCell('I', false, true, false, true, false, false); // [24]
    public static final BrailleCell Cell245 = new BrailleCell('J', false, true, false, true, true, false); //just [245]
    public static final BrailleCell Cell13 = new BrailleCell('K', true, false, true, false, false, false); //knowledge [13]
    public static final BrailleCell Cell123 = new BrailleCell('L', true, true, true, false, false, false); //like [123]
    public static final BrailleCell Cell134 = new BrailleCell('M', true, false, true, true, false, false); //more [134]
    public static final BrailleCell Cell1345 = new BrailleCell('N', true, false, true, true, true, false); //not [1345]
    public static final BrailleCell Cell135 = new BrailleCell('O', true, false, true, false, true, false); // [135]
    public static final BrailleCell Cell1234 = new BrailleCell('P', true, true, true, true, false, false); //people [1234]
    public static final BrailleCell Cell12345 = new BrailleCell('Q', true, true, true, true, true, false); //quite [12345]
    public static final BrailleCell Cell1235 = new BrailleCell('R', true, true, true, false, true, false); //rather [1235]
    public static final BrailleCell Cell234 = new BrailleCell('S', false, true, true, true, false, false); //so [234]
    public static final BrailleCell Cell2345 = new BrailleCell('T', false, true, true, true, true, false); //that [2345]
    public static final BrailleCell Cell136 = new BrailleCell('U', true, false, true, false, false, true); //us [136]
    public static final BrailleCell Cell1236 = new BrailleCell('V', true, true, true, false, false, true); //very [1236]
    public static final BrailleCell Cell2456 = new BrailleCell('W', false, true, false, true, true, true); //will [2456]
    public static final BrailleCell Cell1346 = new BrailleCell('X', true, false, true, true, false, true); //it [1346]
    public static final BrailleCell Cell13456 = new BrailleCell('Y', true, false, true, true, true, true); //you [13456]
    public static final BrailleCell Cell1356 = new BrailleCell('Z', true, false, true, false, true, true); //as [1356]

    public static final BrailleCell CellWhitespace = new BrailleCell(' ', false, false, false, false, false, false); // []
    public static final BrailleCell CellNumbersign = new BrailleCell('#', false, false, true, true, true, true); // [3456]

    public static final BrailleCell CellFullstop = new BrailleCell('4', false, true, false, false, true, true); //dis [256]
    public static final BrailleCell CellQuestionmark = new BrailleCell('8', false, true, true, false, false, true); //his [236
    public static final BrailleCell CellExclamationmark = new BrailleCell('6', false, true, true, false, true, false); //ff [235]
    public static final BrailleCell CellComma = new BrailleCell('1', false, true, false, false, false, false); //ea [2]
    public static final BrailleCell CellColon = new BrailleCell('3', false, true, false, false, true, false); //con, cc [25]
    public static final BrailleCell CellSemicolon = new BrailleCell('2', false, true, true, false, false, false); //bb, be [23]
    public static final BrailleCell CellApostrophe = new BrailleCell('\'', false, false, true, false, false, false); // [3]
    public static final BrailleCell CellHyphen = new BrailleCell('-', false, false, true, false, false, true); // [36]
    public static final BrailleCell CellCloseQuote = new BrailleCell('0', false, false, true, false, true, true); //was [356]

    public static final BrailleCell CellCapitalsign = new BrailleCell(',', false, false, false, false, false, true); // [6]

    public static final BrailleCell CellGG = new BrailleCell('7', false, true, true, false, true, true); //were [2356]
    public static final BrailleCell CellST = new BrailleCell('/', false, false, true, true, false, false); //still [34]
    public static final BrailleCell CellCH = new BrailleCell('*', true, false, false, false, false, true); //child [16]
    public static final BrailleCell CellGH = new BrailleCell('<', true, true, false, false, false, true); // [126]
    public static final BrailleCell CellSH = new BrailleCell('%', true, false, false, true, false, true); //shall [146]
    public static final BrailleCell CellTH = new BrailleCell('?', true, false, false, true, true, true); //this [1456]
    public static final BrailleCell CellWH = new BrailleCell(':', true, false, false, false, true, true); //which [156]
    public static final BrailleCell CellED = new BrailleCell('$', true, true, false, true, false, true); // [1246]
    public static final BrailleCell CellER = new BrailleCell(']', true, true, false, true, true, true); // [12456]
    public static final BrailleCell CellOU = new BrailleCell('\\', true, true, false, false, true, true); //out [1256]
    public static final BrailleCell CellOW = new BrailleCell('[', false, true, false, true, false, true); // [246]
    public static final BrailleCell CellEN = new BrailleCell('5', false, true, false, false, false, true); //enough [26]
    public static final BrailleCell CellING = new BrailleCell('+', false, false, true, true, false, true); // [346]
    public static final BrailleCell CellAR = new BrailleCell('>', false, false, true, true, true, false); // [345]
    public static final BrailleCell CellIN = new BrailleCell('9', false, false, true, false, true, false); // [35]

    public static final BrailleCell CellAND = new BrailleCell('&', true, true, true, true, false, true); // [12346]
    public static final BrailleCell CellFOR = new BrailleCell('=', true, true, true, true, true, true); // [123456]
    public static final BrailleCell CellOF = new BrailleCell('(', true, true, true, false, true, true); // [12356]
    public static final BrailleCell CellTHE = new BrailleCell('!', false, true, true, true, false, true); // [2346]
    public static final BrailleCell CellWITH = new BrailleCell(')', false, true, true, true, true, true); // [23456]

    public static final BrailleCell Cell5 = new BrailleCell('"', false, false, false, false, true, false); // [5]
    public static final BrailleCell Cell45 = new BrailleCell('^', false, false, false, true, true, false); // [45]
    public static final BrailleCell Cell456 = new BrailleCell('_', false, false, false, true, true, true); // [456]
    public static final BrailleCell Cell46 = new BrailleCell('.', false, false, false, true, false, true); // [46]
    public static final BrailleCell Cell56 = new BrailleCell(';', false, false, false, false, true, true); // [56]
    public static final BrailleCell Cell4 = new BrailleCell('@', false, false, false, true, false, false); // [4]

    public static final BrailleCell[] allCells = {Cell1, Cell12, Cell14, Cell145, Cell15, Cell124, Cell1245, Cell125, Cell24, Cell245, Cell13, Cell123, Cell134, Cell1345, Cell135, Cell1234, Cell12345, Cell1235, Cell234, Cell2345, Cell136, Cell1236, Cell2456, Cell1346,
			Cell13456, Cell1356, CellWhitespace, CellNumbersign, CellFullstop, CellQuestionmark, CellExclamationmark, CellComma, CellColon, CellSemicolon, CellApostrophe, CellHyphen, CellCloseQuote,
            CellCapitalsign, CellGG, CellST, CellCH, CellGH, CellSH, CellTH, CellWH, CellED, CellER, CellOU, CellOW, CellEN, CellING, CellAR, CellIN, CellAND, CellFOR, CellOF, CellTHE, CellWITH, Cell4, Cell5, Cell45, Cell456, Cell46, Cell56};

    public static BrailleCell lookUpCell(BrailleCell in)
    {
        for(BrailleCell cell : allCells)
        {
            if(cell.equals(in))
                return cell;
        }
        return null;
    }

    public static BrailleCell lookUpCell(char font)
    {
        for(BrailleCell cell : allCells)
        {
            if(cell.getFontSymbol()==font)
                return cell;
        }
        return null;
    }

    public static String getDotDescriptionsFromFont(String font, Context con)
    {
        String res = "";

        for(char c : font.toCharArray())
        {
            BrailleCell cell = lookUpCell(c);
            if(cell != null)
            {
                res += cell.getDotsDescription(con) + ". ";
            }
        }

        return res;
    }
}
