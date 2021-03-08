package level.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LevelTest1 {


	public static void main(String[] args) {
		LevelTest1 l = new LevelTest1();
//		l.testSolution2();
//		l.testS3();
		String[] participant2 = {"leo", "eden", "kiki"};
		String[] completion2 = {"eden", "kiki"};
		System.out.println("test4() = " + l.test4(participant2, completion2));

	
	}
	
	public String test4(String[] participant, String[] completion) {
		//프로그래머스. 완주하지 못한 선수
		//hashmap으로 풀어야하나?
		
//		수많은 마라톤 선수들이 마라톤에 참여하였습니다. 
//		단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
//
//		마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 
//		완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 
//		완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
//
//		제한사항
//		마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
//		completion의 길이는 participant의 길이보다 1 작습니다.
//		참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
//		참가자 중에는 동명이인이 있을 수 있습니다.
		
		List<String> pList = new ArrayList<>();
		for(int i = 0; i < participant.length; i++) {
			pList.add(participant[i]);
		}
		
		List<String> cList = new ArrayList<>();
		for(int i = 0; i < completion.length; i++) {
			cList.add(completion[i]);
		}
		
		//완주하지 못한 선수
		List<String> uList = new ArrayList<>();
		
		//part comp 비교. part - comp
		for(int i = 0; i < pList.size(); i++) {
			if(cList.contains(pList.get(i)))
				break;
	
			else
				uList.add(pList.get(i));
		}

		
		return uList.toString();
	}

	
	public void testS3() {
		LevelTest1 l = new LevelTest1();
		System.out.println(l.solution3("heLoo"));
	}
	
	public void testSolution2() {
		LevelTest1 l = new LevelTest1();
		int x = -4;
		int n = 10;
		long[] answer = l.solution2(x, n);
		
		System.out.print("answer[] = {");
		for(int i = 0; i < n ; i++) {
			System.out.print(answer[i] + ",");
		}
		System.out.print("}");
	}
	
	/*
	 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

제한 사항
str은 길이 1 이상인 문자열입니다.
	 */
    public String solution3(String s) {
        String answer = "";
        
        char[] chArr = s.toCharArray();
        Arrays.sort(chArr);
        answer = Arrays.toString(chArr);
        
        
        return answer;
    }
	


	/*
	 * 함수 solution은 정수 x와 자연수 n을 입력 받아, 
	 * x부터 시작해 x씩 증가하는 숫자를 n개 지니는 리스트를 리턴해야 합니다. 
	 * 다음 제한 조건을 보고, 조건을 만족하는 함수, solution을 완성해주세요.

제한 조건
x는 -10000000 이상, 10000000 이하인 정수입니다.
n은 1000 이하인 자연수입니다.
	 */
    public long[] solution2(int x, int n) {
        long[] answer = new long[n];
        
               for(int i = 0; i < n; i++) {
    	   if(x >= -10000000 && x <= 10000000 && n <= 1000 && n > 0 ) {
    		   answer[i] = x + (x * i);
    		   
    	   }
    	   
       }
       
        return answer;
    }



	//단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.
	
    public String solution(String s) {
        String answer = "";
        
        int num = (int)(s.length() / 2);
        
        for(int i = 0; i < s.length(); i++){
            //length가 홀수인 경우 
            if(s.length() % 2 != 0){
                answer = s.substring(num, num+1);
            }
            else{
                answer = s.substring(num-1, num);
            }
        
    }
		return answer;

}	
}
    
