package org.stjs.bridge.angularjs;

import org.stjs.javascript.functions.Function0;
import org.stjs.javascript.functions.Function1;

public interface Provider {
	public <T> T constant(String name, Object value);

	public <T> void decorator(String name, Function1<T, T> decorator);

	public <T> T factory(String name, Function0<T> $getFn);

	public <T> T provider(String name, ServiceProvider<T> serviceProvider);

	public <T> T provider(String name, Function0<T> $getFn);

	public <T> T service(String name, Object constructor);

	public <T> T value(String name, T value);
}
