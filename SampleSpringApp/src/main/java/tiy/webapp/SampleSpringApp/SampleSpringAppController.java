package tiy.webapp.SampleSpringApp;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SampleSpringAppController {
	@RequestMapping(path = "/person", method = RequestMethod.GET)
	public String person(Model model, String name, String city, int age) {
		Person p = new Person(name, city, age);
		model.addAttribute("person", p);
		return "person";
	}

	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String home(Model model, HttpSession session) {
		model.addAttribute("name", session.getAttribute("userName"));
		return "home";
	}

	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String login(HttpSession session, String userName, String other) {
		System.out.println(other);
		session.setAttribute("userName", userName);
		return "redirect:/";
	}	
}