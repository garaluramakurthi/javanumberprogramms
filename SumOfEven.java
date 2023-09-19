package numberprogrammes;
import java.util.*;
public class SumOfEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a num");
		int n=sc.nextInt();
		int sum=0,sum1=0;
		while(n!=0) {
			int rem=n%10;
			if(rem%2==0) {
				sum+=rem;
			}
			if(rem%2==1) {
				sum1+=rem;
			}
			n/=10;
		}
	
		System.out.println("sum of even "+sum);
		System.out.println("sum of odd "+sum1);
		
		
	}

}
