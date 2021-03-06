package com.ds.strings;

public class UniqueCharactersInString {
	
	
	private boolean isUnique(String s){
		
		if(s.isEmpty()) throw new IllegalArgumentException();
		
		if(s.length() == 1) return true; 
		
		boolean charArray[] = new boolean[256];
		
		char str[] = s.toCharArray();
		
		for(int i=0;i<s.length();i++){
			char n = s.charAt(i);
			if( charArray[n] ) return false;
			charArray[n] = true;
		}
		
		return true;
		
	}

	public static void main(String[] args) {
		UniqueCharactersInString obj = new UniqueCharactersInString();
		System.out.println(obj.isUnique("abcd"));
		System.out.println(obj.isUnique("a"));			
		System.out.println(obj.isUnique("abccd"));
		System.out.println(obj.isUnique(null));
		System.out.println(obj.isUnique(""));	

	}

}
