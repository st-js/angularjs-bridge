package org.stjs.bridge.angularjs.http;

import org.stjs.bridge.angularjs.Promise;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.functions.Callback4;
import org.stjs.javascript.functions.Function1;

@STJSBridge
public class HttpPromise<T> extends Promise<HttpResponse<T>> {
	public native HttpPromise<T> success(Callback0 callback);

	public native HttpPromise<T> success(Callback1<T> callback);

	public native HttpPromise<T> success(Callback2<T, String> callback);

	public native HttpPromise<T> success(Callback4<T, String, Map<String, String>, HttpConfig> callback);

	public native HttpPromise<T> success(Function1<T, T> callback);

	public native HttpPromise<T> error(Callback0 callback);

	public native HttpPromise<T> error(Callback1<T> callback);

	public native HttpPromise<T> error(Callback2<T, String> callback);

	public native HttpPromise<T> error(Callback4<T, String, Map<String, String>, HttpConfig> callback);

	public native HttpPromise<T> error(Function1<T, T> callback);
}
