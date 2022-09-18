package a.b.c.com.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import a.b.c.com.vo.FormDataVO;

@Controller
public class FormDataController {
	Logger logger = LogManager.getLogger(FormDataController.class);
	
	@RequestMapping(value="formdata_find", method=RequestMethod.GET)
	public String formdata(){
		logger.info("FormDataController :: formdata 함수 진입 >>> : ");
		// mvc/formdata_return
				// <property name="prefix" value="/WEB-INF/view/" />
				// /WEB-INF/view/mvc/formdata_return.jsp
				return "mvc/formdata_return";
	}
	

	// Servlet 방식으로 데이터를 웹브라우저에서 데이터를 받아오고 : request.getParameter()
	// Servlet 방식으로 데이터를 콘트롤러에서 jsp로 보낼 수 있다  : request.setAttribute()
	@RequestMapping(value="formdata_get_servlet", method=RequestMethod.GET)
	public String formdata_get(HttpServletRequest req, Model m){
		logger.info("FormDataController :: formdata_get(HttpServletRequest req, Model m) 함수 진입 >>> : ");
		
		// formdata_return.jsp에서 form태그 안에 있는
		// input 태그의  name의 attribute의 value를 받아온다.
		String datanum=req.getParameter("datanum");
		String dataid=req.getParameter("dataid");
		String datapw=req.getParameter("datapw");
		String dataname=req.getParameter("dataname");
		
		logger.info("FormDataController.formdata_get() :::: datanum >>> : " + datanum);
		logger.info("FormDataController.formdata_get() :::: dataid >>> : " + dataid);
		logger.info("FormDataController.formdata_get() :::: datapw >>> : " + datapw);
		logger.info("FormDataController.formdata_get() :::: dataname >>> : " + dataname);
		
		req.setAttribute("request_datanum", datanum);
		req.setAttribute("request_dataid", dataid);
		req.setAttribute("request_datapw", datapw);
		req.setAttribute("request_dataname", dataname);
		
		m.addAttribute("el_datanum", datanum);
		m.addAttribute("el_dataid", dataid);
		m.addAttribute("el_datapw", datapw);
		m.addAttribute("el_dataname", dataname);
		return "mvc/formdata_get_servlet";
	}
	
	// Spring Web MVC 방식으로
	@RequestMapping(value="formdata_get_spring", method=RequestMethod.GET)
	public String formdata_get_spring(FormDataVO fvo, Model m){
		logger.info("FormDataController :: formdata_get_spring(FormDataVO fvo, Model m) 함수 진입 >>> : ");
		
		logger.info("formdata_get_spring >>> : fvo ::: " + fvo);
		logger.info("formdata_get_spring >>> : fvo.getDatanum() ::: " + fvo.getDatanum());
		logger.info("formdata_get_spring >>> : fvo.getDataid() ::: " + fvo.getDataid());
		logger.info("formdata_get_spring >>> : fvo.getDatapw() ::: " + fvo.getDatapw());
		logger.info("formdata_get_spring >>> : fvo.getDataname() ::: " + fvo.getDataname());
		
		m.addAttribute("m_fvo", fvo);
		
		return "mvc/formdata_get_spring_return";
	}
	
	// Spring @ModelAttribute
	@RequestMapping(value="formdata_post_spring", method=RequestMethod.POST)
	public String formdata_post_modelattrivute(@ModelAttribute("ma_fdvo") FormDataVO fdvo){
		logger.info("FormDataController :: formdata_post_modelattrivute(@ModelAttribute('ma_fdvo') FormDataVO fdvo) 함수 진입 >>> : ");
		
		logger.info("formdata_post_modelattribute >>> : fdvo ::: " + fdvo);
		logger.info("formdata_post_modelattribute >>> : fdvo.getDatanum() ::: " + fdvo.getDatanum());
		logger.info("formdata_post_modelattribute >>> : fdvo.getDataid() ::: " + fdvo.getDataid());
		logger.info("formdata_post_modelattribute >>> : fdvo.getDatapw() ::: " + fdvo.getDatapw());
		logger.info("formdata_post_modelattribute >>> : fdvo.getDataname() ::: " + fdvo.getDataname());
		
		return "mvc/formdata_post_spring_modelattribute_return";
	}
	
	@RequestMapping(value="formdata_post_valueobject", method=RequestMethod.POST)
	public String formdata_post_valueobject(FormDataVO fdvo){
		logger.info("FormDataController :: formdata_post_valueobject(FormDataVO fdvo) 함수 진입 >>> : ");
		
		logger.info("formdata_post_valueobject >>> : fdvo ::: " + fdvo);
		logger.info("formdata_post_valueobject >>> : fdvo.getDatanum() ::: " + fdvo.getDatanum());
		logger.info("formdata_post_valueobject >>> : fdvo.getDataid() ::: " + fdvo.getDataid());
		logger.info("formdata_post_valueobject >>> : fdvo.getDatapw() ::: " + fdvo.getDatapw());
		logger.info("formdata_post_valueobject >>> : fdvo.getDataname() ::: " + fdvo.getDataname());
		
		FormDataVO formDataVO=new FormDataVO();
		
		return "mvc/formdata_post_valueobject_return";
	}
	
	
}
