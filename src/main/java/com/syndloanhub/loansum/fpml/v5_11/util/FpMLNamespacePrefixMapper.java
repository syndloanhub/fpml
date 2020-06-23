package com.syndloanhub.loansum.fpml.v5_11.util;

import java.util.HashMap;
import java.util.Map;

import com.sun.xml.internal.bind.marshaller.NamespacePrefixMapper;

public class FpMLNamespacePrefixMapper extends NamespacePrefixMapper {
	private Map<String, String> nsuri2prefixMap = new HashMap<String, String>();

	public void addMapping(String namespaceUri, String prefix) {
		nsuri2prefixMap.put(namespaceUri, prefix);
	}

	@Override
	public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix) {
		if (nsuri2prefixMap.containsKey(namespaceUri))
			return nsuri2prefixMap.get(namespaceUri);
		return suggestion;
	}
}
