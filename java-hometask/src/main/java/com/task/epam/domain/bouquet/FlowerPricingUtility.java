package com.task.epam.domain.bouquet;

import java.util.List;

public class FlowerPricingUtility {

	public static int calculateTotalCost(List<Flower> flowers) {

		int totalCost = 0;

		for (Flower flower : flowers) {

			totalCost = totalCost + flower.getPrice();

		}

		return totalCost;

	}

}
