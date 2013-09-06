package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Function2;

@SyntheticType
public final class StrictContextualEscaping {
	public static final String HTML = " HTML";
	public static final String CSS = " CSS";
	public static final String URL = " URL";
	public static final String RESOURCE_URL = " RESOURCE_URL";
	public static final String JS = " JS";

	public native <T> T getTrusted(String type, Object maybeTrusted);

	public native <T> T getTrustedCss(Object value);

	public native <T> T getTrustedHtml(Object value);

	public native <T> T getTrustedJs(Object value);

	public native <T> T getTrustedResourceUrl(Object value);

	public native <T> T getTrustedUrl(Object value);

	public native <T> Function2<Object, Object, T> parse(String type, String expression);

	public native <T> Function2<Object, Object, T> parseAsCss(String expression);

	public native <T> Function2<Object, Object, T> parseAsHtml(String expression);

	public native <T> Function2<Object, Object, T> parseAsJs(String expression);

	public native <T> Function2<Object, Object, T> parseAsResourceUrl(String expression);

	public native <T> Function2<Object, Object, T> parseAsUrl(String expression);

	public native <T> T trustAs(String type, Object value);

	public native <T> T trustAsHtml(Object value);

	public native <T> T trustAsJs(Object value);

	public native <T> T trustAsResourceUrl(Object value);

	public native <T> T trustAsUrl(Object value);

	public native boolean isEnabled();
}
