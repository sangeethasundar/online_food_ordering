package Dao3;

import Bean3.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import java.net.*;
import java.lang.*;

public class loginDao3 
{
public int menu(loginBean3 l)
    {
try{

final String JDBC_DRIVER="com.mysql.jdbc.Driver";
final String DB_URL="jdbc:mysql://localhost:3306/test";

final String user="root";
final String pwd="root";
String un=l.getnonveg();


Connection con=null;
Statement stmt=null;
Class.forName("com.mysql.jdbc.Driver");

con=DriverManager.getConnection(DB_URL,user,pwd);
stmt=con.createStatement();
String s="select * from button;";
ResultSet rs=stmt.executeQuery(s);
while(rs.next()){
String us1=rs.getString("bvalue");
if((un.equals(us1))){
return 1;       
				
       	}
	}
}
       catch(SQLException se)
       {}
       catch(Exception e)
       {}         
       return 0;
    }
}


