package com.be.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class DButils {
	private static String url;
	private static String user;
	private static String pass;
	static{
		try {
			Properties prop=new Properties();
			prop.load(DButils.class.getClassLoader().getResourceAsStream("/db.properties"));
			url=prop.getProperty("url");
			user=prop.getProperty("user");
			pass=prop.getProperty("pass");
			
			Class.forName(prop.getProperty("driver"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		try {
		return	DriverManager.getConnection(url,user,pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	public static void close(Connection conn,Statement ps,ResultSet rs){
		try {
			if(rs!=null)
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
			try {
				if(ps!=null)
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn!=null)
				ps.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	}
}
