package com.estafet.boostcd.commons.openshift;

public final class NamespaceUtils {

	public static String namespace(String environment) {
		return System.getenv("PRODUCT") + "-" + environment;
	}

}
