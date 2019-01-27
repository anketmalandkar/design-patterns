package com.am.sample.builder;

public class Computer {

	private String hdd;
	private String ram;

	private boolean isGraphicsCardEnabled;
	private boolean isBluetoothEnabled;

	public Computer(ComputerBuilder computerBuilder) {
		this.hdd = computerBuilder.hdd;
		this.ram = computerBuilder.ram;
		this.isGraphicsCardEnabled = computerBuilder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = computerBuilder.isBluetoothEnabled;
	}

	public String getHdd() {
		return hdd;
	}

	public String getRam() {
		return ram;
	}

	public boolean isGraphicsCardEnabled() {
		return isGraphicsCardEnabled;
	}

	public boolean isBluetoothEnabled() {
		return isBluetoothEnabled;
	}

	public static class ComputerBuilder {

		private String hdd;
		private String ram;

		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;

		public ComputerBuilder(String hdd, String ram) {
			super();
			this.hdd = hdd;
			this.ram = ram;
		}

		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}

		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}

	@Override
	public String toString() {
		return "Computer [hdd=" + hdd + ", ram=" + ram + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
				+ ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
	}
	
	

}
