import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class test1 extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    PrintWriter out = response.getWriter();
    out.println("<html>test1 OK</html>");
    out.close();
  }
}
