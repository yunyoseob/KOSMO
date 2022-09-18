package a.b.c.com.emp.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import a.b.c.com.emp.vo.SpringEmpVO;

@Repository
public class SpringEmpDAOImpl implements SpringEmpDAO {
	Logger logger=LogManager.getLogger(this.getClass());
	
	@Autowired(required=false)
	private SqlSession sqlSession;
	
	@Override
	public int springEmpInsert(SpringEmpVO evo){	
		logger.info("DAO에서는 로그가 찍히지 않는다. 따로 찍는 방법이 있다고 한다.");
		logger.info("SpringEmpDAOImpl :: springEmpInsert(SpringEmpVO evo) 함수 진입 >>> : ");
		return (Integer)sqlSession.insert("springEmpInsert", evo);
	};
	
	@Override
	public List springEmpSelectAll(){
		logger.info("SpringEmpDAOImpl :: springEmpSelectAll() 함수 진입 >>> : ");
		
		return sqlSession.selectList("springEmpSelectAll");
	}
	
	@Override
	public List springEmpSelect(SpringEmpVO evo){
		logger.info("SpringEmpDAOImpl :: springEmpSelect(SpringEmpVO evo) 함수 진입 >>> : ");
		
		return sqlSession.selectList("springEmpSelect", evo);
	}
	
	@Override
	public int springEmpUpdate(SpringEmpVO evo){
		logger.info("SpringEmpDAOImpl :: springEmpUpdate(SpringEmpVO evo) 함수 진입 >>> : ");
		
		return (Integer)sqlSession.update("springEmpUpdate", evo);
	};
}
