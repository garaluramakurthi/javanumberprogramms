package numberprogrammes;
import java.util.*;
public class Strongnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n!=0) {
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=rem;i++) {
				fact*=i;
				}
				sum+=fact;
				n/=10;
			
		}if(sum==temp) {
			System.out.println("Strong");
		}else {
			System.out.println("not strong");
		}
		

	}

}
