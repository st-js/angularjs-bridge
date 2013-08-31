package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Function1;

@SyntheticType
public abstract class Promise<T> {
	public native Promise<T> then (Function1<T, T> successCallback);

	public native Promise<T> then (Function1<T, T> successCallback, Function1<T, Object> errorCallback);

	// catch/finally are keywords -> you to call them with object['catch'] or object['finally']
	// public native Promise<T> catch (Function1<T,Object>errorCallback);

	// public native void finally (Callback1<T> callback);
}
