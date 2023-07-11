package com.kh.weekend;

public class DogGameRun {
	
	public static void main(String [] args) {
		
		Dogs dogs = new Dogs();
		DogGameFunction dgf = new DogGameFunction();
		
		dgf.rules();
		finish:
		while(true) {
			int choice = dgf.dogChoice();
			switch(choice) {
			case 1 : 
				System.out.println("*집순이 강아지를 선택하셨습니다.*");
				dogs.play(new HomeDog());
				break finish;
			case 2 : 
				System.out.println("*깡패 강아지를 선택하셨습니다.*");
				dogs.play(new GangDog());
				break finish;
			case 3 : 
				System.out.println("*할아버지 강아지를 선택하셨습니다.*");
				dogs.play(new OldDog());
				break finish;
			case 4 : 
				System.out.println("*울보 강아지를 선택하셨습니다.*");
				dogs.play(new CryingDog());
				break finish;
			case 5 : 
				System.out.println("*enfp 강아지를 선택하셨습니다.*");
				dogs.play(new EnfpDog());
				break finish;
			default :
				System.out.println("다시 선택해주세요.");
				System.out.println();
			}
		}
	}
}
