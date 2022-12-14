package a.b.c.com.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import a.b.c.com.emp.service.SpringEmpService;
import a.b.c.com.emp.vo.SpringEmpVO;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@Controller
public class SpringEmpController {
	Logger logger = LogManager.getLogger(SpringEmpController.class);
	
	// 컨트롤러에서 서비스 연결
	private SpringEmpService springEmpService;
	
	// 생성자에 @Autowired 어노테이션으로 DI(의존성 주입하기)
	@Autowired(required=false)
	public SpringEmpController(SpringEmpService springEmpService) {
		this.springEmpService=springEmpService;
	}
	
	// ########################## INSERT ################################
	// 입력 폼 호출하기
	@RequestMapping(value="springEmpInsertForm", method=RequestMethod.GET)
	public String springEmpInsertForm(Model model){
		logger.info("SpringEmpController :: springEmpInsertForm(Model model) 함수 진입 >>> : ");
		
		return "emp/springEmpInsertForm";
	}
	
	// springEmpInsertForm.jsp에서 GET방식으로 바인딩하여 컨트롤러로 보냄
	@RequestMapping(value="springEmpInsert", method=RequestMethod.GET)
	public String springEmpInsert(SpringEmpVO evo, Model model){
		logger.info("SpringEmpController :: springEmpInsert(Model model) 함수 진입 >>> : ");
		// input tag ::  empno, ename, hiredate
		logger.info("SpringEmpController :: evo.getEmpno() >>> : "+evo.getEmpno());
		logger.info("SpringEmpController :: evo.getEname() >>> : "+evo.getEname());
		logger.info("SpringEmpController :: evo.getHiredate() >>> : "+evo.getHiredate());
		
		int insertCnt=springEmpService.springEmpInsert(evo);
		if (insertCnt > 0){
			logger.info("SpringEmpController :: springEmpInsert nCnt >>> : "+insertCnt);
			
			model.addAttribute("insertCnt", insertCnt);
			return "emp/springEmpInsert";
			// 성공했을 때는 springEmpInsert.jsp로 가세요.
		}
		
		return "emp/springEmpForm";
	}
	
	// ########################## SELECT ALL ################################
	@RequestMapping(value="springEmpSelectAll", method=RequestMethod.GET)
	public String springEmpSelectAll(Model model){
		logger.info("SpringEmpController :: springEmpSelectAll(Model model) 함수 진입 >>> :");
		
		List<SpringEmpVO> listAll=springEmpService.springEmpSelectAll();
		int nCnt=listAll.size();
		logger.info("SpringEmpController :: springEmpSelectAll nCnt >>> : "+nCnt);
		
		if(nCnt>0){
			model.addAttribute("listAll", listAll);
			return "emp/springEmpSelcetAll";
		}
		
		return "emp/springEmpForm";
	}
	
	// ########################## SELECT ################################
	@RequestMapping(value="springEmpSelectForm", method=RequestMethod.GET)
	public String springEmpSelectForm(@ModelAttribute SpringEmpVO evo, Model model){
		logger.info("SpringEmpController :: springEmpSelectForm(@ModelAttribute SpringEmpVO evo, Model model) 함수 진입 >>> : ");
		
		return "emp/springEmpSelectForm";
	}
	
	@RequestMapping(value="springEmpSelect", method=RequestMethod.GET)
	public String springEmpSelect(@ModelAttribute SpringEmpVO evo, Model model){
		logger.info("SpringEmpController :: springEmpSelect(@ModelAttribute SpringEmpVO evo, Model model) 함수 진입 >>> : ");
		logger.info("SpringEmpController :: evo.getSearchFilter() >>> : "+evo.getSearchFilter());
		logger.info("SpringEmpController :: evo.getKeyword() >>> : "+evo.getKeyword());
		logger.info("SpringEmpController :: evo.getStartDate() >>> : "+evo.getStartDate());
		logger.info("SpringEmpController :: evo.getEndDate() >>> : "+evo.getEndDate());
		
		
		 List<SpringEmpVO> searchList=springEmpService.springEmpSelect(evo);
		 int nCnt=searchList.size();
		 logger.info("SpringEmpController :: springEmpSelect nCnt >>> : "+nCnt);
		 
		 if(nCnt>0){
		 	model.addAttribute("searchList", searchList);
		 	return "emp/springEmpSelect";
		 }
		 
		return "emp/springEmpForm";
	}
	
	// ########################## UPDATE ################################
	@RequestMapping(value="springEmpUpdatForm", method=RequestMethod.GET)
	public String springEmpUpdateForm(Model model){
		logger.info("SpringEmpController ::  springEmpUpdate(@ModelAttribute SpringEmpVO evo, Model model) 함수 진입 >>> : ");
		
		return "emp/springEmpUpdateForm";
	}
	
	@RequestMapping(value="springEmpUpdate", method=RequestMethod.GET)
	public String springEmpUpdateForm(@ModelAttribute SpringEmpVO evo, Model model){
		logger.info("SpringEmpContoller :: springEmpUpdateForm(Model model) 함수 진입 >>> : ");
		logger.info("SpringEmpContoller :: evo.getEmpno() >>> : "+evo.getEmpno());
		logger.info("SpringEmpContoller :: evo.getEname() >>> : "+evo.getEname());
		logger.info("SpringEmpContoller :: evo.getEname() >>> : "+evo.getEname());
		logger.info("SpringEmpContoller :: evo.getHiredate() >>> : "+evo.getHiredate());
		
		int updateCnt=springEmpService.springEmpUpdate(evo);
		logger.info("updateCnt >>> : "+updateCnt);
		
		if(updateCnt>0){
			logger.info("SpringEmpContoller :: springEmpUpdateForm(Model model) updateCnt >>> : "+updateCnt);
			
			model.addAttribute("updateCnt", updateCnt);
			return "emp/springEmpUpdate";
		}
		
		return "emp/springEmpForm";
	}
}