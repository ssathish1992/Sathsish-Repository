package com.ecmmenrce.eshopping;

public class Person {
	void shopping() {

		Browser b = new Browser();
		WebSite w = b.enterDetails();

		w.shop();

		if (w instanceof Amazon) {
			Amazon a = (Amazon) w;
			a.amazonPay();
		} else if (w instanceof Flipkart) {
			Flipkart f = (Flipkart) w;
			f.shopGiftCard();

		}

		if (w instanceof Paytm) {
			Paytm p = (Paytm) w;
			p.bookMovieTicket();
		}

		w.deliver();
 
	}
	
	public static void main(String[] args) {
		Person p = new Person();
		p.shopping();
	}

}
