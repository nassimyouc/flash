package net.javaguides.todoapp.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.javaguides.todoapp.dao.LoginDao;
import net.javaguides.todoapp.model.LoginBean;


@WebServlet("/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LoginDao loginDao;

	public void init() {
		loginDao = new LoginDao();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("login/login.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		authenticate(request, response);
	}

	private void authenticate(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		LoginBean loginBean = new LoginBean();
		loginBean.setName(name);
		loginBean.setEmail(email);

		try {
			if (loginDao.validate(loginBean)) {
				RequestDispatcher dispatcher = request.getRequestDispatcher("home/home.jsp");
				dispatcher.forward(request, response);
			} else {
				HttpSession session = request.getSession();
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}
}
