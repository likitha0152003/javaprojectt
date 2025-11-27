package com.tnsif.encapsulation;

public class Encapsulatuondemo {
	int serialnumber;  //data members
	String name;
	int age;
	
	void show() {// member function
	System.out.println(serialnumber +" "+name+" "+age);	
	}
	
	public static void main(String[] args) {
		Encapsulatuondemo d=new Encapsulatuondemo();
		d.serialnumber=1;
		d.name="rashmi";
		d.age=25;
		
		d.show();
	}

}
