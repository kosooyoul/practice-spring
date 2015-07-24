package kr.jungle.web.contest;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.jungle.web.utils.JSONResponseUtil;

@Controller
public class Test {

	@RequestMapping(value="/echo/{echo}", method=RequestMethod.GET)
	public void insertForm(HttpServletResponse resp, @PathVariable("echo") String echo) throws IOException {
		HashMap<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("returnValue", true);
		resultMap.put("echo", echo);
		
		resp.setContentType("text/json");
		resp.setCharacterEncoding("UTF-8");
		
		resp.getWriter().write(JSONResponseUtil.getJSONString(resultMap));
	}
	
}
