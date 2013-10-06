package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public final class StrictContextualEscapingDelegate {
	public native <T> T getTrusted(String type, Object maybeTrusted);

	public native <T> T trustAs(String type, Object value);

	public native <T> T valueOf(Object value);
}
