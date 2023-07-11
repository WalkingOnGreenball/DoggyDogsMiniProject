package com.kh.weekend;

public class HeartDegree {
	// 필드
	private int sum;
	private int heart;
	
	// 생성자
	
	public int heartDegree(int heart) {
		sum += heart;
		System.out.println();
		System.out.println("<현재 애정도는 "+sum+"도 입니다.>");
		System.out.println();
		return sum;
	}
	
	// getter 메소드 : 매개변수 X, 반환형 O
	public int getSum() {
		return this.sum;
	}
	public int getHeart() {
		return this.heart;
	}
	// setter 메소드 : 매개변수 O, 반환형 X
	public void setSum(int sum) {
		this.sum = sum;
	}
	public void setHeart(int heart) {
		this.heart = heart;
	}
}
