package depinfo;

public class SuperDepartment {
	
	public String depName;
	public String todWork;
	public String workDeadLine;
	public String holiday;
	
	public SuperDepartment() {
		this.depName = " Super Department ";
		this.todWork = " No Work as of now";
		this.workDeadLine = " Nil ";
		this.holiday = " Today is not a holiday";
	}
	
	public String departmentName() {
		return this.depName;
	}
	
	public String getTodaysWork() {
		return this.todWork;
	}
	
	public String getWorkDeadline() {
		return this.workDeadLine;
	}
	
	public String isTodayAHoliday() {
		return this.holiday;
	}
}



