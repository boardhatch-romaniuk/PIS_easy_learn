package ua.lvil.lunp.app.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.lvil.lunp.app.db.dao.ContentDao;
import ua.lvil.lunp.app.db.dao.TopicDao;
import ua.lvil.lunp.app.entities.Content;
import ua.lvil.lunp.app.entities.Topic;

public class ContentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int tid = Integer.valueOf(request.getParameter("tid"));
		Topic topic = new TopicDao().findById(tid);
		Content content = new ContentDao().findContentByTopicId(tid);
		request.setAttribute("topic", topic.getName());
		request.setAttribute("content", content.getText());
		request.getRequestDispatcher("learn.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
