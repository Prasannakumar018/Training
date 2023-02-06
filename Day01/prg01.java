package basic1;

import java.util.Scanner;

public class prg01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c= (a>=b)?a:b;
		System.out.print(c);
	}

}
