package com.algos.java.patterns.strategy;


public class NoFly implements IFlyBehaviour{

	@Override
	public void fly() {
		System.out.println("I cant Fly!!");
	}
	
	

}
