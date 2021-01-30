package codeup100;

import java.util.Scanner;

public class CodeUp1096 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//첫번째 입력
		int n = sc.nextInt();
		sc.nextLine();
		
		//두번쨰 입력
		if(n == 1) {
			String[] input = sc.nextLine().split(" ");
			int x = Integer.parseInt(input[0]);
			int y = Integer.parseInt(input[1]);
			
			//바둑판
			int[][] board = new int [19][19];
			for(int i = 0; i < board.length; i++) {
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j < board[i].length; j++) {
					board[i][j] = 0; //초기값 0
					board[x-1][y-1] = 1;
					
					String str = board[i][j] + " ";
					sb.append(str);
				}
				System.out.println(sb.toString().substring(0, sb.length()-1));
			}
			
		}else { //n > 1 일 경우 int[][]에 좌표값을 받는다.
			int[][] xy = new int[n][2]; // 좌표값 받을 배열
			
			//n번 좌표값 받기
			for(int i = 0; i < n; i++) {
				String[] input = sc.nextLine().split(" ");
				
				xy[i][0] = Integer.parseInt(input[0]);
				xy[i][1] = Integer.parseInt(input[1]);
			}
			
			//바둑판
			int[][] board = new int [19][19];
			for(int i = 0; i < board.length; i++) {
				StringBuilder sb = new StringBuilder();
				for(int j = 0; j < board[i].length; j++) {
					board[i][j] = 0; //초기값 0
					for(int k = 0; k < xy.length; k++) {
						board[(xy[k][0])-1][(xy[k][1])-1] = 1;
					}
					String str = board[i][j] + " "; 
//					System.out.print(board[i][j] + " ");
					sb.append(str);
				}
				System.out.println(sb.toString().substring(0, sb.length()-1));
			}
			
		}
		

	}

}
