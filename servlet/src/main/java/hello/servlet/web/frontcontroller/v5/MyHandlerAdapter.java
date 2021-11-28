package hello.servlet.web.frontcontroller.v5;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hello.servlet.web.frontcontroller.ModelView;

public interface MyHandlerAdapter {
    
    //해당 컨트롤러 처리할 수 있는지 판단
    boolean supports(Object handler);

    //실제 컨트롤러 호출, ModelView 호출
    ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException;
}
