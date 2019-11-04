package exercise2;

public class Connection {

	private String name, address;
	private Integer salary;
	
	private Connection() {}
	
	Connection(String name, String address, Integer salary) {
		this();
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public void setAddress(String address) {
		if (address != null)
			this.address = address;
	}
	
	public void setSalary(Integer salary) {
		if (salary != null) {
			this.salary = salary;
		}
	}
	
	@Override
	public String toString() {
		return name + "\t" + address + "\t" + salary;
	}
	
	public boolean hasName(String name2) {
		return name.equals(name2);
	}
}
