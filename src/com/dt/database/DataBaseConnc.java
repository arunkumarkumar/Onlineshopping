package com.dt.database;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;

import com.project.Onlineshop.SetGetdatas;

public class DataBaseConnc {
	public void dataBase(SetGetdatas u) {
		
		String rv=u.getYrproduct().toString();
	try {
		FileInputStream fin = new FileInputStream("C:\\Users\\ARUN\\eclipse-workspace\\com.dt\\src\\com\\dt\\database\\database.properties");
		Properties p = new Properties();
		p.load(fin);
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		Connection con= DriverManager.getConnection(p.getProperty("Dburl"),p.getProperty("Dbusername"),p.getProperty("Dbpassword"));
		PreparedStatement stmt= con.prepareStatement("insert into ONLINESHOPDETAILS values(?,?,?,?)");
		stmt.setString(1, u.getUserpass());
		stmt.setString(2,u.getPassword());
		Thread.sleep(2000);
		stmt.setString(3,  rv);
		stmt.setInt(4,u.getFinalamount());
		System.out.println();
		int s1=stmt.executeUpdate();
		System.out.println(s1);
		} catch (Exception e) {
		e.printStackTrace();
}
		}


}


