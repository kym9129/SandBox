package kakao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kakao201702 {

	public static void main(String[] args) {
		
		Kakao201702 k = new Kakao201702();
		
//		예제	dartResult	answer	설명
//		1	1S2D*3T	37	1^1 * 2 + 2^2 * 2 + 3^3
//		2	1D2S#10S	9	1^2 + 2^1 * (-1) + 10^1
//		3	1D2S0T	3	1^2 + 2^1 + 0^3
//		4	1S*2T*3S	23	1^1 * 2 * 2 + 2^3 * 2 + 3^1
//		5	1D#2S*3S	5	1^2 * (-1) * 2 + 2^1 * 2 + 3^1
//		6	1T2D3D#	-4	1^3 + 2^2 + 3^2 * (-1)
//		7	1D2S3T*	59	1^2 + 2^1 * 2 + 3^3 * 2
		
		String dartResult = "1S*2T*3S";
		//출력값 확인
		System.out.println(k.evaluatePoint(dartResult));

	}
	
	//2번. 다트 게임
	public int evaluatePoint(String dartResult) {
		int[] sum = new int[3]; //회당 점수 담을 배열
		
		//숫자가 1~2개, S또는T또는D, *또는#이 0~1개
		String regex = "(\\d{1,2}[S|T|D][*|#]{0,1})";
		Pattern p = Pattern.compile(regex+regex+regex);//게임3회
		//다트 결과값과 정규표현식을 매칭
		Matcher m = p.matcher(dartResult);
		
		m.find(); //여러번 할 경우 while문 사용
		
		
		//원점수 추출해서 point[]에 담기
		//정규표현식은 1부터 시작 
		//()괄호 단위로 그룹 1개씩 3회니까 3개 들어옴
		for(int i = 1; i <= m.groupCount(); i++) {
			//(원점수)(보너스)(옵션) 그룹으로 다시 패턴 컴파일
			Pattern p1 = Pattern.compile("(\\d{1,2})([S|T|D])([*|#]{0,1})");
			Matcher m1 = p1.matcher(m.group(i)); //1~3번째 그룹
			m1.find(); // m1 = 원점수 + 보너스 + 옵션
			
			//원점수에 SDT처리 
			sum[i-1] = (int) Math.pow(Integer.parseInt(m1.group(1)), getSDT(m1.group(2)));
			
			//#*처리
			setOption(sum, i, m1.group(3));
		}
		
		return sum[0] + sum[1] + sum[2];
	}
	
	//옵션으로 스타상(*) , 아차상(#)이 존재하며 
	//스타상(*) 당첨 시 해당 점수와 바로 전에 얻은 점수를 각 2배로 만든다. 
	//아차상(#) 당첨 시 해당 점수는 마이너스된다.
//	스타상(*)은 첫 번째 기회에서도 나올 수 있다. 이 경우 첫 번째 스타상(*)의 점수만 2배가 된다. (예제 4번 참고)
//	스타상(*)의 효과는 다른 스타상(*)의 효과와 중첩될 수 있다. 이 경우 중첩된 스타상(*) 점수는 4배가 된다. (예제 4번 참고)
//	스타상(*)의 효과는 아차상(#)의 효과와 중첩될 수 있다. 이 경우 중첩된 아차상(#)의 점수는 -2배가 된다. (예제 5번 참고)
	public void setOption(int[] sum, int idx, String m) {
		//idx에는 i(1~3)가 들어갈 것임
		if("*".equals(m)) {
			sum[idx-1] *= 2; //해당 점수 2배
			if(idx > 1) {//2,3번째 기회의 경우
				sum[idx-2] *= 2; // 바로전의 얻은 점수도 2배
			}
		} else if("#".equals(m)) {
			sum[idx-1] *= -1; //아차상 당첨 시 마이너스처리
		}
	}
	
	//점수와 함께 Single(S), Double(D), Triple(T) 영역이 존재하고 
	//각 영역 당첨 시 점수에서 1제곱, 2제곱, 3제곱 (점수^1 , 점수^2 , 점수^3 )으로 계산된다.
	public int getSDT(String m) {
		int val = 0;
		if(m.equals("S")) {
			val = 1;
		} else if(m.equals("D")) {
			val = 2;
		} else if(m.equals("T")) {
			val = 3;
		}
		return val;
	}

}
