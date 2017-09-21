package arron.developer.controller;

import java.awt.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

import models.Post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import services.PostService;

@Controller
public class BlogController {
	
	@Autowired
	private PostService postService;

	@RequestMapping(value = {"/", "/Home"}, method = RequestMethod.GET)
	public ModelAndView index(Model model) {
		java.util.List<Post> latest5Posts = postService.findLatest5();
		model.addAttribute("latest5posts", latest5Posts);
		
		java.util.List<Post> latest3Posts = latest5Posts.stream().limit(3).collect(Collectors.toList());
		model.addAttribute("latest3posts", latest3Posts);
		
		return new ModelAndView("index", "model", model);	
		
	}
	
	@RequestMapping(value = "/About", method = RequestMethod.GET)
	public ModelAndView About() {
		return new ModelAndView("about");
	}
}