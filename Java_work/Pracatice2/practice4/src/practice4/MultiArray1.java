package practice4;

public class MultiArray1 {

	public static void main(String[] args) {

		// 다차원 배열
		// a[0][0] | a[0][1] | a[0][2]
		// a[1][0] | a[1][1] | a[1][2]
		// a[2][0] | a[2][1] | a[2][2]
		// a[3][0] | a[3][1] | a[3][2]
		
		int N = 50;
		int[][] array = new int [N][N];
		for (int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				array[i][j] = (int)(Math.random() * 10);
			}
		}
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
	}

}