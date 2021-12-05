package depinfo;

public class AdminDepartment extends SuperDepartment {
	
	
	public AdminDepartment() {
		this.depName = " Admin Department ";
		this.todWork = " Complete your documents Submission";
		this.workDeadLine = " Complete by EOD ";
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
}
