package com.am.sample.builder;

public class TestBuilderPattern {
	public static void main(String[] args) {
		// Using builder to get the object in a single line of code and
		// without any inconsistent state or arguments management issues
		Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
		System.out.println("comp : " + comp.toString());
		Computer comp1 = new Computer.ComputerBuilder("500 GB", "2 GB").setGraphicsCardEnabled(true).build();
		System.out.println("comp1 : " + comp1.toString());
		Computer comp2 = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true).build();
		System.out.println("comp2 : " + comp2.toString());
		Computer comp3 = new Computer.ComputerBuilder("500 GB", "2 GB").build();
		System.out.println("comp2 : " + comp3.toString());
		
	}
}
