package org.stjs.bridge.angularjs;

import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.functions.Callback2;
import org.stjs.javascript.functions.Callback4;
import org.stjs.javascript.functions.Function3;
import org.stjs.javascript.jquery.JQueryCore;

/********* Directive ********/

@SyntheticType
@STJSBridge
public class Directive {
	public String require;
	public Map<String, String> scope;
	public Function3<JQueryCore<JQueryCore<?>>, ? extends Attributes, Callback2<? extends Scope, ?>, ?> compile;
	public Callback4<? extends Scope, JQueryCore<JQueryCore<?>>, ? extends Attributes, ?> link;
	public String template;
}
