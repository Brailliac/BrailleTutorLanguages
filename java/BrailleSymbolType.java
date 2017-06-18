package com.lukeneedham.brailletutor.Braille;

import android.content.Context;

/**
 * Created by Luke on 15/06/2017.
 */

public class BrailleSymbolType
{
	private int nameRes;
	private int descRes;

	public BrailleSymbolType(int n, int d)
	{
		nameRes = n;
		descRes = d;
	}

	public int getNameRes()
	{
		return nameRes;
	}

	public int getDescRes()
	{
		return descRes;
	}

	public String getName(Context c)
	{
		return c.getResources().getString(nameRes);
	}

	public String getDesc(Context c)
	{
		return c.getResources().getString(descRes);
	}
}
