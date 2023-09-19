package numberprogrammes;

import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int n=sc.nextInt();
		int i=n*n;
		int sum=0;
		while(i!=0) {
			int rem=i%10;
			sum+=rem;
			i/=10;
		}
		System.out.println(sum);
		if(sum==n) {
			System.out.println("neon");
		}else {
			System.out.println("not neon");
		}

	}

}
