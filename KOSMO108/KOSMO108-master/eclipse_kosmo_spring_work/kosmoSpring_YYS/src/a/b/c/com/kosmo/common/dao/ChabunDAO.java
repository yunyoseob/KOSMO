package a.b.c.com.kosmo.common.dao;

import java.util.List;

import a.b.c.com.kosmo.board.vo.KosmoBoardVO;
import a.b.c.com.kosmo.cart.vo.KosmoCartVO;
import a.b.c.com.kosmo.member.vo.KosmoMemberVO;
import a.b.c.com.kosmo.product.vo.KosmoProductVO;
import a.b.c.com.kosmo.rboard.vo.KosmoRboardVO;

public interface ChabunDAO {
		public List<KosmoProductVO> getKosmoProductChabun();
		public List<KosmoMemberVO> getKosmoMemberChabun();
		public List<KosmoCartVO> getKosmoCartChabun();
		public List<KosmoBoardVO> getKosmoBoardChabun();
		public List<KosmoRboardVO> getKosmoRboardChabun();
}
