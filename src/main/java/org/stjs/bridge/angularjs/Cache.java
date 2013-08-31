package org.stjs.bridge.angularjs;

public abstract class Cache {

	public native CacheInfo info ();

	public native <T> T put (String key, T value);

	public native <T> T get (String key);

	public native void remove (String key);

	public native void removeAll ();

	public native void destroy ();

}
