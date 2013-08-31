package org.stjs.bridge.angularjs;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.functions.Callback0;

public abstract class NgModelController {
	public String $viewValue;
	public Object $modelValue;

	public Array<Object> $parsers;
	public Array<Object> $formatters;

	public Map<String, Object> $error;
	public boolean $pristine;
	public boolean $dirty;
	public boolean $invalid;

	public native void $setValidity (String validationErrorKey, boolean isValid);

	public native void $setViewValue (String value);

	public Callback0 $render;

	public native void $setPristine ();

}
