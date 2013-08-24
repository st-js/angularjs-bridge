package org.stjs.bridge.angularjs;

import org.stjs.bridge.angularjs.http.HttpConfig;
import org.stjs.bridge.angularjs.http.HttpPromise;
import org.stjs.javascript.Map;
import org.stjs.javascript.Window;
import org.stjs.javascript.annotation.GlobalScope;
import org.stjs.javascript.dom.Element;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Function0;
import org.stjs.javascript.functions.Function1;
import org.stjs.javascript.functions.Function2;
import org.stjs.javascript.jquery.JQueryCore;

@GlobalScope
public class GlobalAngularJS {
	public static Angular angular;

	public static void $anchorScroll() {
		throw new UnsupportedOperationException();
	}

	public static Animate $animate;

	public static Cache $cacheFactory(String name) {
		throw new UnsupportedOperationException();
	}

	public static Cache $cacheFactory(String name, CacheOptions options) {
		throw new UnsupportedOperationException();
	}

	public static Function2<Element, Scope, Function2<Element, Element, Scope>> $compile(Element element,
			Function2<Element, Element, Scope> transclude, int maxPriority) {
		throw new UnsupportedOperationException();
	}

	public static Function2<Element, Scope, Function2<Element, Element, Scope>> $compile(String element,
			Function2<Element, Element, Scope> transclude, int maxPriority) {
		throw new UnsupportedOperationException();
	}

	public static Function1<Element, Scope> $compile(Element element) {
		throw new UnsupportedOperationException();
	}

	public static Function1<Element, Scope> $compile(String element) {
		throw new UnsupportedOperationException();
	}

	public static <T> T $controller(String constructor, Map<String, ? extends Object> locals) {
		throw new UnsupportedOperationException();
	}

	public static <T> T $controller(Callback0 constructor, Map<String, ? extends Object> locals) {
		throw new UnsupportedOperationException();
	}

	public static JQueryCore<JQueryCore<?>> $document;

	public static void $exceptionHandler(Exception error) {
		throw new UnsupportedOperationException();
	}

	public static void $exceptionHandler(Exception error, Object cause) {
		throw new UnsupportedOperationException();
	}

	public static Filter $filter(String filterName) {
		throw new UnsupportedOperationException();
	}

	public static HttpPromise $http(HttpConfig config) {
		throw new UnsupportedOperationException();
	}

	public static <T> Function1<String, T> $interpolate(String text) {
		throw new UnsupportedOperationException();
	}

	public static <T> Function1<String, T> $interpolate(String text, boolean mustHaveExpression) {
		throw new UnsupportedOperationException();
	}

	public static <T> Function1<String, T> $interpolate(String text, boolean mustHaveExpression, String trustedContext) {
		throw new UnsupportedOperationException();
	}

	public static Locale $locale;

	public static Location $location;

	public static <T> CompiledExpression<T> $parse(String text) {
		throw new UnsupportedOperationException();
	}

	public static Q $q;

	public static JQueryCore<JQueryCore<?>> $rootElement;

	public static Scope $rootScope;

	public static StrictContextualEscaping $sce;

	public static StrictContextualEscapingDelegate $sceDelegate;

	public static Cache $templateCache;

	public static <T> Promise<T> $timeout(Function0<T> fn) {
		throw new UnsupportedOperationException();
	}

	public static <T> Promise<T> $timeout(Function0<T> fn, int delay) {
		throw new UnsupportedOperationException();
	}

	public static <T> Promise<T> $timeout(Function0<T> fn, int delay, boolean invokeApply) {
		throw new UnsupportedOperationException();
	}

	public static Timeout $timeout;

	public static Window $window;

	public static HttpPromise $timeout(Callback0 callback, long delay) {
		throw new UnsupportedOperationException();
	}
}
