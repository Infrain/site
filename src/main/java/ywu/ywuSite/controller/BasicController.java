package ywu.ywuSite.controller;

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
	public String first() {
		return "BYE";
	}
}
