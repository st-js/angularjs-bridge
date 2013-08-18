package org.stjs.bridge.angularjs;

import org.stjs.javascript.Array;
import org.stjs.javascript.annotation.Template;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.jquery.JQueryCore;

public interface Angular {

	public <F> F bind(Object self, Object fn, Object... args);

	public Injector bootstrap(Element element, Object... modules);

	public <T> T copy(T source);

	public <T> T copy(T source, T destination);

	public <T extends JQueryCore<T>> T element(Element element);

	public boolean equals(Object o1, Object o2);

	public <T> T extend(T destination, Object... sources);

	public <T> Array<T> forEach(Array<T> list, Callback2<T, Integer> iterator);

	public <T> Array<T> forEach(Array<T> list, Callback2<T, Integer> iterator, Object context);

	public <T> T forEach(T list, Callback2<Object, String> iterator);

	public <T> T forEach(T list, Callback2<Object, String> iterator, Object context);

	public <T> T fromJson(String json);

	public Object identity();

	public Injector injector(Object... modules);

	public boolean isElement(Object object);

	public boolean isArray(Object object);

	public boolean isObject(Object object);

	public boolean isFunction(Object object);

	public boolean isString(Object object);

	public boolean isNumber(Object object);

	@Template("property")
	public Mock mock();

	public Module module(String name, String... requires);

	public Module module(String name, Object... requiresAndConfig);

	public boolean isUndefined(Object object);

	public boolean isDefined(Object object);

	public boolean isDate(Object object);

	public String lowercase(String s);

	public Object noop();

	public String toJson(Object obj);

	public String toJson(Object obj, boolean pretty);

	public String uppercase(String s);

	@Template("property")
	public AngularVersion version();
}
