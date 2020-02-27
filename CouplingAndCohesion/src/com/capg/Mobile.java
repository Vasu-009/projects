package com.capg;

public class Mobile {
	public static void main(String ar[]) {
		Sim sim=new JioSim();
		sim.call();
		sim.browse();
	}
}
