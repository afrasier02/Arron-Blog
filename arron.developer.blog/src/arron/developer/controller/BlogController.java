package arron.developer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BlogController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/Home", method = RequestMethod.GET)
	public ModelAndView Home() {
		return new ModelAndView("index");
	}
	
	@RequestMapping(value = "/About", method = RequestMethod.GET)
	public ModelAndView About() {
		return new ModelAndView("about");
	}
}