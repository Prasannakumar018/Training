package basic1;

import java.util.Scanner;

public class prg {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a= sc.nextInt();
		if(a>0) {
			   System.out.println("Positive");
		
		}
		else if(a<0) {
			System.out.print("Negative");
		}
		else {
			System.out.print("Zero");
		}

}
}
