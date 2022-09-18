package a.b.c.com.kosmo.rboard.vo;

public class KosmoRboardVO {
	private String rkbnum;
	private String kbnum;
	private String rkbname;
	private String rkbcontent;
	private String mdeleteyn;
	private String minsertdate;
	
	// default constructor
	public KosmoRboardVO(){
		
	}

	public KosmoRboardVO(String rkbnum, String kbnum, String rkbname, String rkbcontent, String mdeleteyn,
			String minsertdate) {
		this.rkbnum = rkbnum;
		this.kbnum = kbnum;
		this.rkbname = rkbname;
		this.rkbcontent = rkbcontent;
		this.mdeleteyn = mdeleteyn;
		this.minsertdate = minsertdate;
	}

	public String getRkbnum() {
		return rkbnum;
	}

	public String getKbnum() {
		return kbnum;
	}

	public String getRkbname() {
		return rkbname;
	}

	public String getRkbcontent() {
		return rkbcontent;
	}

	public String getMdeleteyn() {
		return mdeleteyn;
	}

	public String getMinsertdate() {
		return minsertdate;
	}

	public void setRkbnum(String rkbnum) {
		this.rkbnum = rkbnum;
	}

	public void setKbnum(String kbnum) {
		this.kbnum = kbnum;
	}

	public void setRkbname(String rkbname) {
		this.rkbname = rkbname;
	}

	public void setRkbcontent(String rkbcontent) {
		this.rkbcontent = rkbcontent;
	}

	public void setMdeleteyn(String mdeleteyn) {
		this.mdeleteyn = mdeleteyn;
	}

	public void setMinsertdate(String minsertdate) {
		this.minsertdate = minsertdate;
	}
	
}
