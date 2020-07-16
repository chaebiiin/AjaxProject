package employee;

public class Employee {
	int employee_id;
	String first_name;
	String email;
	int salary;
	String hire_date;
	String last_name;
	String job_id;
	
	public Employee(String email, String hire_date, String last_name, String job_id) {
		super();
		this.email = email;
		this.hire_date = hire_date;
		this.last_name = last_name;
		this.job_id = job_id;
	}

	public Employee(int employee_id, String first_name, String email, int salary) {
		super();
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.email = email;
		this.salary = salary;
	
	}

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getHire_date() {
		return hire_date;
	}

	public void setHire_date(String hire_date) {
		this.hire_date = hire_date;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getJob_id() {
		return job_id;
	}

	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	
}
