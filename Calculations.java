package com.service;

public class Calculations implements AmountCalculation{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Double totalAmount=0.0;
	@Override
	public Double Calculation(int quantity, Double itemPrize) {
		totalAmount = totalAmount + (itemPrize * quantity);
		return totalAmount;
	}

}
