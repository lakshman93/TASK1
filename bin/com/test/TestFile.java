package com.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;
import org.junit.Test;
import com.service.Calculations;
import com.shoping.ShoppingCart;

public class TestFile extends TestCase {

	@Test
	public void testAddList() {
		List<String> prizes = new ArrayList<String>();
		prizes.add("A001=Bananas=10.00");
		prizes.add("A002=Oranges=20.00");
		prizes.add("A003=Apples=30.00");
		prizes.add("A004=Lemons=40.00");
		prizes.add("A005=Peaches=50.00");
		ShoppingCart.prizeDetials(prizes);
	}

	@Test
	public void testCalculation() {
		Calculations calc = new Calculations();
		Double value = calc.Calculation(1, 1.1);
		assertEquals(1.1, value);
		assertNotNull(value);
	}

	@Test
	public void testdisplay() throws IOException {
		List<Integer> quantity = new ArrayList<Integer>();
		quantity.add(1);
		quantity.add(1);
		quantity.add(1);
		quantity.add(1);
		quantity.add(1);
		Double value = ShoppingCart.displayMenu(quantity);
		assertEquals(150.0, value);
		assertNotNull(value);
	}

}
