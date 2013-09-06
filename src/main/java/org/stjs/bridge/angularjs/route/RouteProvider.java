/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.stjs.bridge.angularjs.route;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge
@SyntheticType
public final class RouteProvider {
	public native RouteProvider when(String url, RouteParameter parameters);

	public native RouteProvider otherwise(RouteParameter parameters);
}
