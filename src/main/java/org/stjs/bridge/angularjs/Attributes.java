package org.stjs.bridge.angularjs;

import org.stjs.javascript.Map;
import org.stjs.javascript.functions.Callback1;

public abstract class Attributes implements Map<String, String> {
	public Map<String, String> $attr() {
		throw new UnsupportedOperationException();
	}

	public void $addClass(String classVal) {
		throw new UnsupportedOperationException();
	}

	public void $removeClass(String classVal) {
		throw new UnsupportedOperationException();
	}

	public void $set(String name, String value) {
		throw new UnsupportedOperationException();
	}

	public <T> void $observe(String name, Callback1<T> callback) {
		throw new UnsupportedOperationException();
	}
}
