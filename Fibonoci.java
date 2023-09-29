package numberprogrammes;

public class Fibonoci {

	public static void main(String[] args) {}{
		int a=0;
		int b=1,res=0;
		System.out.println(a);
		System.out.println(b);
		while(res<=100) {
			res=a+b;
			System.out.println(res);
			a=b;
			b=res;
			
		}
	}

}
