package com.am.sample.singleton.clonesafe;

public class CloneableParent implements Cloneable {

	/* Senario 1 */
	// when no clone() is not overide

	/* Senario 2 */
	@Override
	protected Object clone() {
		return this.clone();
	}

}
