package numberprogrammes;
import java.util.*;
public class SumOfPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			int c=0;
			for(int i=1;i<=rem;i++) {
				if(rem%i==0) {
					c++;
				}
			}
			if(c==2) {
				sum+=rem;
			}n/=10;
		}System.out.println(sum);
		

	}

}
