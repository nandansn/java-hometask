package com.task.epam.domain.gift;

import java.util.Comparator;

public class ChocolateComparator implements Comparator<Chocolate> {

	public int compare(Chocolate o1, Chocolate o2) {
		// TODO Auto-generated method stub

		return o2.getPriceOfEachChocolate() - o1.getPriceOfEachChocolate();
	}

}
