package org.stjs.bridge.angularjs;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public final class SceDelegateProvider {
	public native Array<String> resourceUrlBlacklist();

	public native SceDelegateProvider resourceUrlBlacklist(Array<String> blacklist);

	public native Array<String> resourceUrlWhitelist();

	public native SceDelegateProvider resourceUrlWhitelist(Array<String> whitelist);

}
