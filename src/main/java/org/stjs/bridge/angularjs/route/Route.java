package org.stjs.bridge.angularjs.route;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge
@SyntheticType
public final class Route {
	public Object current;

	public native void reload();
}
