package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.JavascriptFunction;
import org.stjs.javascript.annotation.STJSBridge;

/**
 *
 * @author paulo.quintans
 */
@JavascriptFunction
@STJSBridge
public interface Watcher<T> {
    public void $invoke(T newValue, T oldValue);
}
