package com.algos.java.patterns.strategy;


public class QuackDifferent implements IQuackBehaviour {

	@Override
	public void quack() {
		System.out.println("Quacking differently");
	}

}
