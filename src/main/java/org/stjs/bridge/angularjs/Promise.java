package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Function1;

@SyntheticType
public abstract class Promise<T> {
	public abstract Promise<T> then(Function1<T, T> successCallback);

	public abstract Promise<T> then(Function1<T, T> successCallback, Function1<T, Object> errorCallback);

	// catch/finally are keywords -> you to call them with object['catch'] or object['finally']
	// public abstract Promise<T> catch(Function1<T,Object>errorCallback);

	// public abstract void finally(Callback1<T> callback);
}
