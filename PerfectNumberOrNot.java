package numberprogrammes;
import java.util.*;
public class PerfectNumberOrNot {
	
	    public static void main(String[] args){
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter a number");
	    int n=sc.nextInt();
	    int sum=0;
	    for(int i=1;i<n;i++){
	        if(n%i==0){
	            sum+=i;
	        }
	    }
	        if(sum==n){
	            System.out.println("Perfect Number");
	        }
	        else{
	            System.out.println("not a Perfect Number");
	        }
	    }
}


