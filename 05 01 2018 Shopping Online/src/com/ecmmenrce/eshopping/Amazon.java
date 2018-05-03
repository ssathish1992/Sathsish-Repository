package com.ecmmenrce.eshopping;

public class Amazon extends WebSite {

	public Amazon() {
		super("www.Amazon.com", "993.89393.989393.3993");
		
	}
	void amazonPay()
	{
		System.out.println("Amazon Pay");
		
	}
	
	@Override
	void deliver() {
	System.out.println("Delivering through amazon delivery");
	}
}
