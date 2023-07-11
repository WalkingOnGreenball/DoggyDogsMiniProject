package com.kh.weekend;

public class Dogs {
	public void play(DogGameInterface dgi) {
		dgi.firstChoice();
		dgi.suddenEventChance();
		dgi.lunchChoice();
		dgi.suddenEventChance();
		dgi.picnicChoice();
		dgi.suddenEventChance();
		dgi.lastChoice();
	}
}
