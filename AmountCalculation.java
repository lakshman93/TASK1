package com.service;
import java.io.Serializable;

 public interface AmountCalculation extends Serializable, Cloneable{

//		void Calculation(int quantity, String itemCode,Double itemPrize);
		Double Calculation(int quantity,Double itemPrize);
    }