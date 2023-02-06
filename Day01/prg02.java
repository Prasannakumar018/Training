package basic1;

import java.util.Scanner;

public class prg02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		if(a%2==0) {
			   System.out.println("Even");
		}
		else {
			System.out.print("Odd");
		}
	}

}
