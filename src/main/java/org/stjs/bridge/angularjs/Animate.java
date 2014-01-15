package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.jquery.JQueryCore;

@SyntheticType
public abstract class Animate {
	public native void addClass (JQueryCore<JQueryCore<?>> element, String className);

	public native void addClass (JQueryCore<JQueryCore<?>> element, String className, Callback0 done);

	public native boolean enabled ();

	public native boolean enabled (boolean onOff);

	public abstract void enter(JQueryCore<JQueryCore<?>> element, JQueryCore<JQueryCore<?>> parent,
			JQueryCore<JQueryCore<?>> after);

	public abstract void enter(JQueryCore<JQueryCore<?>> element, JQueryCore<JQueryCore<?>> parent,
			JQueryCore<JQueryCore<?>> after, Callback0 done);

	public native void leave (JQueryCore<JQueryCore<?>> element);

	public native void leave (JQueryCore<JQueryCore<?>> element, Callback0 done);

	public abstract void move(JQueryCore<JQueryCore<?>> element, JQueryCore<JQueryCore<?>> parent,
			JQueryCore<JQueryCore<?>> after);

	public abstract void move(JQueryCore<JQueryCore<?>> element, JQueryCore<JQueryCore<?>> parent,
			JQueryCore<JQueryCore<?>> after, Callback0 done);

	public native void removeClass (JQueryCore<JQueryCore<?>> element, String className);

	public native void removeClass (JQueryCore<JQueryCore<?>> element, String className, Callback0 done);

}
