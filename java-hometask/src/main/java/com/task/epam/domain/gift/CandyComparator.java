package com.task.epam.domain.gift;

import java.util.Comparator;

public class CandyComparator implements Comparator<Candy> {

	public int compare(Candy o1, Candy o2) {
		// TODO Auto-generated method stub
		System.out.println(o1.getBrandNameOfCandy());
		if (o2.getBrandNameOfCandy() == o1.getBrandNameOfCandy())
			return 0;
		else
			return 1;

	}

}
