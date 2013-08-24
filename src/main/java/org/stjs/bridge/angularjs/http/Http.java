/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.stjs.bridge.angularjs.http;

import org.stjs.javascript.annotation.STJSBridge;

@STJSBridge
public interface Http {
    HttpPromise put(String url, Object data);
    HttpPromise post(String url, Object data);
    HttpPromise post(String url, Object data, HttpConfig config);
}
