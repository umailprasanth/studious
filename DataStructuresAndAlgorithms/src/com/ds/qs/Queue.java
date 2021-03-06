package com.ds.qs;


public class Queue<T> {
	
	private Node<T> head;
	private Node<T> last;
	
	public void enQueue(T data){
		if(head == null){			
			last = new Node(data,null);	
			head = last;
		}else{			
			last.next = new Node(data,null);	
			last = last.next;
		}
	
	}
	
	public T dequeue(){
		
		if(head == null)
			throw new RuntimeException("Queue is empty");
		else{
			T data = head.data;
			head = head.next;
			return data;
		}
	}

	public String toString(){
		
		Node<T> node = head;
		StringBuilder ob=new StringBuilder();
		while(node!=null){
			ob.append(node.data+" ");
			node = node.next;
			
		}
		return ob.toString();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new Queue<String>();
		q.enQueue("a");
		q.enQueue("b");
		q.enQueue("c");
		q.enQueue("d");
		
		System.out.println( q.toString() );
		
		q.dequeue();
		
		System.out.println( q.toString() );
		

	}
	
	private static class Node<T>{
		T data;
		Node<T> next ;
		
		public Node(T data,Node<T> n)
		{
		    this.data = data;
		    this.next = n;
		}
	}

}
