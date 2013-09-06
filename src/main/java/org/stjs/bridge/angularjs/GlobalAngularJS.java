package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.GlobalScope;

@GlobalScope
public final class GlobalAngularJS {
	public static Angular angular;

	/**
	 * THESE ARE AVAILABLE VIA INJECTION
	 */
	/*
	public native static void $anchorScroll();

	public static Animate $animate;

	public native static Cache $cacheFactory(String name);

	public native static Cache $cacheFactory(String name, CacheOptions options);

	public native static Function2<Element, Scope, Function2<Element, Element, Scope>> $compile(Element element,
			Function2<Element, Element, Scope> transclude, int maxPriority);

	public native static Function2<Element, Scope, Function2<Element, Element, Scope>> $compile(String element,
			Function2<Element, Element, Scope> transclude, int maxPriority);

	public native static Function1<Element, Scope> $compile(Element element);

	public native static Function1<Element, Scope> $compile(String element);

	public native static <T> T $controller(String constructor, Map<String, ? extends Object> locals);

	public native static <T> T $controller(Callback0 constructor, Map<String, ? extends Object> locals);

	public static JQueryCore<JQueryCore<?>> $document;

	public native static void $exceptionHandler(Exception error);

	public native static void $exceptionHandler(Exception error, Object cause);

	public native static Filter $filter(String filterName);

	public native static HttpPromise $http(HttpConfig config);

	public native static <T> Function1<String, T> $interpolate(String text);

	public native static <T> Function1<String, T> $interpolate(String text, boolean mustHaveExpression);

	public native static <T> Function1<String, T> $interpolate(String text, boolean mustHaveExpression,
			String trustedContext);

	public static Locale $locale;

	public static Location $location;

	public native static <T> CompiledExpression<T> $parse(String text);

	public static Q $q;

	public static JQueryCore<JQueryCore<?>> $rootElement;

	public static Scope $rootScope;

	public static StrictContextualEscaping $sce;

	public static StrictContextualEscapingDelegate $sceDelegate;

	public static Cache $templateCache;

	public native static <T> Promise<T> $timeout(Function0<T> fn);

	public native static <T> Promise<T> $timeout(Function0<T> fn, int delay);

	public native static <T> Promise<T> $timeout(Function0<T> fn, int delay, boolean invokeApply);

	public static Timeout $timeout;

	public static Window $window;

	public native static HttpPromise $timeout(Callback0 callback, long delay);
	*/
}
