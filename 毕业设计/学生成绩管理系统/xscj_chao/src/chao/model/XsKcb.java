package chao.model;

/**
 * XsKcb entity. @author MyEclipse Persistence Tools
 */

public class XsKcb implements java.io.Serializable {

	// Fields

	private XsKcbId id;

	// Constructors

	/** default constructor */
	public XsKcb() {
	}

	/** full constructor */
	public XsKcb(XsKcbId id) {
		this.id = id;
	}

	// Property accessors

	public XsKcbId getId() {
		return this.id;
	}

	public void setId(XsKcbId id) {
		this.id = id;
	}

}