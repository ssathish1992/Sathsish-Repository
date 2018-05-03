package com.ecmmenrce.eshopping;

import java.util.*;

public class Browser {

	WebSite enterDetails() {
		Random r = new Random();
		int n = r.nextInt(3) + 1;

		if (n == 1) {
			return new Amazon();
		} else if (n == 2) {
			return new Flipkart();

		} else
			return new Paytm();

	}
}
