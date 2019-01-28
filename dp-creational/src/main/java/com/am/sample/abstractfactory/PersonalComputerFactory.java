package com.am.sample.abstractfactory;

public class PersonalComputerFactory implements ComputerAbstractFactory {

	private String HDD;
	private String RAM;
	private String CPU;

	public PersonalComputerFactory(String hDD, String rAM, String cPU) {
		super();
		HDD = hDD;
		RAM = rAM;
		CPU = cPU;
	}

	@Override
	public Computer createComputer() {
		return new PersonalComputer(HDD, RAM, CPU);
	}

}
