package march15_oops;

public class March15_employee {
	
	int ID;
	String name;
	String Department;
	String WorkLocation ="bengolore";
	
 
	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		this.ID = iD;
	}

	public String getname() {
		return name;
	}


	public void setname(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		this.Department = department;
	}
	public String getWorkLocation() {
		return WorkLocation;
	}

	public void setWorkLocation(String workLocation) {
		WorkLocation = workLocation;
	}
	
	public static void main(String args[])
	{
		 
		March15_employee e1 = new March15_employee();
		e1.setID(111);
		e1.setname("neha");
		e1.setDepartment("training");
		e1.setWorkLocation("benglore");
		System.out.println(e1.getID());
		System.out.println(e1.getname());
		System.out.println(e1.getDepartment());
		System.out.println(e1.getWorkLocation());
		System.out.println();
		
		
		March15_employee e2 = new March15_employee();
		e2.setID(222);
		e2.setname("pritam");
		e2.setDepartment("automation");
		System.out.println(e2.getID());
		System.out.println(e2.getname());
		System.out.println(e2.getDepartment());
		System.out.println(e2.getWorkLocation());
		System.out.println();
		
		March15_employee e3 = new March15_employee();
		e3.setID(333);
		e3.setname("nisha");
		e3.setDepartment("mechanical");
		System.out.println(e3.getID());
		System.out.println(e3.getname());
		System.out.println(e3.getDepartment());
		System.out.println(e3.getWorkLocation());
		
	}
}
