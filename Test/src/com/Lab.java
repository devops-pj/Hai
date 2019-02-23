package com;
import java.sql.*;

public class Lab {

	public static void main(String[] args) {
		Connection con=null;
		Statement st=null;
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","vasanth1234");
			String str="insert into test values(122,'prasad','prasad@gmail.com',456221)";
			st=con.createStatement();
			int x=st.executeUpdate(str);
			if(x==1){
				System.out.println("record inserted");
			}else{
				System.out.println("not inserted");
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			try{
				if(st!=null)st.close();
				if(con!=null)st.close();
			}catch(Exception e){
				e.printStackTrace();
			}
		}

	}

}
