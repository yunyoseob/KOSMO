package a.b.c.com.kosmo.rboard.dao;

import a.b.c.com.kosmo.rboard.vo.KosmoRboardVO;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class KosmoRboardDAOImpl implements KosmoRboardDAO{
	
	@Autowired(required=false)
	private SqlSession sqlSession;
	
	@Override
	public int kosmoRboardInsert(KosmoRboardVO rvo){
		return (Integer)sqlSession.insert("kosmoRboardInsert", rvo);
	};
	
	@Override
	public List<KosmoRboardVO> kosmoRboardSelectAll(KosmoRboardVO rvo){
		return sqlSession.selectList("kosmoRboardSelectAll", rvo);
	};
	
}
