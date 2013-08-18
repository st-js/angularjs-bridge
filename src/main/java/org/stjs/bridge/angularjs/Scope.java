package org.stjs.bridge.angularjs;

import org.stjs.javascript.Map;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.functions.Callback3;
import org.stjs.javascript.functions.Function1;

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

	public <T> T $apply(String expr) {
		throw new UnsupportedOperationException();
	}

	public <T> T $apply(Function1<Scope, T> expr) {
		throw new UnsupportedOperationException();
	}

	public AngularEvent $broadcast(String name, Object... args) {
		throw new UnsupportedOperationException();
	}

	public void $destroy() {
		throw new UnsupportedOperationException();
	}

	public void $digest() {
		throw new UnsupportedOperationException();
	}

	public AngularEvent $emit(String name, Object... args) {
		throw new UnsupportedOperationException();
	}

	public <T> T eval(String expr) {
		throw new UnsupportedOperationException();
	}

	public <T> T eval(Function1<Scope, T> expr) {
		throw new UnsupportedOperationException();
	}

	public void evalAsync(String expr) {
		throw new UnsupportedOperationException();
	}

	public <T> void evalAsync(Function1<Scope, T> expr) {
		throw new UnsupportedOperationException();
	}

	public <T extends Scope> T $new() {
		throw new UnsupportedOperationException();
	}

	public <T extends Scope> T $new(boolean isolate) {
		throw new UnsupportedOperationException();
	}

	public Callback0 $on(String name, Callback1<AngularEvent> listener) {
		throw new UnsupportedOperationException();
	}

	public <P1> Callback0 $on(String name, Callback2<AngularEvent, P1> listener) {
		throw new UnsupportedOperationException();
	}

	public <P1, P2> Callback0 $on(String name, Callback3<AngularEvent, P1, P2> listener) {
		throw new UnsupportedOperationException();
	}

	public Callback0 $on(String name, Object listener) {
		throw new UnsupportedOperationException();
	}

	public Callback0 $watch(String watchExpression) {
		throw new UnsupportedOperationException();
	}

	public Callback0 $watch(String watchExpression, Callback2<Object, Object> listener) {
		throw new UnsupportedOperationException();
	}

	public Callback0 $watch(String watchExpression, Callback2<Object, Object> listener, boolean objectEquality) {
		throw new UnsupportedOperationException();
	}

	public <T extends Scope> Callback0 $watch(Function1<T, Object> watchExpression) {
		throw new UnsupportedOperationException();
	}

	public <T extends Scope> Callback0 $watch(Function1<T, Object> watchExpression, Callback2<Object, Object> listener) {
		throw new UnsupportedOperationException();
	}

	public <T extends Scope> Callback0 $watch(Function1<T, Object> watchExpression, Callback2<Object, Object> listener,
			boolean objectEquality) {
		throw new UnsupportedOperationException();
	}

	public Callback0 $watchCollection(String watchExpression, Callback2<Object, Object> listener) {
		throw new UnsupportedOperationException();
	}

	public <T extends Scope> Callback0 $watchCollection(Function1<T, Object> watchExpression,
			Callback2<Object, Object> listener) {
		throw new UnsupportedOperationException();
	}

}
