package com.kce.util;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBUtil {
  private static Connection conn;
  public static Connection getConnection() {
  try {
	      if(conn==null) {
	    	  Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/userdb?useSSL=false", "root", "Brindha*02");
	      }
  }
  catch(Exception e) {
	  System.out.println(e);
  }
  return conn;
  }
}
