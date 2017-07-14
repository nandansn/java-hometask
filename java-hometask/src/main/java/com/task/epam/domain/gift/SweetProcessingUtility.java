package com.task.epam.domain.gift;

import java.util.Collections;
import java.util.List;

public class SweetProcessingUtility {

	public static List<Chocolate> sortChocolateByPrice(List<Chocolate> chocolates) {

		Collections.sort(chocolates, new ChocolateComparator());

		return chocolates;

	}

	public static boolean findTheCandy(List<Candy> candies, Candy key) {
		
		

		if (Collections.binarySearch(candies, key, new CandyComparator()) == 0) {
			return true;
		} else {

			return false;
		}
	}

}
