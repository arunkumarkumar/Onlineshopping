package com.project.Onlineshop;

import java.util.Map;
import java.util.Scanner;

import com.dt.database.DataBaseConnc;

public class CartOptions {
	DataBaseConnc vd=new DataBaseConnc();
	protected void choiceCart(SetGetdatas u) {
		try {
		System.out.println("--------------------------------------");
		System.out.println("press --1-- for show the cart product");
		System.out.println("press --2-- remove the product from cart");
		System.out.println("press --3-- for payment gateway");
		System.out.println("press --4-- for continue shopping");
	    u.setChoicecart(u.getInput().nextInt());
		switch (u.getChoicecart()) {
		case 1: {
			u.getCarts().showCart(u);
			break;
		}
		case 2: {
			u.getCarts().removeCart(u);
			break;
		}
		case 3:{
			u.getCarts().paymentWay(u);
			break;
		}
		case 4:{
			u.getProdcate().productCategory(u);
		}

		}
		}catch (Exception e) {
			System.err.println(e);
		}

	}public void showCart(SetGetdatas u) {
		try {
		for (Map.Entry<String,Integer> string : u.getYrproduct().entrySet()) {
			System.out.println("!!! THESE  ARE THE PRODUCTS YOU SELECTED !!!");
			System.out.println("product- " +string.getKey()+   " price- " +"RS."+string.getValue());
		}
			try {
			Thread.sleep(2000);
			System.out.println("IF YOU WANT REMOVE THE PRODUCT CLICK <<--YES \n NO-->> FOR THE OTHER MODIFICATION ");
			String start = u.getInput().next();
			if (start.equalsIgnoreCase("yes")) {
				u.getCarts().removeCart(u);
			}
			else if(start.equalsIgnoreCase("no")) {
				u.getCarts().choiceCart(u);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
		}catch (Exception e) {
			System.err.println(e);
		}
		
	}

	public void removeCart(SetGetdatas u) {
		try {
			for (Map.Entry<String,Integer> string : u.getYrproduct().entrySet()) {
				System.out.println("product- " +string.getKey()+   " price- " +"RS."+string.getValue());
			}
			System.out.println("WHICH PRODUCT YOU WANT TO REMOVE FROM THE CART ?");
			String remve = u.getInput().next();
			if (OnlineShooping.u.getYrproduct().containsKey(remve)) {
				OnlineShooping.u.getYrproduct().remove(remve);
				System.out.println("YOUR PRODUCT IS REMOVED....");
				u.getCarts().choiceCart(u);
			} else {
				System.out.println("ITS NOT IN THE CART,TRY AGAIN");
				u.getCarts().removeCart(u);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

	public void paymentWay(SetGetdatas u) {
		try {
		for (Map.Entry<String,Integer> string : u.getYrproduct().entrySet()) {
			System.out.println("product- " +string.getKey()+   " price- " +"RS."+string.getValue());
			u.setFinalamount(u.getFinalamount()+string.getValue());
		}
		System.out.println("YOUR FINAL AMOUNT FOR ABOVE PRODUCTS "+u.getFinalamount());
		vd.dataBase(u);
		}catch (Exception e) {
			System.err.println(e);
		}
	}

}
