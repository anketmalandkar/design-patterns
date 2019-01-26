package com.am.sample.singleton.serializationsafe;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4849692390981001832L;
	
	//make addition field transient 
	private transient long transValue = 0L;

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
