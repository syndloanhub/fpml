package com.syndloanhub.loansum.fpml.v5_11.util;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DoubleAdapter {
	public static DecimalFormat df = new DecimalFormat("0", DecimalFormatSymbols.getInstance(Locale.ENGLISH));

	static {
		df.setMaximumFractionDigits(340);
	}

	public static double parse(String s) {
		return Double.parseDouble(s);
	}

	public static String print(double d) {
		return df.format(d);
	}
}
