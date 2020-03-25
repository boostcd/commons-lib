package com.estafet.openshift.boost.commons.lib.env;

public final class ENV {

	private ENV( ) {}
	
	public static final String PRODUCT = System.getenv("PRODUCT");	
	
	public static final String OPENSHIFT_HOST_PORT = System.getenv("OPENSHIFT_HOST_PORT");
	public static final String OPENSHIFT_USER = System.getenv("OPENSHIFT_USER");	
	public static final String OPENSHIFT_PASSWORD = System.getenv("OPENSHIFT_PASSWORD");
	
	public static final String GITHUB = System.getenv("GITHUB");
	public static final String GITHUB_USER = System.getenv("GITHUB_USER");
	public static final String GITHUB_PASSWORD = System.getenv("GITHUB_PASSWORD");
	
	public static final String PROD = namespace("prod");
	public static final String BUILD = namespace("build");
	public static final String TEST = namespace("test");
	
	public static String namespace(String env) {
		return PRODUCT + "-" + env;
	}
	
}
