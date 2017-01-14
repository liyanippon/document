package com.xinxi_Action.struts.session;

import java.util.ArrayList;
import java.util.List;

public class Pager {
	List<Object> list = new ArrayList<Object>();

	private Integer curPageNO; // ��ǰҳ

	private Integer pageCount; // ҳ��

	private Integer first; // ��һҳ

	private Integer previous;// ��һҳ

	private Integer next;// ��һҳ

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
	 * @param sx���ж�������¼
	 * @param first_resuleĬ�����ݿ�ӵ�1����ʼ����
	 * @param max_resulesÿҳ����5������
	 * @return list ��ǰҳ= curPageNO ���м�ҳ=pageCount ��һҳ= first ���һҳ= pageCount
	 *         ��һҳ= previous ��һҳ= next
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

	// // �ж��û���һҳ
	// public boolean isFirst() {
	// return (curPageNO == 1) ? true : false;
	// }
	//
	// // ���
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
