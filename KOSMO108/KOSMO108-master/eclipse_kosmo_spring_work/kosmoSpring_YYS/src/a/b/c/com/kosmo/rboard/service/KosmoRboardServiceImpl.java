package a.b.c.com.kosmo.rboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.kosmo.rboard.dao.KosmoRboardDAO;
import a.b.c.com.kosmo.rboard.vo.KosmoRboardVO;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

@Service
@Transactional
public class KosmoRboardServiceImpl implements KosmoRboardService {
	Logger logger = LogManager.getLogger(KosmoRboardServiceImpl.class);
	
	
	@Autowired(required=false)
	private KosmoRboardDAO kosmoRboardDAO;
	
	
	@Override
	public int kosmoRboardInsert(KosmoRboardVO rvo){
		logger.info("KosmoRboardServiceImpl :: kosmoRboardInsert >>> : ");
		return kosmoRboardDAO.kosmoRboardInsert(rvo);
	};
	
	@Override
	public List<KosmoRboardVO> kosmoRboardSelectAll(KosmoRboardVO rvo){
		logger.info("KosmoRboardServiceImpl :: kosmoRboardSelectAll >>> : ");
		return kosmoRboardDAO.kosmoRboardSelectAll(rvo);
	};
}
