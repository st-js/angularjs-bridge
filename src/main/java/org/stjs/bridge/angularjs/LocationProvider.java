package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public final class LocationProvider {
	public native LocationProvider hashPrefix(String prefix);

	public native String hashPrefix();

	public native LocationProvider html5Mode(boolean mode);

	public native boolean html5Mode();
}
