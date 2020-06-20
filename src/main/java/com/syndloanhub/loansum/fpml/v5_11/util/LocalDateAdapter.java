package com.syndloanhub.loansum.fpml.v5_11.util;

import java.time.LocalDate;

public class LocalDateAdapter {
	public static LocalDate parse(String s) {
		return LocalDate.parse(s);
	}

	public static String print(LocalDate date) {
		return date.toString();
	}
}
