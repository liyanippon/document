package com.xinxi_Action.struts.session;

import java.util.ArrayList;
import java.util.List;

public class Pager {
	List<Object> list = new ArrayList<Object>();

	private Integer curPageNO; // 当前页

	private Integer pageCount; // 页数

	private Integer first; // 第一页

	private Integer previous;// 上一页

	private Integer next;// 下一页

	public Pager() {
	}

	public Pager(Integer curPageNO, Integer pageCount, Integer first,
			Integer previous, Integer next) {
		this.curPageNO = curPageNO;
		this.pageCount = pageCount;
		this.first = first;
		this.previous = previous;
		this.next = next;
	}

	/**
	 * 
	 * @param sx共有多少条记录
	 * @param first_resule默认数据库从第1条开始检索
	 * @param max_resules每页返回5条数据
	 * @return list 当前页= curPageNO 共有几页=pageCount 第一页= first 最后一页= pageCount
	 *         上一页= previous 下一页= next
	 */
	public List<Object> Pager_sx(Integer count, Integer first_resule, Integer max_resules) {
		curPageNO = (first_resule == 0) ? 1 : (int) Math
				.ceil((double) first_resule / max_resules);
		pageCount = (int) Math.ceil((double) count / max_resules);
		first = 1;
		previous = (curPageNO - 1 < 1) ? 1 : curPageNO - 1;
		next = (curPageNO + 1 > pageCount) ? pageCount : curPageNO + 1;
		list.add(new Pager(curPageNO, pageCount, first, previous, next));
		return list;
	}

	// // 判断用户第一页
	// public boolean isFirst() {
	// return (curPageNO == 1) ? true : false;
	// }
	//
	// // 最后
	// public boolean isLast() {
	// return (curPageNO == pageCount) ? true : false;
	// }

	public Integer getCurPageNO() {
		return curPageNO;
	}

	public void setCurPageNO(Integer curPageNO) {
		this.curPageNO = curPageNO;
	}

	public Integer getFirst() {
		return first;
	}

	public void setFirst(Integer first) {
		this.first = first;
	}

	public Integer getNext() {
		return next;
	}

	public void setNext(Integer next) {
		this.next = next;
	}

	public Integer getPageCount() {
		return pageCount;
	}

	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}

	public Integer getPrevious() {
		return previous;
	}

	public void setPrevious(Integer previous) {
		this.previous = previous;
	}

}
