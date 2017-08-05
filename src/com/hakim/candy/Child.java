/**
 * 
 */
package com.hakim.candy;

/**
 * @author Kamilia_PC
 *
 */
public class Child {
	
	private String name;
	private Integer rating;
	private Integer candyAmount;
	
	public Child(String name, Integer rating) {
		this.name = name;
		this.rating = rating;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getRating() {
		return rating;
	}
	public void setRating(Integer rating) {
		this.rating = rating;
	}
	public Integer getCandyAmount() {
		return candyAmount;
	}
	public void setCandyAmount(Integer candyAmount) {
		this.candyAmount = candyAmount;
	}
	

	@Override
	public String toString() {
		return "Child [name=" + name + ", rating=" + rating + ", candyAmount=" + candyAmount + "]";
	}
	
	

}
