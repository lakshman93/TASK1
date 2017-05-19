package com.service;
import java.io.Serializable;

 public interface AmountCalculation extends Serializable, Cloneable{

		Double Calculation(int quantity,Double itemPrize);
    }
