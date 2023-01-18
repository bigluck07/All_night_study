package com.lambda;

@FunctionalInterface
public interface Flyer {
	public abstract void fly();
//	public abstract void fly2();
	/*
	 * 원래 여러개 가질 수 있는데,
	 * 아노테이션을 통해 1개의 메소드를 갖도록 강제함
	 */

}
