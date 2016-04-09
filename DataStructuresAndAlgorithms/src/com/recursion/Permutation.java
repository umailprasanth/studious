package com.recursion;

import java.util.ArrayList;
public class Permutation {

	
   public static ArrayList<String> solution(String s){
	   ArrayList<String> fullSolution = new ArrayList<String>();
    	if( s.length() == 1 ) {
    		fullSolution.add(s);
    	}
    	else
    	{
    		for(int i=0;i<s.length();i++){
    			ArrayList<String> res = new ArrayList<String>();
    			String str = String.valueOf(s.charAt(i));
    			System.out.println("str "+str);
    			System.out.println("** "+s.substring(0,i)+s.substring(i+1));
    			res = solution( s.substring(0,i)+s.substring(i+1));
    			System.out.println("res "+res);
    			for(int j=0;j< res.size();j++) {			
    				res.set(j,str+res.get(j));
    			}
    			fullSolution.addAll(res);
    		}
    		
    	}
    	return fullSolution;
    }
	
	
	
	public static void main(String[] args) {
	
		System.out.println( Permutation.solution("abc") );
	}
	
	
	

}
