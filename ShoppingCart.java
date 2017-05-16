package com.shoping;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.service.Calculations;

public class ShoppingCart {
	/**
	 * 
	 */
	private static Scanner scanner;
	static List<String> prize = null;
	static List<String> itemeName = null;
	static List<Double> prizes = null;
	static List<String> itemCodes = null;
	static List<Integer> quantity = null;
	Double TotalAmount = 0.0;

	public void prizeDetials() {
		try {
			scanner = new Scanner(new File("src/PrizeDetails.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner file = scanner.useDelimiter(",\\s*");
		prize = new ArrayList<String>();
		prizes = new ArrayList<Double>();
		itemCodes = new ArrayList<String>();
		itemeName = new ArrayList<String>();
		while (file.hasNext()) {
			prize.add(file.next().toString());
		}
		file.close();
		for (String itemCodess : prize) {
			itemCodes.add(itemCodess.split("=")[0].toString());
			itemeName.add(itemCodess.split("=")[1].toString());
			prizes.add(Double.parseDouble(itemCodess.split("=")[2].toString()));
		}
	}

	public void displayMenu() throws IOException {
		Calculations i = new Calculations();
		quantity = new ArrayList<Integer>();
		for (int j = 0; j < itemeName.size(); j++) {
			System.out.println("Enter the quantity of::::" + itemeName.get(j));
			try {
				scanner = new Scanner(System.in);
				int number;
				do {
					while (!scanner.hasNextInt()) {
						String input = scanner.next();
						System.out.printf("%s is not a valid number.\n", input);
					}
					number = scanner.nextInt();
				} while (number < 0);
				TotalAmount = i.Calculation(number, prizes.get(j));
				System.out.println("totalAmount::::" + TotalAmount);
				quantity.add(number);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		System.out.println("Shopping items");
		System.out.println("Item Name   prize    quantity    Amount");
		for (int k = 0; k < quantity.size(); k++) {
			if (!(quantity.get(k) == 0)) {
				System.out.println(itemeName.get(k) + "      " + prizes.get(k)
						+ " *      " + quantity.get(k) + "        "
						+ (prizes.get(k) * quantity.get(k)));
			}
		}
		System.out.println("             TotalAmount=        " + TotalAmount);
	}

	public static void main(String[] args) throws IOException {
		ShoppingCart i = new ShoppingCart();
		i.prizeDetials();
		i.displayMenu();
	}

}
