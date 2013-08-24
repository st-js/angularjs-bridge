package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.jquery.JQueryCore;

@SyntheticType
public abstract class Animate {
	public abstract void addClass(JQueryCore<JQueryCore<?>> element, String className);

	public abstract void addClass(JQueryCore<JQueryCore<?>> element, String className, Callback0 done);

	public abstract boolean enabled();

	public abstract boolean enabled(boolean onOff);

	public abstract void enter(JQueryCore<JQueryCore<?>> element, JQueryCore<JQueryCore<?>> parent,
			JQueryCore<JQueryCore<?>> after);

	public abstract void enter(JQueryCore<JQueryCore<?>> element, JQueryCore<JQueryCore<?>> parent,
			JQueryCore<JQueryCore<?>> after, Callback0 done);

	public abstract void leave(JQueryCore<JQueryCore<?>> element);

	public abstract void leave(JQueryCore<JQueryCore<?>> element, Callback0 done);

	public abstract void move(JQueryCore<JQueryCore<?>> element, JQueryCore<JQueryCore<?>> parent,
			JQueryCore<JQueryCore<?>> after);

	public abstract void move(JQueryCore<JQueryCore<?>> element, JQueryCore<JQueryCore<?>> parent,
			JQueryCore<JQueryCore<?>> after, Callback0 done);

	public abstract void removeClass(JQueryCore<JQueryCore<?>> element, String className);

	public abstract void removeClass(JQueryCore<JQueryCore<?>> element, String className, Callback0 done);

}
