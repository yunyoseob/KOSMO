package a.b.c.com.kosmo.rboard.controller;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import a.b.c.com.kosmo.common.ChabunUtil;
import a.b.c.com.kosmo.common.service.ChabunService;
import a.b.c.com.kosmo.rboard.service.KosmoRboardService;
import a.b.c.com.kosmo.rboard.vo.KosmoRboardVO;

@Controller
public class KosmoRboardController {
	Logger logger = LogManager.getLogger(KosmoRboardController.class);
	
	// 필드 오토와이드
	@Autowired(required=false)
	private KosmoRboardService kosmoRboardService;
	
	@Autowired(required=false)
	private ChabunService chabunService;
	
	// 댓글 글쓰기 폼
	@RequestMapping(value="kosmoRboardForm", method=RequestMethod.GET)
	public String kosmoRboardForm(){
		logger.info("KosmoRboardController :: kosmoRboardForm 함수 진입 >>> : ");
		return "rboard/kosmoRboardForm";
	}
	
	// 댓글 입력
	@RequestMapping(value="kosmoRboardInsert", method=RequestMethod.POST)
	@ResponseBody
	public String kosmoRboardInsert(KosmoRboardVO rvo){
		logger.info("KosmoRboardController :: kosmoRboardInsert 함수 진입 >>> : ");
		logger.info("KosmoRboardController :: kosmoRboardInsert rvo.getKbnum() >>> : "+rvo.getKbnum());
		
		// 채번 구하기
		List<KosmoRboardVO> rbList=null;
		String chanum="";
		String rkbnum="";
		KosmoRboardVO _rvo=null;
		
		rbList=chabunService.getKosmoRboardChabun();
		logger.info("rbList >>> : "+rbList);
		logger.info("rbList.size() >>> : "+rbList.size());
		logger.info("rbList.get(0) >>> : "+rbList.get(0));
	
		
		_rvo=rbList.get(0);
		logger.info("_rvo.getRkbnum() >>> : "+_rvo.getRkbnum());
		chanum=_rvo.getRkbnum();
		rkbnum=ChabunUtil.getKosmoRboardChabun("D", chanum);
		
		rvo.setRkbnum(rkbnum);
		
		logger.info("rvo.getRkbnum() >>> : "+rvo.getRkbnum());
		
		
		
		
		int nCnt=kosmoRboardService.kosmoRboardInsert(rvo);
		
		
		logger.info("KosmoRboardController kosmoRboardInsert nCnt >>> : " + nCnt);
		
		if (1 == nCnt) { return "GOOD"; }
		else { return "BAD"; }
	}
	
	// 댓글 전체 조회
	@RequestMapping(value="kosmoRboardSelectAll", method=RequestMethod.POST)
	@ResponseBody
	public String kosmoRboardSelectAll(KosmoRboardVO rvo){
		logger.info("KosmoRboardController :: kosmoRboardSelectAll 함수 진입 >>> : ");
		logger.info(" rvo.getRkbnum() >>> : "+rvo.getRkbnum());
		
		List<KosmoRboardVO> list=kosmoRboardService.kosmoRboardSelectAll(rvo);
		logger.info("KosmoRboardController :: kosmoRboardSelectAll :: list >>> : "+list);
		logger.info("KosmoRboardController :: kosmoRboardSelectAll :: list.size() >>> : "+list.size());
		
		String ss="";
		String listStr="";
		for(int i=0; i<list.size(); i++){
			KosmoRboardVO _rvo=list.get(i);
			String s0=_rvo.getRkbnum();
			String s1=_rvo.getRkbname();
			String s2=_rvo.getRkbcontent();
			String s3=_rvo.getMinsertdate();
			ss=s0+","+s1+","+s2+","+s3;
			listStr+=ss+"&";
		}
		logger.info("listStr >>> : \n"+listStr);
		return listStr;
	}
	
	
}
