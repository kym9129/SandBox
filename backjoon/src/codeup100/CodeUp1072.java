package codeup100;

import java.util.Scanner;

public class CodeUp1072 {
	//https://codeup.kr/problem.php?id=1072
	//반복문을 쓰지 말라고 하는데 도무지 방법을 모르겠음 ㅠㅠ 
	//C언어에는 레이블이란게 있다는데 쩝..
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine(); //5
		String input2 = sc.nextLine(); //1 2 3 4 5
		
		String[] arr = input2.split(" ");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
