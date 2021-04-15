package siva.hb.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import siva.hb.dao.IStudentDao;
import siva.hb.dao.impl.StudentDaoImpl;
import siva.hb.model.Student;

//@WebServlet("/register") //no web.xml is required
public class StudentRegisterServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 1. Read Form Data
		String s1 = req.getParameter("sid");
		String stdName = req.getParameter("sname");
		String s2 = req.getParameter("sfee");

		// 2. Parse Data if required
		int stdId = Integer.parseInt(s1);
		double stdFee = Double.parseDouble(s2);

		// 3. Create Model class object and set data to it
		Student sob = new Student();
		sob.setStdId(stdId);
		sob.setStdName(stdName);
		sob.setStdFee(stdFee);

		// 4. Create Dao object and call saveStudent
		IStudentDao dao = new StudentDaoImpl();
		Integer id = dao.saveStudent(sob);

		// 5. construct message and send to UI
		String message = "Student saved with Id:" + id;
		req.setAttribute("msg", message);

		// 6. Move to JSP Page using Dispatcher
		RequestDispatcher rd = req.getRequestDispatcher("index.jsp");
		rd.forward(req, resp);
	}
}
