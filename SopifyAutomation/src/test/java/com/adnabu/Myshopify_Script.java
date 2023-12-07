package com.adnabu;

import org.testng.annotations.Test;

public class Myshopify_Script extends Myshopify_Scenario {
	@Test
	public void getLunchUrl_test() {
		getLunchUrl();
		
	}
	@Test
	public void getsearchData_test() {
		getsearchData("EARRINGS");
		
	}
	@Test
	public void getfilterhData_test() {
		getfilterhData();
		
		
	}
	@Test
	public void aDDTOCarthData_test() {
		
		aDDTOCart();
		
		
	}
	@Test
	public void removeproduct_test() {
		 
		removeproduct();
		
	}
	
}
