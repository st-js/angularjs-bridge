package org.stjs.bridge.angularjs;

import java.util.Iterator;

import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.Template;
import org.stjs.javascript.functions.Callback1;

public abstract class Attributes implements Iterable<String> {
	public Map<String, String> $attr;

	public native Iterator<String> iterator();

	@Template("get")
	public native String $get(String key);

	@Template("put")
	public native void $put(String key, String value);

	@Template("delete")
	public native void $delete(String key);

	public native void $addClass(String classVal);

	public native void $removeClass(String classVal);

	public native void $set(String name, String value);

	public native <T> void $observe(String name, Callback1<T> callback);
}
