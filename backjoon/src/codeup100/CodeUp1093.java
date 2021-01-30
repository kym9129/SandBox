package codeup100;

import java.util.Scanner;

public class CodeUp1093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//첫번째 입력값 : 사용자 입력
		int n = sc.nextInt();
		sc.nextLine();
		
		//두번째 입력값 -> 1~23 랜덤수가 n만큼 입력
		//String -> String[] -> int[]
		String input2 = sc.nextLine();//.substring(1);
//		System.out.println("input2=" + input2);
		String[] arr = input2.split(" ");
		
//		for (int i = 0; i < arr.length; i++){
//			System.out.println("arr = " + arr[i]);
//		}
		int[] rndm = new int[arr.length]; //랜덤수 담길 배열
		for(int i = 0; i <arr.length; i++) {
			rndm[i] = Integer.parseInt(arr[i]);
		}
		
		int[] cnt = new int[23]; //출력용 배열. 1~23까지의 횟수 계산
		
//		System.out.print("rdms[n] = ");
//		for(int i = 0; i < rndm.length; i++) {
//			rndm[i] = (int)(Math.random() * 23) + 1; //1~23까지 랜덤값 넣기
//			System.out.print(rndm[i] + " ");	
//		}
		
//		System.out.print("\ncnt[j] = ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < cnt.length; i++) {
			int num = 0;
			for(int j = 0; j < rndm.length; j++) {
				if(rndm[j] == (i+1)) {
					num++;
				}
			}
			cnt[i] =num;
			String str = cnt[i] + " ";
			sb.append(str);
		}
		//출력 (substring으로 마지막 공백 잘라내기)
		System.out.println(sb.toString().substring(0, (sb.length()-1)));
		
	}

}
