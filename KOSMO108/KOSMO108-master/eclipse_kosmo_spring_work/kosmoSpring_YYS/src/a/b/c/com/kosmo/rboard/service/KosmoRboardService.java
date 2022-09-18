package a.b.c.com.kosmo.rboard.service;

import java.util.List;

import a.b.c.com.kosmo.rboard.vo.KosmoRboardVO;

public interface KosmoRboardService {
	public int kosmoRboardInsert(KosmoRboardVO rvo);
	public List<KosmoRboardVO> kosmoRboardSelectAll(KosmoRboardVO rvo);
}
