package org.stjs.bridge.angularjs.http;

import org.stjs.javascript.annotation.STJSBridge;
import org.stjs.javascript.functions.Callback0;
import org.stjs.javascript.functions.Callback1;
import org.stjs.javascript.functions.Function1;

@STJSBridge
public interface HttpPromise {
    HttpPromise success(Callback0 callback);
    HttpPromise success(Callback1<?> callback);
    HttpPromise error(Callback1<?> callback);
    HttpPromise then(Callback1<?> success);
    HttpPromise then(Callback1<?> success, Callback1<?> error);

    HttpPromise success(Function1<?, ?> callback);
    HttpPromise error(Function1<?, ?> callback);
    HttpPromise then(Function1<?, ?> success);
    HttpPromise then(Function1<?, ?> success, Function1<?, ?> error);
}
