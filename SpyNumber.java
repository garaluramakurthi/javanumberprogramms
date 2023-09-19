package numberprogrammes;
import java.util.*;
public class SpyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//sum==product
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a num");
		int n=sc.nextInt();
		int sum=0,pro=1;
		while(n!=0) {
			int rem=n%10;
			sum+=rem;
			pro*=rem;
			n/=10;
			
		}
		if(sum==pro) {
			System.out.println("spy");
		}else {
			System.out.println("not spy");
		}

	}

}
