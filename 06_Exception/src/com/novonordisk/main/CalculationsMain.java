package com.novonordisk.main;

import com.novonordisk.domain.Calculations;

public class CalculationsMain {
	public static void main(String[] args) {
		System.out.println("main start");
		
		Calculations calculations = new Calculations();
		
		calculations.accept();
		calculations.caluclateResult();
		calculations.display();
		
		System.out.println("main end");
	}
}
