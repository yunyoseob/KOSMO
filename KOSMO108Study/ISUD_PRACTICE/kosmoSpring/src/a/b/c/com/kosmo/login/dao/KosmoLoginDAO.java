package a.b.c.com.kosmo.login.dao;

import java.util.List;

import a.b.c.com.kosmo.mem.vo.KosmoMemberVO;

public interface KosmoLoginDAO {

	public List<KosmoMemberVO> kosmoLoginCheck(KosmoMemberVO kmvo);
}
