package com.jacoco.test;

import org.testng.annotations.Test;

import com.jacoco.app.CarDetails;

public class DemoTest {
	@Test
	public void demoTest() {
		CarDetails carDetails = new CarDetails();
		carDetails.getCarDetails(true);
	}
	
	@Test
	public void demoTest1() {
		CarDetails carDetails = new CarDetails();
		carDetails.getCarDetails(false);
	}
}
