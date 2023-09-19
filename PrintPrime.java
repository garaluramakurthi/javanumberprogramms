package numberprogrammes;

import java.util.Scanner;

public class PrintPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int rev=0;
		while(n!=0) {
			int res=n%10;
			rev=rev*10+res;
			n/=10;
		}
		System.out.println(rev);
		int res=0;
		while(rev!=0) {
			int r=rev%10;
			int c=0;
			for(int i=1;i<=r;i++) {
				if(n%i==0) {
					c++;
				}
			}
			if(c==2) {
				res=res*10+r;
				}
			rev/=10;
		}System.out.println(res);

	}

}
