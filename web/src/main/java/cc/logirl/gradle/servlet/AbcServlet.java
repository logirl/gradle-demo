package cc.logirl.gradle.servlet;

import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/**
 * Created by xinxi on 2017/5/8.
 */
@WebServlet(urlPatterns = "/abc")
public class AbcServlet extends javax.servlet.http.HttpServlet {

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        response.getWriter().write("ok...");
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        doPost(request, response);
    }

}
