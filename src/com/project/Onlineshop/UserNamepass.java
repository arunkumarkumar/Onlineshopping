package com.project.Onlineshop;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class UserNamepass {
	
	 
	public void userPass(SetGetdatas u) throws IOException {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\ARUN\\eclipse-workspace\\com.dt\\src\\com\\project\\Onlineshop\\userdetail.properties");
			Properties p = new Properties();
			p.load(fin);
			System.out.println("ENTER YOUR USERNAME");
			u.setUserpass(u.getInput().nextLine());
			if (p.containsKey(u.getUserpass())) {
				System.out.println("ENTER YOUR PASSWORD");
				u.setPassword(u.getInput().nextLine());
				if (p.containsValue(u.getPassword())) {
			
					System.out.println("HEY!  " + u.getUserpass());
					u.getProdcate().productCategory(u);
				} else {
					System.out.println("WRONG PASSWORD TRY AGAIN");
					u.getUser().userPass(u);
				}
			} else {
				System.out.println("WRONG USERNAME TRY AGAIN");
				u.getUser().userPass(u);
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}
