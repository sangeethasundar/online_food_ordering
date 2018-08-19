import Bean3.loginBean3;
import Dao3.loginDao3;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
 
public class loginController3 extends HttpServlet
{
  public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
  {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String item1=request.getParameter("nvegg");
      
      loginBean3 l=new loginBean3();      
      l.setnonveg(item1);
      int flag=0;
      loginDao3 ld=new loginDao3();
      flag=ld.menu(l);    
      if(flag==1)
             request.getRequestDispatcher("nv1.jsp").forward(request, response);
    
			
       
   }
} 
