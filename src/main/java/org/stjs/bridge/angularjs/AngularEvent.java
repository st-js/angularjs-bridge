package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.SyntheticType;

@SyntheticType
public class AngularEvent {

	public Scope targetScope;
	public Scope currentScope;
	public String name;

	public void stopPropagation() {

	}

	public void preventDefault() {

	}

	public boolean defaultPrevented;

}
