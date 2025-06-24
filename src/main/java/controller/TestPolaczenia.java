package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestPolaczenia {

	// http://localhost:8080/spring_web_mvc/app/testPolaczenia
	@RequestMapping(value = "/testPolaczenia", method = { RequestMethod.GET })
	public String test(Model model) {
		model.addAttribute("message", "Test polaczenia z baza danych udany!");
		return "testPolaczenia";
	}
	
}
