package com.qiangge.linkedList;

class ListNode {
	private int num;
	ListNode next;

	public ListNode(int num) {
		super();
		this.setNum(num);
	}

	public void display() {
		System.out.println("{" + getNum() + "}");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}

public class LinkedList {
	private ListNode first;
	private ListNode tail;

	public LinkedList() {
		first = null;
		tail = null;
	}

	/**
	 * 头插法
	 * 
	 * @param value
	 */
	public void HeadInsert(int value) {
		ListNode newNode = new ListNode(value);
		newNode.next = first;
		first = newNode;

	}

	/**
	 * 尾插法
	 * 
	 * @param value
	 */
	public void TailInsert(int value) {
		ListNode newNode = new ListNode(value);
		if (first == null) {
			first = newNode;
			tail = first;
		} else {
			tail.next = newNode;
			tail = newNode;
		}
	}

	public void displayList() {
		ListNode begin = this.first;
		while (begin != null) {
			System.out.println(first.getNum());
			begin = begin.next;
		}
	}

}
