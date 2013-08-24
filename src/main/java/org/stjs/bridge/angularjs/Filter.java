package org.stjs.bridge.angularjs;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.JavascriptFunction;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Function2;

@STJSBridge
@JavascriptFunction
public interface Filter {
	Function2<Array<Object>, Object, String> $invoke(String filterName);
}
