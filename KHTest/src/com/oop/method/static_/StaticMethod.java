package com.oop.method.static_;

public class StaticMethod {
	
	//static method
    //1. 전달한 문자열을 모두 대문자로 바꾸는 static 메소드
    //메소드명 : toUpper(String) : String
	public static String toUpper(String str) {
		return str.toUpperCase();
	}
    
    
    //2. 첫번째 문자열의 전달받은 인덱스의 문자를 전달받은 문자로 변경하는 static 메소드
    //메소드명 : setChar(String, int, char)
	public static String setChar(String str, int num, char ch) {
		//ex: java, 0, x -> xava
		return str.substring(0,num)+ch+str.substring(num+1);
		
	}
	
    
    //3. 전달한 문자열에서 영문자의 개수를 리턴하는 static 메소드
    //메소드명 : getAlphabetLength(String) : int
	public static int getAlphabetLength(String str) {
		//ex. hello!! -> 5
		int len = 0;
		char[] chAr = str.toCharArray();
		
		for(int i = 0; i < chAr.length; i++) {
			//영문자만 찾기
			if(chAr[i] >= 'a' && chAr[i] <= 'z' || chAr[i] >= 'A' && chAr[i] <='Z') {
				len++;
			}
		}
		return len;
	}
    
    
    //4. 전달한 문자열값을 하나로 합쳐서 리턴 
    //메소드명 : concat(String, String) : String
	public static String concat(String str1, String str2) {
		return str1 + str2;
	}

}
