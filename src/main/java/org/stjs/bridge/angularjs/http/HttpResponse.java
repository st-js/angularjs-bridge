package org.stjs.bridge.angularjs.http;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class HttpResponse {
	public int status;
	public HttpConfig config;
	public String data;
}
