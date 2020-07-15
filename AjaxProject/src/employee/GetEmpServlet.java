package employee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({ "/GetEmpServlet", "/GetEmpListServlet" })
public class GetEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	public GetEmpServlet() {
        super();	
	}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setCharacterEncoding("utf-8");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
//		response.getWriter().append("Served at: ").append(request.getContextPath()).append("   안녕,HELLO!");
//		{"id":"user1", "first_name":"Hong","age":"30"}
		PrintWriter out = response.getWriter();
//		out.write("[{\"id\":\"user1\",\"first_name\":\"Hong\",\"age\":\"30\"},")
//		response.getWriter().write("[{\"id\":\"user1\",\"first_name\":\"Hong\",\"age\":\"30\"},");
//		response.getWriter().write("{\"id\":\"user2\",\"first_name\":\"Kim\",\"age\":\"28\"}]");
		EmpDAO dao = new EmpDAO();
		List<Employee> list = dao.getEmpList();
		int cnt = 0;
		int rowCnt = list.size();
		
		out.write("[");
		for (Employee emp : list) {
			// {"id" : "data1", "first_name":"data2", "email":"data3", "salary":"data4"}
			out.write("{\"id\" : \"" + emp.getEmployee_id() + "\", \"first_name\":\"" + emp.getFirst_name()
					+ "\", \"email\":\" " + emp.getEmail() + "\", \"salary\":\" " + emp.getSalary() + "\"}");
			if (++cnt != rowCnt)
				out.write(",");
		}
		out.write("]");

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
