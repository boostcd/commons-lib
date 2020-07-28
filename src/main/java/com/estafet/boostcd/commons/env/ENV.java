package com.estafet.boostcd.commons.env;

public final class ENV {

	private ENV( ) {}
	
	public static final String OPENSHIFT_HOST_PORT = System.getenv("OPENSHIFT_HOST_PORT");
	public static final String OPENSHIFT_USER = System.getenv("OPENSHIFT_USER");	
	public static final String OPENSHIFT_PASSWORD = System.getenv("OPENSHIFT_PASSWORD");
	
	public static final String GITHUB_USER = System.getenv("GITHUB_USER");
	public static final String GITHUB_PASSWORD = System.getenv("GITHUB_PASSWORD");
	
	public static String cicd(String productId) {
		return namespace(productId, "cicd");
	}
	
	public static String build(String productId) {
		return namespace(productId, "build");
	}
	
	public static String test(String productId) {
		return namespace(productId, "test");
	}
	
	public static String prod(String productId) {
		return namespace(productId, "prod");
	}
	
	public static String namespace(String productId, String env) {
		return productId + "-" + env;
	}
	
}
