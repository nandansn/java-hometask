package com.task.epam.domain.gift;

public class Chocolate extends Sweet {

	private int countOfChoclates;
	private String brandNameOfChocolates;
	private int priceOfEachChocolate;

	public Chocolate(int weightOfTheGift, int countOfChoclates, String brandNameOFChocolates, int priceOfEachChocolate) {
		super(weightOfTheGift);
		this.countOfChoclates = countOfChoclates;
		this.brandNameOfChocolates = brandNameOFChocolates;
		this.priceOfEachChocolate = priceOfEachChocolate;
	}

	public int getCountOfChoclates() {
		return countOfChoclates;
	}

	public void setCountOfChoclates(int countOfChoclates) {
		this.countOfChoclates = countOfChoclates;
	}

	public String getBrandNameOFChocolates() {
		return brandNameOfChocolates;
	}

	public void setBrandNameOFChocolates(String brandNameOFChocolates) {
		this.brandNameOfChocolates = brandNameOFChocolates;
	}

	public int getPriceOfEachChocolate() {
		return priceOfEachChocolate;
	}

	public void setPriceOfEachChocolate(int priceOfEachChocolate) {
		this.priceOfEachChocolate = priceOfEachChocolate;
	}

	@Override
	public String toString() {
		return "Chocolate [countOfChoclates=" + countOfChoclates + ", brandNameOfChocolates=" + brandNameOfChocolates
				+ ", priceOfEachChocolate=" + priceOfEachChocolate + "]";
	}
	
	

}
