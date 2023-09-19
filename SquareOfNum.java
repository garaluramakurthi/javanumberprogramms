package numberprogrammes;
import java.util.Scanner;
public class SquareOfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		int pow=1;
		for(int i=1;i<=b;i++) {
			pow*=a;
		}
		System.out.println(pow);
		
	}

}
