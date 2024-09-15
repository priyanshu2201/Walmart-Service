package com.walmart.model;

import javax.persistence.Embeddable;

@Embeddable
public class Rating {

	private String rate;
	private String count;
	public Rating() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rating(String rate, String count) {
		super();
		this.rate = rate;
		this.count = count;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}
	@Override
	public String toString() {
		return "Rating [rate=" + rate + ", count=" + count + "]";
	}
	
	
}
