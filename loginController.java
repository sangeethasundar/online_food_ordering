import Bean.loginBean;
import Dao.loginDao;
import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;
 
public class loginController extends HttpServlet
{
  public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
  {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String ur=request.getParameter("uname1");
      String ul=request.getParameter("uname2");
      loginBean l=new loginBean();      
      l.setregister(ur);
      l.setlogin(ul);
      int flag=0;
      loginDao ld=new loginDao();
      flag=ld.userAuthentication(l);   
      if(flag==1)
           request.getRequestDispatcher("ncustomer.jsp").forward(request, response);
      else
           request.getRequestDispatcher("oldcustomer.jsp").forward(request, response);

           
   }
} 
