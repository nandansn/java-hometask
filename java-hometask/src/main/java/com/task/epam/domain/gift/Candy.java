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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		
		result = prime * result + countOfCandy;
		result = prime * result + priceOfEachCandy;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Candy other = (Candy) obj;
		if (brandNameOfCandy != other.brandNameOfCandy)
			return false;
		if (countOfCandy != other.countOfCandy)
			return false;
		if (priceOfEachCandy != other.priceOfEachCandy)
			return false;
		
		return true;
	}
	
	

}
