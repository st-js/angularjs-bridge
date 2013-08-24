package org.stjs.bridge.angularjs;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class Q {
	public <T> Promise<T> reject(Object value) {
		throw new UnsupportedOperationException();
	}

	public <T> Deferred<T> defer() {
		throw new UnsupportedOperationException();
	}

	public <T> Promise<T> all(Array<Promise<T>> promises) {
		throw new UnsupportedOperationException();
	}

	public <T> Promise<T> all(Map<String, Promise<T>> promises) {
		throw new UnsupportedOperationException();
	}

	public <T> Promise<T> when(Object promise) {
		throw new UnsupportedOperationException();
	}

}
