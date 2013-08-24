package org.stjs.bridge.angularjs;

import org.stjs.javascript.Array;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.jquery.JQueryCore;

public abstract class Angular {

	public abstract <F> F bind(Object self, Object fn, Object... args);

	public abstract Injector bootstrap(Element element, Object... modules);

	public abstract <T> T copy(T source);

	public abstract <T> T copy(T source, T destination);

	public abstract <T extends JQueryCore<T>> T element(Element element);

	public abstract boolean equals(Object o1, Object o2);

	public abstract <T> T extend(T destination, Object... sources);

	public abstract <T> Array<T> forEach(Array<T> list, Callback2<T, Integer> iterator);

	public abstract <T> Array<T> forEach(Array<T> list, Callback2<T, Integer> iterator, Object context);

	public abstract <T> T forEach(T list, Callback2<Object, String> iterator);

	public abstract <T> T forEach(T list, Callback2<Object, String> iterator, Object context);

	public abstract <T> T fromJson(String json);

	public abstract Object identity();

	public abstract Injector injector(Object... modules);

	public abstract boolean isElement(Object object);

	public abstract boolean isArray(Object object);

	public abstract boolean isObject(Object object);

	public abstract boolean isFunction(Object object);

	public abstract boolean isString(Object object);

	public abstract boolean isNumber(Object object);

	public Mock mock;

	public abstract Module module(String name, String... requires);

	public abstract Module module(String name, Object... requiresAndConfig);

	public abstract boolean isUndefined(Object object);

	public abstract boolean isDefined(Object object);

	public abstract boolean isDate(Object object);

	public abstract String lowercase(String s);

	public abstract Object noop();

	public abstract String toJson(Object obj);

	public abstract String toJson(Object obj, boolean pretty);

	public abstract String uppercase(String s);

	public AngularVersion version;
}
