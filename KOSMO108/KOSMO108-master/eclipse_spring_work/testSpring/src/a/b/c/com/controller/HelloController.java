package a.b.c.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@Controller
public class HelloController {
	Logger logger = LogManager.getLogger(HelloController.class);
	// logger.info("HelloController 클래스 진입 >>> : ");
	
	@RequestMapping(value="hello_kimstar")
	// hello_kimstar
	public String HelloKimStar(Model model){
		logger.info("HelloController :: HelloKimStar 함수 진입 >>> : ");
		
		model.addAttribute("kimStar", "Kim Byeol is Universe Star!!!");
		logger.info("model >>>> : "+model);
		
		return "hello_spring_returnjsp";
	}
	
	@RequestMapping(value="hello_get_kimstar", method=RequestMethod.GET)
	public String HelloGetKimStar(Model model_get){
		logger.info("HelloController :: HelloGetKimStar 함수 진입 >>> :  ");
		
		model_get.addAttribute("model_get", "GET :: Kim Byeol is Universe Star!!!");
		logger.info("model_get >>> "+model_get);
		
		return "hello_spring_get_return";
	}
	
	@RequestMapping(value="hello_post_kimstar", method=RequestMethod.POST)
	public String HelloPostKimStar(Model model_post){
		logger.info("HelloController :: HelloPostKimStar 함수 진입 >>> : ");
		
		model_post.addAttribute("model_post", "POST :: Kim Byeol is Universe Star!!!");
		logger.info("model_post >>> : "+model_post);
		
		return "hello_spring_post_return";
	}
	
}
