package codeup100;

import java.util.Scanner;

public class CodeUp1099 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//미로
		int[][] maze = new int[10][10];
		
		//입력값 받아서 미로에 넣기
		for(int i = 0; i < maze.length; i++) {
			String[] input = sc.nextLine().split(" ");
			
			for(int j = 0; j < maze[i].length; j++) {
				maze[i][j] = Integer.parseInt(input[j]);
				
			}
		}
		//임시 입력값
//		int[][] maze = {
//				{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
//				{1, 2, 0, 1, 0, 0, 0, 0, 0, 1},
//				{1, 0, 0, 1, 0, 0, 0, 0, 0, 1},
//				{1, 0, 0, 1, 0, 0, 0, 0, 0, 1},
//				{1, 0, 0, 1, 0, 0, 0, 0, 0, 1},
//				{1, 0, 0, 1, 0, 0, 1, 0, 0, 1},
//				{1, 0, 0, 0, 0, 0, 1, 0, 0, 1},
//				{1, 0, 0, 0, 0, 0, 1, 0, 0, 1},
//				{1, 0, 0, 0, 0, 0, 0, 0, 0, 1},
//				{1, 1, 1, 1, 1, 1, 1, 1, 1, 1}
//				
//		};

		
		//이동경로 표시
		//참고 : https://gist.github.com/horohyun/fe69d5aefd4df745b07bdb6f59a48e08
		boolean isReached = false;
		int x = 1;
		int y = 1;
		while(!isReached) {
			
			if(maze[x][y] == 2) { //시작점에 먹이가 있는 경우
				isReached = true;
			}
			else {
				if(maze[x][y+1] == 1) { //오른쪽이 막힌 경우
					
					//아래도 막힌 경우 (도착)
					if(maze[x+1][y] == 1) {
						break;
					}else {
					//아래쪽은 열린 경우 (0, 2)
						x++; //아래로 이동
					}
					
				} else if(maze[x][y+1] != 1) {
					//오른쪽이 0 또는 2
					y++; //오른쪽으로 이동
				}
				if(maze[x][y] == 2) { //이동 중 먹이를 만난 경우
					isReached = true;
				}
			}

			maze[x][y] = 9; //지나온 자리 표시
		}
		maze[1][1] = 9; //시작점 표시
		
		//출력
		for(int i = 0; i < maze.length; i++) {
			StringBuilder sb = new StringBuilder();
			
			for(int j = 0; j < maze[i].length; j++) {
				String str = maze[i][j] + " ";
				sb.append(str);
			}
			System.out.println(sb.toString().substring(0, sb.length()-1));
		}


	}
}
