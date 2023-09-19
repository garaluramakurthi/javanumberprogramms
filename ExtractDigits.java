package numberprogrammes;
import java.util.*;
public class ExtractDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int n=sc.nextInt();
		
		while(n!=0) {
			int res=n%10;
			System.out.println(res);
			n/=10;
		}
	}

}
