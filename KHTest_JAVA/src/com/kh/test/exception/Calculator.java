package com.kh.test.exception;

public class Calculator {

	public double divide(double a, double b) {
		// 나눌 수 b가 0일 경우 ZeroException발생시키는 소스 작성함.
		double answer = 0.0;

		try {
			if (b == 0)
				throw new ZeroException("ZeroException!");

			else
				answer = b / a;

		} catch (Exception e) {

			e.printStackTrace();
		}

		return answer;
	}

}
