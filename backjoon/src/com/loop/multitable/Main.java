package com.loop.multitable;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.test();

	}

	public void test() {
		// N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
		// input : 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
		// output : 출력형식과 같게 N*1부터 N*9까지 출력한다.


		try {
			// input
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("1~9 사이의 정수를 입력하세요. > ");
			int N = Integer.parseInt(bf.readLine());

			// 잘못 입력했을 경우 다시 입력받기
			if (N < 1 || N > 9) {
				System.out.println("잘못 입력하셨습니다.");
			}
			
			// output
			for (int i = 1; i < 10; i++) {
				System.out.printf("%d * %d = %d%n", N, i, N * i);
		}
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
