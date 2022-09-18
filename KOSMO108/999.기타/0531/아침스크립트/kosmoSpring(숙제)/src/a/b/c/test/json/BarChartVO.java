package a.b.c.test.json;

public class BarChartVO {

	private String yyyy;
	private String sales;
	private String costs;
	
	public BarChartVO() {
		
	}
	public BarChartVO(String yyyy, String sales, String costs) {
		
		this.yyyy = yyyy;
		this.sales = sales;
		this.costs = costs;
	}
	public String getYyyy() {
		return yyyy;
	}
	public String getSales() {
		return sales;
	}
	public String getCosts() {
		return costs;
	}
	public void setYyyy(String yyyy) {
		this.yyyy = yyyy;
	}
	public void setSales(String sales) {
		this.sales = sales;
	}
	public void setCosts(String costs) {
		this.costs = costs;
	}
	
}
