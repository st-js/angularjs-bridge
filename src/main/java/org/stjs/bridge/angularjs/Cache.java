package org.stjs.bridge.angularjs;

public abstract class Cache {

	public abstract CacheInfo info();

	public abstract <T> T put(String key, T value);

	public abstract <T> T get(String key);

	public abstract void remove(String key);

	public abstract void removeAll();

	public abstract void destroy();

}
