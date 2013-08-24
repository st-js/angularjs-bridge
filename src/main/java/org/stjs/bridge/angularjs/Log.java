package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public abstract class Log {
	public abstract void log(Object msg, Object... otherParams);

	public abstract void warn(Object msg, Object... otherParams);

	public abstract void error(Object msg, Object... otherParams);

	public abstract void debug(Object msg, Object... otherParams);

	public abstract void info(Object msg, Object... otherParams);
}
