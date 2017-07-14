package com.task.epam.domain.gift;

import java.util.Comparator;

public class CandiesSort implements Comparator<Candy>{

	public int compare(Candy o1, Candy o2) {
		// TODO Auto-generated method stub
		return o2.getBrandNameOfCandy().compareTo(o1.getBrandNameOfCandy());
	}

}
