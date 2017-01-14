package chao.model;

/**
 * Cjb entity. @author MyEclipse Persistence Tools
 */

public class Cjb implements java.io.Serializable {

	// Fields

	private CjbId id;
	private Float cj;
	private Integer xf;

	// Constructors

	/** default constructor */
	public Cjb() {
	}

	/** minimal constructor */
	public Cjb(CjbId id) {
		this.id = id;
	}

	/** full constructor */
	public Cjb(CjbId id, Float cj, Integer xf) {
		this.id = id;
		this.cj = cj;
		this.xf = xf;
	}

	// Property accessors

	public CjbId getId() {
		return this.id;
	}

	public void setId(CjbId id) {
		this.id = id;
	}

	public Float getCj() {
		return this.cj;
	}

	public void setCj(Float cj) {
		this.cj = cj;
	}

	public Integer getXf() {
		return this.xf;
	}

	public void setXf(Integer xf) {
		this.xf = xf;
	}

}