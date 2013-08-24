package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.JavascriptFunction;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.functions.Function2;

@JavascriptFunction
@SyntheticType
public abstract class CompiledExpression<T> implements Function2<T, Object, Object> {
	public Callback2<Object, T> assign;

	public boolean literal;

	public boolean constant;
}
