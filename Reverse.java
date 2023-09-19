package numberprogrammes;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int n=sc.nextInt();
		int rev=0;
		while(n!=0) {
			int res=n%10;
			rev=rev*10+res;
			n/=10;
		}
		System.out.println(rev);

	}

}
