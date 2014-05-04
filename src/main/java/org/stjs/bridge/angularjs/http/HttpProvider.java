/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.stjs.bridge.angularjs.http;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public class HttpProvider {
	public Array<Object> responseInterceptors;

	public HttpDefaultConfig defaults;
}
