package ywu.ywuSite.controller;

import com.fasterxml.jackson.databind.JsonDeserializer;
import net.minidev.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class BasicController {
	
	@ResponseBody
	@RequestMapping("/")
	public String home() {
		return "index.html";
	}
	
	@ResponseBody
	@RequestMapping("/firsts")
	public JSONObject first() {
		JSONObject j = new JSONObject();
		j.put("1","Hello");
		j.put("2","world");
		return j;
	}
}
