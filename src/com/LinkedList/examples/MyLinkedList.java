package com.linkedList.examples;

public class MyLinkedList<E> {

	Node head;
	Node tail;

	MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	private static final class Node<E> {
		E data;
		Node next;

		Node(E data) {
			this.data = data;
			this.next = null;

		}
	}

	public static void main(String[] args) {

		MyLinkedList list = new MyLinkedList();

		/*list.addFirst(3);
		list.addFirst(5);
		list.addFirst(8);
		list.addFirst(9);
		list.addFirst(16);
		list.addFirst(78);
		System.out.println("\nPrinting List after adding element to front:--");
		list.printLinkedList(list);*/
		System.out.println("\nPrinting List after adding element to last:--");
		list.addLast(100);
		list.printLinkedList(list);
		System.out.println("\nPrinting List after removing first:--");
		list.removeFirst();
		list.printLinkedList(list);
	}

	public void addFirst(E data) {
		Node newNode = new Node(data);
		newNode.next = head;
		head = newNode;

	}

	public void addLast(E data) {
		Node newNode = new Node(data);
		Node tmp = head;
		if (head == null)
			head = newNode;
		else {
			while (tmp.next != null) {
				tmp = tmp.next;
			}

			tmp.next = newNode;
		}

	}

	public void removeFirst() {
		if (head == null)
			return;
		else {
			if (head.next == null)
				head = null;
			else {
				head = head.next;
			}
		}
	}

	public void removeLast(E data) {

		
	}

	public void printLinkedList(MyLinkedList list) {
		Node tmp = head;
		// System.out.println(head.data);
		while (tmp != null) {
			System.out.printf("%d ", tmp.data);
			tmp = tmp.next;
		}
	}

}
