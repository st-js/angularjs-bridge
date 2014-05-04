package org.stjs.bridge.angularjs.http;

import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public class HttpHeadersConfig {
	public Map<String, Object> common;
	public Map<String, Object> post;
	public Map<String, Object> put;
	public Map<String, Object> get;
}
