package codeup100;

import java.util.Scanner;

public class CodeUp1097 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//바둑판 입력값 받기
		int[][] board = new int[19][19];
		for(int i = 0; i < board.length; i++) {
			String[] input = sc.nextLine().split(" ");
			
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		//임시바둑판
//		int[][] board = {
//				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//				{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//				{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0},
//				{0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0}
//		};
		
		//n값 받기
		int n = sc.nextInt();
		sc.nextLine();
				
		//n번 좌표값 입력받고 바둑돌 바꾸기
		for(int i = 0; i < n ; i++) {
			String[] input = sc.nextLine().split(" ");
			
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			
			//가로줄 전환
			for(int j = 0; j < board.length; j++) {
				
				if(board[j][y-1] == 0) {
					board[j][y-1] = 1;
				}else {
					board[j][y-1] = 0;
				}
			}
			//세로줄 전환
			for(int j = 0; j < board.length; j++) {
				
				if(board[x-1][j] == 0) {
					board[x-1][j] = 1;
				}else {
					board[x-1][j] = 0;
				}
				
			}
			
		}
	
		//출력
			for(int i = 0; i < board.length; i++) {		
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j < board[i].length; j++) {	
					
					String str = board[i][j] + " ";
					sb.append(str);
				}
			System.out.println(sb.toString().substring(0, sb.length()-1));
			}
			


	}

}
