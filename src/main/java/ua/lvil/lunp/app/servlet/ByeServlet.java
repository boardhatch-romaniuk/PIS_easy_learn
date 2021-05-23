package ua.lvil.lunp.app.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.lvil.lunp.app.bean.Bean;

public class ByeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Bean> list = new ArrayList<Bean>();
		Bean b1 = new Bean();
		Bean b2 = new Bean();
		b1.setId(1);
		b2.setId(2);
		b1.setStr("First bean");
		b2.setStr("Second bean");
		
		list.add(b1);
		list.add(b2);
		
		request.setAttribute("list", list);
		
		
		request.getRequestDispatcher("/bye.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
