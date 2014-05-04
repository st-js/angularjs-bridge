package org.stjs.bridge.angularjs;

import org.stjs.bridge.angularjs.route.RouteProvider;
import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.functions.Function0;

@SyntheticType
@SuppressWarnings("hiding")
public final class Module {
	public String name;

	public Array<String> requires;

	public native void animation(String name, Object func);

	public native void config(Callback configFn);

	public native void config(Callback2<LocationProvider, RouteProvider> configFn);

	public native void constant(String name, Object object);

	public native void controller(String name, Object constructor);

	public native void controller(String name, Array<? extends Object> decoratedConstructor);

	public native void directive(String name, Object directiveFactory);

	public native void directive(String name, Function0<Object> simpleConstructor);

	public native void directive(String name, Array<? extends Object> decoratedFactory);

	public native void factory(String name, Object providerFunction);

	public native void factory(String name, Function0<Object> simpleConstructor);

	public native void filter(String name, Object filterFactory);

	public native void provider(String name, Object providerType);

	public native void service(String name, Object constructor);

	public native void run(Callback initializationFn);

	public native void value(String name, Object object);
}
