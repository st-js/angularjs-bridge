package org.stjs.bridge.angularjs;

import org.stjs.javascript.annotation.SyntheticType;
import org.stjs.javascript.jquery.JQueryCore;

@SyntheticType
public interface AngularJQueryCore<FullJQuery extends AngularJQueryCore<?>> extends JQueryCore<FullJQuery> {
	public <T extends Scope> T scope();
}
