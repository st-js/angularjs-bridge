package org.stjs.bridge.angularjs;

import org.stjs.javascript.Array;
import org.stjs.javascript.RegExp;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Function;

@SyntheticType
public final class CompileProvider {
	public native <T> T aHrefSanitizationWhitelist();

	public native <T> T aHrefSanitizationWhitelist(RegExp regexp);

	public native void directive(String name, Function<Object> directiveFactory);

	public native void directive(String name, Array<? extends Object> decoratedFactory);

	public native <T> T imgSrcSanitizationWhitelist();

	public native <T> T imgSrcSanitizationWhitelist(RegExp regexp);

}
