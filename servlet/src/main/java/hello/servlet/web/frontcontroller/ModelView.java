package hello.servlet.web.frontcontroller;

import java.util.HashMap;
import java.util.Map;

public class ModelView {
    private String ViewName; // view의 논리이름
    private Map<String, Object> model = new HashMap<>(); // view를 렌더링할 때 필요한 모델 객체

    public ModelView(String ViewName) {
        this.ViewName = ViewName;
    }

    public String getViewName() {
        return ViewName;
    }

    public void setViewName(String ViewName) {
        this.ViewName = ViewName;
    }

    public Map<String,Object> getModel() {
		return model;
	}

    public void setModel(Map<String,Object> model) 
    {
		this.model = model;
	}





}
