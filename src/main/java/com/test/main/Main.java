package com.test.main;

public class Main {

	public String addData() {

		return Constants.APP_NAME + " is initializing";
	}

	public static void main(String[] args) {
		System.out.println("The app is running ...");
		Main main = new Main();
		main.addData();
	}
}
