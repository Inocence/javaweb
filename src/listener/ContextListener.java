package listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ContextListener implements ServletContextListener, ServletContextAttributeListener {
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("容器初始化");
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("容器销毁");
    }

    public void attributeAdded(ServletContextAttributeEvent scae) {
        System.out.println("增加属性：");
        System.out.println(scae.getName() + ":" + scae.getValue());
    }

    public void attributeRemoved(ServletContextAttributeEvent scae) {
        System.out.println("移除属性");
    }

    public void attributeReplaced(ServletContextAttributeEvent scae) {
        System.out.println("修改属性");
    }
}
