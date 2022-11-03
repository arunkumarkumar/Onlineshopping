package com.project.Onlineshop;

import java.io.*;
import java.util.*;
public class OnlineShooping extends Thread {
	static SetGetdatas u = new SetGetdatas();
	public static void main(String[] args) throws IOException {
			try {
			u.getUser().userPass(u);
			
			}
			catch(Exception e) {
				System.err.println(e);
			}
		}
     
		
}
