package com.jspiders.cardekho.main;

import java.util.Scanner;

import com.jspiders.cardekho.operations.CarOperation;

public class CarMain {

	public static void main(String[] args) {

		CarOperation carOperation = new CarOperation();
		boolean condition = true;
		while (condition) {
			System.out
					.println("===============================\nCAR DEKHO APPLICATION\n===============================");
			System.out.println(
					"Enter 1 to add details\nEnter 2 to remove details\nEnter 3 update to add details\nEnter 4 to search details\nEnter 5 to Exit\n");

			Scanner scanner = new Scanner(System.in);

			System.out.println("Enter Your Choise:");

			int choise = scanner.nextInt();

			switch (choise) {
				case 1: {

					carOperation.add(scanner);

					break;
				}
				case 2: {

					carOperation.remove(scanner);

					break;
				}
				case 3: {

					carOperation.update(scanner);

					break;
				}
				case 4: {

					carOperation.search();

					break;
				}
				case 5: {
					System.out.println("Thank you.......");
					condition = false;

					break;
				}
				default:

					System.out.println("Enter the valid choise please");

			}

		}

	}

}
