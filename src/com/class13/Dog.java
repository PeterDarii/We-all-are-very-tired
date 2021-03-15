package com.class13;

public class Dog {
	
	
	public String color;
	public String size;
	public String breed;
	public int Age;
	
    public void bark() {
    	System.out.println("ruff ruff");
    }
    public void sleep() {
    	System.out.println("ZZZZZZZZzzzzzzzz......");
    }
    public void eat() {
    	for (int i=0; i<5; i++) {
    		System.out.println("Omnomnom");
    	}
    }
    public void look() {
    	System.out.println("Hi I am a dog my color is " +color);
    	
    }
	public static void main(String[] args) {
		
		Dog bullDog= new Dog();
		bullDog.color="Brown";
		bullDog.size="large";
		bullDog.Age=5;
		bullDog.breed="American Bulldog";
        bullDog.bark();
        bullDog.sleep();
        bullDog.eat();
        bullDog.look();
        
        Dog beagle= new Dog();
        beagle.color="light gray";
        beagle.size="large";
        beagle.Age=6;
        beagle.breed="Hunting";
        beagle.look();
        
        Dog germanS= new Dog();
        germanS.color="White&Orange";
        germanS.size="large";
        germanS.Age=6;
        germanS.breed="Hunting";
	}

}

	


