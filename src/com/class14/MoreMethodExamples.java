package com.class14;

public class MoreMethodExamples {

	
	/*
	 * create a method that does not take any values
	 * and always return String "Hi"
	 */
String print() {
return "Hi";
}
/*
 * create a method that takes a number 
 * and returns the double of that number
 */
double doubleTheValue(double input) {
	return input*2;
}

void isRaining(boolean isRain) {
	if (isRain) {
		System.out.println("Please take the umbrella");
	}else {
		System.out.println("Please go for a walk");
	}

	
	}

    void printFiveTimes() {
	for(int i=0; i<5; i++) {
	System.out.println("Batch 9 is GREAT");
	
}
/*
 * create a method that will take boolean as the input
 * if the value is true --> i want to say take the umbrella
 * and if the value is false print please go for a walk
 */
	
		}
		int greater(int num1, int num2) {
			if(num1>num2) {
				return num1;
			}else {
				return num2;
	}
	
		
			
		}
		void OddOrEven(int num1) {
			if(num1%2==0) {
				System.out.println("Even");
			}else {
				System.out.println("Odd");
				
			}
		}
		double returnTheArraysSum(double[] arr) {
			double sum=0;
			for(double element:arr) {
				sum=sum+element;
				
			}
			return sum;
		}

		
		boolean isMirror(String str) {
			String newStr=" ";
			for(int i=str.length()-1; i>=0; i--) {
				System.out.println(i+ " " +str.charAt(i));
				newStr+=str.charAt(i);
				
			}
			System.out.println(newStr);
			
			if(str.equals(newStr)) {
				return true;
			}else {
			   return false;
			   }
			 
			
}

}

