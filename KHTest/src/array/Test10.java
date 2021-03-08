package array;

public class Test10 {

	public static void main(String[] args) {
		// 2차원 배열에 들어있는 데이터들 중 
		//3의 배수만 골라내서 새로운 1차원배열에 기록하고 출력한 다. 
		//단 중복 값은 하나만 기록되게 한다.
		
		int [][] array = {{12, 41, 36, 56}, 
						{82, 10, 12, 61}, 
						{14, 16, 18, 78}, 
						{45, 26, 72, 23}};
		int[] copyAr = new int[array.length * array[0].length];
		int copyidx = 0;
		
		abc:
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				//3의 배수만 골라내서
				if(array[i][j] % 3 == 0) {
					//중복체크. 같은 거 있으면 기록안해 
					for(int n = 0; n < copyidx; n++) { //copyidx가 ++로 인해 copyAr.length의 역할을 한다.
						if(copyAr[n] == array[i][j])
							continue abc;
					}
//					if() {
//						
//					}
					//새로운 1차원배열에 기록
					copyAr[copyidx++] = array[i][j];
				}
			}
		}
		//출력
		System.out.print("copyAr:"); //+ copyAr[0] ~ [x]
		for(int k = 0; k < copyidx; k++) {
			System.out.print(" " + copyAr[k]);
		}
	}

}
