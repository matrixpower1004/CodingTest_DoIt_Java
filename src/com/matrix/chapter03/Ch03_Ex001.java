package com.matrix.chapter03;
import java.util.Scanner;

// 문제 001 숫자의 합 구하기 (백준 온라인 저지 11720)
public class Ch03_Ex001 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자의 개수 : ");
		int pcs = sc.nextInt(); // pcs는 영어로 갯수
		// 입력값을 String형 변수 sNum에 저장한 후 char[]형 배열로 변환하기
		System.out.print("숫자 : ");
		String sNum = sc.next();
		char[] cNum = sNum.toCharArray(); 
		
		long sum = 0;
		
		for (int i = 0; i < cNum.length; i++) {
			sum += cNum[i] - '0'; // cNum[i]를 정수형으로 형변환 후 sum에 누적 합산하기
		}
		System.out.println("합계 : " + sum);
	}
}


