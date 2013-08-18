package org.stjs.bridge.angularjs;

import org.stjs.javascript.Map;
import org.stjs.javascript.annotation.Template;

public interface Attributes extends Map<String, String> {
	@Template("property")
	public Map<String, String> $attr();

	public void $addClass(String classVal);

	public void $removeClass(String classVal);

	public void $set(String name, String value);

}
