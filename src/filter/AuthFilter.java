package filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("filter AuthFilter starting...");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request1 = (HttpServletRequest) request;
        HttpServletResponse response1 = (HttpServletResponse) response;

        String uri = request1.getRequestURI();
        if(uri.endsWith("login.html") || uri.endsWith("login")) {
            chain.doFilter(request, response);
            return;
        }
        String user = (String) request1.getSession().getAttribute("user");
        if(null == user) {
            response1.sendRedirect("login.html");
            return;
        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
