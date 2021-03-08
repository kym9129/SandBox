package com.tryanything;

import java.util.Scanner;

public class BullsAndCows {
	public static final int MAX = 3;

	public static void main(String[] args) {
		//숫자야구 게임 만들기.
		
		//컴퓨터의 랜덤 숫자 3개와 입력값 3개가 (1~9)
		// 자리, 숫자가 모두 일치하면 strike
		// 숫자만 일치하면 ball
		// 자리, 숫자 모두 불일치 : out
		// 사용자가 도전하는 횟수도 표시한다.
		
		//출력예시 :
		//1회 - S1 B1
		//2회 - Out
		//3회 - S3 B0
		
		//컴퓨터 랜덤값 생성. 배열에 삽입
		int[] com = new int[MAX];

		for(int i = 0; i < com.length; i++) {
			int rnd = (int)(Math.random()*9)+1;
			com[i] = rnd;
			
			//중복검사
			for(int j = 0; j < i; j++) {
				if(rnd == com[j])
					i--; //i를 1 줄여서 다시 포문을 돌리게 함. (다시 난수 넣기)
			}
		}
		
			for(int i = 0; i < com.length; i++) {
				System.out.println(com[i]);
			}
			
		//사용자 값 받기
		System.out.println("1~9사이의 숫자 3개를 입력하세요. (ex. 1/2/3)");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		//쪼개고 int로 형변환
		String[] temp = input.split("/");
		int[] user = new int[MAX];
		for(int i = 0; i < temp.length; i++) {
			user[i] = Integer.parseInt(temp[i]);
		}
		
		//판정
		String[] result = new String[MAX];
		//idx+1회, 
				
				// 자리, 숫자가 모두 일치하면 strike
				//com[i] , user[j] : i == j && com[i] == user[j] 

				
				// 숫자만 일치하면 ball
				//com[i] == user[j]

			
				
			

		

	}

}
