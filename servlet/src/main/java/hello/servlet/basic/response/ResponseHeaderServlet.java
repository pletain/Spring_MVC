package hello.servlet.basic.response;

 
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "responseHeaderServlet", urlPatterns="/response-header")
public class ResponseHeaderServlet extends HttpServlet {
    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //status-line
        //응답 코드
        // response.setStatus(HttpServletResponse.SC_OK); 

        // //response-header
        // response.setHeader("Content-Type", "text/plain");
        // response.setHeader("Cache-Control", "no-cache, must-revalidate");
        // response.setHeader("Pragma", "no-cache");
        // response.setHeader("my-header", "hello");

        //header 편의 메서드
        content(response);
        cookie(response);
        redirect(response);
        
        PrintWriter writer = response.getWriter();
        writer.println("안녕하세요!");
    }

    private void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/basic/hello-form.html");
    }

    private void cookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("myCookie", "good");
        cookie.setMaxAge(600);
        response.addCookie(cookie);
    }

    private void content(HttpServletResponse response) {
        response.setContentType("text/plain");
        response.setCharacterEncoding("UTF-8");
    }
    
}