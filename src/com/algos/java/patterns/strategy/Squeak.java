package com.algos.java.patterns.strategy;


public class Squeak implements IQuackBehaviour {

	@Override
	public void quack() {
		System.out.println(" I am squeaking");
	}

}
