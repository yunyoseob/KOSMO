package a.b.c.test.json;

public class PieChartVO {
	
	private String task;
	private String hoursday;
	
	public PieChartVO() {

	}
	public PieChartVO(String task, String hoursday) {

		this.task = task;
		this.hoursday = hoursday;
	}
	
	public String getTask() {
		return task;
	}
	public String getHoursday() {
		return hoursday;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public void setHoursday(String hoursday) {
		this.hoursday = hoursday;
	}

}
