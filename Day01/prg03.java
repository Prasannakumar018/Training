package basic1;

import java.util.Scanner;

public class prg03 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		int c=a+b;
		if(c%2==0) {
			   System.out.println("Even");
		}
		else {
			System.out.print("Odd");
		}
	}
}
