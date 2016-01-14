package com.algos.java.patterns.strategy;



public class FlyWithWings implements IFlyBehaviour {

	@Override
	public void fly() {
		System.out.println("I can fly with Wings!!");
	}

}
