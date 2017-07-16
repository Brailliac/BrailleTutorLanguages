package com.lukeneedham.brailletutor.Braille;

import android.content.Context;

import com.lukeneedham.brailletutor.R;

/**
 * Created by Luke on 30/07/2016.
 */
public enum BrailleSymbolUsageRule
{
    ANYWHERE(R.string.rule_anywhere),
    STANDALONE(R.string.rule_standAlone),
    SURROUNDED(R.string.rule_surrounded),
    FIRST_SYLLABLE(R.string.rule_firstSyllable),
    NOT_AT_START(R.string.rule_notAtStart),
    STRESS_ON_FIRST_E_AND_NOT_AFTER_I_OR_E(R.string.rule_stressFirst_E_AndDontFollow_I_Or_E),
    NOT_AFTER_A_OR_O_AND_UN_NOT_A_PREFIX(R.string.rule_dontFollow_A_Or_O_And_UN_notPrefix),
    ORIGINAL_MEANING_RETAINED(R.string.rule_wordMeaningRetained),
    ORIGINAL_PRONOUNCIATION_RETAINED(R.string.rule_samePronounciation),
    SHORT_A(R.string.rule_short_A),
    ONE_SYLLABLE(R.string.rule_oneSyllable),
    ONE_SYLLABLE_OR_END_WITH_ONEY_BUT_NEVER_AFTER_O(R.string.rule_oneSyllableOr_ONEY_NotAfter_O),

    //SWEDISH
    OPTIONAL_SURROUNDED_BOTHSIDES_ONLY_BY_PLAIN(R.string.rule_optionalSurroundedPlainBothSides),
    OPTIONAL_SURROUNDED_START_ONLY_BY_PLAIN(R.string.rule_optionalSurroundedPlainStart);

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
