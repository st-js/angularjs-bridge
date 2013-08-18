package org.stjs.bridge.angularjs;

import org.stjs.javascript.Array;

public interface Injector {
	public Array<String> annotate(Object function);

	public <T> T get(String name);

	public boolean has(String name);

	public <T> T instantiate(Class<T> type, Object... locals);

	public Object invoke(Object function);

	public Object invoke(Object function, Object self, Object... arguments);
}
