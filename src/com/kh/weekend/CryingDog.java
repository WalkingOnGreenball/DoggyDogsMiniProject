package com.kh.weekend;

import java.util.Random;
import java.util.Scanner;

public class CryingDog implements DogGameInterface{
	
	static HeartDegree heartDegree = new HeartDegree();
	DogGameFunction dgf = new DogGameFunction();
	
	@Override
	public void firstChoice() {
		finish:
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("강아지와의 첫 대면 입니다. 어떤 행동을 취하시겠습니까?");
		System.out.println();
		System.out.println("1. 편의점에서 간식을 사온다.");
		System.out.println("2. 조심스럽게 손을 내밀어본다.");
		System.out.println("3. 눈 싸움을 한다.");
		System.out.println("4. 일단 쓰다듬어본다.");
		System.out.println();
		System.out.print("입력 : ");
		
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 :
				System.out.println();
				heartDegree.heartDegree(40);
				break finish;
			case 2 :
				System.out.println();
				heartDegree.heartDegree(30);
				break finish;
			case 3 :
				System.out.println();
				heartDegree.heartDegree(20);
				break finish;
			case 4 :
				System.out.println();
				heartDegree.heartDegree(-10);
				break finish;
			default :
				System.out.println();
				System.out.println();
				System.out.println("다시 선택해주세요.");
				System.out.println();
			}
		}
	}

	@Override
	public int suddenEventChance() {
		Random rand = new Random();
		for (int i = 0; i < 1; i++) {		
			int eventResult = rand.nextInt(6)+1;
			if(eventResult == 1) {
				suddenCat();
			} else if (eventResult == 2) {
				suddenDog();
			} else {
				continue;
			}
		}
		return heartDegree.getSum();
	}
	public static int suddenCat() {	
		System.out.println("서든 이벤트! 고양이의 등장!");
		System.out.println("강아지가 흥분했다! 애정도가 대폭 하락합니다.");
		System.out.println();
		heartDegree.setSum(heartDegree.getSum()/2);
		System.out.println("<현재 애정도는 "+heartDegree.getSum()+"도 입니다.>");
		System.out.println();
		return heartDegree.getSum();
	}
	public static int suddenDog() {		
		System.out.println("서든 이벤트! 강아지 친구의 등장!");
		System.out.println("강아지가 흥분했다! 애정도가 대폭 상승합니다.");
		System.out.println();
		heartDegree.setSum(heartDegree.getSum()*2);
		System.out.println("<현재 애정도는 "+heartDegree.getSum()+"도 입니다.>");
		System.out.println();
		return heartDegree.getSum();
	}

	@Override
	public int lunchChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("벌써 점심시간 입니다! 얘는 밥을 얼마나 먹을까?");
		System.out.println("(모든 양은 1~100 사이입니다.)");
		System.out.println();
		
		while(true) {
			System.out.print("사료량 : ");
			int rice = sc.nextInt();
			if (rice <= 100 && 0 <= rice) {
				if (50 < rice) {
					System.out.println("맛있어.. 훌쩍..");
					heartDegree.heartDegree(20);
				} else {
					System.out.println("코딱지야?");
					heartDegree.heartDegree(-10);
				}
				break;
			} else {
				System.out.println();
				System.out.println("다시 입력해주세요.");
			}
		}
		
		while(true) {
			System.out.print("급수량 : ");
			int water = sc.nextInt();
			if (water <= 100 && 0 <= water) {
				if (50 < water) {
					System.out.println("난 많이 울어서 물 마셔야해.. 훌쩍..");
					heartDegree.heartDegree(20);
				} else {
					System.out.println("우에엥");
					heartDegree.heartDegree(-10);
				}
				break;
			} else {
				System.out.println();
				System.out.println("다시 입력해주세요.");
			}
		}
		
		while(true) {
			System.out.print("간식량 : ");
			int snack = sc.nextInt();
			if (snack <= 100 && 0 <= snack) {
				if (50 < snack) {
					System.out.println("좋아~ 훌쩍..");
					heartDegree.heartDegree(20);
				} else {
					System.out.println("이게 뭐야..");
					heartDegree.heartDegree(-10);
				}
				break;
			} else {
				System.out.println();
				System.out.println("다시 입력해주세요.");
			}
		}
		return heartDegree.getSum();
	}

	@Override
	public int picnicChoice() {
		finish:
		while(true) {
			Scanner sc = new Scanner(System.in);
			System.out.println();
			System.out.println("산책시간 입니다! 어딜 같이 걸어볼까?");
			System.out.println();
			System.out.println("1. 바다");
			System.out.println("2. 산");
			System.out.println("3. 공원");
			System.out.println("4. 안 나가~");
			System.out.println();
			System.out.print("입력 : ");
			
			int choice = sc.nextInt();
			switch(choice) {
			case 1 :
				System.out.println();
				heartDegree.heartDegree(40);
				break finish;
			case 2 :
				System.out.println();
				heartDegree.heartDegree(-10);
				break finish;
			case 3 :
				System.out.println();
				heartDegree.heartDegree(30);
				break finish;
			case 4 :
				System.out.println();
				heartDegree.heartDegree(20);
				break finish;
			default :
				System.out.println();
				System.out.println();
				System.out.println("다시 선택해주세요.");
				System.out.println();
			}
		}
		return heartDegree.getSum();
	}

	@Override
	public int lastChoice() {
		Scanner sc = new Scanner(System.in);
		System.out.println("어떤 사람이 나타나 본인이 주인이라고한다. 느낌이 별론데.. 강아지의 눈빛이 흔들린다.. 강아지는 누구를 선택할 것인가..?");
		System.out.println();
		System.out.println("엔터키를 누르세요.");
		sc.nextLine();
		
		if (heartDegree.getSum() >= 70) {
			System.out.println("<강아지가 꼬리를 흔들며 나에게 왔다.>");
		} else if (heartDegree.getSum() < 70) {
			System.out.println("<강아지가 떠났다.>");
		}
		return heartDegree.getSum();
	}
}
