package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public final class LogProvider {
	public native LogProvider debugEnabled(String flag);

	public native String debugEnabled();
}
