package com.estafet.boostcd.commons.lib.git;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Git {
    
	private static Pattern pattern = Pattern.compile("(https:\\/\\/.+\\/)([a-zA-Z0-9-_]+)\\/([a-zA-Z0-9-_]+)(\\.git)?");

    private String repoUrl;

    public Git(String repoUrl) {
        this.repoUrl = repoUrl;
    }

	public String uri() {
		Matcher matcher = pattern.matcher(repoUrl);
		matcher.find();
		return matcher.group(3);
	}

	public String org() {
		Matcher matcher = pattern.matcher(repoUrl);
		matcher.find();
		return matcher.group(2);
	}

}