package org.stjs.bridge.angularjs.cookie;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge(sources = "angular-cookie.js")
@SyntheticType
public class CookieStore {
	public native <T> T get(String key);

	public native <T> void put(String key, T value);

	public native void remove(String key);
}
