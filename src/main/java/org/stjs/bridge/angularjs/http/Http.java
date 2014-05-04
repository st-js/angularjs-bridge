/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.stjs.bridge.angularjs.http;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge
@SyntheticType
public final class Http {
	public native <T> HttpPromise<T> get(String url);

	public native <T> HttpPromise<T> get(String url, HttpConfig config);

	public native <T> HttpPromise<T> put(String url);

	public native <T> HttpPromise<T> put(String url, Object data);

	public native <T> HttpPromise<T> put(String url, Object data, HttpConfig config);

	public native <T> HttpPromise<T> post(String url);

	public native <T> HttpPromise<T> post(String url, Object data);

	public native <T> HttpPromise<T> post(String url, Object data, HttpConfig config);

	public native <T> HttpPromise<T> delete(String url);

	public native <T> HttpPromise<T> delete(String url, HttpConfig config);

	public native <T> HttpPromise<T> head(String url);

	public native <T> HttpPromise<T> head(String url, HttpConfig config);

	public native <T> HttpPromise<T> jsonp(String url);

	public native <T> HttpPromise<T> jsonp(String url, HttpConfig config);

	public HttpDefaultConfig defaults;
}
