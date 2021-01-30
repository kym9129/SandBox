package codeup100;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CodeUp1095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//첫번째 입력값 : 사용자 입력
		int n = sc.nextInt();
		sc.nextLine();
		
		//두번째 입력값 -> 1~23 랜덤수가 n만큼 입력
		//String -> String[] -> ArrayList<Integer>
		String input2 = sc.nextLine();
		String[] arr = input2.split(" ");
		
		List<Integer> list = new ArrayList<>();
		for(int i = 0; i <arr.length; i++) {
			list.add(Integer.parseInt(arr[i]));
		}
		Collections.sort(list);
		System.out.println(list.get(0));

	}

}
