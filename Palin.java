package numberprogrammes;
import java.util.*;
public class Palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		while(n!=0) {
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		if(rev==temp) {
			System.out.println("palin");
		}
		else {
			System.out.println("not palin");
		}

	}

}
