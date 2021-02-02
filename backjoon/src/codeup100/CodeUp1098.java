package codeup100;

import java.util.Scanner;

public class CodeUp1098 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//h w 입력
		String[] hw = sc.nextLine().split(" ");
		int h = Integer.parseInt(hw[0]);
		int w = Integer.parseInt(hw[1]);
//		System.out.println("h=" + h);
//		System.out.println("w=" + w);
		
		//바둑판 생성, 값 초기화
		int[][] board = new int[h][w];
		for(int i = 0; i < board.length; i++) {
			for(int j = 0; j < board[i].length; j++) {
				board[i][j] = 0;
//				System.out.print(board[i][j] + " ");
			}
//			System.out.println();
		}
		
		//n 입력
		int n = sc.nextInt();
//		System.out.println("n=" + n);
		sc.nextLine();
		
		//n번 막대 놓기
		for(int k = 0; k < n; k++) {
			//l, d, x, y입력받기
			String[] ldxy = sc.nextLine().split(" ");
			int l = Integer.parseInt(ldxy[0]);
			int d = Integer.parseInt(ldxy[1]);
			int x = Integer.parseInt(ldxy[2]);
			int y = Integer.parseInt(ldxy[3]);
			
//			System.out.println("l=" + l);
//			System.out.println("d=" + d);
//			System.out.println("x=" + x);
//			System.out.println("y=" + y);
			
			//x, y 위치
			board[x-1][y-1] = 1;
			
			//방향 d 가로 0 세로 1
			//막대길이 l
			if(d == 0) { //l만큼 y값 증가
				for(int i = 1; i < l; i++) {
					board[x-1][(y-1)+i] = 1;
				}
			} else if(d == 1) { //l만큼 x값 증가
				for(int i = 1; i < l; i++) {
					board[(x-1)+i][y-1] = 1;
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
