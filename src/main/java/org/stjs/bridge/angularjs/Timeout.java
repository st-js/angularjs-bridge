package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.JavascriptFunction;
import org.stjs.javascript.annotation.SyntheticType;

@JavascriptFunction
@SyntheticType
public abstract class Timeout {
	public native boolean cancel (Promise<?> promise);
}
