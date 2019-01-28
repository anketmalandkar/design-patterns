package com.am.sample.factory;

public class ComputerFactory {

	public static Computer createComputer(ComputerType computerType, String hdd, String ram, String cpu) {
		Computer computer = null;
		switch (computerType) {
		case PC:
			computer = new PersonalComputer(hdd, ram, cpu);
			break;
		case SERVER:
			computer = new Server(hdd, ram, cpu);
			break;
		case SUPERCOMPUTER:
			computer = new SuperComputer(hdd, ram, cpu);
			break;
		}
		return computer;
	}

}
