package a.b.c.com.controller;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import a.b.c.com.service.SpringAutowiredService;
import a.b.c.com.vo.FormDataVO;

@Controller
public class SpringAutowiredController {
	private Logger logger=LogManager.getLogger(SpringAutowiredController.class);
	final private SpringAutowiredService springAutowiredService;
	
	// 서비스 클래스 사용하고 싶어요 :: 생성자 주입
	@Autowired(required=false)
	public SpringAutowiredController(SpringAutowiredService springAutowiredService){
		this.springAutowiredService=springAutowiredService;
	}
	
	
	// 오토와이어드(의존성 주입 : DI) 생성자 실행 링크 클릭해서 여기로 온다.
	@RequestMapping(value="autowired_test", method=RequestMethod.GET)
	public String autowired_test(){
		logger.info("SpringAutowiredController.autowired_test() 함수 진입");
		
		// view 폴더 안에 autowired 폴더 안에 autowired_test_return.jsp로 가세요
		return "autowired/autowired_test_return";
	}
	
	// autowired_test_return.jsp에서 GET AUTOWIRED CONSTRUCTOR 버튼을
	// 클릭해서 왔다.
	@RequestMapping(value="autowired_test_get", method=RequestMethod.GET)
	public String autowiredTest_Get(FormDataVO fvo, Model model){
		logger.info("SpringAutowiredController.autowiredTest_Get() 함수 진입");
		
		List<FormDataVO> list = springAutowiredService.autowiredTest(fvo);
		int listSize = list.size();
		
		logger.info("listSize >>> : " + listSize);
		model.addAttribute("list", list);
		
		return "autowired/autowired_test_get_return";
	}
	
}
