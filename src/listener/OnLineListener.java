package listener;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class OnLineListener implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent se) {
        ServletContext context = se.getSession().getServletContext();
        Integer number = (Integer) context.getAttribute("online_number");
        number = number == null ? 1 : number + 1;
        context.setAttribute("online_number", number);
        System.out.println("当前在线人数：" + number);
    }

    public void sessionDestroyed(HttpSessionEvent se) {
    }
}
