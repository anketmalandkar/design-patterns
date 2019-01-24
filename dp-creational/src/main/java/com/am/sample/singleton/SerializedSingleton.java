package com.am.sample.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4849692390981001832L;

	private SerializedSingleton() {

	}

	private static class SingletonHelper {
		private static SerializedSingleton INSTANCE = new SerializedSingleton();
	}

	public static SerializedSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

	protected Object readResolve() {
		return getInstance();
	}

}
