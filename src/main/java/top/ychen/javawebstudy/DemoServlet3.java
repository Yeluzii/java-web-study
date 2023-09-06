package top.ychen.javawebstudy;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/demo3")
public class DemoServlet3 extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 返回一段json
        resp.setContentType("application/json;charset=utf-8");
        PrintWriter out = resp.getWriter();
        String jsonString = """
                "name":"CY"
                "age":20
                """;
        out.print(jsonString);
        out.flush();
        out.close();
    }

    @Override
    public void destroy() {
    }
}
