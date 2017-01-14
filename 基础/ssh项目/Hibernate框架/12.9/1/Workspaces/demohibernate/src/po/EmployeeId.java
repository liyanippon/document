package po;

/**
 * EmployeeId entity. @author MyEclipse Persistence Tools
 */

public class EmployeeId implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Company company;

	// Constructors

	/** default constructor */
	public EmployeeId() {
	}

	/** full constructor */
	public EmployeeId(Integer id, String name, Company company) {
		this.id = id;
		this.name = name;
		this.company = company;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EmployeeId))
			return false;
		EmployeeId castOther = (EmployeeId) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getName() == castOther.getName()) || (this.getName() != null
						&& castOther.getName() != null && this.getName()
						.equals(castOther.getName())))
				&& ((this.getCompany() == castOther.getCompany()) || (this
						.getCompany() != null
						&& castOther.getCompany() != null && this.getCompany()
						.equals(castOther.getCompany())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getName() == null ? 0 : this.getName().hashCode());
		result = 37 * result
				+ (getCompany() == null ? 0 : this.getCompany().hashCode());
		return result;
	}

}