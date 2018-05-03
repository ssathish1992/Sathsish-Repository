package com.ecmmenrce.eshopping;

public class WebSite {

	String url;
	String ipAdress;

	void shop() {
		System.out.println("Shopping");
	}

	void deliver() {
		System.out.println("Delivering with help of IndiaPost");

	}

	public WebSite(String url, String ipAdress) {
		this.url = url;
		this.ipAdress = ipAdress;
		System.out.println(this.url+" "+this.ipAdress);
	}

	
}
