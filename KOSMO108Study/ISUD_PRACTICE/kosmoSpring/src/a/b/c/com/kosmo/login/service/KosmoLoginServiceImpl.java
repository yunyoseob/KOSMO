package a.b.c.com.kosmo.login.service;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import a.b.c.com.kosmo.login.dao.KosmoLoginDAO;
import a.b.c.com.kosmo.mem.vo.KosmoMemberVO;

@Service
@Transactional
public class KosmoLoginServiceImpl implements KosmoLoginService {
	Logger logger = LogManager.getLogger(KosmoLoginServiceImpl.class);
	
	// 서비스에서 DAO 연결하기 
	// 필드 @Autowired 어노테이션으로  DI (의존성 주입하기)
	@Autowired(required=false)
	private KosmoLoginDAO kosmoLoginDAO;

	@Override
	public List<KosmoMemberVO> kosmoLoginCheck(KosmoMemberVO kmvo) {
		// TODO Auto-generated method stub
		logger.info("KosmoLoginServiceImpl kosmoLoginCheck 함수 진입 >>> : ");
		return kosmoLoginDAO.kosmoLoginCheck(kmvo);
	}

}
