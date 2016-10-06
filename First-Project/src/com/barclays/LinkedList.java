package com.barclays;

 class LinkedList {
	public Node firstNode,LastNode;
	public LinkedList() {
		firstNode=null;
		LastNode=null;
	}
	public void insert(int value){
		Node n=new Node(value);
		if(firstNode==null){
			firstNode=LastNode=n;
		}
		else{
			LastNode.next=n;
			LastNode=n;
		}
	}
	public void display(){
		Node node=firstNode;
		while(node!=null){
			System.out.println(node.data);
			node=node.next;
		}
	}
 class Node{
		int data;
		Node next;
		Node(int data){
			this.data=data;
			next=null;
		}
		
	}
}
