package com.am.sample.abstractfactory;

public class SuperComputerFactory implements ComputerAbstractFactory {

	private String HDD;
	private String RAM;
	private String CPU;

	public SuperComputerFactory(String hDD, String rAM, String cPU) {
		super();
		HDD = hDD;
		RAM = rAM;
		CPU = cPU;
	}

	@Override
	public Computer createComputer() {
		return new SuperComputer(HDD, RAM, CPU);
	}

}
