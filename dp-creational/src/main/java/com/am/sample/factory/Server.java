package com.am.sample.factory;

public class Server implements Computer {

	private String HDD;
	private String RAM;
	private String CPU;

	public Server(String hDD, String rAM, String cPU) {
		super();
		HDD = hDD;
		RAM = rAM;
		CPU = cPU;
	}

	@Override
	public String HDD() {
		return this.HDD;
	}

	@Override
	public String RAM() {
		return this.RAM;
	}

	@Override
	public String CPU() {
		return this.CPU;
	}

	@Override
	public String toString() {
		return "Server [HDD=" + HDD + ", RAM=" + RAM + ", CPU=" + CPU + "]";
	}

}
