package org.stjs.bridge.angularjs;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Function;

@SyntheticType
public final class ControllerProvider {
	public native void register(String name, Function<Object> constructor);

	public native void register(String name, Array<? extends Object> constructor);

}
