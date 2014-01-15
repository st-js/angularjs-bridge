package org.stjs.bridge.angularjs;

import org.stjs.javascript.Array;
import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.dom.Element;

@SyntheticType
public abstract class FormController {
	public native void $addControl ();

	public native void $removeControl ();

	public native void $setDirty ();

	public native void $setPristine ();

	public native void $setValidity ();

	public boolean $pristine;

	public boolean $dirty;

	public boolean $valid;

	public boolean $invalid;

	public Map<String, Array<Element>> $error;
}
