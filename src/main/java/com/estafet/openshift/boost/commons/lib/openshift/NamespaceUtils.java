package com.estafet.openshift.boost.commons.lib.openshift;

public final class NamespaceUtils {

	public static String namespace(String environment) {
		return System.getenv("PRODUCT") + "-" + environment;
	}

}
