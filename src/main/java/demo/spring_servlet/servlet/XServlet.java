package demo.spring_servlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;

import demo.spring_servlet.po.TestBean;

public class XServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private static final Log log = LogFactory.getLog(XServlet.class);
	
	private TestBean b = null;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		PrintWriter pw = resp.getWriter();
		try {
			pw.write(this.b.toString());
			log.debug(b);
		} finally {
			pw.close();
		}
		
	}

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		 ApplicationContext ac = (ApplicationContext) config.getServletContext().getAttribute("applicationContext");
		 this.b = ac.getBean("testBean", TestBean.class);
	}

	

}
