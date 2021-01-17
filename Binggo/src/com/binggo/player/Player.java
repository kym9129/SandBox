package com.binggo.player;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

	int[][] board = new int[5][5];
	

	int bingoCount = 0;

	public void initBoard() {
		// board initialize
		
		//1~50 사이의 랜덤수 배치
		System.out.println("-------bingo---------");
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				int rnd = (int)((Math.random()*50) + 1);
				board[i][j] = rnd;
				System.out.print(board[i][j] + " ");
			}
			System.out.println(" ");
		}
		System.out.println("------------------");

	}

	public void input() {
		int input = 0;
		int playCnt = 0;
		try{
			
			while(true) {
				// 사용자 입력받기
				Scanner sc = new Scanner(System.in);
				System.out.println("숫자를 입력하세요. : ");
				input = sc.nextInt();
				
				if(input > 50 || input < 1) {
					throw new Exception();
				}
				
				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board[i].length; j++) {
						//사용자의 입력값과 숫자판의 숫자가 같으면 0으로 교체
						if (board[i][j] == input) {
							board[i][j] = 0;
						}
						System.out.print(board[i][j] + " ");
					}	
					System.out.println(" ");
				}
				playCnt++;
				System.out.println("입력횟수 : " + playCnt);
				if(playCnt >= 5)
					calBingo();
			}
			
			
		}catch(Exception e) {
			System.out.println("잘못 입력하였습니다.");
			input();
		}
	}
	

	private void calBingo() {
		int cnt = 0;
		
		//빙고 판정
		for (int i = 0; i < board.length; i++) {
			//행빙고
			if(
				board[i][0] == 0 && 
				board[i][1] == 0 &&
				board[i][2] == 0 &&
				board[i][3] == 0 &&
				board[i][4] == 0) {
				
				cnt++;
				System.out.println(i + "행 빙고");
			}

			//열빙고
			else if(board[0][i] == 0 && 
				board[1][i] == 0 &&
				board[2][i] == 0 &&
				board[3][i] == 0 &&
				board[4][i] == 0) {
				
				cnt++;
				System.out.println(i + "열 빙고");
				
			}
		}
		
		//대각선 빙고
		if(board[0][0] == 0 &&
				board[1][1] == 0 &&
				board[2][2] == 0 &&
				board[3][3] == 0 &&
				board[4][4] == 0) {
			cnt++;
			System.out.println("대각선1 빙고");
			
		}
		//대각선 빙고2
		else if(board[0][4] == 0 &&
				board[1][3] == 0 &&
				board[2][2] == 0 &&
				board[3][1] == 0 &&
				board[4][0] == 0) {
			cnt++;
			System.out.println("대각선1 빙고");
			
		}
		
		System.out.println("빙고 수 = " + cnt);
		

	}
	
	
	ArrayList<Integer> numBox = new ArrayList<>();
	ArrayList<String> numBox2 = new ArrayList<>();
	
	public void initRandomBox() {
		for(int i = 0; i < 50; i++) {
			numBox.add(i);
		}
	}
	
	public void setBingoBoard() {
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
		 int result = (int)(Math.random() * numBox.size());
		 
		 	board[i][j] = numBox.remove(result);
		 	System.out.println("numbox size : " + numBox.size());	
		 	System.out.println("add num : " + board[i][j]);
			}
	
		}
	}

}
