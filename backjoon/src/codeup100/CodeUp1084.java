package codeup100;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class CodeUp1084 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		String[] arr = input.split(" ");
		int r, g, b;
		r = Integer.parseInt(arr[0]);
		g = Integer.parseInt(arr[1]);
		b = Integer.parseInt(arr[2]);
		
		//System.out.println이 시간초과의 원인이라고 함.
		//아래의 질의응답 참고하였음
		//https://codeup.kr/d_thread.php?tid=7961&cid=
		BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = 0;
		for(int i = 0; i < r; i++) {
			for(int j = 0; j < g; j++) {
				String str = "";
				for(int k = 0; k < b; k++) {
					str += i + " " + j + " " + k+"\n";
					cnt++;
				}
				try {
					bf.write(str);
					bf.flush();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		System.out.println(cnt);
		

	}

}
