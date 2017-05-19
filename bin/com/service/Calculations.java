package com.service;

import java.util.List;

public class Calculations implements AmountCalculation{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static List<String> prize = null;

	static List<Integer> quantity = null;
	static Double TotalAmount = 0.0;
	Double totalAmount = 0.0;
	@Override
	public Double Calculation(int quantity, Double itemPrize) {
		totalAmount = totalAmount + (itemPrize * quantity);
		return totalAmount;
	}

}
