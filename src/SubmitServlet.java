import bean.Hero;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SubmitServlet extends HttpServlet {

    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String data = request.getParameter("data");
        System.out.println("json data is " + data);

        JSONObject jsonObject = JSONObject.fromObject(data);
        System.out.println("json object is " + jsonObject);

        Hero hero = (Hero)JSONObject.toBean(jsonObject, Hero.class);
        System.out.println("Hero object is " + hero);

        hero.setHp(100);

        response.setContentType("application/json;charset=UTF-8");
        /*JSONObject object = new JSONObject();
        object.put("hero", hero);
        response.getWriter().print(object);*/
        List<Hero> heroes = new ArrayList<>();
        for (int i = 0; i < 10; i ++) {
            heroes.add(hero);
        }
        String result = JSONSerializer.toJSON(heroes).toString();
        response.getWriter().print(result);
    }
}
