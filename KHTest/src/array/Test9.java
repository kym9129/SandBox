package array;

public class Test9 {

	public static void main(String[] args) {
		// 2차원 배열에 들어있는 데이터중 가장 큰 값과 가장 작은 값을 구한다.
//		가장 큰 값 : 82
//		가장 작은 값 : 10
		int [][] array = {{12, 41, 36, 56}, 
						{82, 10, 12, 61}, 
						{14, 16, 18, 78}, 
						{45, 26, 72, 23}};
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] < min) {
					min = array[i][j];
					
				}
				if(array[i][j] > max){
					max = array[i][j];
				}
			}
		}
		System.out.println("가장 큰 값 : " + max);
		System.out.println("가장 작은 값 : " + min);
	}

}
