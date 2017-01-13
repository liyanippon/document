package chao.model;

import java.sql.Blob;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Xsb entity. @author MyEclipse Persistence Tools
 */

public class Xsb implements java.io.Serializable {

	// Fields

	private String xh;
	private Zyb zyb;
	private String xm;
	private Boolean xb;
	private Timestamp cssj;
	private Integer zxf;
	private String bz;
	//private String zp;
	private byte[] zp;  
	//private Blob zp;
	private Set xsKcbs = new HashSet(0);
	private Set cjbs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Xsb() {
	}

	/** minimal constructor */
	public Xsb(Zyb zyb, String xm) {
		this.zyb = zyb;
		this.xm = xm;
	}

	/** full constructor */
	public Xsb(Zyb zyb, String xm, Boolean xb, Timestamp cssj, Integer zxf,
			String bz, byte[] zp, Set xsKcbs, Set cjbs) {
		this.zyb = zyb;
		this.xm = xm;
		this.xb = xb;
		this.cssj = cssj;
		this.zxf = zxf;
		this.bz = bz;
		this.zp = zp;
		this.xsKcbs = xsKcbs;
		this.cjbs = cjbs;
	}

	// Property accessors

	public String getXh() {
		return this.xh;
	}

	public void setXh(String xh) {
		this.xh = xh;
	}

	public Zyb getZyb() {
		return this.zyb;
	}

	public void setZyb(Zyb zyb) {
		this.zyb = zyb;
	}

	public String getXm() {
		return this.xm;
	}

	public void setXm(String xm) {
		this.xm = xm;
	}

	public Boolean getXb() {
		return this.xb;
	}

	public void setXb(Boolean xb) {
		this.xb = xb;
	}

	public Timestamp getCssj() {
		return this.cssj;
	}

	public void setCssj(Timestamp cssj) {
		this.cssj = cssj;
	}

	public Integer getZxf() {
		return this.zxf;
	}

	public void setZxf(Integer zxf) {
		this.zxf = zxf;
	}

	public String getBz() {
		return this.bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}

//	public String getZp() {
//		return zp;
//	}
//
//	public void setZp(String zp) {
//		this.zp = zp;
//	}
//	public void setZp(Blob zp) {
//		this.zp = zp;
//	}
	
//	public Blob getZp() {
//		return zp;
//	}
	
	
	public void setXsKcbs(Set xsKcbs) {
		this.xsKcbs = xsKcbs;
	}
	public byte[] getZp() {
		return zp;
	}

	public void setZp(byte[] zp) {
		this.zp = zp;
	}

	public Set getXsKcbs() {
		return xsKcbs;
	}
	
	public void setCjbs(Set cjbs) {
		this.cjbs = cjbs;
	}
	
	public Set getCjbs() {
		return this.cjbs;
	}



}