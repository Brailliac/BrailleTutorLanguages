package com.lukeneedham.brailletutor.Braille;

import android.content.Context;

import com.lukeneedham.brailletutor.R;

/**
 * Created by Luke on 30/07/2016.
 */
public enum BrailleSymbolUsageRule
{
    ANYWHERE(R.string.ruleAnywhere),
    STANDALONE(R.string.ruleStandAlone),
    SURROUNDED(R.string.ruleSurrounded),
    FIRST_SYLLABLE(R.string.ruleFirstSyllable),
    NOT_AT_START(R.string.ruleNotAtStart),
    STRESS_ON_FIRST_E_AND_NOT_AFTER_I_OR_E(R.string.ruleEver),
    NOT_AFTER_A_OR_O_AND_UN_NOT_A_PREFIX(R.string.ruleUnder),
    ORIGINAL_MEANING_RETAINED(R.string.ruleWordMeaningRetained),
    ORIGINAL_PRONOUNCIATION_RETAINED(R.string.ruleSamePronounciation),
    SHORT_A(R.string.ruleShortA),
    ONE_SYLLABLE(R.string.ruleOneSyllable),
    ONE_SYLLABLE_OR_END_WITH_ONEY_BUT_NEVER_AFTER_O(R.string.ruleOne);

    private int ruleDescription;

    BrailleSymbolUsageRule(int ruleDesc)
    {
        ruleDescription = ruleDesc;
    }

    public String getRuleDescription(Context c)
    {
        return c.getResources().getString(ruleDescription);
    }


    // ~ the contraction can be used whenever the letters occur
    // . the (non-contraction) symbol can be used whenever the letters occur
    // < the contraction can only be used when standing alone
    // > the contraction can only be used when surrounded by other letter cells
    // ¬ the contraction can only be used when it is the first syllable of a word
    // ^ the contraction cannot be used at the start of a word

    // £ the contraction cannot be used after i or e //ever
    // 0 the contraction cannot be used after o //one
    // $ the contraction cannot be used after a or o //under

    // ! signifies a modifier cell (non-litteral)
}
