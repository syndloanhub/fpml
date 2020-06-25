package com.syndloanhub.loansum.fpml.v5_11.util;

import java.time.LocalDateTime;

public class LocalDateTimeAdapter {
	public static LocalDateTime parse(String s) {
		return LocalDateTime.parse(s);
	}

	public static String print(LocalDateTime dateTime) {
		return dateTime.toString();
	}
}
