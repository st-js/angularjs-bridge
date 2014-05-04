package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.annotation.Template;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Function1;

@SyntheticType
public class Promise<T> {
	public native <V> Promise<V> then(Function1<T, V> successCallback);

	public native <V> Promise<V> then(Function1<T, V> successCallback, Function1<T, V> errorCallback);

	// catch/finally are keywords -> you to call them with object['catch'] or object['finally']
	@Template("prefix")
	public native <V> Promise<V> $catch(Function1<T, V> errorCallback);

	@Template("prefix")
	public native void $finally(Callback1<T> callback);
}
