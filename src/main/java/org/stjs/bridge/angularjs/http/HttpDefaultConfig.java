package org.stjs.bridge.angularjs.http;

import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public class HttpDefaultConfig {
	public String method;
	public String url;
	public Map<String, Object> params;
	public HttpHeadersConfig headers;

	public Object data;

	// transformRequest – {function(data, headersGetter)|Array.<function(data, headersGetter)>} – transform function or
	// an array of such functions. The transform function takes the http request body and headers and returns its
	// transformed (typically serialized) version.
	// transformResponse – {function(data, headersGetter)|Array.<function(data, headersGetter)>} – transform function or
	// an array of such functions. The transform function takes the http response body and headers and returns its
	// transformed (typically deserialized) version.
	/**
	 * {boolean|Cache} – If true, a default $http cache will be used to cache the GET request, otherwise if a cache
	 * instance built with $cacheFactory, this cache will be used for caching.
	 */
	public Object cache;
	/**
	 * {number} – timeout in milliseconds.
	 */
	public int timeout;

	public boolean withCredentials;

}
