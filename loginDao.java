package Dao;

import Bean.loginBean;
import java.io.*;
import java.util.*;
import java.sql.*;
import java.net.*;
import java.lang.*;

public class loginDao 
{
public int userAuthentication(loginBean l)
    {
try{

final String JDBC_DRIVER="com.mysql.jdbc.Driver";
final String DB_URL="jdbc:mysql://localhost:3306/TEST";

final String user="root";
final String pwd="root";
String ur1=l.getregister();
String ul1=l.getlogin();

Connection con=null;
Statement stmt=null;
Class.forName("com.mysql.jdbc.Driver");

con=DriverManager.getConnection(DB_URL,user,pwd);
stmt=con.createStatement();
String s="select * from verification;";
ResultSet rs=stmt.executeQuery(s);

while(rs.next()){
	String ur11=rs.getString("username");
	String ul11=rs.getString("password");
	if((ur1.equals(ur11))){      
              return 1;         
        }
		}
}
       catch(SQLException se)
       {
         //Handle errors for JDBC
          se.printStackTrace();
       }
       catch(Exception e)
       {
         //Handle errors for Class.forName
         e.printStackTrace();
       }         
       return 0;
    }
}


