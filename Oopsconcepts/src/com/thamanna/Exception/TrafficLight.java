package com.thamanna.Exception;

public class TrafficLight {
	public static final String RED="RED";
	public static final String AMBER="AMBER";
	public static final String GREEN="GREEN";
	public int getDuration (String color){
		switch(color) {
		case RED:
			return 40;
		case AMBER:
			return 5;
		case GREEN:
			return 60;
			default:
				return 0;
			
		}
	}

}
