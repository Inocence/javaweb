import com.sun.deploy.net.HttpRequest;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Iterator;
import java.util.List;

public class UploadServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        factory.setSizeThreshold(1024 * 1024);

        String filename = null;
        List items = null;
        try{
            items = upload.parseRequest(request);
        } catch (FileUploadException e) {
            e.printStackTrace();
        }

        try{
            Iterator iterator = items.iterator();
            while (iterator.hasNext()) {
                FileItem item = (FileItem) iterator.next();
                if(!item.isFormField()) {
                    filename = System.currentTimeMillis() + ".jpg";
                    String folder = "C:\\usr\\java\\web\\javaweb\\out\\artifacts\\javaweb_war_exploded\\uploaded";
                    File file = new File(folder, filename);
                    file.getParentFile().mkdirs();

                    InputStream inputStream = item.getInputStream();
                    FileOutputStream outputStream = new FileOutputStream(file);
                    byte[] bytes = new byte[1024 * 1024];
                    int len = 0;
                    while (-1 != (len = inputStream.read(bytes))) {
                        outputStream.write(bytes);
                    }
                    outputStream.close();
                }
            }
            response.setContentType("text/html");
            String html = "<img width='200' height='150' src='uploaded/%s' />";
            PrintWriter printWriter = response.getWriter();
            printWriter.format(html, filename);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
