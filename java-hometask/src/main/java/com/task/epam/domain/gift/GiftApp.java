package com.task.epam.domain.gift;

import java.util.ArrayList;
import java.util.List;

public class GiftApp {

	public static void main(String[] args) {

		Candy candyOne = new Candy(5, 5, "E", 1);
		Candy candyTwo = new Candy(6, 4, "A", 10);
		Candy candyThree = new Candy(4, 15, "C", 20);
		Candy candyFour = new Candy(3, 13, "D", 15);
		Candy candyFive = new Candy(1, 14, "F", 4);

		Chocolate chocolateOne = new Chocolate(10, 3, "Bull", 2);
		Chocolate chocolateTwo = new Chocolate(12, 3, "Apple", 3);
		Chocolate chocolateThree = new Chocolate(11, 3, "Brownie", 4);
		Chocolate chocolateFour = new Chocolate(13, 3, "Creamy", 1);

		List<Sweet> sweets = new ArrayList<Sweet>();
		sweets.add(candyOne);
		sweets.add(chocolateOne);

		Gift newYearGift = new Gift(sweets);

		System.out.println("Total weight of the gift:" + newYearGift.calculateWeight());
		
		
		List<Chocolate> chocolates = new ArrayList<Chocolate>();
		chocolates.add(chocolateOne);
		chocolates.add(chocolateTwo);
		chocolates.add(chocolateThree);
		chocolates.add(chocolateFour);
		
		
		List<Candy> candies = new ArrayList<Candy>();
		candies.add(candyOne);
		candies.add(candyTwo);
		candies.add(candyThree);
		candies.add(candyFour);
		candies.add(candyFive);
		
		
		
		SweetProcessingUtility.sortChocolateByPrice(chocolates);
		
		for (Chocolate chocolate : chocolates) {
			
			System.out.println(chocolate);
			
		}
		
		SweetProcessingUtility.sortCandyByBrandName(candies);
		for (Candy candy : candies) {
			
			System.out.println(candy);
			
		}
		
		Candy candyKey = new Candy(1, 14, "F", 4);
		System.out.println("Candy Found:"+SweetProcessingUtility.findTheCandy(candies, candyKey));

	}

}
