package com.kh.weekend;

import java.util.Scanner;

public class DogGameFunction {
	
	static HeartDegree heartDegree = new HeartDegree();
	
	public void rules() {
		Scanner sc = new Scanner(System.in);
		System.out.println("*            유기견 구조하기            *");
		System.out.println("*               룰 설명               *");
		System.out.println("*  강아지와 하루를 보내고 선택받아야 합니다!   *");
		System.out.println("*     선택에 따라 애정도가 바뀌게 되는데     *");
		System.out.println("* 선택한 강아지에게 어울리는 행동을 취해보세요! *");
		System.out.println();
		System.out.println("엔터키를 누르세요.");
		sc.nextLine();		
	}
	
	public int dogChoice(){	
		Scanner sc = new Scanner(System.in);
		System.out.println("1. 집순이 강아지 : 집 안에서 나를 보며 꼬리를 흔들고있다. 왜 나오진 않지?");
		System.out.println("2. 깡패 강아지 : 눈빛이 이상하다. 싸우면 내가 질 수도 있을 것 같다..");
		System.out.println("3. 할아버지 강아지 : 눈이 처져있다.. 왠지 생기가 없어보이지만 차분하다.");
		System.out.println("4. 울보 강아지 : 눈 밑에 저것은 다크써클인가?");
		System.out.println("5. enfp 강아지 : 난리났네 난리났어. 꼬리로 날아갈 것 같다.");
		System.out.println();
		System.out.print("강아지를 선택해보세요. : ");
		int choice = sc.nextInt();
		System.out.println();
		System.out.println();
		return choice;
	}
}
