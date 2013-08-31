package org.stjs.bridge.angularjs;

import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.STJSBridge;

/**
 *
 * @author paulo.quintans
 */
@STJSBridge
public abstract class Location {
    public native String path ();
    public native Location path (String path);
    public native String hash ();
    public native Location hash (String path);
    public native <T> T search ();
    public native Location search (Map<String, Object> hash);
    public native Location search (Object hash);
    // will override only a single search parameter. If the value is null, the parameter will be deleted.
    public native Location search (String parameter, Object parameterValue);
    public native Location replace ();
}
