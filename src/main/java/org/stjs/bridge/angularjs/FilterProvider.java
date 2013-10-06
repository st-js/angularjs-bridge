package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Function;

@SyntheticType
public final class FilterProvider {
	public native void register(String name, Function<? extends Filter> constructor);
}
