package kr.jungle.web.utils;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import net.sf.json.JSONSerializer;

public class JSONResponseUtil {
	/**
	 * JSON View ?”ë©´ ì²˜ë¦¬ë¥??„í•´ JSONë³?™˜ ??ResponseEntityë¡?ë°˜í™˜.
	 * @param obj
	 * @return
	 */
	public static final ResponseEntity<String> getJSONResponse(Object obj){
		String json = JSONSerializer.toJSON(obj).toString();
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "application/json; charset=UTF-8");
		return new ResponseEntity<String>(json, responseHeaders, HttpStatus.OK);
	}
	 
	/**
	 * JSON View ?”ë©´ ì²˜ë¦¬ë¥??„í•´ JSONë³?™˜ ??ResponseEntityë¡?ë°˜í™˜.
	 * @param obj
	 * @return
	 */
	public static final String getJSONString(Object obj){
		return JSONSerializer.toJSON(obj).toString();
	}
}
