package java_lab;
import java.util.Scanner;

public class prg3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the dividend:");
		int a =sc.nextInt();
		System.out.println("enter the divisor:");
		int b=sc.nextInt();
		try{
			int c=a/b;
			System.out.println(a+"/"+b+"="+c);
		}
		catch(ArithmeticException e ){
			System.out.println("cannot divide by 0");
		}
		sc.close();
	}
}
