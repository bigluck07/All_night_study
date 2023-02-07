package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TestController {

	@GetMapping("/main")
	public String main() {
		return "main"; //  /WEB-INF/views/main.jsp
	}
	
	@GetMapping("/soap")
	public String soap(@RequestParam String id,
			           @RequestParam String pw) {
		System.out.println(id+"\t"+pw);
		return "main"; //  /WEB-INF/views/main.jsp
	}
	@GetMapping("/rest/id/{userid}/pw/{passwd}")
	public String rest(@PathVariable("userid") String userid,
			          @PathVariable String passwd ) {
		System.out.println(userid+"\t"+passwd);
		return "main"; //  /WEB-INF/views/main.jsp
	}
}





