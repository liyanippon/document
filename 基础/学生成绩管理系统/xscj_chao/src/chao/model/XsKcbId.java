package chao.model;

/**
 * XsKcbId entity. @author MyEclipse Persistence Tools
 */

public class XsKcbId implements java.io.Serializable {

	// Fields

	private Xsb xsb;
	private Kcb kcb;

	// Constructors

	/** default constructor */
	public XsKcbId() {
	}

	/** full constructor */
	public XsKcbId(Xsb xsb, Kcb kcb) {
		this.xsb = xsb;
		this.kcb = kcb;
	}

	// Property accessors

	public Xsb getXsb() {
		return this.xsb;
	}

	public void setXsb(Xsb xsb) {
		this.xsb = xsb;
	}

	public Kcb getKcb() {
		return this.kcb;
	}

	public void setKcb(Kcb kcb) {
		this.kcb = kcb;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof XsKcbId))
			return false;
		XsKcbId castOther = (XsKcbId) other;

		return ((this.getXsb() == castOther.getXsb()) || (this.getXsb() != null
				&& castOther.getXsb() != null && this.getXsb().equals(
				castOther.getXsb())))
				&& ((this.getKcb() == castOther.getKcb()) || (this.getKcb() != null
						&& castOther.getKcb() != null && this.getKcb().equals(
						castOther.getKcb())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getXsb() == null ? 0 : this.getXsb().hashCode());
		result = 37 * result
				+ (getKcb() == null ? 0 : this.getKcb().hashCode());
		return result;
	}

}