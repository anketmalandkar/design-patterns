package com.am.sample.singleton;

public class ThreadSafeVolatileSingleton {

	private static volatile ThreadSafeVolatileSingleton instance;

	private ThreadSafeVolatileSingleton() {

	}

	public static ThreadSafeVolatileSingleton getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeVolatileSingleton.class) {
				if (instance == null) {
					instance = new ThreadSafeVolatileSingleton();
				}
			}
		}
		return instance;
	}

}
