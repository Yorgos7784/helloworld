package practice3;

public class Array2 {

	public static void main(String[] args) {

		// Math.random() : 0 ~ 0.xxxx 숫자 랜덤 (0 <= x < 1)
		
		int[] array = new int[100];
		for(int i = 0; i < 100; i++)
		{
			array[i] = (int) (Math.random() * 100 + 1);
		}
		int sum = 0;
		for(int i = 0; i < 100; i++) {
			sum += array[i];
		}
		
		System.out.println("100개의 랜덤 정수의 평균값은 " + sum / 100 + "입니다");
	}

}