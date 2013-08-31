package org.stjs.bridge.angularjs;

import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.functions.Callback3;
import org.stjs.javascript.functions.Function1;

@SyntheticType
public class Scope {
	public Long $id;

	public Scope() {
		//
	}

	public Scope(Map<String, Object> providers) {
		//
	}

	public Scope(Map<String, Object> providers, Map<String, Object> instanceCache) {
		//
	}

	public native <T> T $apply(String expr);

	public native <T> T $apply(Function1<Scope, T> expr);

	public native AngularEvent $broadcast(String name, Object... args);

	public native void $destroy();

	public native void $digest();

	public native AngularEvent $emit(String name, Object... args);

	public native <T> T eval(String expr);

	public native <T> T eval(Function1<Scope, T> expr);

	public native void evalAsync(String expr);

	public native <T> void evalAsync(Function1<Scope, T> expr);

	public native <T extends Scope> T $new();

	public native <T extends Scope> T $new(boolean isolate);

	public native Callback0 $on(String name, Callback1<AngularEvent> listener);

	public native <P1> Callback0 $on(String name, Callback2<AngularEvent, P1> listener);

	public native <P1, P2> Callback0 $on(String name, Callback3<AngularEvent, P1, P2> listener);

	public native Callback0 $on(String name, Object listener);

	public native Callback0 $watch(String watchExpression);

	public native <T> Callback0 $watch(String watchExpression, Callback2<T, T> listener);

	public native <T> Callback0 $watch(String watchExpression, Callback2<T, T> listener, boolean objectEquality);

	public native <T extends Scope> Callback0 $watch(Function1<T, Object> watchExpression);

	public native <T extends Scope> Callback0 $watch(Function1<T, Object> watchExpression,
			Callback2<Object, Object> listener);

	public native <T extends Scope> Callback0 $watch(Function1<T, Object> watchExpression,
			Callback2<Object, Object> listener, boolean objectEquality);

	public native Callback0 $watchCollection(String watchExpression, Callback2<Object, Object> listener);

	public native <T extends Scope> Callback0 $watchCollection(Function1<T, Object> watchExpression,
			Callback2<Object, Object> listener);

}
