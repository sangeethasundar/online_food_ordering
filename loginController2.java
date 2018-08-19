import Bean2.loginBean2;
import Dao2.loginDao2;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
 
public class loginController2 extends HttpServlet
{
  public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
  {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String item1=request.getParameter("vegg");
      
      loginBean2 l=new loginBean2();      
      l.setveg(item1);
      int flag=0;
      loginDao2 ld=new loginDao2();
      flag=ld.menu(l);    
      if(flag==1)
             request.getRequestDispatcher("v1.jsp").forward(request, response);
    
			
       
   }
} 
