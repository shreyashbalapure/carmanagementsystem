package com.jspiders.cardekho.operations;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.jspiders.cardekho.entity.Car;

public class CarOperation {
	ArrayList<Car> arrayList = new ArrayList<Car>();

	public void add(Scanner scanner) {
		Car car = new Car();
		System.out.println("enter the id");
		car.setId(scanner.nextInt());
		System.out.println("enter the car name");
		car.setName(scanner.next());
		System.out.println("enter the car brand");
		car.setBrand(scanner.next());
		System.out.println("enter the price");
		car.setPrice(scanner.nextDouble());

		arrayList.add(car);

		System.out.println("car is added");

	}

	public void remove(Scanner scanner) {
		System.out.println("enter id of the car to remove details :");
		int idToRemove = scanner.nextInt();

		Iterator<Car> iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			Car car = iterator.next();
			if (car.getId() == idToRemove) {
				iterator.remove();
				System.out.println("car of id " + idToRemove + " removed successfully.");
				return;
			}
		}

		System.out.println("car of id " + idToRemove + " not found.");
	}

	public void update(Scanner scanner) {
		System.out.println("Enter ID of the car that you want to update:");
		int idToUpdate = scanner.nextInt();

		for (Car car : arrayList) {
			if (car.getId() == idToUpdate) {
				System.out.println("Enter new name:");
				car.setName(scanner.next());

				System.out.println("Enter new brand:");
				car.setBrand(scanner.next());

				System.out.println("Enter new price:");
				car.setPrice(scanner.nextDouble());

				System.out.println("Car with ID " + idToUpdate + " updated successfully.");
				return;
			}
		}

		System.out.println("Car with ID " + idToUpdate + " not found.");
	}

	public void search() {
		System.out.println("===============================");
		System.out.println("======Details of the Cars======");
		System.out.println("===============================");

		for (Car details : arrayList) {
			System.out.println(details);
		}
		System.out.println("===============================");
		// System.out.println(arrayList[0]);

	}

}
