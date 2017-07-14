package com.task.epam.domain.bouquet;

import java.util.ArrayList;
import java.util.List;

public class BouquetApp {

	public static void main(String[] args) {

		// Create bunch of flowers and find the total cost of the bouquet

		List<Flower> flowers = new ArrayList<Flower>();

		// Create bunch of jasmine and rose. Add it to the bouquet.
		Jasmine jasmineOne = new Jasmine(10);
		Jasmine jasmineTwo = new Jasmine(20);
		Jasmine jasmineThree = new Jasmine(14);
		Jasmine jasmineOFour = new Jasmine(13);

		flowers.add(jasmineOne);
		flowers.add(jasmineTwo);
		flowers.add(jasmineThree);
		flowers.add(jasmineOFour);

		Rose roseOne = new Rose(10);
		Rose roseTwo = new Rose(20);
		Rose roseThree = new Rose(14);
		Rose roseOFour = new Rose(13);

		flowers.add(roseOne);
		flowers.add(roseTwo);
		flowers.add(roseThree);
		flowers.add(roseOFour);

		// Get Total cost

		System.out.println(FlowerPricingUtility.calculateTotalCost(flowers));

	}

}
