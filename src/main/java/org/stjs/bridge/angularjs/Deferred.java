package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public abstract class Deferred<T> {
	public Promise<T> promise;

	public native Promise<T> resolve (Object value);

	public native Promise<T> reject (Object reason);
}
