package hello.servlet.web.frontcontroller.v3;

import java.util.Map;

import hello.servlet.web.frontcontroller.ModelView;

public interface ControllerV3 {
    
    //HttpServletRequest 파라미터를 프론트 컨트롤러가 paramMap에 담아서 호출해줌
    ModelView process(Map<String, String> paramMap);
}
