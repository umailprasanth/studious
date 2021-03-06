package com.ds.tree;

import com.ds.qs.Queue;

public class BST<Key extends Comparable<Key>,Value> {

	
	private static class Node<Key,Value>{
		private Key key;
		private Value value;
		private Node<Key,Value> left;
		private Node<Key,Value> right;
		private int count;
		public Node(Key key,Value value){
			this.key  = key;
			this.value  = value;
		}
		
	} 
	
	
	private Node<Key,Value> root;
	
	private void put(Key key,Value val){ 		
		root = put(root,key,val);				
	}
	
	public int size(Node<Key,Value> node){
		if(node == null) return 0;
		return node.count;
	}
	
	public int size(){
		return size(root);
	}
		
	private Node<Key,Value> put(Node<Key,Value> node,Key key,Value val){
		if(node == null) return new Node(key,val);
		int cmp = key.compareTo(node.key);
		if(cmp < 0)
			node.left = put(node.left,key,val);
		else if(cmp > 0)
			node.right = put(node.right,key,val);
		else if(cmp == 0)
			node.value = val;
		node.count = 1 + size(node.left) + size(node.right);
		return node;
				
	}
	
	public Value get(Key key){ 
		
		Node<Key,Value> x = root;
		
		while(x != null){
			
			int cmp = key.compareTo( x.key );
			if(cmp < 0) x = x.left;
			else if(cmp > 0) x = x.right;
			else if(cmp == 0) return x.value;
		}
		return null;
	}
	
	public String toString(){
		return root.key+"";
	}
	
	public void inorder(Queue<Key> q){
		inorder(root,q);
	}
	
	
	private void inorder(Node <Key,Value> node,Queue<Key> q){
		if(node == null) return ;
		inorder(node.left, q);
		q.enQueue(node.key);
		inorder(node.right,q);
	}
	
	public int height()
    {
      return height(root);
    }
	
    private int height(Node <Key,Value> n)
    {
      if(n == null) return -1;
      else
      return 1 + Math.max( height(n.left), height(n.right));
    }
	
	
	public static void main(String s[]){
		BST<Integer,Integer> oBst = new BST<Integer,Integer>();
		oBst.put(5,0);
		oBst.put(7,0);
		oBst.put(3,0);
		System.out.println( oBst.toString() );
		Queue<Integer> q = new Queue<Integer>();
		oBst.inorder(q);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		
		
		
	}
	
	
}
