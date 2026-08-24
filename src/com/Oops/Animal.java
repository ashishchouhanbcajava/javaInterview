package com.Oops;

abstract class Animal {

	abstract void sound();
	

	void makesound() {
		System.out.println("i am making sound");
	}

	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.sound();
		animal.makesound();
		
	}
	

}

class Dog extends Animal {

	@Override
	void sound() {
		System.out.println("I am barking");
	}
	
	@Override
	void makesound() {
		// TODO Auto-generated method stub
		System.out.println("hello");
	}

}
