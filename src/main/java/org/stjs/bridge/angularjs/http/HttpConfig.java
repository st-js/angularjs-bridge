package org.stjs.bridge.angularjs.http;

import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
@STJSBridge
public final class HttpConfig {
	public String method;
	public String url;
	public Map<? extends String, ?> params;
	public Map<? extends String, ?> headers;
	public Object data;
	// there are more. see: http://docs.angularjs.org/api/ng.$http
}
