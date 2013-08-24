/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.stjs.bridge.angularjs.route;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public interface RouteProvider {
    RouteProvider when(String url, RouteParameter parameters);
    RouteProvider otherwise(RouteParameter parameters);
}
