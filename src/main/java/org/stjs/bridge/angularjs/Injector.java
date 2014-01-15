package org.stjs.bridge.angularjs;

import org.stjs.javascript.Array;

public final class Injector {
	public native Array<String> annotate(Object function);

	public native <T> T get(String name);

	public native boolean has(String name);

	public native <T> T instantiate(Class<T> type, Object... locals);

	public native Object invoke(Object function);

	public native Object invoke(Object function, Object self, Object... arguments);
}
