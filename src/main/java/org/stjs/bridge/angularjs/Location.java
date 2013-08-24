package org.stjs.bridge.angularjs;

import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.STJSBridge;

/**
 *
 * @author paulo.quintans
 */
@STJSBridge
public abstract class Location {
    public abstract String path();
    public abstract Location path(String path);
    public abstract String hash();
    public abstract Location hash(String path);
    public abstract <T> T search();
    public abstract Location search(Map<String, Object> hash);
    public abstract Location search(Object hash);
    // will override only a single search parameter. If the value is null, the parameter will be deleted.
    public abstract Location search(String parameter, Object parameterValue);
    public abstract Location replace();
}
