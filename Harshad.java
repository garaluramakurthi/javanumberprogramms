package numberprogrammes;

import java.util.Scanner;

public class Harshad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num to check harshed or not");
		int n=sc.nextInt();
		
		int sum=0,temp=n;
		while(n!=0) {
			int rem=n%10;
			sum+=rem;
			n/=10;
		}if(temp%sum==0) {
			System.out.println("harshad num");
		}else {
			System.out.println("not harshed");
		}

	}

}
