package org.stjs.bridge.angularjs;

import org.stjs.javascript.Map;
import org.stjs.javascript.functions.Callback1;

public abstract class Attributes implements Map<String, String> {
	public Map<String, String> $attr;

	public native void $addClass(String classVal);

	public native void $removeClass(String classVal);

	public native void $set(String name, String value);

	public native <T> void $observe(String name, Callback1<T> callback);
}
