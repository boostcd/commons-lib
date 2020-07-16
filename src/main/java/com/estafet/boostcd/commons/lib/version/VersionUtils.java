package com.estafet.boostcd.commons.lib.version;

import java.util.List;

public final class VersionUtils {

	public static String getLatest(List<String> versions) {
		versions.sort(VersionNumberComparator.getInstance());
		return versions.get(versions.size() - 1);
	}
	
}
