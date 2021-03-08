package kakao;

public class Kakao201701 {
	
	public static void main(String[] args) {
		
		Kakao201701 k = new Kakao201701();
		
		int n = 6;
		int[] arr1 = {46, 33, 33 ,22, 31, 50};
		int[] arr2 = {27 ,56, 19, 14, 14, 10};
		String[] strArr = k.decodeMap(n, arr1, arr2);
		for(int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + ", ");
			//["######", "### #", "## ##", " #### ", " #####", "### # "]
		}
	}
	

	
	//1번. 비밀지도 : 비트연산자 OR
	public String[] decodeMap(int n, int[] arr1, int[] arr2) {
		String[] result = new String[n];
		
		for(int i = 0; i < n; i++) {
			int arr = arr1[i] | arr2[i];
			result[i] = Integer.toBinaryString(arr).replace("1", "#").replace("0", " ");
		}
		
		return result;
	}

}
