package com.lukeneedham.brailletutor.Braille;

import android.content.Context;

/**
 * Created by Luke on 15/06/2017.
 */

public class BrailleSymbolType
{
	private int nameRes;
	private int descRes;

	private String NAME_ID;

	public BrailleSymbolType(int n, int d, String na)
	{
		nameRes = n;
		descRes = d;
		NAME_ID = na;
	}

	public String getNAME_ID()
	{
		return NAME_ID;
	}

	public String getName(Context c)
	{
		return c.getResources().getString(nameRes);
	}

	public String getDesc(Context c)
	{
		return c.getResources().getString(descRes);
	}

	public String toString()
	{
		return getNAME_ID();
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		BrailleSymbolType that = (BrailleSymbolType) o;

		return NAME_ID.equals((that.getNAME_ID()));
	}

	@Override
	public int hashCode()
	{
		return NAME_ID.hashCode();
	}
}
