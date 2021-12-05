package depinfo;

public class TechDepartment extends SuperDepartment {
	
	String stackInfo; 
	
	public TechDepartment() {
		this.depName = " Tech Department ";
		this.todWork = " Complete coding of Module 1";
		this.workDeadLine = " Complete by EOD ";
		this.stackInfo = " core Java";
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
	
	public String getTechStackInformation() {
		return this.stackInfo;
	}
	
}
