package org.stjs.bridge.angularjs;

import org.stjs.javascript.functions.Function0;
import org.stjs.javascript.functions.Function1;

public class Provider {
	public native <T> T constant(String name, Object value);

	public native <T> void decorator(String name, Function1<T, T> decorator);

	public native <T> T factory(String name, Function0<T> $getFn);

	public native <T> T provider(String name, ServiceProvider<T> serviceProvider);

	public native <T> T provider(String name, Function0<T> $getFn);

	public native <T> T service(String name, Object constructor);

	public native <T> T value(String name, T value);
}
