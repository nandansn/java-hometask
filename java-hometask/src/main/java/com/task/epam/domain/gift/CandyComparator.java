package com.task.epam.domain.gift;

import java.util.Comparator;

public class CandyComparator implements Comparator<Candy> {

	public int compare(Candy o1, Candy o2) {
		// TODO Auto-generated method stub
		if (o1.getBrandNameOfCandy() != o2.getBrandNameOfCandy())
			return 1;
		if (o1.getCountOfCandy() != o2.getCountOfCandy())
			return 1;
		if (o1.getPriceOfEachCandy() != o2.getPriceOfEachCandy())
			return 1;
		
		return 0;

	}

}
