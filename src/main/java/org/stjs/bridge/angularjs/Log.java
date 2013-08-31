package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public abstract class Log {
	public native void log (Object msg, Object... otherParams);

	public native void warn (Object msg, Object... otherParams);

	public native void error (Object msg, Object... otherParams);

	public native void debug (Object msg, Object... otherParams);

	public native void info (Object msg, Object... otherParams);
}
