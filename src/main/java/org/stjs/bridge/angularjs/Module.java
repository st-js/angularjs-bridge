package org.stjs.bridge.angularjs;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Function0;

@SyntheticType
public final class Module {
	public String name;

	public Array<String> requires;

	public native <F> F animation(String name, F func);

	public native void config(Callback0 configFn);

	public native void constant(String name, Object object);

	public native void controller(String name, Object constructor);

	public native <T> void directive(String name, Function0<Object> directiveFactory);

	public native <T> void factory(String name, Object providerFunction);

	public native void filter(String name, Object filterFactory);

	public native void provider(String name, Object providerType);

	public native void run(Callback0 initializationFn);

	public native void value(String name, Object object);
}
