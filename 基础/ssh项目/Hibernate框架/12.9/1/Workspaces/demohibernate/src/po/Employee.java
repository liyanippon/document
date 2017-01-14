package po;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private EmployeeId id;
	private Company company;

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** minimal constructor */
	public Employee(EmployeeId id) {
		this.id = id;
	}

	/** full constructor */
	public Employee(EmployeeId id, Company company) {
		this.id = id;
		this.company = company;
	}

	// Property accessors

	public EmployeeId getId() {
		return this.id;
	}

	public void setId(EmployeeId id) {
		this.id = id;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}