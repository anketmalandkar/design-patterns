package com.am.sample.singleton.clonesafe;

public class SingletonChild extends CloneableParent {

	private static SingletonChild instance = new SingletonChild();

	private SingletonChild() {

	}

	public static SingletonChild getInstance() {
		return instance;
	}

	/* Senario 1 
	 * 
	 * @Override 
	 * protected Object clone() throws CloneNotSupportedException { 
	 * throw new CloneNotSupportedException(); 
	 * }
	 */

	/*
	 * Senario 2 
	 * 
	 * Compiler error : Exception CloneNotSupportedException is not
	 * compatible with throws clause in CloneableParent.clone()
	 */
	/*
	 * @Override protected Object clone() throws CloneNotSupportedException { 
	 * throw new CloneNotSupportedException(); 
	 * }
	 */

	/* Senario 2
	 * 
	 *  Without compiler error*/

	@Override
	protected Object clone() {
		throw new RuntimeException("Clone Not Supported");
	}

}
