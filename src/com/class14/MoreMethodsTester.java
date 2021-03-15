package com.class14;

public class MoreMethodsTester {



	public static void main(String[] args) {
		
		MoreMethodExamples moreMethodExamples=new MoreMethodExamples();
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println(moreMethodExamples.print());
		
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.println(moreMethodExamples.doubleTheValue(20));
		
		System.out.println("-------------------------------------------------------------------------");
		
		moreMethodExamples.isRaining(false);
		
		System.out.println("-------------------------------------------------------------------------");
		
	    moreMethodExamples.printFiveTimes();
	    
		System.out.println("-------------------------------------------------------------------------");
		
	    System.out.println(moreMethodExamples.greater(122, 56));
	    
		System.out.println("-------------------------------------------------------------------------");
		
        moreMethodExamples.OddOrEven(5);
        
		System.out.println("-------------------------------------------------------------------------");
		
        double [] arr= {10.2,25,30};
        System.out.println(moreMethodExamples.returnTheArraysSum(arr));
        
		System.out.println("-------------------------------------------------------------------------");
		
        
        System.out.println(moreMethodExamples.isMirror("aba"));
        System.out.println(moreMethodExamples.isMirror("abcdef"));
}
	}


