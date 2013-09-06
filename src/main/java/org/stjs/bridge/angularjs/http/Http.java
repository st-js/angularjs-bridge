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
	public native HttpPromise put(String url, Object data);

	public native HttpPromise post(String url, Object data);

	public native HttpPromise post(String url, Object data, HttpConfig config);
}
