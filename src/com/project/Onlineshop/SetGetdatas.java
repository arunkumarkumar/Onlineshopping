package com.project.Onlineshop;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SetGetdatas {
	private String userpass;
	private String password;
	private String groceryproduct;
	private String mobileproduct;
	private String menproduct;
	private String womenprdoct;
	private String electroniprodu;
	private String applianproduct;
	private String productchoice;
	private int choicecart;
	private int finalamount;
	private CartOptions carts= new CartOptions();
    private OnlineShooping shop = new OnlineShooping();
    private Scanner input = new Scanner(System.in);
    private UserNamepass user=new UserNamepass();
    private Map<String,Integer> yrproduct = new HashMap<String,Integer>();
   private ProductCategory prodcate = new ProductCategory();
	public String getProductchoice() {
		return productchoice;
	}
	public void setProductchoice(String productchoice) {
		this.productchoice = productchoice;
	}
	public String getElectroniprodu() {
		return electroniprodu;
	}
	public void setElectroniprodu(String electroniprodu) {
		this.electroniprodu = electroniprodu;
	}
	public String getUserpass() {
		return userpass;
	}
	public void setUserpass(String userpass) {
		this.userpass = userpass;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGroceryproduct() {
		return groceryproduct;
	}
	public void setGroceryproduct(String groceryproduct) {
		this.groceryproduct = groceryproduct;
	}
	public String getMobileproduct() {
		return mobileproduct;
	}
	public void setMobileproduct(String mobileproduct) {
		this.mobileproduct = mobileproduct;
	}
	public String getMenproduct() {
		return menproduct;
	}
	public void setMenproduct(String menproduct) {
		this.menproduct = menproduct;
	}
	public String getWomenprdoct() {
		return womenprdoct;
	}
	public void setWomenprdoct(String womenprdoct) {
		this.womenprdoct = womenprdoct;
	}
	public String getApplianproduct() {
		return applianproduct;
	}
	public void setApplianproduct(String applianproduct) {
		this.applianproduct = applianproduct;
	}
	public int getChoicecart() {
		return choicecart;
	}
	public void setChoicecart(int choicecart) {
		this.choicecart = choicecart;
	}
	public int getFinalamount() {
		return finalamount;
	}
	public void setFinalamount(int finalamount) {
		this.finalamount = finalamount;
	}
	public CartOptions getCarts() {
		return carts;
	}
	public OnlineShooping getShop() {
		return shop;
	}
	public Scanner getInput() {
		return input;
	}
	public UserNamepass getUser() {
		return user;
	}
	public Map<String,Integer> getYrproduct() {
		return yrproduct;
	}
	public ProductCategory getProdcate() {
		return prodcate;
	}
	
	

 
	
}


