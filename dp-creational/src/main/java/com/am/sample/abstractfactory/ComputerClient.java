package com.am.sample.abstractfactory;

public class ComputerClient {
	
	public static void main(String args[]) {
		Computer pc = ComputerFactory.getComputer(new PersonalComputerFactory("1tb", "4gb", "I7"));
		
		System.out.println(pc.toString());
		
		Computer server = ComputerFactory.getComputer(new ServerFactory("10tb", "40gb", "I7 ++"));
		
		System.out.println(server.toString());
		
		Computer superComputer = ComputerFactory.getComputer(new SuperComputerFactory("100tb", "400gb", "I7 +++"));
		
		System.out.println(superComputer.toString());
	}

}
