package chao.model;

import java.util.HashSet;
import java.util.Set;

/**
 * Kcb entity. @author MyEclipse Persistence Tools
 */

public class Kcb implements java.io.Serializable {

	// Fields

	private String kch;
	private String kcm;
	private Short kxxq;
	private Integer xs;
	private Integer xf;
	private Set xsKcbs = new HashSet(0);
	private Set cjbs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Kcb() {
	}

	/** full constructor */
	public Kcb(String kcm, Short kxxq, Integer xs, Integer xf, Set xsKcbs,
			Set cjbs) {
		this.kcm = kcm;
		this.kxxq = kxxq;
		this.xs = xs;
		this.xf = xf;
		this.xsKcbs = xsKcbs;
		this.cjbs = cjbs;
	}

	// Property accessors

	public String getKch() {
		return this.kch;
	}

	public void setKch(String kch) {
		this.kch = kch;
	}

	public String getKcm() {
		return this.kcm;
	}

	public void setKcm(String kcm) {
		this.kcm = kcm;
	}

	public Short getKxxq() {
		return this.kxxq;
	}

	public void setKxxq(Short kxxq) {
		this.kxxq = kxxq;
	}

	public Integer getXs() {
		return this.xs;
	}

	public void setXs(Integer xs) {
		this.xs = xs;
	}

	public Integer getXf() {
		return this.xf;
	}

	public void setXf(Integer xf) {
		this.xf = xf;
	}

	public Set getXsKcbs() {
		return this.xsKcbs;
	}

	public void setXsKcbs(Set xsKcbs) {
		this.xsKcbs = xsKcbs;
	}

	public Set getCjbs() {
		return this.cjbs;
	}

	public void setCjbs(Set cjbs) {
		this.cjbs = cjbs;
	}

}