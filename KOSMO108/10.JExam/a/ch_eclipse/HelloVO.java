package a.b.c.ch3;

public class HelloVO {

	private String mid;
	private String mpw;
	private String mname;
	
	public HelloVO() {
		
	}

	public HelloVO(String mid, String mpw, String mname) {		
		this.mid = mid;
		this.mpw = mpw;
		this.mname = mname;
	}
	
	public String getMid() {
		return mid;
	}
	public String getMpw() {
		return mpw;
	}
	public String getMname() {
		return mname;
	}
	
	public void setMid(String mid) {
		this.mid = mid;
	}
	public void setMpw(String mpw) {
		this.mpw = mpw;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	
	
	
	
	
}
