package org.stjs.bridge.angularjs;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Function0;

@SyntheticType
public final class Module {
	public String name;

	public Array<String> requires;

	public <F> F animation(String name, F func) {
		throw new UnsupportedOperationException();
	}

	public void config(Callback0 configFn) {
		throw new UnsupportedOperationException();
	}

	public void constant(String name, Object object) {
		throw new UnsupportedOperationException();
	}

	public void controller(String name, Object constructor) {
		throw new UnsupportedOperationException();
	}

	public <T> void directive(String name, Function0<Object> directiveFactory) {
		throw new UnsupportedOperationException();
	}

	public <T> void factory(String name, Object providerFunction) {
		throw new UnsupportedOperationException();
	}

	public void filter(String name, Object filterFactory) {
		throw new UnsupportedOperationException();
	}

	public void provider(String name, Object providerType) {
		throw new UnsupportedOperationException();
	}

	public void run(Callback0 initializationFn) {
		throw new UnsupportedOperationException();
	}

	public void value(String name, Object object) {
		throw new UnsupportedOperationException();
	}
}
