package com.class13;

public class MobilePhone {

	public double size;
	public String color;
	public String model;
	public String make;
	public int AmountOfRam;
	public int AmountOfRom;
	public double price;
	
	public static void main(String[] args) {
		
		MobilePhone iPhone= new MobilePhone();
		iPhone.model="iphone12";
		iPhone.price=999;
		iPhone.size=6.4;
		iPhone.make="Apple";
		iPhone.color="Black";


		MobilePhone Samsung=new MobilePhone();
		Samsung.model="S21";
		Samsung.price=800;
		Samsung.size=6.8;
		Samsung.make="Samsung";
		Samsung.color="Phanthom Black";

			}

		}


