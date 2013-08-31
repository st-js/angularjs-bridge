package org.stjs.bridge.angularjs;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public final class Q {
	public native <T> Promise<T> reject(Object value);

	public native <T> Deferred<T> defer();

	public native <T> Promise<T> all(Array<Promise<T>> promises);

	public native <T> Promise<T> all(Map<String, Promise<T>> promises);

	public native <T> Promise<T> when(Object promise);

}
