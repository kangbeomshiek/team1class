package com.javalec.base;

import com.javalac.menu.HQ;
import com.javalac.menu.Shop1;
import com.javalac.menu.Shop2;
import com.javalac.menu.Shop3;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop1 shop1 = new Shop1();
		HQ hq = new HQ();
		Shop2 shop2 = new Shop2();
		Shop3 shop3 = new Shop3();
		    
		
		System.out.println("HQ----------------");
			hq.Kimchi();
			hq.Bude();
		    hq.Bibim();
		    hq.Sunde();
		    hq.Bab();
		    System.out.println("Shop1------------");
		    shop1.Kimchi();
		    shop1.Bude();
		    hq.Bibim();
		    shop1.Sunde();
		    hq.Bab();
		    System.out.println("Shop2------------");
		    hq.Kimchi();
		    shop2.Bude();
		    shop2.Bibim();
		    shop2.Sunde();
		    shop2.Bab();
		    System.out.println("Shop3------------");
		    shop3.Kimchi();
		    shop3.Bude();
		    shop3.Bibim();
		    shop3.Sunde();
		    hq.Bab();
		    
		    
		    
	}

}
