package org.stjs.bridge.angularjs.http;

import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class HttpResponse<T> {
	public int status;
	public HttpConfig config;
	public T data;
	public Map<String, String> headers;
}
