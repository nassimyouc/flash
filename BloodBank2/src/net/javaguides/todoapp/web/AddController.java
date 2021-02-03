package net.javaguides.todoapp.web;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.TemporalAccessor;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.javaguides.todoapp.dao.BloodDao;
import net.javaguides.todoapp.dao.addNewDonor;
import net.javaguides.todoapp.model.Add;






@WebServlet("/")
public class AddController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BloodDao addD;

	public void init() {
		 addD = (BloodDao) new addNewDonor();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		doGet(request,response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
   try {
		switch (action) {
		case "/new":
			showform(request, response);
			break;
		case "/insert":
			insertBlood(request, response);
			break;	
		case "/list":
			listBlood(request, response);
			break;	
		case "/show":
			showHome(request, response);
			break;	
		case "/delete":
			deleteBlood(request, response);
			break;
		case "/update":
			updateBlood(request, response);
			break;	
		case "/showupdate":
			showUpdate(request, response);
			break;	
		case "/stock":
			showstock(request, response);
			break;
		case "/logout":
			logout(request, response);
			break;		
		
		default:
			RequestDispatcher dispatcher = request.getRequestDispatcher("home/home.jsp");
			dispatcher.forward(request, response);
			break;
		}
	} catch (SQLException ex) {
		throw new ServletException(ex);
	}
		
	}
	

	private void listBlood(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Add> listBlood = addD.selectAllBlood();
		request.setAttribute("listBlood", listBlood);
		RequestDispatcher dispatcher = request.getRequestDispatcher("home/List.jsp");
		dispatcher.forward(request, response);
	}
private void insertBlood(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		String name = request.getParameter("name");
		String father = request.getParameter("father");
		String mother = request.getParameter("mother");
		int mobil = Integer.parseInt(request.getParameter("mobilenumber"));
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String bloodgroup = request.getParameter("bloodgroup");
		String address = request.getParameter("address");
		
		
		Add new1 = new Add(name, father, mother, mobil, gender, email, bloodgroup, address);
		
		addD.insertBlood(new1);
		response.sendRedirect("home/addnewdonor.jsp");
	}

	private void showform(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("home/addnewdonor.jsp");
		dispatcher.forward(request, response);

		
	}
private void showUpdate(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("home/update.jsp");
		dispatcher.forward(request, response);

		
	}
	private void deleteBlood(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		addD.deleteBlood(id);
		response.sendRedirect("list");
	}	
	
	private void updateBlood(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		
		String name = request.getParameter("name");
		String father = request.getParameter("father");
		String mother = request.getParameter("mother");
		int mobil = Integer.parseInt(request.getParameter("mobilenumber"));
		String gender = request.getParameter("gender");
		String email = request.getParameter("email");
		String bloodgroup = request.getParameter("bloodgroup");
		String address = request.getParameter("address");
		
		Add updateBlood = new Add( name, father, mother, mobil, gender, email, bloodgroup, address);
		
		addD.updateBlood(updateBlood);
		
		response.sendRedirect("list");
	}
private void showHome(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("home/home.jsp");
		dispatcher.forward(request, response);

		
	}
private void showstock(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("home/ManageStock.jsp");
	dispatcher.forward(request, response);

	
}

private void logout(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	
	RequestDispatcher dispatcher = request.getRequestDispatcher("index/index.jsp");
	dispatcher.forward(request, response);

	
}


}

