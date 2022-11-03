package com.project.Onlineshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class ProductCategory {
	
	 public void productCategory(SetGetdatas u ) {
			try {
				try{
				Thread.sleep(2000);
				System.out.println("------WELCOME TO E-SHOPPING------");
				}
				catch (Exception e) {
					System.err.println(e);
				}
				try{
					Thread.sleep(2000);
				System.out.println("---THESE ALL ARE PRODUCT CATEGORIES---");
				List<String> km = new ArrayList<String>();
				km.add("GROCERY");
				km.add("MOBILES");
				km.add("FASHION");
				km.add("ELECTRONICS");
				km.add("APPLIANCES");
				for (String string : km) {
					System.out.println(string);
				}
				}
				catch (Exception e) {
					System.out.println(e);
				}
				System.out.println("WHICH PRODUCT CATEGORY YOU WANT TO CHOOSE ?");
				u.setProductchoice(u.getInput().next());
				if (u.getProductchoice().equalsIgnoreCase("Grocery")) {
					System.out.println("----SO YOU CHOOSE->>>>" + u.getProductchoice());
					u.getProdcate().groceryList(u);
				} else if (u.getProductchoice().equalsIgnoreCase("mobiles")) {
					System.out.println("SO YOU CHOOSE   " + u.getProductchoice());
					u.getProdcate().mobilesList(u);
				} else if (u.getProductchoice().equalsIgnoreCase("fashion")) {
					System.out.println("SO YOU CHOOSE   " + u.getProductchoice());
					u.getProdcate().fashionList(u);
				} else if (u.getProductchoice().equalsIgnoreCase("electronics")) {
					System.out.println("SO YOU CHOOSE   " + u.getProductchoice());
					u.getProdcate().electronicsList(u);
				} else if (u.getProductchoice().equalsIgnoreCase("appliances")) {
					System.out.println("SO YOU CHOOSE   " + u.getProductchoice());
					u.getProdcate().applianceList(u);
				} else {
					System.out.println(" ");
					System.out.println("SOMETHING WRONG TRY AGAIN");
					u.getProdcate().productCategory(u);
				}
			} catch (Exception e) {
				System.err.println(e);
			}
		}

		public void groceryList(SetGetdatas u) {
			try {
				System.out.println("--------------------------------------");
				System.out.println("----GROCERY CATEGORIES----");
				Map<String,Integer> de = new LinkedHashMap<String,Integer>();
				de.put("GOLDWINNER",120);
				de.put("HARPICPOWERPLUS",45);
				de.put("ONION",80);
				de.put("DETTOLHANDWASH",30);
				de.put("TATATEA",60);
				de.put("RAGIFLOUR",65);
				de.put("CHOCOLATE",57);
				for (Map.Entry<String,Integer> string : de.entrySet()) {
					System.out.println("product- " +string.getKey()+   "-->" +"RS."+string.getValue());
				}
				System.out.println("!!! CHOOSE OUR PRODUCT !!!");
				u.setGroceryproduct(u.getInput().next());
				if (de.containsKey(u.getGroceryproduct())) {
					u.getYrproduct().put(u.getGroceryproduct(),de.get(u.getGroceryproduct()));
					System.out.println("!!! PRODUCT ADD TO CART SUCESSFULLY !!!");
					System.out.println(u.getYrproduct().size() + " PRODUCTS IN THE CART");
					System.out.println("--------------------------------------");
					System.out.println("!!! DO YOU WANT TO SEE THE PRODUCT IN CART CLICK<<--YES \n NO-->>FOR CONTINUE SHOPPING !!!");
					String cart = u.getInput().next();
					if (cart.equalsIgnoreCase("yes")) {
						u.getCarts().choiceCart(u);
					} else if (cart.equalsIgnoreCase("no")) {
						System.out.println("--------------------------------------");
						System.out.println("!!! DO YU WANT TO CONTINUE IN GROCERY CATEGORY CLICK<<--YES \n-->>NO FOR MAIN CATEGORY !!!");
						String decis = u.getInput().next();
						if (decis.equalsIgnoreCase("yes")) {
							u.getProdcate().groceryList(u);
						} else if (decis.equalsIgnoreCase("no")) {
							u.getProdcate().productCategory(u);
						}
					}
				}
				else {
					System.out.println("!!! WRONG PRODUCT TRY AGAIN !!!");
					u.getProdcate().groceryList(u);
				}
			} catch (Exception e) {
				System.err.println(e);
			}
		}

		public void mobilesList(SetGetdatas u) {
			try {
				System.out.println("--------------------------------------");
				System.out.println("----MOBILES CATEGORIES----");
				Map<String,Integer> link = new HashMap<String,Integer>();
				link.put("REDMIA1",15000);
				link.put("GALAXYF13",13000);
				link.put("MOTOROLA30",14000);
				link.put("INFINIX11",10000);
				link.put("REALME9",16000);
				link.put("VIVO20",10000);
				link.put("OPPO5G",17000);
				for (Map.Entry<String,Integer> string : link.entrySet()) {
					System.out.println("product- " +string.getKey()+   "-->" +"RS."+string.getValue());
				}
				System.out.println("!!! CHOOSE OUR PRODUCT !!!");
			    u.setMobileproduct(u.getInput().next());
				if (link.containsKey(u.getMobileproduct())) {
					u.getYrproduct().put(u.getMobileproduct(),link.get(u.getMobileproduct()));
					System.out.println("!!! PRODUCT ADD TO CART SUCESSFULLY");
					System.out.println(u.getYrproduct().size() + " PRODUCTS IN THE CART");
					System.out.println("--------------------------------------");
					System.out.println("!!! DO YOU WANT TO SEE THE PRODUCT IN CART CLICK<<--YES \n NO-->>FOR CONTINUE SHOPPING !!!");
					String cart = u.getInput().next();
					if (cart.equalsIgnoreCase("yes")) {
						u.getCarts().choiceCart(u);
					} else if (cart.equalsIgnoreCase("no")) {
						System.out.println("--------------------------------------");
						System.out.println("!!! DO YU WANT TO CONTINUE IN MOBILES CATEGORY SHOOPING CLICK<<--YES OR NO-->>FOR MAIN CATEGORY !!!");
						String decis1 = u.getInput().next();
						if (decis1.equalsIgnoreCase("yes")) {
							u.getProdcate().mobilesList(u);
						} else if (decis1.equalsIgnoreCase("no")) {
							u.getProdcate().productCategory(u);
						}
					}
				} else {
					System.out.println("!!! WRONG PRODUCT TRY AGAIN !!!");
					u.getProdcate().mobilesList(u);
				}
			} catch (Exception e) {
				System.err.println(e);
			}
		}

		public void fashionList(SetGetdatas u) {
			try {
				System.out.println("--------------------------------------");
				System.out.println("----MOBILES CATEGORIES----");
				Set<String> set = new TreeSet<String>();
				set.add("menswear");
				set.add("womenwear");
				for (String string : set) {
					System.out.println(string);
				}
				System.out.println("!!! CHOOSE YOUR  WEAR !!!");
				String fash = u.getInput().next();
				if (fash.equalsIgnoreCase("menswear")) {
					u.getProdcate().menList(u);
				} else if (fash.equalsIgnoreCase("womenwear")) {
					u.getProdcate().womenList(u);
				}
				
			} catch (Exception e) {
				System.err.println(e);
			}
		}

		public void menList(SetGetdatas u) {
			try {
				System.out.println("--------------------------------------");
				System.out.println("----MENSWEAR PRODUCTS----");
				Map<String,Integer> hash = new HashMap<String,Integer>();
				hash.put("TSHIRT",400);
				hash.put("PANT",500);
				hash.put("JEANS",300);
				hash.put("SHOES",200);
				for (Map.Entry<String,Integer> string : hash.entrySet()) {
					System.out.println("product- " +string.getKey()+   "--> " +"RS."+string.getValue());
				}
				System.out.println("!!! CHOOSE YOUR PRODUCT WEAR !!!");
				u.setMenproduct(u.getInput().next());
				if (hash.containsKey(u.getMenproduct())) {
					u.getYrproduct().put(u.getMenproduct(),hash.get(u.getMenproduct()));
					System.out.println("!!! PRODUCT ADD TO CART SUCESSFULLY");
					System.out.println(u.getYrproduct().size() + " PRODUCTS IN THE CART");
					System.out.println("--------------------------------------");
					System.out.println("!!! DO YOU WANT TO SEE THE PRODUCT IN CART CLICK<<--YES OR NO-->>FOR CONTINUE SHOPPING !!!");
					String cart = u.getInput().next();
					if (cart.equalsIgnoreCase("yes")) {
						u.getCarts().choiceCart(u);
					} else if (cart.equalsIgnoreCase("no")) {
						System.out.println("--------------------------------------");
						System.out.println("!!! DO YU WANT TO CONTINUE SHOOPING IN MENSWEAR PRODUCTS CLICK<<--YES OR NO-->>FOR MAIN CATEGORY !!!");
						String decis1 = u.getInput().next();
						if (decis1.equalsIgnoreCase("yes")) {
							u.getProdcate().menList(u);
						} else if (decis1.equalsIgnoreCase("no")) {
							u.getProdcate().productCategory(u);
						}
					}
				} else {
					System.out.println("!!! WRONG PRODUCT TRY AGAIN !!!");
					u.getProdcate().fashionList(u);
				}
			} catch (Exception e) {
				System.err.println(e);
			}

		}

		public void womenList(SetGetdatas u) {
			try {
				System.out.println("--------------------------------------");
				System.out.println("----WOMENWEAR PRODUCTS----");
				Map<String,Integer> hash1 = new HashMap<String,Integer>();
				hash1.put("SAREES",2000);
				hash1.put("LEGGINGS",250);
				hash1.put("HEELS",600);
				hash1.put("GOWNS",300);
				for (Map.Entry<String,Integer> string : hash1.entrySet()) {
					System.out.println("product- " +string.getKey()+   " --> " +"RS."+string.getValue());
				}
				System.out.println("!!! CHOOSE YOUR PRODUCT WEAR !!!");
				u.setWomenprdoct(u.getInput().next());
				if (hash1.containsKey(u.getMenproduct())) {
					u.getYrproduct().put(u.getWomenprdoct(),hash1.get(u.getWomenprdoct()));
					System.out.println("!!! PRODUCT ADD TO CART SUCESSFULLY");
					System.out.println(u.getYrproduct().size() + " PRODUCTS IN THE CART");
					System.out.println("--------------------------------------");
					System.out.println(
							"!!! DO YOU WANT TO SEE THE PRODUCT IN CART CLICK<<--YES \n NO-->>FOR CONTINUE SHOPPING !!!");
					String cart = u.getInput().next();
					if (cart.equalsIgnoreCase("yes")) {
						u.getCarts().choiceCart(u);
					} else if (cart.equalsIgnoreCase("no")) {
						System.out.println("--------------------------------------");
						System.out.println(
								"!!! DO YU WANT TO CONTINUE SHOOPING IN WOMENWEAR PRODUCTS CLICK<<--YES \n NO-->>FOR MAIN CATEGORY !!!");
						String decis1 = u.getInput().next();
						if (decis1.equalsIgnoreCase("yes")) {
							u.getProdcate().womenList(u);
						} else if (decis1.equalsIgnoreCase("no")) {
							u.getProdcate().productCategory(u);
						}
					}
				} else {
					System.out.println("!!! WRONG PRODUCT TRY AGAIN !!!");
					u.getProdcate().womenList(u);
				}
			} catch (Exception e) {
				System.err.println(e);
			}

		}

		private void electronicsList(SetGetdatas u) {
			try {
				System.out.println("--------------------------------------");
				System.out.println("----ELECTRONICS CATEGORIES----");
				Map<String,Integer> link1 = new HashMap<String,Integer>();
				link1.put("HEADPHONES",500);
				link1.put("SPEAKERS",800);
				link1.put("SOUNDBAR",2000);
				link1.put("POWERBANK",1000);
				link1.put("PRINTER",7000);
				link1.put("CONSOLE",12000);
				for (Map.Entry<String,Integer> string : link1.entrySet()) {
					System.out.println("product- " +string.getKey()+   " --> " +"RS."+string.getValue());
				}
				System.out.println("!!! CHOOSE OUR PRODUCT !!!");
				u.setElectroniprodu(u.getInput().next());
				if (link1.containsKey(u.getElectroniprodu())) {
					u.getYrproduct().put(u.getElectroniprodu(),link1.get(u.getElectroniprodu()));
					System.out.println("!!! PRODUCT ADD TO CART SUCESSFULLY");
					System.out.println(u.getYrproduct().size() + " PRODUCTS IN THE CART");
					System.out.println("--------------------------------------");
					System.out.println("!!! DO YOU WANT TO SEE THE PRODUCT IN CART CLICK<<--YES \n NO-->>FOR CONTINUE SHOPPING !!!");
					String cart = u.getInput().next();
					if (cart.equalsIgnoreCase("yes")) {
						u.getCarts().choiceCart(u);
					} else if (cart.equalsIgnoreCase("no")) {
						System.out.println("--------------------------------------");
						System.out.println("!!! DO YU WANT TO CONTINUE IN ELECTRONICS CATEGORY SHOOPING CLICK<<--YES \n NO-->>FOR MAIN CATEGORY !!!");
						String decis1 = u.getInput().next();
						if (decis1.equalsIgnoreCase("yes")) {
							u.getProdcate().electronicsList(u);
						} else if (decis1.equalsIgnoreCase("no")) {
							u.getProdcate().productCategory(u);
						}
					}
				} 
				else {
					System.out.println("!!! WRONG PRODUCT TRY AGAIN !!!");
					u.getProdcate().electronicsList(u);
				}

			} catch (Exception e) {
				System.err.println(e);
			}

		}
  private void applianceList(SetGetdatas u) {
			try {
				System.out.println("--------------------------------------");
				System.out.println("----APPLIANCES CATEGORIES----");
				Map<String,Integer> link2 = new LinkedHashMap<String,Integer>();
				link2.put("TV",20000);
				link2.put("WASHINGMACHINE",10000);
				link2.put("AC",15000);
				link2.put("FANS",1000);
				link2.put("FRIDGE",15000);
				link2.put("HEATER",8000);
				for (Map.Entry<String,Integer> string : link2.entrySet()) {
					System.out.println("product- " +string.getKey()+   " --> " +"RS."+string.getValue());
				}
				System.out.println("!!! CHOOSE OUR PRODUCT !!!");
				u.setApplianproduct(u.getInput().next());
				if (link2.containsKey(u.getApplianproduct())) {
					u.getYrproduct().put(u.getApplianproduct(),link2.get(u.getApplianproduct()));
					System.out.println("!!! PRODUCT ADD TO CART SUCESSFULLY");
					System.out.println(u.getYrproduct().size() + " PRODUCTS IN THE CART");
					System.out.println("--------------------------------------");
					System.out.println("!!! DO YOU WANT TO SEE THE PRODUCT IN CART CLICK<<--YES \n NO-->>FOR CONTINUE SHOPPING !!!");
					String cart = u.getInput().next();
					if (cart.equalsIgnoreCase("yes")) {
						u.getCarts().choiceCart(u);
					} else if (cart.equalsIgnoreCase("no")) {
						System.out.println("--------------------------------------");
						System.out.println("!!! DO YU WANT TO CONTINUE IN APPLIANCES CATEGORY FOR SHOPING CLICK<<--YES \n NO-->>FOR MAIN CATEGORY !!!");
						String decis1 = u.getInput().next();
						if (decis1.equalsIgnoreCase("yes")) {
							u.getProdcate().applianceList(u);
						} else if (decis1.equalsIgnoreCase("no")) {
							u.getProdcate().productCategory(u);
						}
					}
				} else {
					System.out.println("!!! WRONG PRODUCT TRY AGAIN!!!");
					u.getProdcate().applianceList(u);
				}
			} catch (Exception e) {
				System.err.println(e);
			}
			
		}

}
