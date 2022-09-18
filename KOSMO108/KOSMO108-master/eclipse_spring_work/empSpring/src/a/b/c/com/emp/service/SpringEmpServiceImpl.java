package a.b.c.com.emp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import a.b.c.com.emp.dao.SpringEmpDAO;
import a.b.c.com.emp.vo.SpringEmpVO;

@Service
@Transactional
public class SpringEmpServiceImpl implements SpringEmpService {
	Logger logger = LogManager.getLogger(SpringEmpServiceImpl.class);
	
	//서비스에서 DAO 연결하기
	private SpringEmpDAO springEmpDAO;
	
		
	// ################## INSERT #########################	
    // 생성자 에 @Autowired 어노테이션으로 DI(의존성 주입)
    @Autowired(required=false)
    public SpringEmpServiceImpl(SpringEmpDAO springEmpDAO){
    	this.springEmpDAO=springEmpDAO;
    }
		
    @Override
    public int springEmpInsert(SpringEmpVO evo){
    	logger.info("SpringEmpServiceImpl springEmpInsert 함수 진입 >>> : ");
    	
    	return springEmpDAO.springEmpInsert(evo);
    }
    
    // ################## SELECT ALL #########################
    @Override
    public List springEmpSelectAll(){
    	logger.info("SpringEmpServiceImpl springEmpSelectAll() 함수 진입 >>> : ");
    	
    	return springEmpDAO.springEmpSelectAll();
    };
    
    // ############### SELECT #############################
    @Override
    public List springEmpSelect(SpringEmpVO evo){
    	logger.info("SpringEmpServiceImpl :: springEmpSelect(SpringEmpVO evo) 함수 진입 >>> : ");
    	
    	return springEmpDAO.springEmpSelect(evo);
    }
    
    // ############### UPDATE #############################
    @Override
    public int springEmpUpdate(SpringEmpVO evo){
    	logger.info("SpringEmpServiceImpl :: springEmpSelect(SpringEmpVO evo) 함수 진입 >>> : ");
    	
    	return springEmpDAO.springEmpUpdate(evo);
    }
    
}
