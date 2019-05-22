import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;

public class LoginServlet extends HttpServlet {

    /*protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        //控制台打印
        System.out.println("name: " + name);
        System.out.println("password: " + password);

        //返回数据
        String html = null;
        if("admin".equals(name) && "123".equals(password)) {
            html = "success";
        } else {
            html = "fail";
        }

        PrintWriter printWriter = response.getWriter();
        printWriter.println(html);
    }*/

    public void init() {
        System.out.println("initing...");
    }

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        //request.setCharacterEncoding("UTF-8");
        String name = request.getParameter("name");
        String password = request.getParameter("password");

        //控制台打印
        System.out.println("name: " + name);
        System.out.println("password: " + password);
        System.out.println("啊啊啊啊");
        //返回数据
        String html = null;
        if("admin".equals(name) && "123".equals(password)) {
            //html = "success";
            //request.getRequestDispatcher("success.html").forward(request, response);
            request.getSession().setAttribute("user", "admin");
            response.sendRedirect("success.html");
        } else {
            //html = "fail";
            //request.getRequestDispatcher("fail.html").forward(request, response);
            response.sendRedirect("fail.html");
        }


        //PrintWriter printWriter = response.getWriter();
        //printWriter.println(html);

        System.out.println(request.getRequestURL());
        System.out.println("单值：" + request.getParameter("name"));
        System.out.println("多值：" + Arrays.asList(request.getParameterValues("hobits")));
        Map<String, String[]> paramters = request.getParameterMap();
        for (String param : paramters.keySet()) {
            String[] value = paramters.get(param);
            System.out.println(param + ":" + Arrays.asList(value));
        }
    }
}
