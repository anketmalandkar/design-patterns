package com.am.sample.factory;

public class ComputerClient {

	public static void main(String[] args) {
		
		Computer pc = ComputerFactory.createComputer(ComputerType.PC, "1tb", "6gb", "I7");
		
		System.out.println(pc.toString());
		
		Computer server = ComputerFactory.createComputer(ComputerType.SERVER, "20tb", "20gb", "AMD Radion");
		
		System.out.println(server.toString());
		
		Computer superComputer = ComputerFactory.createComputer(ComputerType.SUPERCOMPUTER, "200tb", "200gb", "AMD Radion XXXX");
		
		System.out.println(superComputer.toString());

	}

}
