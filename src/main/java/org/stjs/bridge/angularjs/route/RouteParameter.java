package org.stjs.bridge.angularjs.route;

import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.annotation.SyntheticType;

@STJSBridge
@SyntheticType
public class RouteParameter {
	public String templateUrl;
	public String redirectTo;
	public Object controller;
	public Map<String, ?> resolve;
	public boolean reloadOnSearch;
}
