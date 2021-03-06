package com.ds.strings;

public class AnagramTester {

	
	public static boolean isAnagaram(String s1, String s2){

	    //if the count of occurrence of each character is same it is an anagram
		
		if(s1.isEmpty() || s2.isEmpty() ) throw new IllegalArgumentException();
		
		if(s1.length() != s2.length() ) return false;
		
		int countArray[] = new int[256];
		
		for(int i=0;i<s1.length();i++){
			System.out.println((int)s1.charAt(i));
			countArray[ (int)s1.charAt(i) ]++;
		}
		
		for(int j=0;j<s2.length();j++){			
			if( countArray[ (int)s2.charAt(j) ] == 0){
				return false;
			}				
		    countArray[ s2.charAt(j) ]--;
		}
		
		return true;
		
	}
	
	public static void main(String[] args) {		
		System.out.println( AnagramTester.isAnagaram("abcc", "ccdc") );
	}

}
