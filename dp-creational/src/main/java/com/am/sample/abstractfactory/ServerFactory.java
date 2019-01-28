package com.am.sample.abstractfactory;

public class ServerFactory implements ComputerAbstractFactory {

	private String HDD;
	private String RAM;
	private String CPU;

	public ServerFactory(String hDD, String rAM, String cPU) {
		super();
		HDD = hDD;
		RAM = rAM;
		CPU = cPU;
	}

	@Override
	public Computer createComputer() {
		return new Server(HDD, RAM, CPU);
	}

}
