import javax.servlet.*;

public class HelloServlet implements Servlet {

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("servlet inited...");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException {
        System.out.println("servlet running...");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("servlet destroyed...");
    }
}
