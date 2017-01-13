package chao.tool;

public class Pager {
    private int pageNow;
    private int pageSize=8;
    private int totalPage;
    private int totalSize;
    private boolean hasFirst;
    private boolean hasPre;
    private boolean hasnext;
    private boolean hasLast;
	public Pager(int pageNow, int totalSize) {
		super();
		this.pageNow = pageNow;
		this.totalSize = totalSize;
	}
	public int getPageNow() {
		return pageNow;
	}
	public void setPageNow(int pageNow) {
		this.pageNow = pageNow;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getTotalPage() {
		totalPage=getTotalSize()/getPageSize();
		if(totalSize%totalPage!=0)
			totalPage++;
		return totalPage;
	}
	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	public int getTotalSize() {
		return totalSize;
	}
	public void setTotalSize(int totalSize) {
		this.totalSize = totalSize;
	}
	public boolean isHasFirst() {
		if(pageNow==1)
			return false;
		else
		    return true;
	}
	public void setHasFirst(boolean hasFirst) {
		this.hasFirst = hasFirst;
	}
	public boolean isHasPre() {
		if(this.isHasFirst())
			return false;
		else
		    return true;
	}
	public void setHasPre(boolean hasPre) {
		this.hasPre = hasPre;
	}
	public boolean isHasnext() {
		if(this.isHasLast())
			return false;
		else
		    return true;
	}
	public void setHasnext(boolean hasnext) {
		this.hasnext = hasnext;
	}
	public boolean isHasLast() {
		if(pageNow==this.getTotalPage())
			return false;
		else
		    return true;
	}
	public void setHasLast(boolean hasLast) {
		this.hasLast = hasLast;
	}
}
