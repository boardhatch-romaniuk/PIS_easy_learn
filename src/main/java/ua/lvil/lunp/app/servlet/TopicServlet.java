package ua.lvil.lunp.app.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.lvil.lunp.app.db.dao.SubjectDao;
import ua.lvil.lunp.app.db.dao.TopicDao;
import ua.lvil.lunp.app.entities.Topic;

public class TopicServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int sid = Integer.valueOf(request.getParameter("sid"));
		List<Topic> list = new TopicDao().findTopicBySubjectId(sid);
		String sname = new SubjectDao().findSubNameBySubId(sid);

		request.setAttribute("list", list);
		request.setAttribute("sname", sname);
		request.getRequestDispatcher("topics.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
