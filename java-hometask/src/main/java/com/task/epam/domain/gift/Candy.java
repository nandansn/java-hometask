package com.task.epam.domain.gift;

public class Candy extends Sweet{
	
	private int countOfCandy;
	private String brandNameOfCandy;
	private int priceOfEachCandy;
	
	

	public Candy(int weightOfSweet, int countOfCandy, String brandNameOfCandy, int priceOfEachCandy) {
		super(weightOfSweet);
		this.countOfCandy = countOfCandy;
		this.brandNameOfCandy = brandNameOfCandy;
		this.priceOfEachCandy = priceOfEachCandy;
	}

	public int getCountOfCandy() {
		return countOfCandy;
	}

	public void setCountOfCandy(int countOfCandy) {
		this.countOfCandy = countOfCandy;
	}

	public String getBrandNameOfCandy() {
		return brandNameOfCandy;
	}

	public void setBrandNameOfCandy(String brandNameOfCandy) {
		this.brandNameOfCandy = brandNameOfCandy;
	}

	public int getPriceOfEachCandy() {
		return priceOfEachCandy;
	}

	public void setPriceOfEachCandy(int priceOfEachCandy) {
		this.priceOfEachCandy = priceOfEachCandy;
	}

	@Override
	public String toString() {
		return "Candy [countOfCandy=" + countOfCandy + ", brandNameOfCandy=" + brandNameOfCandy + ", priceOfEachCandy="
				+ priceOfEachCandy + "]";
	}

	
	
	

}
