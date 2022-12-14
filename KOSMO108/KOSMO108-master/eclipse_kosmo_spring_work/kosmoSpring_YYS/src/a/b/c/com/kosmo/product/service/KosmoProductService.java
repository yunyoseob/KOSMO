package a.b.c.com.kosmo.product.service;

import java.util.List;
import a.b.c.com.kosmo.product.vo.KosmoProductVO;

public interface KosmoProductService {
	public int kosmoProductInsert(KosmoProductVO kvo);
	public List<KosmoProductVO> kosmoProductSelectAll(KosmoProductVO kvo);
	public List<KosmoProductVO> kosmoProductSelect(KosmoProductVO kvo);
	// ์ํ์กฐํ
	public List<KosmoProductVO> kosmoProductMSelect(KosmoProductVO kvo);
	public int kosmoProductUpdate(KosmoProductVO kvo);
	public int kosmoProductDelete(KosmoProductVO kvo);
}
