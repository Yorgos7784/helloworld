package practice5;

import java.util.Scanner;

public class SSS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하세요. : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요. : ");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력하세요. : ");
		char a = sc.next().charAt(0);
		
		if(a == '+')
		{
			System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		}
		else if(a == '-')
		{
			System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
		}
		else if(a == 'x')
		{
			System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
		}
		else if(a == '/')
		{
			System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
		}
		else
		{
			System.out.println("잘못 입력하였습니다");
		}

	}

}