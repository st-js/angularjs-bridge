package org.stjs.bridge.angularjs;

import org.stjs.javascript.Array;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.jquery.JQueryCore;

public abstract class Angular {

	public native <F> F bind (Object self, Object fn, Object... args);

	public native Injector bootstrap (Element element, Object... modules);

	public native <T> T copy (T source);

	public native <T> T copy (T source, T destination);

	public native <T extends JQueryCore<T>> T element (Element element);

	public native boolean equals (Object o1, Object o2);

	public native <T> T extend (T destination, Object... sources);

	public native <T> Array<T> forEach (Array<T> list, Callback2<T, Integer> iterator);

	public native <T> Array<T> forEach (Array<T> list, Callback2<T, Integer> iterator, Object context);

	public native <T> T forEach (T list, Callback2<Object, String> iterator);

	public native <T> T forEach (T list, Callback2<Object, String> iterator, Object context);

	public native <T> T fromJson (String json);

	public native Object identity ();

	public native Injector injector (Object... modules);

	public native boolean isElement (Object object);

	public native boolean isArray (Object object);

	public native boolean isObject (Object object);

	public native boolean isFunction (Object object);

	public native boolean isString (Object object);

	public native boolean isNumber (Object object);

	public Mock mock;

	public native Module module (String name, String... requires);

	public native Module module (String name, Object... requiresAndConfig);

	public native boolean isUndefined (Object object);

	public native boolean isDefined (Object object);

	public native boolean isDate (Object object);

	public native String lowercase (String s);

	public native Object noop ();

	public native String toJson (Object obj);

	public native String toJson (Object obj, boolean pretty);

	public native String uppercase (String s);

	public AngularVersion version;
}
