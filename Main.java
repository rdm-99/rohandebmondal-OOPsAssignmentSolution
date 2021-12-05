package depinfo;

public class Main {

	public static void main(String[] args) {
		
		AdminDepartment dep1 = new AdminDepartment();
		HrDepartment dep2 = new HrDepartment();
		TechDepartment dep3 = new TechDepartment();
		
		System.out.println(" Welcome to " + dep1.depName);
		System.out.println(dep1.todWork);
		System.out.println(dep1.workDeadLine);
		System.out.println(dep1.holiday);
		
		System.out.println();
		
		System.out.println(" Welcome to " + dep2.depName);
		System.out.println(dep2.activity);
		System.out.println(dep2.todWork);
		System.out.println(dep2.workDeadLine);
		System.out.println(dep2.holiday);
		
		System.out.println();
		
		System.out.println(" Welcome to " + dep3.depName);
		System.out.println(dep3.todWork);
		System.out.println(dep3.workDeadLine);
		System.out.println(dep3.stackInfo);
		System.out.println(dep3.holiday);
		

	}

}
