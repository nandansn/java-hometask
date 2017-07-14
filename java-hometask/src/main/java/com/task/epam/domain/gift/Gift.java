package com.task.epam.domain.gift;

import java.util.List;

public class Gift implements Weight {

	private List<Sweet> sweets;

	public Gift(List<Sweet> sweets) {
		super();
		this.sweets = sweets;
	}

	public List<Sweet> getSweets() {
		return sweets;
	}

	public void setSweets(List<Sweet> sweets) {
		this.sweets = sweets;
	}

	public int calculateWeight() {
		// TODO Auto-generated method stub

		int totalWeightOfTheGift = 0;

		for (Sweet sweet : this.getSweets()) {

			totalWeightOfTheGift = totalWeightOfTheGift + sweet.getWeightOfSweet();
		}
		return totalWeightOfTheGift;
	}
	
	

}
