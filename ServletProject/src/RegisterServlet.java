

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import MyData.*;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		if
		(
			request.getParameter("name").equals("") ||
			request.getParameter("pass").equals("") ||
			request.getParameter("pass2").equals("") ||
			request.getParameter("email").equals("")
		)
		{
			response.sendRedirect("register.jsp?message=fill all fields");
			return;
		}
		
		if(DataBase.getUserByLogin(request.getParameter("name")) != null)
		{
			response.sendRedirect("register.jsp?message=username is taken");
			return;
		}
		
		if(!request.getParameter("pass").equals(request.getParameter("pass2")))
		{
			response.sendRedirect("register.jsp?message=passwords is not the same");
			return;
		}
		
		User u = new User();
		u.login = request.getParameter("name");
		u.password = request.getParameter("pass");
		u.email = request.getParameter("email");
		if(request.getParameter("admin") != null)
		{
			u.role = UserRole.Admin;
		}else
		{
			u.role = UserRole.Registered;
		}
		DataBase.users.add(u);
		
		response.sendRedirect("login.jsp?message=account created&color=green");
	}

}

// request.getParameter("pass") != request.getParameter("pass2") 